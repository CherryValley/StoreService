package com.johnny.store.vo;

public class CityVO {
    private int cityID;
    private int countryID;
    private int provinceID;
    private String cityNameCN;
    private String cityNameEN;
    private String inUser;
    private String inDate;
    private String lastEditUser;
    private String lastEditDate;

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public String getCityNameCN() {
        return cityNameCN;
    }

    public void setCityNameCN(String cityNameCN) {
        this.cityNameCN = cityNameCN;
    }

    public String getCityNameEN() {
        return cityNameEN;
    }

    public void setCityNameEN(String cityNameEN) {
        this.cityNameEN = cityNameEN;
    }

    public String getInUser() {
        return inUser;
    }

    public void setInUser(String inUser) {
        this.inUser = inUser;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getLastEditUser() {
        return lastEditUser;
    }

    public void setLastEditUser(String lastEditUser) {
        this.lastEditUser = lastEditUser;
    }

    public String getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(String lastEditDate) {
        this.lastEditDate = lastEditDate;
    }
}
