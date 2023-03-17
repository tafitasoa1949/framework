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
public class Emp {
    
    @Url(name = "Emp-test")
    public void test(){
        System.out.println("fonction test");
    }
    
    @Url(name = "Emp-ajouter")
    public void ajouter(){
        System.out.println("ajouter emp");
    }
}
