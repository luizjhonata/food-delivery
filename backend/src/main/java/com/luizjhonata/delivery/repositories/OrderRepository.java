package com.luizjhonata.delivery.repositories;

import com.luizjhonata.delivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
