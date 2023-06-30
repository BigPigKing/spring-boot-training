package cht.eric.graphql;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cht.eric.graphql.queries.OrderQuery;
import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import io.leangen.graphql.GraphQLSchemaGenerator;
import jakarta.servlet.http.HttpServletRequest;


@RestController
public class GraphQLController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GraphQLController.class);

    private final GraphQL graphQL;

    public GraphQLController(
        OrderQuery orderQuery
    ) {
        GraphQLSchema schema = new GraphQLSchemaGenerator()
            .withBasePackages("cht.eric")
            .withOperationsFromSingletons(
                orderQuery
            )
            .generate();
        graphQL = GraphQL.newGraphQL(schema).build();

        LOGGER.info("Generated GraphQL schema using SPQR");
    }

    @PostMapping(
        value = "/graphql",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public Map<String, Object> indexFromAnnotated(
        @RequestBody Map<String, String> request,
        HttpServletRequest raw
    ) {
        ExecutionResult executionResult = graphQL.execute(
            ExecutionInput.newExecutionInput()
                .query(request.get("query"))
                .operationName(request.get("operationName"))
                .build()
        );
        return executionResult.toSpecification();
    }
}
