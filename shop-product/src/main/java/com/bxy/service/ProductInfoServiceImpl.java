package com.bxy.service;

import com.bxy.dao.ProductInfoDAO;
import com.bxy.entity.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/14$ 14:32$
 * @version: V_1.0.0
 */

@Service
@Transactional
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDAO productInfoDAO;

    @Override
    public List<ProductInfo> selectAll() {
        return productInfoDAO.selectAll();
    }

    @Override
    public ProductInfo selectById(String productId) {
        return productInfoDAO.selectByPrimaryKey(productId);
    }
}
