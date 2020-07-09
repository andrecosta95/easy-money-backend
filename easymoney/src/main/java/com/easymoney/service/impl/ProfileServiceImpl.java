package com.easymoney.service.impl;

import com.easymoney.model.Profile;
import com.easymoney.repository.ProfileRepository;
import com.easymoney.service.ProfileService;

import java.util.List;
import java.util.Optional;

public class ProfileServiceImpl implements ProfileService {

    private ProfileRepository repository;

    @Override
    public Profile save(Profile profile) {
        return repository.save(profile);
    }

    @Override
    public void deleteById(Long profileId) {
        repository.deleteById(profileId);
    }

    @Override
    public Optional<Profile> findById(Long profileId) {
        return repository.findById(profileId);
    }

    @Override
    public List<Profile> findAll() {
        return repository.findAll();
    }

    @Override
    public void editAccessLevel(Profile profile, String accessLevel) {
        if (profile != null) {
            profile.setAccessLevel(accessLevel);
            repository.save(profile);
        }
    }
}
