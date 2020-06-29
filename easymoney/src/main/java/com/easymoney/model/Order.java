package com.easymoney.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter@Entity
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue
    private long orderId;
    private Coin coin;
    private long dateExpect;
    private double tilValueCoin;
    private double tilQtyCoin;

}
