/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ETU2059.framework.models;

import ETU2059.framework.ModelView;
import ETU2059.framework.annotation.Url;

/**
 *
 * @author Tafitasoa-P15B-140
 */
public class Emp {
    String nom;
    String prenoms;

    public String getNom() {
        return nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public Emp(String nom, String prenoms) {
        this.nom = nom;
        this.prenoms = prenoms;
    }

    public Emp() {
    }
    @Url(name = "ajouter")
    public ModelView addEmp(){
        ModelView modelv = new ModelView();
        modelv.setViewname("ajouterEmp.jsp");
        return modelv;
    }
}
