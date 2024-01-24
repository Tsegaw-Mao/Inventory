/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.inventory;

import com.mycompany.inventory.Models.*;
import com.mycompany.inventory.Service.InventoryService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author omen
 */
public class Main {

    public static Scanner inp = new Scanner(System.in);
    public static InventoryService ir = new InventoryService();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        int casee;
        System.out.println("Press Enter to Continue ");
        inp.nextLine();
        while (true) {

            System.out.println("INVENTORY SYSTEM");
            System.out.println("Main Menu");
            System.out.println("1. WAREHOUSE");
            System.out.println("2. SECTION");
            System.out.println("3. STORAGE BIN");
            System.out.println("4. ITEM");
            System.out.println(" PRESS ANY LETTER TO EXIT ");
            System.out.println("Choice : ");
            if (inp.hasNextInt()) {
                casee = inp.nextInt();
                switch (casee) {
                    case 1:
                        warehouseMenu();
                        break;
                    case 2:
                        sectionMenu();
                        break;
                    case 3:
                        storageBinMenu();
                        break;
                    case 4:
                        itemMenu();
                        break;
                    default: {
                        inp.nextLine();
                        System.out.println(" !! Wrong Choice !!");
                        System.out.println(" Press Enter to go Back  ");
                        inp.nextLine();
                    }

                }
            } else {
                break;
            }
        }

    }

    private static void warehouseMenu() {

        int casee;
        while (true) {
            System.out.println(" WAREHOUSE PAGE");
            System.out.println(" WAREHOUSE MENU");
            System.out.println(" 1. ADD WAREHOUSE ");
            System.out.println(" 2. UPDATE WAREHOUSE ");
            System.out.println(" 3. DELTE WAREHOUSE ");
            System.out.println(" 4. SEARCH WAREHOUSE ");
            System.out.println(" 5. VIEW ALL WAREHOUSES ");
            System.out.println(" PRESS ANY LETTER TO GO BACK TO MAIN MENU");
            System.out.println("Choice : ");

            if (inp.hasNextInt()) {
                casee = inp.nextInt();
                switch (casee) {
                    case 1:
                        addWarehouse();
                        break;
                    case 2:
                        updateWarehouse();
                        break;
                    case 3:
                        deleteWarehouse();
                        break;
                    case 4:
                        searchWarehouse();
                        break;
                    case 5:
                        viewAllWarehouses();
                        break;
                    default: {
                        inp.nextLine();
                        System.out.println(" !! Wrong Choice !! ");
                        System.out.println(" Press Enter to go Back  ");
                        inp.nextLine();
                    }
                }
            } else {
                mainMenu();
            }
        }
    }

    private static void addWarehouse() {
        Warehouse warehouse = new Warehouse();
        System.out.println("Create New Warehouse");
        System.out.println("Warehouse ID : ");
        warehouse.setWarehouseId(inp.nextInt());
        inp.nextLine();
        System.out.println("Location : ");
        warehouse.setLocation(inp.nextLine());
        System.out.println("Capacity : ");
        warehouse.setCapacity(inp.nextInt());
        System.out.println("Occupancy : ");
        warehouse.setOccupancy(inp.nextInt());

        ir.addWarehouse(warehouse);
        System.out.println("  Warehouse Created Sussessfully  ");
        System.out.println("Press Enter to go Back to Warehouse Menu");
        inp.nextLine();
    }

    private static void updateWarehouse() {
        Warehouse warehouse = new Warehouse();
        System.out.println("Update an Existing Warehouse");
        System.out.println("Warehouse ID : ");
        warehouse.setWarehouseId(inp.nextInt());
        inp.nextLine();
        System.out.println("Location : ");
        warehouse.setLocation(inp.nextLine());
        System.out.println("Capacity : ");
        warehouse.setCapacity(inp.nextInt());
        System.out.println("Occupancy : ");
        warehouse.setOccupancy(inp.nextInt());

        ir.updateWarehouse(warehouse);
        System.out.println("  Warehouse Updated Sussessfully  ");
        System.out.println("Press Enter to go Back to Warehouse Menu");
        inp.nextLine();
    }

    private static void deleteWarehouse() {
        System.out.println(" Delete an Existing Warehouse  ");
        System.out.println("Warehouse ID : ");
        ir.deleteWarehouse(inp.nextInt());

        System.out.println("  Warehouse Deleted Sussessfully  ");
        System.out.println("Press Enter to go Back to Warehouse Menu");
        inp.nextLine();
    }

    private static void searchWarehouse() {
        Warehouse warehouse = new Warehouse();
        System.out.println(" Search an Existing Warehouse  ");
        System.out.println("Warehouse ID : ");
        warehouse = ir.searchWarehouse(inp.nextInt());

        System.out.println("Result Warehouse ID : " + warehouse.getWarehouseId());
        System.out.println("Result Warehouse Location : " + warehouse.getLocation());
        System.out.println("Result Warehouse Capacity : " + warehouse.getCapacity());
        System.out.println("Result Warehouse Occupancy : " + warehouse.getOccupancy());
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < warehouse.getSections().size(); i++) {
            ids.add(warehouse.getSections().get(i).getSectionId());
        }
        System.out.println("Result Warehouse Sections IDs : " + ids);

        System.out.println("");
        System.out.println("");
        System.out.println("Press Enter to go Back to Warehouse Menu");
        inp.nextLine();

    }

    private static void viewAllWarehouses() {

        List<Warehouse> warehouses = new ArrayList<>();
        warehouses = ir.viewAllWarehouses();
        for (Warehouse warehouse : warehouses) {
            System.out.println(" Warehouse ID : " + warehouse.getWarehouseId());
            System.out.println(" Warehouse Location : " + warehouse.getLocation());
            System.out.println(" Warehouse Capacity : " + warehouse.getCapacity());
            System.out.println(" Warehouse Occupancy : " + warehouse.getOccupancy());
            List<Integer> ids = new ArrayList<>();
            for (int i = 0; i < warehouse.getSections().size(); i++) {
                ids.add(warehouse.getSections().get(i).getSectionId());
            }

            System.out.println(" Warehouse Sections IDs : " + ids);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Press Enter to go Back to Warehouse Menu");
        inp.nextLine();

    }

    private static void sectionMenu() {

        int casee;
        while (true) {
            System.out.println(" SECTION PAGE");
            System.out.println(" SECTION MENU");
            System.out.println(" 1. ADD SECTION ");
            System.out.println(" 2. UPDATE SECTION ");
            System.out.println(" 3. DELTE SECTION ");
            System.out.println(" 4. SEARCH SECTION ");
            System.out.println(" 5. VIEW ALL SECTIONS ");
            System.out.println(" PRESS ANY LETTER TO GO BACK TO MAIN MENU");
            System.out.println("Choice : ");

            if (inp.hasNextInt()) {
                casee = inp.nextInt();
                switch (casee) {
                    case 1:
                        addSection();
                        break;
                    case 2:
                        updateSection();
                        break;
                    case 3:
                        deleteSection();
                        break;
                    case 4:
                        searchSection();
                        break;
                    case 5:
                        viewAllSections();
                        break;
                    default: {
                        inp.nextLine();
                        System.out.println(" !! Wrong Choice !! ");
                        System.out.println(" Press Enter to go Back  ");
                        inp.nextLine();
                    }
                }
            } else {
                mainMenu();
            }

        }
    }

    private static void addSection() {

        int warehouseId;

        Section section = new Section();
        System.out.println("Create New Section");
        System.out.println("Section ID : ");
        section.setSectionId(inp.nextInt());
        inp.nextLine();
        System.out.println("Aisle Name : ");
        section.setAisleName(inp.nextLine());
        System.out.println("Maximum Capacity : ");
        section.setMaxCapacity(inp.nextInt());
        System.out.println("Occupancy : ");
        section.setOccupancy(inp.nextInt());
        System.out.println("Set in Warehouse ID : ");
        warehouseId = inp.nextInt();
        section.setInWarehouseId(warehouseId);

        Warehouse warehouse = ir.searchWarehouse(warehouseId);

        ir.addSection(warehouse, section);
        System.out.println("  Section Created Sussessfully  ");
    }

    private static void updateSection() {
        int warehouseId;

        Section section = new Section();
        System.out.println("Update Existing Section");
        System.out.println("Section ID : ");
        section.setSectionId(inp.nextInt());
        inp.nextLine();
        System.out.println("Aisle Name : ");
        section.setAisleName(inp.nextLine());
        System.out.println("Maximum Capacity : ");
        section.setMaxCapacity(inp.nextInt());
        System.out.println("Occupancy : ");
        section.setOccupancy(inp.nextInt());
        System.out.println("Set in Warehouse ID : ");
        warehouseId = inp.nextInt();
        section.setInWarehouseId(warehouseId);

        Warehouse warehouse = ir.searchWarehouse(warehouseId);

        ir.updateSection(warehouse, section);
        System.out.println("  Section Updated Sussessfully  ");

    }

    private static void deleteSection() {

        System.out.println(" Delete an Existing Section ");
        System.out.println("Warehouse ID : ");
        Warehouse warehouse = ir.searchWarehouse(inp.nextInt());

        System.out.println("Section ID to be Deleted : ");
        int id = inp.nextInt();

        ir.deleteSection(warehouse, id);

        System.out.println("  Warehouse Deleted Sussessfully  ");

    }

    private static void searchSection() {

        System.out.println(" Search an Existing Section ");
        System.out.println("Warehouse ID : ");
        Warehouse warehouse = ir.searchWarehouse(inp.nextInt());

        System.out.println("Section ID to be Searched : ");
        int id = inp.nextInt();
        Section section = new Section();

        section = ir.searchSection(warehouse, id);

        System.out.println(" Result Section ID : " + section.getSectionId());
        System.out.println(" Result Aisle Name : " + section.getAisleName());
        System.out.println(" Result Maximum Capacity : " + section.getMaxCapacity());
        System.out.println(" Result Occupancy : " + section.getOccupancy());
        System.out.println(" Result Found in Warehouse ID : " + section.getInWarehouseId());
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < section.getBins().size(); i++) {
            ids.add(section.getBins().get(i).getBinId());
        }

        System.out.println(" Result Section List of Storage Bins IDs : " + ids);

    }

    private static void viewAllSections() {

        System.out.println(" Show All Existing Sections ");
        System.out.println("Warehouse ID : ");
        Warehouse warehouse = ir.searchWarehouse(inp.nextInt());

        List<Section> sections = new ArrayList<>();

        sections = ir.viewAllSections(warehouse);
        for (Section section : sections) {

            System.out.println(" Section ID : " + section.getSectionId());
            System.out.println(" Aisle Name : " + section.getAisleName());
            System.out.println(" Maximum Capacity : " + section.getMaxCapacity());
            System.out.println(" Occupancy : " + section.getOccupancy());
            System.out.println(" Found in Warehouse ID : " + section.getInWarehouseId());
            List<Integer> ids = new ArrayList<>();
            for (int i = 0; i < section.getBins().size(); i++) {
                ids.add(section.getBins().get(i).getBinId());
            }

            System.out.println(" List of Storage Bins IDs : " + ids);

        }

    }

    private static void storageBinMenu() {

        int casee;
        while (true) {
            System.out.println(" STORAGE BIN PAGE");
            System.out.println(" STORAGE BIN MENU");
            System.out.println(" 1. ADD STORAGE BIN ");
            System.out.println(" 2. UPDATE STORAGE BIN ");
            System.out.println(" 3. DELTE STORAGE BIN ");
            System.out.println(" 4. SEARCH STORAGE BIN ");
            System.out.println(" 5. VIEW ALL STORAGE BINS ");
            System.out.println(" PRESS ANY LETTER TO GO BACK TO MAIN MENU");
            System.out.println("Choice : ");

            if (inp.hasNextInt()) {
                casee = inp.nextInt();
                switch (casee) {
                    case 1:
                        addStorageBin();
                        break;
                    case 2:
                        UpdateStorageBin();
                        break;
                    case 3:
                        deleteStorageBin();
                        break;
                    case 4:
                        searchStorageBin();
                        break;
                    case 5:
                        viewAllStorageBins();
                        break;
                    default: {
                        inp.nextLine();
                        System.out.println(" !! Wrong Choice !! ");
                        System.out.println(" Press Enter to go Back  ");
                        inp.nextLine();
                    }
                }
            } else {
                mainMenu();
            }

        }
    }

    private static void addStorageBin() {
        Warehouse w;
        Section s;
        StorageBin bin = new StorageBin();
        System.out.println("Create New Storage Bin");
        System.out.println("Storage Bin ID : ");
        bin.setBinId(inp.nextInt());
        System.out.println("Maximum Capacity : ");
        bin.setMaxCapacity(inp.nextInt());
        System.out.println("Set in Section ID : ");
        int sid = inp.nextInt();
        bin.setInSectionId(sid);
        System.out.println("Set in Under Warehouse ID : ");
        int wid = inp.nextInt();

        w = ir.searchWarehouse(wid);
        s = ir.searchSection(w, sid);

        ir.addStorageBin(w, s, bin);

        System.out.println("   Storage Bin Created Sussessfully   ");

    }

    private static void UpdateStorageBin() {

        Warehouse w;
        Section s;
        StorageBin bin = new StorageBin();
        System.out.println("Update Existing Storage Bin");
        System.out.println("Storage Bin ID : ");
        bin.setBinId(inp.nextInt());
        System.out.println("Maximum Capacity : ");
        bin.setMaxCapacity(inp.nextInt());
        System.out.println("Set in Section ID : ");
        int sid = inp.nextInt();
        bin.setInSectionId(sid);
        System.out.println("Set in Under Warehouse ID : ");
        int wid = inp.nextInt();

        w = ir.searchWarehouse(wid);
        s = ir.searchSection(w, sid);

        ir.updateStorageBin(w, s, bin);

        System.out.println("   Storage Bin Updated Sussessfully   ");

    }

    private static void deleteStorageBin() {

        Warehouse w;
        Section s;

        System.out.println("Delete an Existing Storage Bin");
        System.out.println("Storage Bin Found in Warehouse ID : ");
        int wid = inp.nextInt();
        System.out.println("Storage Bin Found under Section ID : ");
        int sid = inp.nextInt();
        System.out.println("Storage Bin ID to Be Deleted : ");
        int binId = inp.nextInt();
        w = ir.searchWarehouse(wid);
        s = ir.searchSection(w, sid);

        ir.deleteStorageBin(w, s, binId);

        System.out.println("Storage Bin Deleted Sussessfully");

    }

    private static void searchStorageBin() {

        System.out.println(" Search an Existing Storage Bin ");
        System.out.println("Search in Warehouse ID : ");

        Warehouse warehouse = ir.searchWarehouse(inp.nextInt());

        System.out.println("Search Under Storage Bin ID : ");
        Section section = ir.searchSection(warehouse, inp.nextInt());

        System.out.println("Storage Bin ID to be Searched : ");
        int id = inp.nextInt();
        StorageBin bin = new StorageBin();

        bin = ir.searchStorageBin(warehouse, section, id);

        System.out.println(" Result Storage Bin ID : " + bin.getBinId());
        System.out.println(" Result Maximum Capacity : " + bin.getMaxCapacity());
        System.out.println(" Result Found Under Section ID : " + bin.getInSectionId());

        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < bin.getItems().size(); i++) {
            ids.add(bin.getItems().get(i).getItemId());
        }

        System.out.println(" Result Section List of Storage Bins IDs : " + ids);

    }

    private static void viewAllStorageBins() {
        System.out.println(" Search an Existing Storage Bin ");
        System.out.println(" In Warehouse ID : ");

        Warehouse warehouse = ir.searchWarehouse(inp.nextInt());

        System.out.println("Show Under Storage Bin ID : ");
        Section section = ir.searchSection(warehouse, inp.nextInt());

        List<StorageBin> bins = new ArrayList<>();
        bins = ir.viewAllStorageBins(warehouse, section);
        for (StorageBin bin : bins) {

            System.out.println(" Storage Bin ID : " + bin.getBinId());
            System.out.println(" Maximum Capacity : " + bin.getMaxCapacity());
            System.out.println(" Found Under Section ID : " + bin.getInSectionId());

            List<Integer> ids = new ArrayList<>();
            for (int i = 0; i < bin.getItems().size(); i++) {
                ids.add(bin.getItems().get(i).getItemId());
            }

            System.out.println(" Section List of Storage Bins IDs : " + ids);
        }
    }

    private static void itemMenu() {

        int casee;
        while (true) {
            System.out.println(" ITEM PAGE");
            System.out.println(" ITEM MENU");
            System.out.println(" 1. ADD ITEM ");
            System.out.println(" 2. UPDATE ITEM ");
            System.out.println(" 3. DELTE ITEM ");
            System.out.println(" 4. SEARCH ITEM ");
            System.out.println(" 5. VIEW ALL ITEM ");
            System.out.println(" PRESS ANY LETTER TO GO BACK TO MAIN MENU");
            System.out.println("Choice : ");

            if (inp.hasNextInt()) {
                casee = inp.nextInt();
                switch (casee) {
                    case 1:
                        addItem();
                        break;
                    case 2:
                        updateItem();
                        break;
                    case 3:
                        deleteItem();
                        break;
                    case 4:
                        searchItem();
                        break;
                    case 5:
                        viewAllItems();
                        break;
                    default: {
                        inp.nextLine();
                        System.out.println(" !! Wrong Choice !! ");
                        System.out.println(" Press Enter to go Back  ");
                        inp.nextLine();
                    }
                }
            } else {
                mainMenu();
            }

        }
    }

    private static void addItem() {

    }

    private static void updateItem() {

    }

    private static void deleteItem() {

    }

    private static void searchItem() {

    }

    private static void viewAllItems() {

    }
}
