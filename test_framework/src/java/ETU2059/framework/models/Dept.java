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
    
    int id;
    String nom;

    public Dept(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Dept() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
   
    @Url(name = "deptlist")
    public ModelView list(){
        ModelView modelv = new ModelView();
        Dept dep1 = new Dept(1,"huhu");
        Dept dep2 = new Dept(2,"mety");
        Vector<Dept> alldept = new Vector<Dept>();
        alldept.add(dep1);
        alldept.add(dep2);
        modelv.addItem("de", alldept);
        modelv.setViewname("listdept.jsp");
        return modelv;
    }
}
