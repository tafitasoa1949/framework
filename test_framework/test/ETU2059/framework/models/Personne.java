/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ETU2059.framework.models;

import ETU2059.framework.annotation.Url;
import java.util.Date;

/**
 *
 * @author Tafitasoa-P15B-140
 */
public class Personne {
    String nom;
    int age;
    Date daty;

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDaty() {
        return daty;
    }

    public void setDaty(Date daty) {
        this.daty = daty;
    }
    
    @Url(name = "ajout_pers")
    public void ajouter(){
        
    }
}
