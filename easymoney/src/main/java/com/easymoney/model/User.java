package com.easymoney.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int id;
    private String name;
    private int cpf;
    private Profile profile;
    private Address address;

}
