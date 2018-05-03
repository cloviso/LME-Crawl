package com.maikegroup.delight.data.repository.data.cuPrice.model;

import java.io.Serializable;

public class CuPrice implements Serializable {
    private String tId;

    private String title;

    private String datestr;

    private String pricerange;

    private String avgprice;

    private String rollprice;

    private String unit;

    private static final long serialVersionUID = 1L;

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDatestr() {
        return datestr;
    }

    public void setDatestr(String datestr) {
        this.datestr = datestr == null ? null : datestr.trim();
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

    public String getRollprice() {
        return rollprice;
    }

    public void setRollprice(String rollprice) {
        this.rollprice = rollprice == null ? null : rollprice.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }
}