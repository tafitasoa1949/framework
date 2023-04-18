package ETU2059.framework;

import java.util.HashMap;

public class ModelView {
     String Viewname;
     HashMap<String,Object> donnees = new HashMap<String,Object>();
     public String getViewname(){
          return this.Viewname;
     }
     public void setViewname(String name){
          this.Viewname = name;
     }

    public HashMap<String, Object> getDonnees() {
        return donnees;
    }

    public void setDonnees(HashMap<String, Object> donnees) {
        this.donnees = donnees;
    }
    
    public void addItem(String key,Object value){
        donnees.put(key,value);
    }
     public ModelView(){

     }
}