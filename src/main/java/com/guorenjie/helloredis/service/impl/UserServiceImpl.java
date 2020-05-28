package com.guorenjie.helloredis.service.impl;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guorenjie.helloredis.util.RedisUtil;

import javax.annotation.Resource;


/**
 * @author guorenjie
 */
@Service
public class UserServiceImpl {

	@Resource
    RedisUtil redisUtil;


    public Object getString(String key) {
		return  redisUtil.get(key);
	}
	public boolean setString(String key,Object object,long time,TimeUnit timeUnit) {
		return redisUtil.setIfAbsent(key, object, time, timeUnit);
	}

}
