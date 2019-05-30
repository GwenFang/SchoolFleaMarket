package main.java.com.market.service.impl;

import main.java.com.market.dao.AreaDao;
import main.java.com.market.model.Area;
import main.java.com.market.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService{
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
