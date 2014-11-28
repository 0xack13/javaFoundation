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
class StationaryItem {
    private double size;
    private static int countS;

    public StationaryItem(double asize,int countS){
      super();
        this.size=asize;
        countS++;
    }        
    public StationaryItem(){   
     this(0.0,0);
    }
    public void setSize(double size1){
        size=size1;
    }

    public double getSize(){
        return size;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Size=" + getSize();
    }
}
