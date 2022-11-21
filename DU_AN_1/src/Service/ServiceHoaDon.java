/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DoMain.HoaDon;
import Repository.RepositoryHoaDon;
import ViewModel.HoaDonViewModel;
import java.util.ArrayList;

/**
 *
 * @author mngha
 */
public class ServiceHoaDon { 
    
    private RepositoryHoaDon hd;
    
    public ServiceHoaDon(){
        this.hd = new RepositoryHoaDon();
    }
    public void insert(HoaDon hd){
        this.hd.insert(hd);
    }
    public void update(String id, HoaDon hd){
        this.update(id, hd);
    }
    public void delete(String id){
        this.delete(id);
    }
    public ArrayList<HoaDonViewModel> getHoaDon(){
        return this.hd.AllHoaDon();
    }
}
