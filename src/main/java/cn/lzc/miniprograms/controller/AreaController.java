package cn.lzc.miniprograms.controller;

import cn.lzc.miniprograms.entity.Area;
import cn.lzc.miniprograms.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/listarea")
    private Map<String,Object> listArea(){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        //查询全部区域列表
        List<Area> areaList = areaService.queryArea();
        modelMap.put("areaList",areaList);
        return modelMap;
    }

    @GetMapping("/getareabyid")
    private Map<String,Object> getAreaById(Integer areaId){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        //根据id查询区域信息
        Area area = areaService.queryAreayById(areaId);
        modelMap.put("area",area);
        return modelMap;
    }

    @PostMapping("/addarea")
    private Map<String,Object> addArea(@RequestBody Area area){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        //新增区域信息
        boolean success = areaService.insertArea(area);
        modelMap.put("success", success);
        return modelMap;
    }

    @PostMapping("/modifyarea")
    private Map<String,Object> modifyArea(@RequestBody Area area){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        //修改区域信息
        boolean success = areaService.updateArea(area);
        modelMap.put("success", success);
        return modelMap;
    }

    @GetMapping("/removearea")
    private Map<String,Object> removeArea(Integer areaId){
        Map<String,Object> modelMap=new HashMap<String,Object>();
        //删除区域信息
        boolean success = areaService.deleteArea(areaId);
        modelMap.put("success", success);
        return modelMap;
    }
}
