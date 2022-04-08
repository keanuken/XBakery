/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modul.Menu;
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
public class ControllerMenu {

    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();

    public void insert(String idMenu, String namaMenu, double harga) {
        String query = "INSERT INTO menu (id_menu, namaMenu, harga) values"
                + "('" + idMenu + "','" + namaMenu + "'," + harga + ")";
        try {
            Statement stm = con.createStatement();
            int result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public List<Menu> tampil() {
        List<Menu> listMenu = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM menu");
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getString("id_menu"));
                menu.setNamaMenu(rs.getString("namaMenu"));
                menu.setHarga(rs.getDouble("harga"));
                listMenu.add(menu);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listMenu;
    }

    public void update(String idMenu, String namaMenu, double harga) {
        int result = 0;

        String query = "UPDATE menu SET namaMenu = '" + namaMenu + "', "
                + "harga = " + harga + " WHERE id_menu = '" + idMenu + "'";
        try {
            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void delete(String idMenu) {

        int result = 0;
        String query = "DELETE FROM menu WHERE id_menu = " + idMenu + "";
        try {

            Statement stm = con.createStatement();
            result = stm.executeUpdate(query);
        } catch (SQLException ex) {

            System.out.println(ex.toString());
        }
    }

    public List<Menu> cari(String cari) {
        List<Menu> listMenu = new ArrayList();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM menu WHERE id_menu like '%"+ cari +"%' or namaMenu like '%"+ cari +"%'");
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getString("id_menu"));
                menu.setNamaMenu(rs.getString("namaMenu"));
                menu.setHarga(rs.getDouble("harga"));
                listMenu.add(menu);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return listMenu;
    }
}
