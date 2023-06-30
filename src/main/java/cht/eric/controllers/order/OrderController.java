package cht.eric.controllers.order;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cht.eric.controllers.order.models.OrderPostDTO;
import cht.eric.controllers.order.models.OrderPutDTO;
import cht.eric.models.Order;
import cht.eric.services.BaseRestfulService;


@RestController
public class OrderController {
    private final BaseRestfulService<Order, String, OrderPostDTO, OrderPutDTO> service;

    OrderController(
        BaseRestfulService<Order, String, OrderPostDTO, OrderPutDTO> service
    ) {
        this.service = service;
    }

    @PostMapping("/orders")
    Order postOrder(
        @RequestBody OrderPostDTO orderPostDTO
    ) {
        return service.createEntity(orderPostDTO);
    }

    @PutMapping("/orders/{id}")
    Order putOrder(
        @PathVariable String id,
        @RequestBody OrderPutDTO orderPutDTO
    ) {
        return service.updateEntity(id, orderPutDTO);
    }

    @DeleteMapping("/orders/{id}")
    void deleteOrder(@PathVariable String id) {
        service.deleteEntity(id);
    }
}
