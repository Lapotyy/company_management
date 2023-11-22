package org.example;

public class Main {
    public static void main(String[] args) {
        var x = -5 % 2;
        System.out.println(x);


        double [] officesSizes = {42.7,20.9,38.7,24.3,12.5,14.8,14.0};

        for (var size : officesSizes) {
            Office office = new Office(size);
            double rent = office.getmonthyRent();

            System.out.println("Size: "+ size + " rent is " + rent);

        }


    }
}