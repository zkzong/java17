package org.example.sb3.ss;

import com.github.pagehelper.PageInfo;
import org.example.sb3.ss.entity.Order;
import org.example.sb3.ss.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private ExampleService exampleService;

    @Test
    public void initEnvironment() throws SQLException {
        exampleService.initEnvironment();
    }

    @Test
    public void processSuccess() throws SQLException {
        exampleService.processSuccess();
    }

    @Test
    public void selectByOrderId() {
        Order order = exampleService.selectByOrderId();
        System.out.println(order);
    }

    @Test
    public void selectRange() {
        List<Order> orders = exampleService.selectRange();
        System.out.println(orders);
    }

    @Test
    public void selectgt() {
        List<Order> orders = exampleService.selectgt();
        System.out.println(orders);
    }

    @Test
    public void selectlt() {
        List<Order> orders = exampleService.selectlt();
        System.out.println(orders);
    }

    @Test
    public void page() {
        PageInfo<Order> page = exampleService.page();
        System.out.println(page);
    }

    @Test
    public void cleanEnvironment() throws SQLException {
        exampleService.cleanEnvironment();
    }
}
