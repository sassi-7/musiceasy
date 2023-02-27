package com.work_final.finalwork.model;

import javax.persistence.*;

@Entity
@Table(name="order_info")
public class OrderInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String order_id;
    private String order_status;
    private String goods_id;
    private String goods_name;
    private String cust_account;
    private String cust_name;
    private String cust_address;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getCust_account() {
        return cust_account;
    }

    public void setCust_account(String cust_account) {
        this.cust_account = cust_account;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }
}
