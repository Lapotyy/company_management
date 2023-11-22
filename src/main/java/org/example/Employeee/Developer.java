package org.example.Employeee;

public class Developer extends Employee implements ICanProgram {


    private String programingLanguage;

    public Developer(String name, String programingLanguage) {
        super(name);
        this.programingLanguage = programingLanguage;
    }

    @Override
    public String getSound(){
        return "Woop Woop";
    }


    public String getProgramingLanguage(){
        return programingLanguage;
    }


    @Override
    public String program() {
        return name + " write some " + programingLanguage;

    }
}
