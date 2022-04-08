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
public class Customers {
    private String idCustomers;
    private String namaCustomers;
    private String alamat;
    private String noTlp;
    
    public Customers(){}

    public Customers(String idCustomers, String namaCustomers, String alamat, String noTlp) {
        this.idCustomers = idCustomers;
        this.namaCustomers = namaCustomers;
        this.alamat = alamat;
        this.noTlp = noTlp;
    }

    public String getIdCustomers() {
        return idCustomers;
    }

    public void setIdCustomers(String idCustomers) {
        this.idCustomers = idCustomers;
    }

    public String getNamaCustomers() {
        return namaCustomers;
    }

    public void setNamaCustomers(String namaCustomers) {
        this.namaCustomers = namaCustomers;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }
    
    
}
