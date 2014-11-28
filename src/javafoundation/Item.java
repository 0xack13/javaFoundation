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
class Item {
    private int id;
    private String name;

    public Item(int Id,String Name){
        this.id= Id;
        this.name=Name;
    }

    public Item(){
        this(0,"");
    }

    public void setId(int id1){           
            this.id = id1;
    }
        public void setName(String name1){
            this.name = name1;
       }

    public int getId(){
        return id;
     }
    public String getName(){
       return name;   
     }

    @Override
    public String toString(){
     return"the id is ="+" "+id+" "+"and the name is ="+""+name;       
    }   
}
