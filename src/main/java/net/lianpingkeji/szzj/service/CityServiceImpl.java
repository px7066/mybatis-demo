package net.lianpingkeji.szzj.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import net.lianpingkeji.szzj.mapper.CityMapper;
import net.lianpingkeji.szzj.persistence.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public void createCity(City city) {
        cityMapper.insert(city);
    }

    @Override
    public City findById(Long id) {
        return cityMapper.findById(id);
    }

    @Override
    public PageInfo<City> findCityPage(int page, int size) {
        PageHelper.startPage(page, size);
        List<City> citys = cityMapper.findAll();
        PageInfo<City> cityPage = new PageInfo(citys);
        return cityPage;
    }
}
