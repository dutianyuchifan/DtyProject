package com.dtytest.dty_test.service.impl;

import com.dtytest.dty_test.entity.User;
import com.dtytest.dty_test.mapper.UserMapper;
import com.dtytest.dty_test.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-12-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
