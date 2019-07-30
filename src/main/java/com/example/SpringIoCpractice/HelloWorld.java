package com.example.SpringIoCpractice;

import org.springframework.stereotype.Component;

public  class HelloWorld {
  private String hello;

  public void setHello(String hello) {
    this.hello = hello;
  }

  public void getHello() {
    System.out.println(hello);
  }
}
