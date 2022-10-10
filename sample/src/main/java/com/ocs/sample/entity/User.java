package com.ocs.sample.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    private String name;
    private int id;
    private Date birth;
    private int salary;
}
