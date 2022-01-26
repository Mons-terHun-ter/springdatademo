package com.tuling.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @author libo.a
 * @date 2022/1/26 4:31 PM
 */
@Entity
@Table
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custId;

    private String custName;
}
