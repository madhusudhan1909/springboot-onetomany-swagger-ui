package com.example2.demo.repository;

import com.example2.demo.dto.OrderResponse;
import com.example2.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
@Query("SELECT new com.example2.demo.dto.OrderResponse(c.name,p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse>getJoinInformation();
}
