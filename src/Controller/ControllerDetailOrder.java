/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modul.DetailOrder;
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
public class ControllerDetailOrder {
    
        Scanner sc = new Scanner(System.in);
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.LogOn();

        public void insert(String idOrders, String idMenu, int jumlah, double total) {
            String query = "INSERT INTO detailorder (id_Orders, id_Menu, Jumlah, Total) values"
                    + "('" + idOrders + "','" + idMenu + "'," + jumlah + "," + total + ")";
            try {
                Statement stm = con.createStatement();
                int result = stm.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

        public List<DetailOrder> tampil() {
            List<DetailOrder> listDO = new ArrayList();
            try {
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("SELECT * FROM detailorder");
                while (rs.next()) {
                    DetailOrder DO = new DetailOrder();
                    DO.setIdOrders(rs.getString("id_Orders"));
                    DO.setIdMenu(rs.getString("id_Menu"));
                    DO.setJumlah(rs.getInt("Jumlah"));
                    DO.setTotal(rs.getDouble("Total"));
                    listDO.add(DO);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            return listDO;
        }

        public void update(String idOrders, String idMenu, int jumlah, double total) {
            int result = 0;

            String query = "UPDATE detailorder SET id_Menu = '" + idMenu + "', "
                    + "Jumlah = " + jumlah + ", "
                    + "Total = " + total + ""
                    + " WHERE id_Orders = '" + idOrders + "'";
            try {
                Statement stm = con.createStatement();
                result = stm.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

        public void delete(String idOrders) {

            int result = 0;
            String query = "DELETE FROM detailorder WHERE id_Orders = " + idOrders + "";
            try {

                Statement stm = con.createStatement();
                result = stm.executeUpdate(query);
            } catch (SQLException ex) {

                System.out.println(ex.toString());
            }
        }

        public List<DetailOrder> cari(String cari) {
             List<DetailOrder> listDO = new ArrayList();
            try {
                Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM detailorder WHERE id_Orders like '%"+ cari +"%' or id_Menu like '%"+ cari +"%'");
                while (rs.next()) {
                    DetailOrder DO = new DetailOrder();
                    DO.setIdOrders(rs.getString("id_Orders"));
                    DO.setIdMenu(rs.getString("id_Menu"));
                    DO.setJumlah(rs.getInt("Jumlah"));
                    DO.setTotal(rs.getDouble("Total"));
                    listDO.add(DO);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            return listDO;
        }
}
