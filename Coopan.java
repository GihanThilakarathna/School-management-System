/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Chamoth
 */
public class Coopan extends javax.swing.JFrame {

   
    public Coopan() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        COOPAN = new javax.swing.JTextField();
        COOPANID = new javax.swing.JLabel();
        DONEE = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Sales = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        Coopan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        COO = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bookshop");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 180, 63));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1610, 100));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        COOPAN.setText(" ");
        COOPAN.setToolTipText("");
        COOPAN.setName("vb"); // NOI18N
        jPanel3.add(COOPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 170, 40));

        COOPANID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        COOPANID.setText("Coopan ID");
        jPanel3.add(COOPANID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 90, 40));

        DONEE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DONEE.setText("DONE");
        DONEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DONEEActionPerformed(evt);
            }
        });
        jPanel3.add(DONEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 78, 33));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 450, 230));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sales.setText("Sales");
        jPanel1.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 48));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 70, 40));

        LogOut.setText("LogOut");
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 80, 40));

        Coopan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Coopan.setText("Coopan");
        Coopan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoopanActionPerformed(evt);
            }
        });
        jPanel1.add(Coopan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 150, 46));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 810));

        COO.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        COO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coopan ID"
            }
        ));
        COO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COOMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(COO);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 420, 280));

        jPanel4.setBackground(new java.awt.Color(214, 222, 222));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1602, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 1610, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        
        Bookshop1 BKS = new Bookshop1();
        BKS.setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_BackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        ShowTableData();
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void COOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COOMouseClicked
       
        
        
            int i = COO.getSelectedRow();
        TableModel model = COO.getModel();
        COOPAN.setText(model.getValueAt(i,0).toString());
      
        
    }//GEN-LAST:event_COOMouseClicked

    private void DONEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DONEEActionPerformed
        
        
        
                                                      
    String BOOK_ID = " ";
    String Book_Name = " ";
    String Book_Price = " ";
    String Quantity = " ";
    String Total= " ";
    
    String CoopanID = COOPAN.getText();
         
   String query = "insert into bookshop2 (Book_ID,Book_Name,Book_Price,Quantity,Total,CoopanID)values('"+BOOK_ID+"','"+Book_Name+"','"+Book_Price+"','"+Quantity+"','"+Total+"','"+CoopanID+"')";
    System.out.println(query);
    
     Connection c = null;
        try {
            c = DB_class.getConnection();
            Statement stmt ;
            stmt = c.createStatement();
            stmt.executeUpdate(query);
             JOptionPane.showMessageDialog(this, "Saved");
             ShowTableData();
        } catch (Exception ex) {
            Logger.getLogger(Coopan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
       
       
        
    }//GEN-LAST:event_DONEEActionPerformed

    private void CoopanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoopanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoopanActionPerformed

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
            java.util.logging.Logger.getLogger(Coopan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coopan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coopan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coopan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coopan().setVisible(true);
            }
        });
    }

    
     public void ShowTableData(){
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"CoopanID"},0);
        
        
        try{
        
        Connection C = DB_class.getConnection();
        Statement st = C.createStatement();
           
            String sql="SELECT * FROM bookshop2";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            
                
                 
                String f = rs.getString("CoopanID"); 
                 
                model.addRow(new Object[]{f});
                COO.setModel(model);
            }
            
            
            
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable COO;
    private javax.swing.JTextField COOPAN;
    private javax.swing.JLabel COOPANID;
    private javax.swing.JButton Coopan;
    private javax.swing.JButton DONEE;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Sales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
