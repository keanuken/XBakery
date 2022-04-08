/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Orders;
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
public class ControllerOrders {

    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();

    public void insert(String idOrders, String idCustomers, String tanggalOrder, String keterangan) {
        String query = "INSERT INTO orders (id_Orders, id_customers, tanggal_order, Keterangan) values"
                + "('" + idOrders + "','" + idCustomers + "','" + tanggalOrder + "','" + keterangan + "')";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public List<Orders> tampil() {
        List<Orders> listOrders = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM detailorder");
            while (rs.next()) {
                Orders o = new Orders();
                o.setIdOrders(rs.getString("id_orders"));
                o.setIdCustomers(rs.getString("id_customers"));
                o.setTanggalOrder(rs.getString("tanggal_order"));
                o.setKeterangan(rs.getString("Keterangan"));
                listOrders.add(o);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listOrders;
    }

    public void update(String idOrders, String idCustomers, String tanggalOrder, String keterangan) {
        int result = 0;

        String query = "UPDATE orders SET id_customers = '" + idCustomers + "', "
                + "tanggal_order = '" + tanggalOrder + "', "
                + "Keterangan = '" + keterangan + "'"
                + " WHERE id_orders = '" + idOrders + "'";
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void delete(String idOrders) {

        int result = 0;
        String query = "DELETE FROM orders WHERE id_orders = " + idOrders + "";
        try {

            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {

            System.out.println(ex.toString());
        }
    }

    public List<Orders> cari(String cari) {
        List<Orders> listOrders = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM orders WHERE id_orders like '%"+ cari +"%' or id_customers like '%"+ cari +"%'");
            while (rs.next()) {
                Orders o = new Orders();
                o.setIdOrders(rs.getString("id_orders"));
                o.setIdCustomers(rs.getString("id_customers"));
                o.setTanggalOrder(rs.getString("tanggal_order"));
                o.setKeterangan(rs.getString("Keterangan"));
                listOrders.add(o);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listOrders;
    }
}
