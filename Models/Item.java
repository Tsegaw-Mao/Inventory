/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.Models;

/**
 *
 * @author omen
 */
public class Item {
    
    private int itemId;
    private String name;
    private String description;
    private int quantity;
    private int price;
    private int inStorageBinId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInStorageBinId() {
        return inStorageBinId;
    }

    public void setInStorageBinId(int inStorageBinId) {
        this.inStorageBinId = inStorageBinId;
    }
    
    
    
}
