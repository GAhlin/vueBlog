package com.dangelion.shiro;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author Gavin
 * @Date 2020/7/22
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;

    private String email;

    private String password;

    private Integer status;

    private LocalDateTime created;

    private LocalDateTime lastLogin;
}
