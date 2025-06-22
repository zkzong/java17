package org.example.sb3.ss.repository;

import org.example.sb3.ss.entity.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OrderExtRepositoryTest {

    @Autowired
    private OrderExtRepository orderExtRepository;

    @Test
    public void testSelectRange() {
        List<Order> orders = orderExtRepository.selectRange();
        System.out.println(orders);
    }

    @Test
    public void selectgt() {
        List<Order> orders = orderExtRepository.selectgt();
        System.out.println(orders);
    }

    @Test
    public void selectlt() {
        List<Order> orders = orderExtRepository.selectlt();
        System.out.println(orders);
    }

    @Test
    public void selectByAddress() {
        List<Order> orders = orderExtRepository.selectByAddress();
        System.out.println(orders);
    }
}
