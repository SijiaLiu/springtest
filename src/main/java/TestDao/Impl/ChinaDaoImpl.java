package main.java.TestDao.Impl;


import main.java.TestDao.LanguageDao;
import main.java.bean.Person;

/**
 * Created by LiuSijia on 2017/8/16.
 */
public class ChinaDaoImpl implements LanguageDao {
    @Override
    public void sayhello(Person person) {
        System.out.println("你好！");
    }
}
