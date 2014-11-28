/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundation;

/**
 *
 * @author 0xack13
 */
class LabItem extends Item {
      private String type; 
    public static int countL;
    
 public LabItem(String type1,int countL1){
    super();
    this.type= type1;
    countL++;
    
}    
 public LabItem(){
    this("",0);  
    }
    public void setType(String type2){
      this.type=type2;  
    }

   public String getType(){

       return type;
   }
   @Override
   public String toString(){
       return super.toString() + " " + "Type=" + getType() ;
   }
}
