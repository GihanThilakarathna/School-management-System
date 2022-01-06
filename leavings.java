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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author DuminduS
 */
public class leavings extends javax.swing.JFrame {

    /**
     * Creates new form leavings
     */
    public leavings() {
        initComponents();
    }
    
    
    
      public void Insert_Update_Delete_Display(){
    
        show_users_in_jtable();
    
    
    }
    
     public Connection getConnection() throws SQLException
     {
         Connection con;
         try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
             return con;
         }catch(Exception e){
             e.printStackTrace();
             return null;
         }
     }
     
     public ArrayList<User03> getUsersList(){
         
         
         
          ArrayList<User03> usersList03 = new ArrayList<User03> ();
         try{
         
         Connection connection = getConnection();
         String query = "SELECT * FROM `staff_leavings01";
         Statement st;
         ResultSet rs;
             st = connection.createStatement();
             rs = st.executeQuery(query);
             User03 user03;
             while(rs.next())
             {
                 user03 = new User03(rs.getString("staff_id"),rs.getString("reason"),rs.getString("date"),rs.getString("leave_type"),rs.getString("time"));
                 usersList03.add(user03);
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         
         return usersList03;
             
         
     }
          
        //display table in jtable

         public void show_users_in_jtable()
         {
             ArrayList<User03> list = getUsersList();
             DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
             Object[] row = new Object [5];
             for(int i = 0; i < list.size(); i++)
             {
                 row[0] = list.get(i).getstaff_id01();
                 row[1] = list.get(i).getreason01();
                 row[2] = list.get(i).getdate01();
                 row[3] = list.get(i).getleavetype01();
                 row[4] = list.get(i).gettime01();
                
                 
                 model.addRow(row);
                 
             }
             
         }         
    

         
         //execute the sql query
         
         public void executeSQLQuery(String query , String message) throws SQLException
         {
             Connection con = getConnection();
             Statement st;
             
             try{
                 st = con.createStatement();
                 if((st.executeUpdate(query)) == 1)
                 {
                     
                     //refresh jtable
                     DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
                     model.setRowCount(0);
                     show_users_in_jtable();
                     
                     JOptionPane.showMessageDialog(null, "Data"+message+"Successful");
                 }else{
                     JOptionPane.showMessageDialog(null, "Data Not"+message);
                 }    
             }catch(Exception ex){
                 ex.printStackTrace();
             }
         }

          
         void clear(){
    staffleaveID.setText(null);
    reasonLeave.setText(null);
    leaveDate.setText(null);
    leaveType.setText(null);
    leaveTime.setText(null);
         }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        staffleaveID = new javax.swing.JTextField();
        reasonLeave = new javax.swing.JTextField();
        leaveDate = new javax.swing.JTextField();
        leaveType = new javax.swing.JTextField();
        leaveTime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(160, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 50));

        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jButton2.setText("ATTENDANCE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 170, 50));

        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jButton3.setText("LEAVINGS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 170, 50));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 810));

        jPanel2.setBackground(new java.awt.Color(160, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STAFF MANAGEMENT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 410, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1610, 80));

        jPanel3.setBackground(new java.awt.Color(215, 221, 221));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel3.setMinimumSize(new java.awt.Dimension(1630, 760));
        jPanel3.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STAFF ID", "REASON FOR LEAVE", "DATE", "LEAVE TYPE", "TIME"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 980, 440));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, 200, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 170, 40));

        staffleaveID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffleaveIDActionPerformed(evt);
            }
        });
        jPanel3.add(staffleaveID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 210, 30));

        reasonLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonLeaveActionPerformed(evt);
            }
        });
        jPanel3.add(reasonLeave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 220, 60));

        leaveDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveDateActionPerformed(evt);
            }
        });
        jPanel3.add(leaveDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 190, 40));

        leaveType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveTypeActionPerformed(evt);
            }
        });
        jPanel3.add(leaveType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 170, 30));

        leaveTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveTimeActionPerformed(evt);
            }
        });
        jPanel3.add(leaveTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Staff ID :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Enter leaving details");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 210, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Time :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Leave type :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reason for leave :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 20));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("SUBMIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 190, 40));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 100, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 1610, 730));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        registerAcademic satten = new registerAcademic();
        satten.setVisible(true);
        this.setVisible(false);
    }                                        

    private void staffleaveIDActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void reasonLeaveActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void leaveDateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void leaveTypeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void leaveTimeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        attendance satten = new attendance();
        satten.setVisible(true);
        this.setVisible(false);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 //INSERT
        String sleaveid = staffleaveID.getText();
        String reason =  reasonLeave.getText();
        String leavedtae = leaveDate.getText();
        String leavetype = leaveType.getText();
        String leavetime = leaveTime.getText();
        
        
        if(sleaveid.isEmpty() || staffleaveID.getText().trim().length() != 4 || reason.isEmpty() || leavedtae.isEmpty() || leavetype.isEmpty() || leavetime.isEmpty() ){
            JOptionPane.showMessageDialog(null,"Error!!!");
        }
        else{
            
        int x=JOptionPane.showConfirmDialog(null,"Do you want to add this record");
        if (x==0){
        
        String query = "INSERT INTO staff_leavings01(staff_id,reason,date,leave_type,time) Values('"+staffleaveID.getText()+"','"+reasonLeave.getText()+"','"+leaveDate.getText()+"','"+leaveType.getText()+"','"+leaveTime.getText()+"');"; 
        try {
            executeSQLQuery(query,"Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(registerAcademic.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
    }       

    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
//UPDATE

        String sleaveid = staffleaveID.getText();
        String reason =  reasonLeave.getText();
        String leavedtae = leaveDate.getText();
        String leavetype = leaveType.getText();
        String leavetime = leaveTime.getText();
        
        
        if(sleaveid.isEmpty() || reason.isEmpty() || leavedtae.isEmpty() || leavetype.isEmpty() || leavetime.isEmpty() ){
            JOptionPane.showMessageDialog(null,"Error!!!");
        }
        else{
            
        int x=JOptionPane.showConfirmDialog(null,"Do you want to update..?");
        if (x==0){
        
        String query = "UPDATE staff_leavings01 SET reason='"+reasonLeave.getText()+"',date='"+leaveDate.getText()+"',leave_type='"+leaveType.getText()+"',time='"+leaveTime.getText()+"'where staff_id='"+staffleaveID.getText()+"';";
        try {
            executeSQLQuery(query,"Updated");
        } catch (SQLException ex) {
            Logger.getLogger(registerAcademic.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        }
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
 //DELETE
        
        String query = "DELETE FROM `staff_leavings01` WHERE staff_id = '"+staffleaveID.getText()+"'";
        try {
            executeSQLQuery(query,"Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(leavings.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                        

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        
 //display selected row in form
       
       int i = jTable3.getSelectedRow();
       TableModel model = jTable3.getModel();
       staffleaveID.setText(model.getValueAt(i,0).toString());
       reasonLeave.setText(model.getValueAt(i,1).toString());
       leaveDate.setText(model.getValueAt(i,2).toString());
       leaveType.setText(model.getValueAt(i,3).toString());
       leaveTime.setText(model.getValueAt(i,4).toString());

    }                                    

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        Insert_Update_Delete_Display();
    }                                 

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         Connection connection;
        try {
            connection = DBclass.getConnection();
       
        
           PreparedStatement pre1;
     
            pre1 = connection.prepareStatement("select *  from staff_leavings01 where staff_id= ?   ");
            pre1.setString(1 , staffleaveID.getText() );
            ResultSet rs = pre1.executeQuery();
            String staffleaveID ="" ;
            String reasonLeave ="" ;
            String leaveDate ="" ;
            String leaveType ="" ;
            String leaveTime ="" ;
            
           
         
            while(rs.next())
            {
                staffleaveID = rs.getString(1);
                reasonLeave = rs.getString(2);
                leaveDate  = rs.getString(3);
                leaveType = rs.getString(4);
                 leaveTime = rs.getString(5);
                  
              
            
            
            this.staffleaveID.setText(staffleaveID);
            this.reasonLeave.setText(reasonLeave);
           this.leaveDate.setText(leaveDate);
            this.leaveType.setText(leaveType);
            this.leaveTime.setText(leaveTime);
            
            }
    }   catch (Exception ex) {
            System.out.println(ex);
        }
                                            
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        clear();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         mainhome1 home11 = new mainhome1();
        home11.setVisible(true);
        this.setVisible(false);
    }                                        

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
            java.util.logging.Logger.getLogger(leavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leavings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leavings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField leaveDate;
    private javax.swing.JTextField leaveTime;
    private javax.swing.JTextField leaveType;
    private javax.swing.JTextField reasonLeave;
    private javax.swing.JTextField staffleaveID;
    // End of variables declaration                   
}
