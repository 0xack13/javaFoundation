/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafoundation;

import java.util.HashMap;

/**
 *
 * @author 0xack13
 */
public class ItemHashMap {
    //Private Hashmap
    private HashMap<Integer, Item> hm = new HashMap<Integer, Item>();
    //current number of created "ItemHashMap"
    public static int hmCounter = 0;
    
    public void ItemHashMap() {
        hm = new HashMap<Integer, Item>();
    }
    
    public void addStationaryItem (StationaryItem sti) {
        hm.put(hmCounter, sti);
        hmCounter++;
    }
    
    public void addLabItem(LabItem labi) {
        hm.put(hmCounter, labi);
        hmCounter++;
    }
    
    public String displayItemsInHashMap() {
        String msg = null;
        if(hm.isEmpty())
        {
            msg = "NO items are available";
        } else {
            for(Integer i : hm.keySet())
            {
                msg += "Key: " + i + " With a value of: " + hm.get(i) + "\n";
            }
        }
        return msg;
    }
}
