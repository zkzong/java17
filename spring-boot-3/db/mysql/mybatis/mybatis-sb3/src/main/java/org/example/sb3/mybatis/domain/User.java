package org.example.sb3.mybatis.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private Long id;
    private String userName;
    private Integer age;

}
