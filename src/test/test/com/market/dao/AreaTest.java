package com.market.dao;

import com.market.BaseTest;
import main.java.com.market.dao.AreaDao;
import main.java.com.market.model.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class AreaTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public  void  testQueryArea(){
        List<Area> areaList=areaDao.queryArea();
        System.out.println(areaList);
    }
}
