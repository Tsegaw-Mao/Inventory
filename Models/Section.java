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
public class Section {
    
    private int sectionId;
    private String aisleName;
    private int maxCapacity;
    private int occupancy;
    private int inWarehouseId;
    private List<StorageBin> bins = new ArrayList<>();

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public String getAisleName() {
        return aisleName;
    }

    public void setAisleName(String aisleName) {
        this.aisleName = aisleName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public int getInWarehouseId() {
        return inWarehouseId;
    }

    public void setInWarehouseId(int inWarehouseId) {
        this.inWarehouseId = inWarehouseId;
    }

    public List<StorageBin> getBins() {
        return bins;
    }

    public void setBins(List<StorageBin> bins) {
        this.bins = bins;
    }

        
}
