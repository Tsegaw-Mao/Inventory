/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class StorageBin {
    
    private int binId;
    private int maxCapacity;
    private int inSectionId;
    private List<Item> items = new ArrayList<>();

    public int getBinId() {
        return binId;
    }

    public void setBinId(int binId) {
        this.binId = binId;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getInSectionId() {
        return inSectionId;
    }

    public void setInSectionId(int inSectionId) {
        this.inSectionId = inSectionId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    
}
