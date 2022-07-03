package com.stock.micservice.entities;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.io.Serializable;
import java.math.BigDecimal;

class CompositeKey implements Serializable {
    private String date;
    private String time;
}
@Entity
@Table
@IdClass(CompositeKey.class)
public class Stock implements Serializable {
    private long compcode;
    @Id
    private String date;
    @Id
    private String time;
    private BigDecimal stkprice;

    public Stock() {
    }

    public Stock(long compcode, String date, String time, BigDecimal stkprice) {
        this.compcode = compcode;
        this.date = date;
        this.time = time;
        this.stkprice = stkprice;
    }

    public long getCompcode() {
        return compcode;
    }

    public void setCompcode(long compcode) {
        this.compcode = compcode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public BigDecimal getStkprice() {
        return stkprice;
    }

    public void setStkprice(BigDecimal stkprice) {
        this.stkprice = stkprice;
    }

}

