package main.java.Service.Impl;


import main.java.Service.Service;
import main.java.bean.Person;

/**
 * Created by LiuSijia on 2017/8/16.
 */
public class ServiceImpl2 extends ServiceImpl implements Service {


    @Override
    public void add(Person person) {
        getLanguageDao().sayhello(person);
    }

    @Override
    public void modify(Person person) {
        getLanguageDao().sayhello(person);
    }
}
