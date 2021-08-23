package net.lianpingkeji.szzj.service;

import com.github.pagehelper.PageInfo;
import net.lianpingkeji.szzj.persistence.City;

public interface CityService {
    void createCity(City city);

    City findById(Long id);

    PageInfo<City> findCityPage(int page, int size);
}
