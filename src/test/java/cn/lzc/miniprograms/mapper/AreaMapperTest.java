package cn.lzc.miniprograms.mapper;

import cn.lzc.miniprograms.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaMapperTest {
    @Autowired
    private AreaMapper areaMapper;
    @Test
    public void queryArea() {
        List<Area> areaList = areaMapper.queryArea();
        assertEquals(4,areaList.size());
        for (Area area : areaList) {
            System.out.println(area);
        }
    }

    @Test
    public void queryAreayById() {
        Area area = areaMapper.queryAreayById(1);
        System.out.println(area);
    }

    @Test
    public void insertArea() {
        Area area=new Area();
        area.setAreaName("中湖");
        area.setPriorty(5);
        int i = areaMapper.insertArea(area);
        System.out.println(i);
    }

    @Test
    public void updateArea() {
        Area area = areaMapper.queryAreayById(5);
        area.setAreaName("centerlake");
        area.setPriorty(5);
        int i = areaMapper.updateArea(area);
        System.out.println(i);
    }

    @Test
    public void deleteArea() {
        areaMapper.deleteArea(5);
    }
}