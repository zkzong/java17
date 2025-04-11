package org.example.sb3.ss.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.sb3.ss.entity.OrderItem;

import java.util.List;

@Mapper
public interface OrderItemMapper {
    void createTableIfNotExists();

    void truncateTable();

    void dropTable();

    int insert(OrderItem orderItem);

    void delete(Long orderId);

    List<OrderItem> selectAll();

    List<OrderItem> selectRange();
}
