package org.example.sb3.ss.service;

import org.example.sb3.ss.entity.Address;
import org.example.sb3.ss.entity.Order;
import org.example.sb3.ss.entity.OrderItem;
import org.example.sb3.ss.repository.AddressRepository;
import org.example.sb3.ss.repository.OrderItemRepository;
import org.example.sb3.ss.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public final class ExampleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleService.class);

    private final OrderRepository orderRepository;

    private final OrderItemRepository orderItemRepository;

    private final AddressRepository addressRepository;

    public ExampleService(final OrderRepository orderRepository, final OrderItemRepository orderItemRepository, final AddressRepository addressRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.addressRepository = addressRepository;
    }

    public void run() throws SQLException {
        try {
            this.initEnvironment();
            this.processSuccess();
        } finally {
            //this.cleanEnvironment();
        }
    }

    private void initEnvironment() throws SQLException {
        orderRepository.createTableIfNotExists();
        orderItemRepository.createTableIfNotExists();
        addressRepository.createTableIfNotExists();
        orderRepository.truncateTable();
        orderItemRepository.truncateTable();
        addressRepository.truncateTable();
    }

    private void processSuccess() throws SQLException {
        LOGGER.info("-------------- Process Success Begin ---------------");
        List<Long> orderIds = insertData();
        printData();
        //deleteData(orderIds);
        //printData();
        LOGGER.info("-------------- Process Success Finish --------------");
    }

    private List<Long> insertData() throws SQLException {
        LOGGER.info("---------------------------- Insert Data ----------------------------");
        List<Long> result = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            Order order = new Order();
            order.setOrderId(i);
            order.setUserId(i);
            order.setOrderType(i % 2);
            order.setAddressId(i);
            order.setStatus("INSERT_TEST");
            orderRepository.insert(order);

            OrderItem orderItem = new OrderItem();
            orderItem.setOrderId(order.getOrderId());
            orderItem.setUserId(i);
            orderItem.setPhone("13800000001");
            orderItem.setStatus("INSERT_TEST");
            orderItemRepository.insert(orderItem);

            Address address = new Address();
            address.setAddressId((long) i);
            address.setAddressName("address_test_" + i);
            addressRepository.insert(address);

            result.add(order.getOrderId());
        }
        return result;
    }

    private void deleteData(final List<Long> orderIds) throws SQLException {
        LOGGER.info("---------------------------- Delete Data ----------------------------");
        long count = 1;
        for (Long each : orderIds) {
            orderRepository.delete(each);
            orderItemRepository.delete(each);
            addressRepository.delete(count++);
        }
    }

    private void printData() throws SQLException {
        LOGGER.info("---------------------------- Print Order Data -----------------------");
        for (Object each : this.selectAll()) {
            LOGGER.info(each.toString());
        }
        LOGGER.info("---------------------------- Print OrderItem Data -------------------");
        for (Object each : orderItemRepository.selectAll()) {
            LOGGER.info(each.toString());
        }
        LOGGER.info("---------------------------- Print Address Data -------------------");
        for (Object each : addressRepository.selectAll()) {
            LOGGER.info(each.toString());
        }
    }

    private List<Order> selectAll() throws SQLException {
        List<Order> result = orderRepository.selectAll();
        return result;
    }

    private void cleanEnvironment() throws SQLException {
        orderRepository.dropTable();
        orderItemRepository.dropTable();
        addressRepository.dropTable();
    }
}
