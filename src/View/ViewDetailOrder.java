/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConnectionManager;
import Model.DetailOrder;
import Controller.ControllerDetailOrder;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author synx
 */
public class ViewDetailOrder extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public ViewDetailOrder() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        model = new DefaultTableModel();
        tableMenu.setModel(model);

        model.addColumn("ID Order");
        model.addColumn("ID Menu");
        model.addColumn("Jumlah");
        model.addColumn("Total");
        getData();
    }

    ControllerDetailOrder conDO = new ControllerDetailOrder();
    ConnectionManager conMan = new ConnectionManager();

    private final DefaultTableModel model;
    final JPanel panel = new JPanel();

    public final void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tableMenu.getModel();
        dtm.setRowCount(0);

        List<DetailOrder> myDetailOrder = conDO.tampil();
        String[] data = new String[5];
        for (DetailOrder detailOrder : myDetailOrder) {
            data[0] = detailOrder.getIdOrders();
            data[1] = detailOrder.getIdMenu();
            data[2] = Integer.toString(detailOrder.getJumlah());
            data[3] = Double.toString(detailOrder.getTotal());
            dtm.addRow(data);
        }
    }
    
    public final void cariData() {
        DefaultTableModel dtm = (DefaultTableModel) tableMenu.getModel();
        dtm.setRowCount(0);

        List<DetailOrder> myDetailOrder = conDO.cari(fieldCari.getText());
        String[] data = new String[5];
        for (DetailOrder detailOrder : myDetailOrder) {
            data[0] = detailOrder.getIdOrders();
            data[1] = detailOrder.getIdMenu();
            data[2] = Integer.toString(detailOrder.getJumlah());
            data[3] = Double.toString(detailOrder.getTotal());
            dtm.addRow(data);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        fieldIDO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldIDM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldJumlah = new javax.swing.JTextField();
        btnUp = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        fieldCari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldTotal = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(211, 175, 118));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detail Order");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 3));

        jScrollPane1.setBorder(null);

        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMenu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 610, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("ID Order");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, -1, -1));

        fieldIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDOActionPerformed(evt);
            }
        });
        jPanel1.add(fieldIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 180, 40));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("ID Menu");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, -1, -1));

        fieldIDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDMActionPerformed(evt);
            }
        });
        jPanel1.add(fieldIDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, 180, 40));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Jumlah");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, -1, -1));

        fieldJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJumlahActionPerformed(evt);
            }
        });
        jPanel1.add(fieldJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 180, 40));

        btnUp.setBackground(new java.awt.Color(255, 255, 255));
        btnUp.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        btnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_update_left_rotation_15px.png"))); // NOI18N
        btnUp.setText("Update");
        btnUp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 40));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, -1, 40));

        btnDel.setBackground(new java.awt.Color(255, 255, 255));
        btnDel.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        btnDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Delete_15px.png"))); // NOI18N
        btnDel.setText("Delete");
        btnDel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel1.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 100, 40));

        fieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCariActionPerformed(evt);
            }
        });
        fieldCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldCariKeyReleased(evt);
            }
        });
        jPanel1.add(fieldCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 180, 40));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Cari :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, -1, -1));

        fieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTotalActionPerformed(evt);
            }
        });
        jPanel1.add(fieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, 180, 40));

        jMenu1.setText("Home");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_home_15px.png"))); // NOI18N
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Daftar Harga");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_purchase_order_15px.png"))); // NOI18N
        jMenuItem2.setText("Daftar Harga");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new ViewHome().setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void fieldIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDOActionPerformed

    private void fieldIDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDMActionPerformed

    private void fieldJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldJumlahActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        // TODO add your handling code here:
        int i = tableMenu.getSelectedRow();
        if (i == -1) {

            JOptionPane.showMessageDialog(btnUp, "Harap pilih salah satu data!", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        conDO.update((fieldIDO.getText()), fieldIDM.getText(), Integer.parseInt(fieldJumlah.getText()), Double.parseDouble(fieldTotal.getText()));

        JOptionPane.showMessageDialog(btnUp, "Data Berhasil Diubah");
        getData();

        fieldIDO.setText("");
        fieldIDM.setText("");
        fieldJumlah.setText("");
        fieldTotal.setText("");
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        conDO.insert(
                fieldIDO.getText(),
                fieldIDM.getText(),
                Integer.parseInt(fieldJumlah.getText()),
                Double.parseDouble(fieldTotal.getText())
                );
        JOptionPane.showMessageDialog(btnSubmit, "Data berhasil ditambahkan.");
        getData();
        fieldIDO.setText("");
        fieldIDM.setText("");
        fieldJumlah.setText("");
        fieldTotal.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int i = tableMenu.getSelectedRow();
        if (i == -1) {

            JOptionPane.showMessageDialog(btnDel, "Harap pilih satu data!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        conDO.delete((fieldIDO.getText()));
        JOptionPane.showMessageDialog(btnDel, "Data berhasil dihapus!");
        getData();

        fieldIDO.setText("");
        fieldIDM.setText("");
        fieldJumlah.setText("");
    }//GEN-LAST:event_btnDelActionPerformed

    private void fieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCariActionPerformed

    private void fieldCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldCariKeyReleased
        // TODO add your handling code here:
        if (fieldCari.getText().equals("")){
            getData();
        }else {
            cariData(); 
        }
    }//GEN-LAST:event_fieldCariKeyReleased

    private void tableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMenuMouseClicked
        // TODO add your handling code here:
        int i = tableMenu.getSelectedRow();
        TableModel model = tableMenu.getModel();
        
        fieldIDO.setText(model.getValueAt(i, 0).toString());
        fieldIDM.setText(model.getValueAt(i, 1).toString());
        fieldJumlah.setText(model.getValueAt(i, 2).toString());
        fieldTotal.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tableMenuMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new ViewPriceList().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void fieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDetailOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUp;
    private javax.swing.JTextField fieldCari;
    private javax.swing.JTextField fieldIDM;
    private javax.swing.JTextField fieldIDO;
    private javax.swing.JTextField fieldJumlah;
    private javax.swing.JTextField fieldTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMenu;
    // End of variables declaration//GEN-END:variables
}