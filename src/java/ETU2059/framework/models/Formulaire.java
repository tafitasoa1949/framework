/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ETU2059.framework.models;

import ETU2059.framework.annotation.Url;

/**
 *
 * @author Tafitasoa-P15B-140
 */
public class Formulaire {
    @Url(name = "Formulaire-insert")
    public void insert(){
        System.out.println("insert formulaire");
    }
    
    @Url(name = "Formulaire-delete")
    public void delete(){
        System.out.println("delete formulaire");
    }
}
