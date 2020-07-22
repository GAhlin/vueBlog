package com.dangelion.service.impl;

import com.dangelion.entity.Blog;
import com.dangelion.mapper.BlogMapper;
import com.dangelion.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
