/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Slinky
 */
public class type extends javax.swing.JFrame {

    /**
     * Creates new form category
     */
    public type() {
        initComponents();
        table_update ();
    }
    
    Connection con1;
    PreparedStatement pst;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txttype = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(160, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EXIT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, -1, 32));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CATEGORY");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TYPE");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, 25));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADD ITEMS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 120, 30));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REMOVE ITEMS");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 810));

        jPanel2.setBackground(new java.awt.Color(215, 221, 221));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Insert a Type");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));
        jPanel2.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 270, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Add.png")); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 150, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Save.png")); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 160, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\cancel.png")); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 160, 50));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 710, 380));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Item Type");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 1610, 720));

        jPanel3.setBackground(new java.awt.Color(160, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SCHOOL INVENTORY");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1610, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_update ()
    {
        try {
            int c;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
                pst = con1.prepareStatement("select * from type");
                ResultSet rs = pst.executeQuery();
                
                ResultSetMetaData rsd = rs.getMetaData();
                c = rsd.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                d.setRowCount(0);
                
                
                while(rs.next())
                {
                    Vector v2 = new Vector();
                    
                    for(int i=1; i<=c; i++)
                    {
                        v2.add(rs.getString("id"));
                        v2.add(rs.getString("type"));
                    }
                    
                    d.addRow(v2);
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        String type = txttype.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
            pst = con1.prepareStatement("update type set type=? where id=?");
            pst.setString(1 ,type);
            pst.setInt(2 ,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Type Updated");
            table_update ();
            txttype.setText("");
            txttype.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String type = txttype.getText();
        
          if(type.isEmpty() ){
            JOptionPane.showMessageDialog(null,"Cannot keep empty ");
        }
          else{
              int x=JOptionPane.showConfirmDialog(null,"Do you want to add this type");
              if(x==0){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
            pst = con1.prepareStatement("insert into type(type)values(?)");
            pst.setString(1 ,type);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Type Added");
            table_update ();
            txttype.setText("");
            txttype.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
        }
              }
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        txttype.setText(d1.getValueAt(selectIndex, 1).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the Record","Warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
                pst = con1.prepareStatement("delete from type where id=?");
                pst.setInt(1 ,id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Type Deleted");
                table_update ();
                txttype.setText("");
                txttype.requestFocus();
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(type.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        category c = new category();
        this.hide();
        c.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        type b = new type();
        this.hide();
        b.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        product p = new product();
        this.hide();
        p.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        rem r = new rem();
        this.hide();
        r.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new type().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txttype;
    // End of variables declaration//GEN-END:variables
}
