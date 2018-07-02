package com.baizhi.service;

import com.baizhi.HelloDao;

/**
 * Created by Administrator on 2018-7-2.
 */
public class HelloService {
    public String sayHello(String str){
        HelloDao helloDao = new HelloDao();
        return helloDao.hello(str);
    }

}
