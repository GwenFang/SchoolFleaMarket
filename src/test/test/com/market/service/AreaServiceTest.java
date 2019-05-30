package com.market.service;

import com.market.BaseTest;
import main.java.com.market.model.Area;
import main.java.com.market.service.AreaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void testGetAreaList(){
        List<Area> areaList=areaService.getAreaList();
        System.out.println(areaList.toString());
    }
}
