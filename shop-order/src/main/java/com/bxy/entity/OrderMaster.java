package com.bxy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 类描述信息 ()
 *
 * @author bxy
 * @Date 2019/11/14$ 15:20$
 * @version: V_1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderMaster implements Serializable {
    @Id
    private String orderId;
    private String buyerName;
    private String buyerIphone;
    private String buyerAddress;
    private String buyerOpenid;
    private Double orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    private Date createTime;
    private Date updateTime;

}
