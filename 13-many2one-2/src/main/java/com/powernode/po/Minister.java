package com.powernode.po;

public class Minister {

    private Integer mid;
    private String mname;

    private Country country;//关联属性

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Minister [mid=" + mid + ", mname=" + mname + ", country=" + country + "]";
    }

}
