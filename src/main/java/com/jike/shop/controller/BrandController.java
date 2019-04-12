package com.jike.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jike.goods.service.BrandService;
import com.jike.pojo.TbBrand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/brand")
@RestController
public class BrandController {

    @Reference
    BrandService brandService;



    //这是一个测试用的
    @RequestMapping("/find")
    public List<TbBrand> find(){
        List<TbBrand> brandList = brandService.findAll();
        return brandList;
    }
}