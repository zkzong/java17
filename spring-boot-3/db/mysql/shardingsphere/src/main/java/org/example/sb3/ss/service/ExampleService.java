package org.example.sb3.ss.service;

import com.github.pagehelper.PageInfo;
import org.example.sb3.ss.entity.Order;

import java.sql.SQLException;
import java.util.List;

public interface ExampleService {

    /**
     * Initialize environment.
     *
     * @throws SQLException SQL exception
     */
    void initEnvironment() throws SQLException;

    /**
     * Clean environment.
     *
     * @throws SQLException SQL exception
     */
    void cleanEnvironment() throws SQLException;

    /**
     * Process success.
     *
     * @throws SQLException SQL exception
     */
    void processSuccess() throws SQLException;

    /**
     * Process failure.
     *
     * @throws SQLException SQL exception
     */
    void processFailure() throws SQLException;

    /**
     * Print data.
     *
     * @throws SQLException SQL exception
     */
    void printData() throws SQLException;

    Order selectByOrderId();

    List<Order> selectRange();

    List<Order> selectgt();

    List<Order> selectlt();

    PageInfo<Order> page();
}
