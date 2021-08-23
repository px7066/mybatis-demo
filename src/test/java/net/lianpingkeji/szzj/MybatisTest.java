package net.lianpingkeji.szzj;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.lianpingkeji.szzj.persistence.City;
import net.lianpingkeji.szzj.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class MybatisTest {
    @Autowired
    private CityService cityService;

    @Test
    public void test(){
        City city = new City();
        city.setName("上海");
        PageHelper.startPage(0, 10);
        cityService.createCity(city);
        City city1 = cityService.findById(1L);
        Assert.notNull(city1.getCityName(), "不为空");
        PageInfo<City> cityPage = cityService.findCityPage(0, 10);
        System.out.println(cityPage.getSize());
        Assert.isTrue(cityPage.getTotal() ==10, "分页查询失败");
    }
}
