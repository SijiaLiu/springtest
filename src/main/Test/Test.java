package main.Test;

import main.java.Service.Service;
import main.java.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LiuSijia on 2017/8/16.
 */
public class Test {
    private static Service service;
    private static Person person;

////• Object getBean(String name) 根据名称返回一个Bean，客户端需要自己进行类型转换；
//
////• T getBean(String name, Class<T> requiredType) 根据名称和指定的类型返回一个Bean，客户端无需自己进行类型转换，如果类型转换失败，容器抛出异常；
//
////• T getBean(Class<T> requiredType) 根据指定的类型返回一个Bean，客户端无需自己进行类型转换，如果没有或有多于一个Bean存在容器将抛出异常；
//
////• Map<String, T> getBeansOfType(Class<T> type) 根据指定的类型返回一个键值为名字和值为Bean对象的 Map，如果没有Bean对象存在则返回空的Map。


    public static void main(String[] args) {

        person = new Person();
        person.setName("testName");
        person.setRemark("testRemark");
        //ClassPathXmlApplicationContext：ApplicationContext实现，从classpath获取配置文件；
        //FileSystemXmlApplicationContext：ApplicationContext实现，从文件系统获取配置文件。
        ApplicationContext ctx=
                new ClassPathXmlApplicationContext("beans.xml");
        service = ctx.getBean("service",Service.class);

        testModify();
    }

    public static void testAdd(){
        service.add(person);
    }
    public static void testModify(){
        service.modify(person);
    }
}
