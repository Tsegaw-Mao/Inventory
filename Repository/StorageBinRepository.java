/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.Repository;

import com.mycompany.inventory.Models.StorageBin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class StorageBinRepository {

    List<StorageBin> bins = new ArrayList<>();

    public StorageBinRepository(List<StorageBin> bins) {
        this.bins = bins;
    }

    public void addStorageBin(StorageBin bin) {
        this.bins.add(bin);
    }

    public void deleteStorageBinById(int binId) {
        for (StorageBin bin : bins) {
            if (bin.getBinId()==binId) {
                bins.remove(bin);
                break;
            }
        }
    }

    public void updateStorageBin(StorageBin bin) {
        for (int i = 0; i < bins.size(); i++) {
            if (bins.get(i).getBinId()==bin.getBinId()) {
                bins.set(i, bin);
                break;
            }
        }
    }

    public StorageBin searchStorageBinById(int binId) {
        for (StorageBin bin : bins) {
            if (bin.getBinId()==binId) {
                return bin;
            }
        }
        return null;
    }

    public List<StorageBin> viewAllStorageBins() {
        return bins;
    }

}
