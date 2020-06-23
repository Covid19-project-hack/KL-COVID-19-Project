package com.klcovid19project.Models;

public class HealthCareList {

    String sno, address, fp, cap, name, officer;

    public HealthCareList() {
    }

    public HealthCareList(String sno, String address, String fp, String cap, String name, String officer) {
        this.sno = sno;
        this.address = address;
        this.fp = fp;
        this.cap = cap;
        this.name = name;
        this.officer = officer;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficer() {
        return officer;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }
}
