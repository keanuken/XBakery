/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Billing;

/**
 *
 * @author synx
 */
public class ControllerBilling {
    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();

    public void insert(String idBilling, String idOrders,String tanggalBilling, String keterangan) {
        String query = "INSERT INTO billing (id_billing, id_orders, tanggal_billing, keterangan) values"
                + "('" + idBilling + "','" + idOrders + "','" + tanggalBilling + "','" + keterangan + "')";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public List<Billing> tampil() {
        List<Billing> listBil = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                Billing bil = new Billing();
                bil.setIdBilling(rs.getString("id_billing"));
                bil.setIdOrders(rs.getString("id_orders"));
                bil.setTanggalBilling(rs.getString("tanggal_billing"));
                bil.setKeterangan(rs.getString("keterangan"));
                listBil.add(bil);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listBil;
    }

    public void update(String idBilling, String idOrders,String tanggalBilling, String keterangan) {
        int result = 0;

        String query = "UPDATE billing SET id_orders = '" + idOrders + "', "
                + "tanggal_billing = '" + tanggalBilling + "', "
                + "keterangan = '" + keterangan + "'"
                + " WHERE id_billing = '" + idBilling + "'";
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void delete(String idBilling) {

        int result = 0;
        String query = "DELETE FROM billing WHERE id_billing = " + idBilling + "";
        try {

            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {

            System.out.println(ex.toString());
        }
    }
    
     public List<Billing> cari(String cari){
        List<Billing> listBil = new ArrayList();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM billing WHERE id_billing like '%"+ cari +"%' or id_orders like '%"+ cari +"%'");
            while (rs.next()) {
                Billing bil = new Billing();
                bil.setIdBilling(rs.getString("id_billing"));
                bil.setIdOrders(rs.getString("id_orders"));
                bil.setTanggalBilling(rs.getString("tanggal_billing"));
                bil.setKeterangan(rs.getString("keterangan"));
                listBil.add(bil);
            }
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
        return listBil;
    }
}
