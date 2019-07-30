package com.example.SpringIoCpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//TODO
class Main{

    public static void main(String[]args){
        //1.加载hello.xml路径配置文件,自动创建对象
        ApplicationContext context=new ClassPathXmlApplicationContext("hello.xml");
        //2.从spring中获取对象
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //3.
        helloWorld.getHello();
    }
}