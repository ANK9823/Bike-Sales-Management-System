/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bsms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANK
 */
public class Customer_Details extends javax.swing.JFrame {
   String customerid,customer_name,nic,address,mobile,home;
    /** Creates new form Customer_Details */
    public Customer_Details() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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
        jSeparator1 = new javax.swing.JSeparator();
        txtnic = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        txtcid = new javax.swing.JTextField();
        txtcn = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txthno = new javax.swing.JTextField();
        txtmono = new javax.swing.JTextField();
        btnenter = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcd = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Customer Name        :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 290, 50));

        jLabel2.setBackground(new java.awt.Color(0, 153, 255));
        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NIC                             :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 300, 50));

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Address                      :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 300, 70));

        jLabel4.setBackground(new java.awt.Color(0, 153, 255));
        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Customer ID              :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 300, 50));

        jLabel5.setBackground(new java.awt.Color(0, 153, 255));
        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Customer Details");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 360, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 970, 10));

        txtnic.setBackground(new java.awt.Color(255, 255, 255));
        txtnic.setFont(new java.awt.Font("DejaVu Serif", 0, 24)); // NOI18N
        txtnic.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 290, 40));

        txta.setBackground(new java.awt.Color(255, 255, 255));
        txta.setFont(new java.awt.Font("DejaVu Serif", 0, 24)); // NOI18N
        txta.setForeground(new java.awt.Color(0, 0, 0));
        txta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaActionPerformed(evt);
            }
        });
        jPanel1.add(txta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 290, 40));

        txtcid.setBackground(new java.awt.Color(255, 255, 255));
        txtcid.setFont(new java.awt.Font("DejaVu Serif", 0, 24)); // NOI18N
        txtcid.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 290, 40));

        txtcn.setBackground(new java.awt.Color(255, 255, 255));
        txtcn.setFont(new java.awt.Font("DejaVu Serif", 0, 24)); // NOI18N
        txtcn.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 290, 40));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact No", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 153, 255));
        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mobile     :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 147, 123, 34));

        jLabel7.setBackground(new java.awt.Color(0, 153, 255));
        jLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Home       :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 71, 123, 31));

        txthno.setBackground(new java.awt.Color(255, 255, 255));
        txthno.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        txthno.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txthno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 290, 40));

        txtmono.setBackground(new java.awt.Color(255, 255, 255));
        txtmono.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        txtmono.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtmono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 290, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 520, 230));

        btnenter.setBackground(new java.awt.Color(0, 102, 204));
        btnenter.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnenter.setForeground(new java.awt.Color(255, 255, 255));
        btnenter.setText("ENTER");
        btnenter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });
        jPanel1.add(btnenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 120, 50));

        btnupdate.setBackground(new java.awt.Color(0, 102, 204));
        btnupdate.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 120, 50));

        btnclear.setBackground(new java.awt.Color(0, 102, 204));
        btnclear.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 120, 50));

        btndelete.setBackground(new java.awt.Color(0, 102, 204));
        btndelete.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 120, 50));

        btnhome.setBackground(new java.awt.Color(0, 102, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bsms/1 home-start-blue-logo-icon-0.png"))); // NOI18N
        btnhome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 60, 60));

        btnsearch.setBackground(new java.awt.Color(0, 102, 255));
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bsms/vippng.com-search-png-images-1037268.png"))); // NOI18N
        btnsearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, 60, 60));

        tblcd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblcd);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 720, 560, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaActionPerformed

    private void btnenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterActionPerformed
        LoadElements();
        DBConnection.Connect();
        try
        {
            if(this.txtcid.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Customer ID is required!");
            }
            else if(this.txtcn.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Customer Name is required");
            }
            else if(this.txtnic.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "NIC is required");
            }
            else if(this.txta.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Address is required");
            }
            else if(this.txtmono.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Mobile No is required");
            }
            else if(this.txthno.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Home No is required");
            }
            else
            {
                Statement st=DBConnection.con.createStatement();
                st.executeUpdate("INSERT INTO CUSTOMER VALUES('"+customerid+"','"+customer_name+"','"+nic+"','"+address+"','"+mobile+"','"+home+"')");
                JOptionPane.showMessageDialog(this, "Record is inserted succesfully");
                DBConnection.con.close();
                LoadTable();
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        }

        private void txtsaActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        void LoadElements()
        {
            customerid=this.txtcid.getText();
            customer_name=this.txtcn.getText();
            nic=this.txtnic.getText();
            address=this.txta.getText();
            mobile=this.txtmono.getText();
            home=this.txthno.getText();
            

        }
        void LoadTable()
        {
            DefaultTableModel dtm=new DefaultTableModel();
            dtm.addColumn("Customer ID");
            dtm.addColumn("Customer Name");
            dtm.addColumn("NIC");
            dtm.addColumn("Address");
            dtm.addColumn("Mobile");

            dtm.addColumn("Home");
            

            DBConnection.Connect();
            try
            {
                Statement st=DBConnection.con.createStatement();
                ResultSet rs=st.executeQuery("SELECT * FROM CUSTOMER");
                while(rs.next())
                {
                    String CUSTOMERID = rs.getString("CUSTOMERID");
                    String CUSTOMER_NAME = rs.getString("CUTOMER_NAME");
                    String NIC= rs.getString("NIC");

                    String ADDRESS= rs.getString("ADDRESS");
                    String MOBILE = rs.getString("MOBILE");
                    String HOME=rs.getString("HOME");
                    
                    dtm.addRow(new String[]{CUSTOMERID,CUSTOMER_NAME,NIC,ADDRESS,MOBILE,HOME});
                   
                }
                this.tblcd.setModel(dtm);
                DBConnection.con.close();
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }

            //TODO add your handling code here
    }//GEN-LAST:event_btnenterActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        LoadElements();
        DBConnection.Connect();
        try

        {
            if(this.txtcid.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Customer ID is required!");
            }
            
            else
            {
                Statement st=DBConnection.con.createStatement();
                st.executeUpdate("UPDATE CUSTOMER SET CUTOMER_NAME='"+customer_name+"',NIC='"+nic+"',ADDRESS='"+address+"',MOBILE='"+mobile+"',HOME='"+home+"' WHERE CUSTOMERID='"+this.txtcid.getText()+"'");
                JOptionPane.showMessageDialog(this, "Record is updated succesfully");
                DBConnection.con.close();
                LoadTable();
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }  // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        this.txtcid.setText("");
        this.txtcn.setText("");
        this.txtnic.setText("");
        this.txta.setText("");
        this.txtmono.setText("");
        this.txthno.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        DBConnection.Connect();
        try
        {
            if(this.txtcid.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Customer ID is required!");
            }
            

            else
            {
                Statement st=DBConnection.con.createStatement();
                st.executeUpdate("DELETE FROM CUSTOMER WHERE CUSTOMERID='"+this.txtcid.getText()+"'");
                JOptionPane.showMessageDialog(this, "Record is deleted succesfully");
                DBConnection.con.close();
                LoadTable();
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        Main mp=new Main();
        mp.setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        DBConnection.Connect();
        try
        {
            Statement st = DBConnection.con.createStatement();
            ResultSet res = st.executeQuery("SELECT*FROM CUSTOMER WHERE CUSTOMERID='"+this.txtcid.getText()+"'");
            while(res.next())
            {
                this.txtcn.setText(res.getString("CUTOMER_NAME"));
                this.txtnic.setText(res.getString("NIC"));
                this.txta.setText(res.getString("ADDRESS"));
               
                this.txtmono.setText(res.getString("MOBILE"));
                this.txthno.setText(res.getString("HOME"));
            }
            DBConnection.con.close();

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnenter;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblcd;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcn;
    private javax.swing.JTextField txthno;
    private javax.swing.JTextField txtmono;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables

}
