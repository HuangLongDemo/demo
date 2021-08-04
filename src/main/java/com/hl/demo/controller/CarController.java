package com.hl.demo.controller;

import com.hl.demo.dao.bean.Car;
import com.hl.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "get/car", method = RequestMethod.POST)
    @ResponseBody
    public List<Car> getCarByIds() {
        try{
            String ids = "1,2";
            return  carService.getCarByIds(ids);
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
