package org.jineral.school.demo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jineral
 * @create date 2011-11-20
 */
@ManagedBean(name = "helloView")
@ViewScoped
public class HelloView implements Serializable { 

    private String hello;
    private String userName;  
  
    public void sayHello(){  
        hello=String.format("hello %s,welcome to this schoolDemo!", userName);  
    }  
    public HelloView() {
        hello="hello world!";
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

}
