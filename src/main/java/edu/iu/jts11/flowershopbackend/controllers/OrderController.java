package edu.iu.jts11.flowershopbackend.controllers;

import edu.iu.jts11.flowershopbackend.model.Customer;
import edu.iu.jts11.flowershopbackend.model.Order;
import edu.iu.jts11.flowershopbackend.repository.CustomerRepository;
import edu.iu.jts11.flowershopbackend.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class OrderController {
    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;

    public OrderController(OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @PostMapping("/order")
    public boolean add(@RequestBody Order order) {
        try {
            if (order.getPurchaseOption().equalsIgnoreCase("subscription") && !order.getUsername().isEmpty()) {
                Customer customer = customerRepository.findByUsername(order.getUsername());
                customer.setSubscribed(true);
            }
            orderRepository.save(order);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @GetMapping("/orders/{customerId}")
    public Iterable<Order> getOrders(@PathVariable String customerId) {
        try {
            return orderRepository.findAllByUsername(customerId);
        } catch (Exception e) {
            return null;
        }
    }
}
