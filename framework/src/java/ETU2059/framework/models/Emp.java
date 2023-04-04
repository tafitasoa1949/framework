/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ETU2059.framework.models;

import ETU2059.framework.annotation.Url;
import ETU2059.framework.ModelView;

/**
 *
 * @author Tafitasoa-P15B-140
 */
public class Emp {
    
    @Url(name = "Emp-test")
    public ModelView voir(){
        ModelView modelv = new ModelView();
        modelv.setViewname("listEmp.jsp");
        return modelv;
    }
}
