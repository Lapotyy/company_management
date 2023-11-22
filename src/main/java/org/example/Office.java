package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Office {

    private static final int RENT_SMALL_OFFICE = 3200;
    private static final int RENT_LARGE_OFFICE = 2785;
    private static final int OFFICE_SIZE_BREAKPOINT= 20;

    private static final int OFFICE_TAX= 150;

    public double size;

    public Office(double size) {
        this.size = size;
    }

    public double getmonthyRent() {
        double yearlyrent = getYearlyrent();

        double monthlyrent = round(yearlyrent / 12);
        return monthlyrent;
    }

    private double getYearlyrent() {
        double yearlySpaceRent = getYearlySpacerent();
        double yearlyTax = getYearlTax();

        return yearlySpaceRent + yearlyTax;
    }

    private double getYearlTax() {
        return OFFICE_TAX * size;
    }

    private double getYearlySpacerent() {
        if ((size < OFFICE_SIZE_BREAKPOINT)){
            return RENT_SMALL_OFFICE*size;
        }
        else {
            return RENT_LARGE_OFFICE*size;
        }
    }

    private static double round(double value) {
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();



    }
}

