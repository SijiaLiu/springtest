package main.java.Service.Impl;


import main.java.Service.Service;
import main.java.TestDao.LanguageDao;
import main.java.bean.Person;

/**
 * Created by LiuSijia on 2017/8/16.
 */
public class ServiceImpl implements Service {

    private LanguageDao languageDao;

    public LanguageDao getLanguageDao() {
        return languageDao;
    }

    public void setLanguageDao(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public void add(Person person) {
        languageDao.sayhello(person);
    }

    @Override
    public void modify(Person person) {
        languageDao.sayhello(person);
    }
}
