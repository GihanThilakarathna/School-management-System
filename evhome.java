/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class evhome extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public evhome() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        evaddD = new javax.swing.JButton();
        eveditd = new javax.swing.JButton();
        eveditd1 = new javax.swing.JButton();
        evhome = new javax.swing.JButton();
        evadddetailsb = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        evjlheader = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        evhomeregS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        evjlstudentn = new javax.swing.JLabel();
        evtxenterS = new javax.swing.JTextField();
        evtxentersid = new javax.swing.JTextField();
        evhomecheckreg = new javax.swing.JButton();
        eveditsd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(162, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 171, 19), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        evaddD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evaddD.setText("Add details");
        evaddD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaddDActionPerformed(evt);
            }
        });
        jPanel1.add(evaddD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 50));

        eveditd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eveditd.setText("Edit Details");
        eveditd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eveditdActionPerformed(evt);
            }
        });
        jPanel1.add(eveditd, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, -1, -1));

        eveditd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eveditd1.setText("Edit Details");
        eveditd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eveditd1ActionPerformed(evt);
            }
        });
        jPanel1.add(eveditd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 50));

        evhome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evhome.setText("Home");
        evhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evhomeActionPerformed(evt);
            }
        });
        jPanel1.add(evhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 50));

        evadddetailsb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evadddetailsb.setText("Event details");
        evadddetailsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evadddetailsbActionPerformed(evt);
            }
        });
        jPanel1.add(evadddetailsb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 160, 60));

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 750, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 820));

        jPanel3.setBackground(new java.awt.Color(162, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 171, 19), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        evjlheader.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        evjlheader.setForeground(new java.awt.Color(255, 255, 255));
        evjlheader.setText("Event management");
        jPanel3.add(evjlheader, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1620, 90));

        jPanel2.setBackground(new java.awt.Color(214, 222, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 171, 19), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to event management");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Register to a sport");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        evhomeregS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evhomeregS.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Add.png")); // NOI18N
        evhomeregS.setText("Submit");
        evhomeregS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evhomeregSActionPerformed(evt);
            }
        });
        jPanel2.add(evhomeregS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 120, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Enter sport name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        evjlstudentn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        evjlstudentn.setText("Enter student ID");
        jPanel2.add(evjlstudentn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        jPanel2.add(evtxenterS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, 40));
        jPanel2.add(evtxentersid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, 40));

        evhomecheckreg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evhomecheckreg.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\a4.png")); // NOI18N
        evhomecheckreg.setText("Registerd student list");
        evhomecheckreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evhomecheckregActionPerformed(evt);
            }
        });
        jPanel2.add(evhomecheckreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 290, 70));

        eveditsd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eveditsd.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Save.png")); // NOI18N
        eveditsd.setText("Edit details with sports");
        eveditsd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eveditsdActionPerformed(evt);
            }
        });
        jPanel2.add(eveditsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 290, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Screenshot (123).png")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 110, 440, 560));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 1620, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void evaddDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaddDActionPerformed
        enterdetails cc = new enterdetails();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_evaddDActionPerformed

    private void eveditdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eveditdActionPerformed
        updatedetails xx = new updatedetails();
        xx.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_eveditdActionPerformed

    private void eveditd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eveditd1ActionPerformed
        updatedetails xx = new updatedetails();
        xx.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_eveditd1ActionPerformed

    private void evhomeregSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evhomeregSActionPerformed
    String sportname = evtxenterS.getText();
    String eventsid = evtxentersid.getText();
        
        if(sportname.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sport name is empty !");
        }
        else if( evtxentersid.getText().trim().length() != 4 )    {
            JOptionPane.showMessageDialog(null,"Invalid student ID !");
        }
        
     else{
    String query = "insert into sports values ('"+sportname+"','"+eventsid+"')";
    
        try {
        
        Connection c = dbbclass.getConnection();
        
        Statement stmt = c.createStatement();
        stmt.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Sport and related student details added sucsessfully");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,e.getMessage());
        
    }    
        }
// TODO add your handling code here:
    
    }//GEN-LAST:event_evhomeregSActionPerformed

    private void evhomecheckregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evhomecheckregActionPerformed
        eventsport zx = new eventsport();
        zx.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_evhomecheckregActionPerformed

    private void evhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evhomeActionPerformed
        evhome hh = new evhome();
        hh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_evhomeActionPerformed

    private void evadddetailsbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evadddetailsbActionPerformed
        eventdetails dd = new eventdetails();
        dd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_evadddetailsbActionPerformed

    private void eveditsdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eveditsdActionPerformed
          eventsport xxx = new eventsport();
        xxx.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_eveditsdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         mainhome1 main = new mainhome1();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(evhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(evhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(evhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(evhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new evhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton evaddD;
    private javax.swing.JButton evadddetailsb;
    private javax.swing.JButton eveditd;
    private javax.swing.JButton eveditd1;
    private javax.swing.JButton eveditsd;
    private javax.swing.JButton evhome;
    private javax.swing.JButton evhomecheckreg;
    private javax.swing.JButton evhomeregS;
    private javax.swing.JLabel evjlheader;
    private javax.swing.JLabel evjlstudentn;
    private javax.swing.JTextField evtxenterS;
    private javax.swing.JTextField evtxentersid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
