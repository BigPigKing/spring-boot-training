package cht.eric.graphql.queries;

import java.util.List;

import org.springframework.stereotype.Component;

import cht.eric.models.Order;
import cht.eric.repositories.OrderRepository;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;

@Component
public class OrderQuery {
    private final OrderRepository orderRepository;

    public OrderQuery(
        OrderRepository orderRepository
    ) {
        this.orderRepository = orderRepository;
    }


    @GraphQLQuery
    public Order getOrderById(
        @GraphQLArgument(name = "id", description = "id for order")
            String id
    ) {
        return orderRepository.getReferenceById(id);
    }

    @GraphQLQuery
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}
