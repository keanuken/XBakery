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
public class Orders {
    private String idOrders;
    private String idCustomers;
    private String tanggalOrder;
    private String keterangan;

    public Orders(String idOrders, String idCustomers, String tanggalOrder, String keterangan) {
        this.idOrders = idOrders;
        this.idCustomers = idCustomers;
        this.tanggalOrder = tanggalOrder;
        this.keterangan = keterangan;
    }

    public String getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(String idOrders) {
        this.idOrders = idOrders;
    }

    public String getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getTanggalOrder() {
        return tanggalOrder;
    }

    public void setTanggalOrder(String tanggalOrder) {
        this.tanggalOrder = tanggalOrder;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
