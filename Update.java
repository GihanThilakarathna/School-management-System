/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import com.mysql.cj.exceptions.DeadlockTimeoutRollbackMarker;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class Update extends javax.swing.JFrame { 
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BOOKID = new javax.swing.JTextField();
        Book = new javax.swing.JLabel();
        Book1 = new javax.swing.JLabel();
        BOOKNAME = new javax.swing.JTextField();
        Book2 = new javax.swing.JLabel();
        BOOKPRICE = new javax.swing.JTextField();
        UPDATE = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Sales = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UPDATETABLE = new javax.swing.JTable();

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 272, 63));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1610, 100));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Update Item");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 170, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 470, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BOOKID.setText(" ");
        BOOKID.setToolTipText("");
        BOOKID.setName("vb"); // NOI18N
        jPanel3.add(BOOKID, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 28, 170, 40));

        Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Book.setText("Book ID");
        jPanel3.add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 27, 120, 40));

        Book1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Book1.setText("Book Name");
        jPanel3.add(Book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 75, 120, 40));

        BOOKNAME.setText(" ");
        BOOKNAME.setToolTipText("");
        BOOKNAME.setName("vb"); // NOI18N
        BOOKNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKNAMEActionPerformed(evt);
            }
        });
        jPanel3.add(BOOKNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 76, 170, 40));

        Book2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Book2.setText("Book Price");
        jPanel3.add(Book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 129, 120, 40));

        BOOKPRICE.setText(" ");
        BOOKPRICE.setToolTipText("");
        BOOKPRICE.setName("vb"); // NOI18N
        BOOKPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKPRICEActionPerformed(evt);
            }
        });
        jPanel3.add(BOOKPRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 130, 170, 40));

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UPDATE.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Save.png")); // NOI18N
        UPDATE.setText("Update");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel3.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 188, 140, 33));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 460, 250));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Sales.setText("Sales");
        jPanel1.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 60));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 70, 39));

        LogOut.setText("LogOut");
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 80, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 810));

        jPanel5.setBackground(new java.awt.Color(214, 222, 222));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UPDATETABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Book Price"
            }
        ));
        UPDATETABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATETABLEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(UPDATETABLE);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 1360, 250));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 1610, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       
        Bookshop1 BKS = new Bookshop1();
        BKS.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed

        
      int BID = Integer.parseInt(BOOKID.getText());
      String BName = BOOKNAME.getText();
      String BPrice =BOOKPRICE.getText();
      
      
      try{
           Connection C = DB_class.getConnection();
               PreparedStatement pre2;
             
           pre2 = C.prepareStatement( "UPDATE bookshop2 SET Book_Name =?, Book_Price =?  where  Book_ID =?");
           
        
           
            pre2.setString(1,BName);
            pre2.setString(2,BPrice);
            pre2.setInt(3,BID);
            pre2.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated !!");
            ShowTableData();
            
          
          
      
      }catch(Exception ex){
      
      
      }
      
        
    }//GEN-LAST:event_UPDATEActionPerformed

    public void ShowTableData(){
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Book_ID","Book_Name","Book_Price","Quantity","Total"},0);
        
        
        try{
        
        Connection C = DB_class.getConnection();
        Statement st = C.createStatement();
           
            String sql="SELECT * FROM bookshop2";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            
                String a = rs.getString("Book_ID");
                String b = rs.getString("Book_Name");
                String c = rs.getString("Book_Price");
                String d = rs.getString("Quantity"); 
                String e = rs.getString("Total"); 
                 
                model.addRow(new Object[]{a,b,c,d,e});
                UPDATETABLE.setModel(model);
            }
            
            
            
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    }
    
    
    
    private void UPDATETABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATETABLEMouseClicked
        
        
       int i = UPDATETABLE.getSelectedRow();
       TableModel model = UPDATETABLE.getModel();
       BOOKID.setText(model.getValueAt(i,0).toString());
       BOOKNAME.setText(model.getValueAt(i,1).toString());
       BOOKPRICE.setText(model.getValueAt(i,2).toString());
    }//GEN-LAST:event_UPDATETABLEMouseClicked

    private void BOOKNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOOKNAMEActionPerformed

    private void BOOKPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKPRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOOKPRICEActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        ShowTableData();
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BOOKID;
    private javax.swing.JTextField BOOKNAME;
    private javax.swing.JTextField BOOKPRICE;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Book;
    private javax.swing.JLabel Book1;
    private javax.swing.JLabel Book2;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Sales;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTable UPDATETABLE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void executeSQLQuery(String query, String updated) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
