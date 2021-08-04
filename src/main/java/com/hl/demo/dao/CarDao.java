package com.hl.demo.dao;

import com.hl.demo.dao.bean.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CarDao {

    @Select("select count(*) from car where 1= 1")
    int saveOne();

    List<Car> findCarByIds();
}
