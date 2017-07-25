package com.test.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.core.base.BaseController;
import com.test.core.utils.Result;
import com.test.mapper.UserMapper;
import com.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hch on 2017/7/11.
 */
@RestController
public class TestController extends BaseController{
    @Autowired
    UserMapper userMapper;
    @GetMapping("test")
    public Result test(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return success("hello").setData(userPageInfo);
    }
}
