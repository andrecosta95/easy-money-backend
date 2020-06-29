package com.easymoney.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {

    private String login;
    private String passWord;
    private long lastAccess;

}
