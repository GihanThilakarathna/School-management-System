/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Ishara Fernando
 */
public class SalaryRecords extends javax.swing.JFrame {
    Connection con = null; 
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    

    /**
     * Creates new form SalaryRecords
     */
    public SalaryRecords() {
        initComponents();
        con = Database.connect();
        table();
    }
    
    
    
     public void table()
    {
        try
        {
            String sql = "SELECT EmployeeID,EmployeeName,Salary,YearAndMonth FROM salaryrecords ";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            srtable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e) {}
           
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        srback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        maintitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        srtitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        srtable = new javax.swing.JTable();
        sryam = new javax.swing.JTextField();
        srsalary = new javax.swing.JTextField();
        srename = new javax.swing.JTextField();
        sreid = new javax.swing.JTextField();
        srsearch = new javax.swing.JButton();
        srs = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        srsubmit = new javax.swing.JButton();
        srupdate = new javax.swing.JButton();
        srdelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        srback.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        srback.setText("Back");
        srback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srbackActionPerformed(evt);
            }
        });
        getContentPane().add(srback, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 760, -1, -1));

        jPanel1.setBackground(new java.awt.Color(162, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        maintitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        maintitle.setForeground(new java.awt.Color(255, 255, 255));
        maintitle.setText("Finance Management");
        jPanel1.add(maintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 390, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1820, 80));

        jPanel2.setBackground(new java.awt.Color(214, 222, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        srtitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        srtitle.setText("Salary Records");
        jPanel2.add(srtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, 31));

        srtable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        srtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        srtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(srtable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 1050, 360));

        sryam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sryamActionPerformed(evt);
            }
        });
        jPanel2.add(sryam, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 210, 40));
        jPanel2.add(srsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 210, 40));
        jPanel2.add(srename, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 210, 40));
        jPanel2.add(sreid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 210, 30));

        srsearch.setText("Search");
        srsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srsearchActionPerformed(evt);
            }
        });
        jPanel2.add(srsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        srs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srsActionPerformed(evt);
            }
        });
        jPanel2.add(srs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 210, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Year and Month :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Salary :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee Name :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Employee ID :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Employee Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        srsubmit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        srsubmit.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\Upload.png")); // NOI18N
        srsubmit.setText("Submit");
        srsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srsubmitActionPerformed(evt);
            }
        });
        jPanel2.add(srsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 140, 40));

        srupdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        srupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\Save.png")); // NOI18N
        srupdate.setText("Update");
        srupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srupdateActionPerformed(evt);
            }
        });
        jPanel2.add(srupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 140, 40));

        srdelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        srdelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\cancel.png")); // NOI18N
        srdelete.setText("Delete");
        srdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srdeleteActionPerformed(evt);
            }
        });
        jPanel2.add(srdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 600, 140, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\a4.png")); // NOI18N
        jButton2.setText("Generate Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 650, 180, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1820, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sryamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sryamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sryamActionPerformed

    private void srbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srbackActionPerformed
        FinanceMain fm5 = new FinanceMain();
        fm5.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_srbackActionPerformed

    private void srsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srsubmitActionPerformed
            String Employeeid = sreid.getText();
            String EmployeeName = srename.getText();
            String Salary = srsalary.getText();
            String YearAndMonth = sryam.getText();
         
         
        if(Employeeid.isEmpty() || sreid.getText().trim().length() != 4 || EmployeeName.isEmpty() ||  Salary.isEmpty() || YearAndMonth.isEmpty() ){
            JOptionPane.showConfirmDialog(null,"Error!!!");
        }
        else{
            
        int x=JOptionPane.showConfirmDialog(null,"Do you want to add this record");
        if (x==0){
        try 
        {
            String q = "INSERT INTO `salaryrecords`(`EmployeeID`,`EmployeeName`, `Salary`, `YearAndMonth`) VALUES ('"+Employeeid+"','"+EmployeeName+"','"+Salary+"','"+YearAndMonth+"')";
        
            ps=con.prepareStatement(q);
            ps.execute();
            table();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_srsubmitActionPerformed
        }
    }
    private void srtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srtableMouseClicked
        // table mouse click
        int r = srtable.getSelectedRow();
        String eid = srtable.getValueAt(r, 0).toString();
        String ename = srtable.getValueAt(r, 1).toString();
        String salary = srtable.getValueAt(r, 2).toString();
        String year = srtable.getValueAt(r, 3).toString();
        
        sreid.setText(eid);
        srename.setText(ename);
        srsalary.setText(salary);
        sryam.setText(year);
        
    }//GEN-LAST:event_srtableMouseClicked

    private void srupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srupdateActionPerformed
        // update
        String eid = sreid.getText();
        String ename = srename.getText();
        String salary = srsalary.getText();
        String year = sryam.getText();
        
        String q = "UPDATE `salaryrecords` SET EmployeeName ='"+ename+"', Salary = '"+salary+"', YearAndMonth = '"+year+"' where EmployeeID = '"+eid+"'";
        try{
        ps = con.prepareStatement(q);
        ps.execute();
        table();
        }
        catch(Exception e){
            
        }
        
    }//GEN-LAST:event_srupdateActionPerformed

    private void srdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srdeleteActionPerformed
        // Delete
        String eid = sreid.getText();
        String q = "DELETE from salaryrecords where EmployeeID =' "+eid+"'";
        try{
            ps = con.prepareStatement(q);
            ps.execute();
            table();
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_srdeleteActionPerformed

    private void srsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srsearchActionPerformed
          // search
        String ename = srs.getText();
        String q = "SELECT EmployeeID,EmployeeName,Salary,YearAndMonth from salaryrecords where EmployeeName LIKE '%" +ename+ "%'";  
        
        try{
            ps = con.prepareStatement(q);
            rs = ps.executeQuery();
            srtable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_srsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            srtable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(SalaryRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void srsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srsActionPerformed

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
            java.util.logging.Logger.getLogger(SalaryRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaryRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaryRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaryRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maintitle;
    private javax.swing.JButton srback;
    private javax.swing.JButton srdelete;
    private javax.swing.JTextField sreid;
    private javax.swing.JTextField srename;
    private javax.swing.JTextField srs;
    private javax.swing.JTextField srsalary;
    private javax.swing.JButton srsearch;
    private javax.swing.JButton srsubmit;
    private javax.swing.JTable srtable;
    private javax.swing.JLabel srtitle;
    private javax.swing.JButton srupdate;
    private javax.swing.JTextField sryam;
    // End of variables declaration//GEN-END:variables
}
