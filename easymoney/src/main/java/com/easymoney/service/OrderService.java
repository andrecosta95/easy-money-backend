package com.easymoney.service;

import com.easymoney.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    /**
     * Method that create a order service.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @param order
     * @return <code>Order</code> object
     */

    Order save(Order order);

    /**
     * Method that remove a order by an id.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @param orderId
     */
    void deleteById(Long orderId);

    /**
     * Method that find a order by an id.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @param id
     * @return <code>Optional<Order></code> object
     */
    Optional<Order> findById(Long id);


    /**
     * Method that find all order.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @return <code>List<Order></code> object
     */
    List<Order> findAll();

    /**
     * Method that edit a order by an id.
     *
     * @author André Costa
     * @since 04/07/2020
     *
     * @param id
     * @return <code>Optional<Order></code> object
     */
    Optional<Order> editById(Long id);

}
