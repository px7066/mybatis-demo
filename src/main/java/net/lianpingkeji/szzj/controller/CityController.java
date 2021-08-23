package net.lianpingkeji.szzj.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.lianpingkeji.szzj.persistence.City;
import net.lianpingkeji.szzj.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping("findCityPage")
    public PageInfo<City> findCityPage(){
        PageHelper.startPage(0, 10);
        return cityService.findCityPage(0, 10);
    }
}
