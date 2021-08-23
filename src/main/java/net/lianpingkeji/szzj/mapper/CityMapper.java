package net.lianpingkeji.szzj.mapper;

import com.github.pagehelper.Page;
import net.lianpingkeji.szzj.persistence.City;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface CityMapper {
    @Insert("INSERT INTO city(name) VALUES(#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(City city);

    @Select("SELECT id, name FROM city WHERE id = #{id}")
    @Results(id = "cityResult", value = {
            @Result(property = "id", column = "id", id = true, javaType = Long.class, jdbcType = JdbcType.INTEGER),
            @Result(property = "cityName", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR)
    })
    City findById(long id);

    @Select("SELECT id, name FROM city")
    List<City> findAll();
}
