package com.baizhi.contrlloer;


import com.baizhi.service.HelloService;

/**
 * Created by Administrator on 2018-7-2.
 */
public class Test {
    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        System.out.println(helloService.sayHello("zs"));
    }
}
