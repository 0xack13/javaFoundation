/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundation;

import java.util.Scanner;

/**
 *
 * @author 0xack13
 */
public class TestItemHashMap  {

    public static void displayMenu() { 

        System.out.println("=========================" + 
                "\n 1- Add Stationary Item" + "\n 2- Add Lab Item" + 
                "\n 3- Display all items" + "\n 4- Exit"); 
    } 

    public static void main(String[] args) { 
        ItemHashMap itHm = new ItemHashMap(); 
        Scanner input = new Scanner(System.in); 
        displayMenu(); 

        System.out.print(" Enter your choice:"); 
        int choice = input.nextInt(); 

        while (choice != 4) { 
            if (choice == 1) { 
                 // add addStationaryItem for test 
                System.out.print(" Enter Id :"); 
                int id = input.nextInt(); 
                System.out.print(" Enter Name :"); 
                String name = input.next(); 
                System.out.print(" Enter Size :"); 
                double size = input.nextDouble(); 
                StationaryItem sti = new StationaryItem(id, name, size); 
                itHm.addStationaryItem(sti); 
            }//end first if 

            if (choice == 2) { 
                // add addLabItem for test 
                System.out.print(" Enter Id :"); 
                int id = input.nextInt(); 
                System.out.print(" Enter Name :"); 
                String name = input.next(); 
                System.out.print(" Enter type :"); 
                String type = input.next(); 
                LabItem labi = new LabItem(id, name, type); 
                itHm.addLabItem(labi); 

            }//end  second if 
            if (choice == 3) { 
                System.out.println(itHm.displayItemsInHashMap()); 
            } 

            System.out.println(); 
            System.out.print(" Enter your choice:"); 
            choice = input.nextInt(); 
        }//end while 
        if (choice == 4) { 
            System.out.println("\n the number of item is :" + ItemHashMap.hmCounter); 
            System.out.println(" the number of Stationaryitem is :" + StationaryItem.countS); 
            System.out.println(" the number of LabItem item is :" + LabItem.countL); 
            System.exit(0); 
        } 
    }//END main method 
    
    
    
}
