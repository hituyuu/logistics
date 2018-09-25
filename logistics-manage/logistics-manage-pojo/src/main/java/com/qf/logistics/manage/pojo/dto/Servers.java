package com.qf.logistics.manage.pojo.dto;

import java.io.Serializable;

/**
 * Created by 38126 on 2018/9/4.
 */
public class Servers implements Serializable{

     private int id;
     private String servicecompy;
     private Double freight;
     private int days;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getServicecompy() {
          return servicecompy;
     }

     public void setServicecompy(String servicecompy) {
          this.servicecompy = servicecompy;
     }

     public Double getFreight() {
          return freight;
     }

     public void setFreight(Double freight) {
          this.freight = freight;
     }

     public int getDays() {
          return days;
     }

     public void setDays(int days) {
          this.days = days;
     }

     @Override
     public String toString() {
          return "Servers{" +
                  "id=" + id +
                  ", servicecompy='" + servicecompy + '\'' +
                  ", freight=" + freight +
                  ", days=" + days +
                  '}';
     }
}
