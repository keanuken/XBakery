/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

/**
 *
 * @author synx
 */
public class ViewHome extends javax.swing.JFrame {

    /**
     * Creates new form ViewHome
     */
    public ViewHome() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        btnBilling.addMouseListener(hoverBil);
        btnCus.addMouseListener(hoverCus);
        btnDO.addMouseListener(hoverDO);
        btnMenu.addMouseListener(hoverMenu);
        btnOrder.addMouseListener(hoverOrder);
        btnDisc.addMouseListener(hoverDisc);
        btnExit.addMouseListener(Exit);
    }
    
    public MouseListener hoverBil = new MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnBilling.setForeground(Color.WHITE);
            btnBilling.setBackground(new Color(160,137,99));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnBilling.setForeground(Color.BLACK);
            btnBilling.setBackground(new Color(255,235,204));
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            new ViewBilling().setVisible(true);
            dispose();
        }
    };
    
    public MouseListener hoverCus = new MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnCus.setForeground(Color.WHITE);
            btnCus.setBackground(new Color(160,137,99));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnCus.setForeground(Color.BLACK);
            btnCus.setBackground(new Color(255,235,204));
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            new ViewCustomers().setVisible(true);
            dispose();
        }
    };
    
    public MouseListener hoverDO = new MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnDO.setForeground(Color.WHITE);
            btnDO.setBackground(new Color(160,137,99));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnDO.setForeground(Color.BLACK);
            btnDO.setBackground(new Color(255,235,204));
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            new ViewDetailOrder().setVisible(true);
            dispose();
        }
    };
    
    public MouseListener hoverMenu = new MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnMenu.setForeground(Color.WHITE);
            btnMenu.setBackground(new Color(160,137,99));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnMenu.setForeground(Color.BLACK);
            btnMenu.setBackground(new Color(255,235,204));
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            new ViewMenu().setVisible(true);
            dispose();
        }
    };
    
    public MouseListener hoverOrder = new MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnOrder.setForeground(Color.WHITE);
            btnOrder.setBackground(new Color(160,137,99));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnOrder.setForeground(Color.BLACK);
            btnOrder.setBackground(new Color(255,235,204));
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            new ViewOrder().setVisible(true);
            dispose();
        }
    };
    
    public MouseListener hoverDisc = new MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnDisc.setForeground(Color.WHITE);
            btnDisc.setBackground(new Color(160,137,99));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnDisc.setForeground(Color.BLACK);
            btnDisc.setBackground(new Color(255,235,204));
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            new ViewDisc().setVisible(true);
            dispose();
        }
    };
    
    public MouseListener Exit = new MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btnExit.setForeground(Color.WHITE);
            btnExit.setBackground(new Color(255,63,63));
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
            btnExit.setForeground(Color.WHITE);
            btnExit.setBackground(new Color(255,102,102));
        }
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            dispose();
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBilling = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCus = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDO = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnDisc = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(211, 175, 118));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        btnBilling.setBackground(new java.awt.Color(255, 235, 204));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel2.setText("Billing");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_billing_machine_30px.png"))); // NOI18N

        javax.swing.GroupLayout btnBillingLayout = new javax.swing.GroupLayout(btnBilling);
        btnBilling.setLayout(btnBillingLayout);
        btnBillingLayout.setHorizontalGroup(
            btnBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBillingLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnBillingLayout.setVerticalGroup(
            btnBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBillingLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(btnBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnCus.setBackground(new java.awt.Color(255, 235, 204));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel3.setText("Customers");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_people_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout btnCusLayout = new javax.swing.GroupLayout(btnCus);
        btnCus.setLayout(btnCusLayout);
        btnCusLayout.setHorizontalGroup(
            btnCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCusLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(108, 108, 108))
        );
        btnCusLayout.setVerticalGroup(
            btnCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCusLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(btnCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16))
        );

        btnDO.setBackground(new java.awt.Color(255, 235, 204));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel4.setText("Detail Order");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cheque_30px.png"))); // NOI18N

        javax.swing.GroupLayout btnDOLayout = new javax.swing.GroupLayout(btnDO);
        btnDO.setLayout(btnDOLayout);
        btnDOLayout.setHorizontalGroup(
            btnDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDOLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDOLayout.setVerticalGroup(
            btnDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDOLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(btnDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15))
        );

        btnMenu.setBackground(new java.awt.Color(255, 235, 204));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel5.setText("Menu");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_purchase_order_30px.png"))); // NOI18N

        javax.swing.GroupLayout btnMenuLayout = new javax.swing.GroupLayout(btnMenu);
        btnMenu.setLayout(btnMenuLayout);
        btnMenuLayout.setHorizontalGroup(
            btnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMenuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMenuLayout.setVerticalGroup(
            btnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(btnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnOrder.setBackground(new java.awt.Color(255, 235, 204));
        btnOrder.setPreferredSize(new java.awt.Dimension(155, 60));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel6.setText("Orders");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_shopping_cart_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout btnOrderLayout = new javax.swing.GroupLayout(btnOrder);
        btnOrder.setLayout(btnOrderLayout);
        btnOrderLayout.setHorizontalGroup(
            btnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrderLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnOrderLayout.setVerticalGroup(
            btnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnOrderLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(btnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(15, 15, 15))
        );

        btnExit.setBackground(new java.awt.Color(255, 102, 102));

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Exit");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Close_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(15, 15, 15))
        );

        btnDisc.setBackground(new java.awt.Color(255, 235, 204));

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel16.setText("Discounts");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_discount_30px.png"))); // NOI18N

        javax.swing.GroupLayout btnDiscLayout = new javax.swing.GroupLayout(btnDisc);
        btnDisc.setLayout(btnDiscLayout);
        btnDiscLayout.setHorizontalGroup(
            btnDiscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDiscLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDiscLayout.setVerticalGroup(
            btnDiscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDiscLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(btnDiscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBilling, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(btnBilling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 720));

        jPanel8.setBackground(new java.awt.Color(255, 232, 195));

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel12.setText("Kasir X Bakery");
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel12)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 990, 130));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Self checkout-amico (1).png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel btnBilling;
    private javax.swing.JPanel btnCus;
    private javax.swing.JPanel btnDO;
    private javax.swing.JPanel btnDisc;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnMenu;
    private javax.swing.JPanel btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration                   
}
