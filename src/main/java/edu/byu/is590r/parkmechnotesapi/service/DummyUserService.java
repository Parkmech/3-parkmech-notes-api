package edu.byu.is590r.parkmechnotesapi.service;

import org.springframework.stereotype.Service;

@Service
public class DummyUserService implements UserService {
    @Override
    public String getUsername(String userName)
    {
        var user = String.format("Hello, %s, from User Service",userName);
        return user;
    }
}