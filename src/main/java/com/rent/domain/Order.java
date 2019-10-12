package com.rent.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Author 贾振乾
 * Date 2019/10/10
 * Time 13:58
 */
@Entity
@Data
@Table(name = "orders")
@AllArgsConstructor
public class Order {
//"    \"out_trade_no\":\"20150320013335\"," +
//                "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
//                "    \"total_amount\":10.0," +
//                "    \"subject\":\"小米 16G\"," +
//                "    \"body\":\"小米 1G\"," +
//                "    \"passback_params\":\"merchantBizType%3d3C%26merchantBizNo%3d2016010101111\"," +
//                "    \"extend_params\":{" +
//                "    \"sys_service_provider_id\":\"2088511833207846\"" +


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "o_id")
    private Integer orderId;//订单id

    @Column(name = "o_code")
    private String orderCode;//订单编号

    @Column(name = "o_price")
    private BigDecimal totalP;//订单金额

    @Column(name = "o_name")
    private String orderName;//订单名称

    @Column(name = "o_status")
    private String orderStatus;//订单状态

    @Column(name="o_unitPrice")
    private BigDecimal unitPrice;//单价

    @Column(name="o_month")
    private Integer month;//租期月份

    @Column(name = "u_id")
    private Integer userId;//用户id

    public Order(String orderCode, BigDecimal totalP, String orderName, String orderStatus, BigDecimal unitPrice, Integer month, Integer userId) {
        this.orderCode = orderCode;
        this.totalP = totalP;
        this.orderName = orderName;
        this.orderStatus = orderStatus;
        this.unitPrice = unitPrice;
        this.month = month;
        this.userId = userId;
    }

    public Order() {
    }
}
