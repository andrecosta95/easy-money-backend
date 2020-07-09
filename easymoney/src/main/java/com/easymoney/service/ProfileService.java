package com.easymoney.service;

import com.easymoney.model.Profile;

import java.util.List;
import java.util.Optional;

public interface ProfileService {

    /**
     * Method that create a profile.
     *
     * @author André Costa
     * @since 06/07/2020
     *
     * @param profile
     * @return <code>Profile</code> object
     */

    Profile save(Profile profile);

    /**
     * Method that remove a profile by an id.
     *
     * @author André Costa
     * @since 06/07/2020
     *
     * @param profileId
     */
    void deleteById(Long profileId);

    /**
     * Method that find a profile by an id.
     *
     * @author André Costa
     * @since 06/07/2020
     *
     * @param profileId
     * @return <code>Optional<Profile></code> object
     */
    Optional<Profile> findById(Long profileId);


    /**
     * Method that find all profile.
     *
     * @author André Costa
     * @since 06/07/2020
     *
     * @return <code>List<Profile></code> object
     */
    List<Profile> findAll();

    /**
     * Method that edit access level a profile
     *
     * @author André Costa
     * @since 06/07/2020
     *
     * @param profile
     * @param accessLevel
     */
    void editAccessLevel(Profile profile, String accessLevel);

}
