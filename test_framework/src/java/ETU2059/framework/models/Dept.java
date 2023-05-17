/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ETU2059.framework.models;

import ETU2059.framework.ModelView;
import ETU2059.framework.annotation.Url;
import java.util.Vector;

/**
 *
 * @author Tafitasoa-P15B-140
 */
public class Dept {
    String nom;
    double salaire;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public Dept(String no,double sal){
        this.setNom(no);
        this.setSalaire(sal);
    }
    public Dept(){
        
    }
    @Url(name = "listdepartement")
    public ModelView findAll(){
        ModelView val = new ModelView();
        Vector<Dept> list = new Vector<Dept>();
        Dept d1 = new Dept("tafitasoa",3000);
        Dept d2 = new Dept("fleuris",2000);
        Dept d3 = new Dept("jimmy",1000);
        list.add(d1);
        list.add(d2);
        list.add(d3);
        val.addItem("li", list);
        val.setViewname("listdept.jsp");
        return val;
    }
}
