package org.example.Employeee;

public class Employee extends Person {


    public Employee(String name) {
        setName(name);
    }

    public String getSound(){
        return "Aaow!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
     this.name = capitalaizeFirstLetter(name);


    }

    @Override

    public  String eatFood(){
        return "nom nom nom";
    }

    protected String capitalaizeFirstLetter(String input) {
        String firstcharcter = input.substring(0,1).toUpperCase();
        String rest = input.substring(1);
        return firstcharcter + rest;
    }

}
