package com.bxy.service;

import com.bxy.entity.ProductInfo;

import java.util.List;

public interface ProductInfoService {

    List<ProductInfo> selectAll();

    ProductInfo selectById(String productId);
}
