package com.example.springCourse.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table
public class Company {
    @Id
    private long compcode;
    private String compname;

    private String turnover;
    private String ceo;
    private String website;
    private String stkex;

    public String getTurnover() {return turnover;}

    public void setTurnover(String turnover) {this.turnover = turnover;}

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getStkex() {
        return stkex;
    }

    public void setStkex(String stkex) {
        this.stkex = stkex;
    }

    public long getCompcode() {
        return compcode;
    }

    public void setCompcode(long compcode) {
        this.compcode = compcode;
    }
}


//    Company Code
//    b. Company Name
//    c. Company CEO
//    d. Company Turnover
//    e. Company Website
//    f. Stock Exchange it is enlisted in
//        (BSE, NSE etc)