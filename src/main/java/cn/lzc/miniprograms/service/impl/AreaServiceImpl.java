package cn.lzc.miniprograms.service.impl;

import cn.lzc.miniprograms.entity.Area;
import cn.lzc.miniprograms.mapper.AreaMapper;
import cn.lzc.miniprograms.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public List<Area> queryArea() {
        return areaMapper.queryArea();
    }

    @Override
    public Area queryAreayById(int areaId) {
        return areaMapper.queryAreayById(areaId);
    }
    @Transactional
    @Override
    public boolean insertArea(Area area) {
        if (area.getAreaName()!=null&&!"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effcetedNum = areaMapper.insertArea(area);
                if (effcetedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("插入区域信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("插入区域信息失败:"+e.getMessage());
            }
        }else{
            throw  new RuntimeException("区域信息不能为空！");
        }
    }
    @Transactional
    @Override
    public boolean updateArea(Area area) {
        if (area.getAreaId()!=null&&area.getAreaId()>0){
            //设置修改时间
            area.setLastEditTime(new Date());
            try {
                //更新区域信息
                int effcetedNum = areaMapper.updateArea(area);
                if (effcetedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("更新区域信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("更新区域信息失败:"+e.getMessage());
            }
        }else{
            throw  new RuntimeException("区域信息不能为空！");
        }
    }
    @Transactional
    @Override
    public boolean deleteArea(int areaId) {
        if (areaId>0){
            try {
                //删除区域信息
                int effcetedNum = areaMapper.deleteArea(areaId);
                if (effcetedNum>0){
                    return true;
                }else{
                    throw new RuntimeException("删除区域信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除区域信息失败:"+e.getMessage());
            }

        }else {
            throw new RuntimeException("区域Id不能为空");
        }
    }
}
