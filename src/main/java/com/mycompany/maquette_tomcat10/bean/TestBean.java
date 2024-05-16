/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maquette_tomcat10.bean;

//import jakarta.enterprise.context.RequestScoped;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

//import jakarta.inject.Named;


@Named(value = "testBean")

@SessionScoped

/**
 *
 * @author miledrousset
 */
public class TestBean implements Serializable{
    public String maPremiereDemande(){
        return "Resultat venant de Bean";
    }
 
    
    
}
