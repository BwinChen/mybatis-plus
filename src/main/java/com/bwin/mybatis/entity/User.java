package com.bwin.mybatis.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * @author McAfee
 */
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    private LocalDateTime createTime;

}
