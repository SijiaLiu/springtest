package main.TestDao.Impl;

import main.TestDao.LanguageDao;

/**
 * Created by LiuSijia on 2017/8/16.
 */
public class ChinaDaoImpl implements LanguageDao {
    @Override
    public void sayhello() {
        System.out.println("你好！");
    }
}
