package com.dangelion.service.impl;

import com.dangelion.entity.User;
import com.dangelion.mapper.UserMapper;
import com.dangelion.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Gavin
 * @since 2020-07-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
