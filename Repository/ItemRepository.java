/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.Repository;

import com.mycompany.inventory.Models.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class ItemRepository {

    List<Item> items = new ArrayList<>();

    public ItemRepository(List<Item> items) {
        this.items = items;
    }
    
    

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void deleteItemById(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                items.remove(item);
                break;
            }
        }
    }

    public void updateItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId() == item.getItemId()) {
                items.set(i, item);
                break;
            }
        }
    }

    public Item searchItemById(int itemId) {
        for (Item item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }

    public List<Item> viewAllItems() {
        return items;
    }

}
