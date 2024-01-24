/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.Repository;

import com.mycompany.inventory.Models.Warehouse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class WarehouseRepository {
    
    List<Warehouse> warehouses = new ArrayList<>();
    public void addWarehouse(Warehouse warehouse){
        this.warehouses.add(warehouse);
    }
    public void deleteWarehouseById(int warehouseId){
        for(Warehouse warehouse : warehouses){
            if(warehouse.getWarehouseId()==warehouseId){
                warehouses.remove(warehouse);
                break;
            }
        }
    }
    public void updateWarehouse(Warehouse updatewarehouse){
        for(int i = 0 ; i < warehouses.size() ; i++ ){
            if(warehouses.get(i).getWarehouseId() == updatewarehouse.getWarehouseId()){
                warehouses.set(i, updatewarehouse);
                break;
            }
        }
    }
    public Warehouse searchWarehouseById(int warehouseId){
        for(Warehouse warehouse : warehouses){
            if(warehouse.getWarehouseId()==warehouseId){
                return warehouse;
            }
        }
        return null;
    }
    public List<Warehouse> viewAllWarehouses(){
        return warehouses;
    }
    
}
