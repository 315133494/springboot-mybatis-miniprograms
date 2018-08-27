package cn.lzc.miniprograms.service;

import cn.lzc.miniprograms.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据id列出具体区域
     * @param areaId
     * @return
     */
    Area queryAreayById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    boolean insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean updateArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
