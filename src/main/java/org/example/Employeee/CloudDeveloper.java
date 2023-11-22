package org.example.Employeee;

import org.example.Employeee.Developer;
import org.example.Website;

public class CloudDeveloper extends Developer {


    public CloudDeveloper(String name, String programmingLanguage) {
        super(name, programmingLanguage);
    }

    public void fixWebsite(Website website) {
        website.fix();
    }

}
