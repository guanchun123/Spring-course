package com.bjpowerload;

import com.bjpowerload.impl.SomeServiceImpl;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class doSome {
    @Test
    public void test1(){
        SomeServiceImpl someService = new SomeServiceImpl();
        someService.dosome();

    }

    /*
    * spring默认创建对象的时间：在创建spring的容器时，会创建配置文件中所有的对象
    * */
    @Test
    public void test2(){
        //使用spring容器创建对象
        //1，指定spring配置文件的名称
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        SomeServiceImpl someService = (SomeServiceImpl) applicationContext.getBean("someService");
        //2，创建spring容器的对象，aApplicationContest
        //ApplicationContest就是表示Spring容器，通过容器获取对象了
        //ClassPathXmlApplicationContest:表示从类路径中加载spring
        someService.dosome();

        //从容器中获取某个对象，你要调用对象的方法
        //getBean("从配置文件中的bean的id值")


        //使用spring创建好的对象
    }

    /*
    * 获取spring中java对象的信息
    * */
    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //使用spring提供的方法，获取容器中定义的bean的数量
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量:"+beanDefinitionCount);


        //获取容器中定义的bean的名称
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name :beanDefinitionNames) {
            System.out.println(name);
        }


    }


    /*
     * spring能创建一个非定义类的对象嘛，创建一个存在的某个类的对象
     * */
    @Test
    public void test4(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Date mydate = (Date) classPathXmlApplicationContext.getBean("mydate");
        System.out.println("当前时间"+mydate);
    }

}
