package com.mycompany.maquette_tomcat10.bean;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author miledrousset
 */
@SessionScoped
@Named(value = "testBean")
public class TestBean implements Serializable{

    public String maPremiereDemande(){
        return "Resultat venant de Bean";
    }
    
}
