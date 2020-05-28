package com.guorenjie.helloredis.controller;

import com.guorenjie.helloredis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.Executors;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author guorenjie
 * @since 2019-09-22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserServiceImpl userService;


    @RequestMapping("/{key}")
	public String index(@PathVariable String key) {
        return key+"在redis中对应的String="+(String) userService.getString(key);
	}

}
