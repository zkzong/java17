package org.example.sb3.ss.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.sb3.ss.entity.Order;

import java.util.List;

@Mapper
public interface OrderMapper {

    void createTableIfNotExists();

    void truncateTable();

    void dropTable();

    int insert(Order order);

    void delete(Long orderId);

    List<Order> selectAll();

    Order selectByOrderId();

    List<Order> selectRange();

    List<Order> selectgt();

    List<Order> selectlt();

}
