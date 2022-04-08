/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modul.Customers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author synx
 */
public class ControllerCustomers {

    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();

    public void insert(String idCustomers, String namaCustomers, String alamat, String noTlp) {
        String query = "INSERT INTO customers (id_customers, namaCustomers, alamat, noTlp) values"
                + "('" + idCustomers + "','" + namaCustomers + "','" + alamat + "','" + noTlp + "')";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public List<Customers> tampil() {
        List<Customers> listCus = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM customers");
            while (rs.next()) {
                Customers cus = new Customers();
                cus.setIdCustomers(rs.getString("id_customers"));
                cus.setNamaCustomers(rs.getString("namaCustomers"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNoTlp(rs.getString("noTlp"));
                listCus.add(cus);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listCus;
    }

    public void update(String idCustomers, String namaCustomers, String alamat, String noTlp) {
        int result = 0;

        String query = "UPDATE customers SET namaCustomers = '" + namaCustomers + "', "
                + "alamat = '" + alamat + "', "
                + "noTlp = '" + noTlp + "'"
                + " WHERE id_customers = '" + idCustomers + "'";
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void delete(String idCustomers) {

        int result = 0;
        String query = "DELETE FROM customers WHERE id_customers = " + idCustomers + "";
        try {

            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {

            System.out.println(ex.toString());
        }
    }

    public List<Customers> cari(String cari) {
        List<Customers> listCus = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM customers");
            while (rs.next()) {
                Customers cus = new Customers();
                cus.setIdCustomers(rs.getString("id_customers"));
                cus.setNamaCustomers(rs.getString("namaCustomers"));
                cus.setAlamat(rs.getString("alamat"));
                cus.setNoTlp(rs.getString("noTlp"));
                listCus.add(cus);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listCus;
    }
}
