package com.bxy.service;

import com.bxy.dao.OrderDAO;
import com.bxy.entity.OrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/14$ 15:25$
 * @version: V_1.0.0
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    public void create(OrderMaster orderMaster) {
        orderMaster.setOrderId(UUID.randomUUID().toString());
        orderMaster.setBuyerAddress("武清区");
        orderMaster.setBuyerIphone("123456789");
        orderMaster.setBuyerName("bxy");
        orderMaster.setBuyerOpenid("xxxxxxx");
        orderMaster.setCreateTime(new Date());
        orderMaster.setOrderStatus(0);
        orderMaster.setPayStatus(0);
        orderMaster.setUpdateTime(new Date());
        orderDAO.insertSelective(orderMaster);
    }
}
