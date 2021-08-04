package com.hl.demo.service;


import com.hl.demo.dao.CarDao;
import com.hl.demo.dao.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public List<Car> getCarByIds(String carIds) {
        List<Integer> idList = Arrays.stream(carIds.split(",")).map(Integer::valueOf).collect(Collectors.toList());
        int count = carDao.saveOne();
        return carDao.findCarByIds();
    }
}


