package com.ocs.sample.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    private String name;
    private Integer id;
    private Date birth;
    private Integer salary;
}
