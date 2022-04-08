/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul;

/**
 *
 * @author synx
 */
public class DetailOrder {
    private String idOrders;
    private String idMenu;
    private int jumlah;
    private double total;
    
    public DetailOrder(){}

    public DetailOrder(String idOrders, String idMenu, int jumlah, double total) {
        this.idOrders = idOrders;
        this.idMenu = idMenu;
        this.jumlah = jumlah;
        this.total = total;
    }

    public String getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(String idOrders) {
        this.idOrders = idOrders;
    }

    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
