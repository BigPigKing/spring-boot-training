package cht.eric.controllers.order;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cht.eric.models.Order;
import cht.eric.repositories.OrderRepository;


@RestController
public class OrderController {
    private final OrderRepository repository;

    OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/orders")
    List<Order> all() {
        return repository.findAll();
    }

    @PostMapping("/orders")
    Order postOrder(@RequestBody Order newOrder) {
        return repository.save(newOrder);
    }

    @PutMapping("/orders/{id}")
    Order putOrder(@RequestBody Order newOrder, @PathVariable String id) {
        return repository.findById(id)
        .map(order -> {
            order.setCategory(newOrder.getCategory());
            return repository.save(order);
        })
        .orElseGet(() -> {
            newOrder.setId(id);
            return repository.save(newOrder);
        });
    }

    @DeleteMapping("/orders/{id}")
    void deleteOrder(@PathVariable String id) {
        repository.deleteById(id);
    }
}
