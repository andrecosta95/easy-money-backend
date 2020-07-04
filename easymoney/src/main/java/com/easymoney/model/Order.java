package com.easymoney.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Coin coin;
    private long dateExpect;
    private BigDecimal tilValueCoin;
    private BigDecimal tilQtyCoin;

}
