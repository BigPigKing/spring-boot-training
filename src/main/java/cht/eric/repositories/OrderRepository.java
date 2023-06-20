package cht.eric.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cht.eric.models.tables.pojos.Order;

public interface OrderRepository extends JpaRepository<Order, String> {
}
