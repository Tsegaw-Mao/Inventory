/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.Service;

import com.mycompany.inventory.Models.*;
import com.mycompany.inventory.Repository.*;
import java.util.List;

/**
 *
 * @author omen
 */
public class InventoryService {

    WarehouseRepository wr = new WarehouseRepository();
    SectionRepository sr;
    StorageBinRepository sbr;
    ItemRepository ir;

    public void addWarehouse(Warehouse warehouse) {
        wr.addWarehouse(warehouse);
    }

    public void updateWarehouse(Warehouse warehouse) {
        wr.updateWarehouse(warehouse);
    }

    public void deleteWarehouse(int warehouseId) {
        wr.deleteWarehouseById(warehouseId);
    }

    public Warehouse searchWarehouse(int warehouseId) {
        return wr.searchWarehouseById(warehouseId);
    }

    public List<Warehouse> viewAllWarehouses() {
        return wr.viewAllWarehouses();
    }

    public void addSection(Warehouse warehouse, Section section) {
        sr = new SectionRepository(warehouse.getSections());
        sr.addSection(section);
        warehouse.setSections(sr.viewAllSections());
        wr.updateWarehouse(warehouse);
    }

    public void updateSection(Warehouse warehouse, Section section) {
        sr = new SectionRepository(warehouse.getSections());
        sr.updateSection(section);
        warehouse.setSections(sr.viewAllSections());
        wr.updateWarehouse(warehouse);
    }

    public void deleteSection(Warehouse warehouse, int sectionId) {
        sr = new SectionRepository(warehouse.getSections());
        sr.deleteSectionById(sectionId);
        warehouse.setSections(sr.viewAllSections());
        wr.updateWarehouse(warehouse);
    }

    public Section searchSection(Warehouse warehouse, int sectionId) {
        sr = new SectionRepository(warehouse.getSections());
        return sr.searchSectionById(sectionId);
    }

    public List<Section> viewAllSections(Warehouse warehouse) {
        sr = new SectionRepository(warehouse.getSections());
        return sr.viewAllSections();
    }

    public void addStorageBin(Warehouse warehouse, Section section, StorageBin bin) {
        sbr = new StorageBinRepository(section.getBins());
        sbr.addStorageBin(bin);
        section.setBins(sbr.viewAllStorageBins());
        this.updateSection(warehouse, section);
    }

    public void updateStorageBin(Warehouse warehouse, Section section, StorageBin bin) {
        sbr = new StorageBinRepository(section.getBins());
        sbr.updateStorageBin(bin);
        section.setBins(sbr.viewAllStorageBins());
        this.updateSection(warehouse, section);
    }

    public void deleteStorageBin(Warehouse warehouse, Section section, int binId) {
        sbr = new StorageBinRepository(section.getBins());
        sbr.deleteStorageBinById(binId);
        section.setBins(sbr.viewAllStorageBins());
        this.updateSection(warehouse, section);
    }

    public StorageBin searchStorageBin(Warehouse warehouse, Section section, int binId) {
        sbr = new StorageBinRepository(section.getBins());
        return sbr.searchStorageBinById(binId);
    }

    public List<StorageBin> viewAllStorageBins(Warehouse warehouse, Section section) {
        sbr = new StorageBinRepository(section.getBins());
        return sbr.viewAllStorageBins();
    }
    public void addItem(Warehouse warehouse, Section section, StorageBin bin, Item item) {
        ir = new ItemRepository(bin.getItems());
        ir.addItem(item);
        bin.setItems(ir.viewAllItems());
        this.updateStorageBin(warehouse, section, bin);
    }
    public void updateItem(Warehouse warehouse, Section section, StorageBin bin, Item item) {
        ir = new ItemRepository(bin.getItems());
        ir.updateItem(item);
        bin.setItems(ir.viewAllItems());
        this.updateStorageBin(warehouse, section, bin);
    }
    public void deleteItem(Warehouse warehouse, Section section, StorageBin bin, int itemId){
        ir = new ItemRepository(bin.getItems());
        ir.deleteItemById(itemId);
        bin.setItems(ir.viewAllItems());
        this.updateStorageBin(warehouse, section, bin);
    }
    public Item searchItem(Warehouse warehouse, Section section, StorageBin bin, int itemId){
        ir = new ItemRepository(bin.getItems());
        return ir.searchItemById(itemId) ;
    }
    public List<Item> viewAllItems(Warehouse warehouse, Section section, StorageBin bin){
        ir = new ItemRepository(bin.getItems());
        return ir.viewAllItems();
    }
}
