package com.maikegroup.delight.data.repository.data.lmeprice.model;

import java.io.Serializable;

public class LmePrice implements Serializable {
    private Integer key;

    private Integer id;

    private String title;

    private String date;

    private String pricerange;

    private String avgprice;

    private String up2down;

    private String danwei;

    private static final long serialVersionUID = 1L;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getPricerange() {
        return pricerange;
    }

    public void setPricerange(String pricerange) {
        this.pricerange = pricerange == null ? null : pricerange.trim();
    }

    public String getAvgprice() {
        return avgprice;
    }

    public void setAvgprice(String avgprice) {
        this.avgprice = avgprice == null ? null : avgprice.trim();
    }

    public String getUp2down() {
        return up2down;
    }

    public void setUp2down(String up2down) {
        this.up2down = up2down == null ? null : up2down.trim();
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei == null ? null : danwei.trim();
    }
}