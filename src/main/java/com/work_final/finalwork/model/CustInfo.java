package com.work_final.finalwork.model;

import javax.persistence.*;

@Entity
@Table(name="cust_info")
public class CustInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String cust_account;
    private String cust_name;
    private String cust_passwd;
    private String cust_address;

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

    public String getCust_passwd() {
        return cust_passwd;
    }

    public void setCust_passwd(String cust_passwd) {
        this.cust_passwd = cust_passwd;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }
}
