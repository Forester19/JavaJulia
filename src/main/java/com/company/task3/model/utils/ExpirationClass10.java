package com.company.task3.model.utils;

import com.company.task3.model.intefraces.expiration.Expiration;
import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.Calendar;
import java.util.Date;

public class ExpirationClass10 implements Expiration {
    private int validity = 10;

    private Date dateOfCreation;

    public ExpirationClass10 () {
        dateOfCreation = new Date();
    }

    @Override
    public long getExpiration() {
        return gatDateOfCreation().getTime() + (validity*1000*3600*24);
    }

    @Override
    public Date gatDateOfCreation() {
        return dateOfCreation;
    }

    @Override
    public String toString() {
        return "ExpirationClass10{" +
                "validity=" + validity +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }
}
