/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author synx
 */
public class Billing {
    private String idBilling;
    private String idOrders;
    private String tanggalBilling;
    private String Keterangan;

    public Billing(String idBilling, String idOrders, String tanggalBilling, String Keterangan) {
        this.idBilling = idBilling;
        this.idOrders = idOrders;
        this.tanggalBilling = tanggalBilling;
        this.Keterangan = Keterangan;
    }
    
    public Billing(){}

    public String getIdBilling() {
        return idBilling;
    }

    public void setIdBilling(String idBilling) {
        this.idBilling = idBilling;
    }

    public String getIdOrders() {
        return idOrders;
    }

    public void setIdOrders(String idOrders) {
        this.idOrders = idOrders;
    }

    public String getTanggalBilling() {
        return tanggalBilling;
    }

    public void setTanggalBilling(String tanggalBilling) {
        this.tanggalBilling = tanggalBilling;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }
}
