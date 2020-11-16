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
 * @Date 2019/11/14$ 14:28$
 * @version: V_1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo implements Serializable {
    @Id
    private  String productId;
    private  String productName;
    private  Double productPrice;
    private  Integer productStock;
    private  String productDescription;
    private  String productIcon;
    private  Integer categoryType;
    private  Date createTime;
    private  Date updateTime;
}
