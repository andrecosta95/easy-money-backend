package com.easymoney.service;

import com.easymoney.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    /**
     * Method that create a user.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @param user
     * @return <code>User</code> object
     */

    User save(User user);

    /**
     * Method that remove a user by an id.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @param userId
     */
    void deleteById(Long userId);

    /**
     * Method that find a user by an id.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @param userId
     * @return <code>Optional<User></code> object
     */
    Optional<User> findById(Long userId);


    /**
     * Method that find all user.
     *
     * @author André Costa
     * @since 28/06/2020
     *
     * @return <code>List<User></code> object
     */
    List<User> findAll();

}
