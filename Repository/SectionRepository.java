/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory.Repository;

import com.mycompany.inventory.Models.Section;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omen
 */
public class SectionRepository {
    List<Section> sections = new ArrayList<>();

    public SectionRepository(List<Section> sections) {
        this.sections = sections;
    }
    
    
    
    public void addSection(Section section){
        this.sections.add(section);
    }
    public void deleteSectionById(int sectionId){
        for(Section section : sections){
            if(section.getSectionId()==sectionId){
                sections.remove(section);
                break;
            }
        }
    }
    public void updateSection(Section updatesection){
        for(int i = 0 ; i < sections.size() ; i++ ){
            if(sections.get(i).getSectionId() == updatesection.getInWarehouseId()){
                sections.set(i, updatesection);
                break;
            }
        }
    }
    public Section searchSectionById(int sectionId){
        for(Section section : sections){
            if(section.getSectionId()==sectionId){
                return section;
            }
        }
        return null;
    }
    public List<Section> viewAllSections(){
        return sections;
    }
    
    
}
