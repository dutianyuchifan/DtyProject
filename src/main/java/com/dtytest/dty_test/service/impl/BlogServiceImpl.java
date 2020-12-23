package com.dtytest.dty_test.service.impl;

import com.dtytest.dty_test.entity.Blog;
import com.dtytest.dty_test.mapper.BlogMapper;
import com.dtytest.dty_test.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
