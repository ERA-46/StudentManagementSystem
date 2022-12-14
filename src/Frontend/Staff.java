/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;
import DatabaseLayer.DBConnection;
import DatabaseLayer.DBUserConnection;
import Models.AddStaff;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javafx.scene.control.RadioButton; //for radio buttons
import java.sql.ResultSet; //jtable
import net.proteanit.sql.DbUtils; //to get data from DB to the sys
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author sange
 */
public class Staff extends javax.swing.JInternalFrame {
        
    Models.AddStaff Staff;
    String type;
    /**
     * Creates new form Student
     */
    public Staff() {
        initComponents();
        
        Staff = new AddStaff();
        showTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void showTableData(){
       DBConnection con = new DBConnection();
      try
      {
          String sql = "select * from Staff";
          PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
          ResultSet rs = prep.executeQuery();  
          tblStaff.setModel(DbUtils.resultSetToTableModel(rs));
          
      }
      catch(SQLException ex)
      {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());          
      }   
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGrpType = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtSearchStaff = new javax.swing.JTextField();
        btnSearchStaff = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        lblSubject = new javax.swing.JLabel();
        cmbGrade = new javax.swing.JComboBox<>();
        cmbSub = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        lblGrade = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        cmbSrchBy = new javax.swing.JComboBox<>();
        cmbtype = new javax.swing.JComboBox<>();
        btnReport = new javax.swing.JButton();
        cmbName = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setText("Address");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 280, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 360, 133));

        jLabel3.setText("Contact");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 80, 30));

        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
        });
        getContentPane().add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 360, 30));

        btnAdd.setText("ADD");
        btnAdd.setPreferredSize(new java.awt.Dimension(71, 23));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 230, 50));

        btnClear.setText("CLEAR");
        btnClear.setPreferredSize(new java.awt.Dimension(71, 23));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 100, 50));

        jLabel11.setText("Search by");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));
        getContentPane().add(txtSearchStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 340, 40));

        btnSearchStaff.setText("SEARCH");
        btnSearchStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, 180, 40));

        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblStaff);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 810, 320));

        btnUpdate.setText("UPDATE DETAILS");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 140, 50));

        btnDelete.setText("DELETE MEMBER");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 130, 50));

        jLabel12.setText("Email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 360, 30));

        jLabel13.setText("NIC");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        getContentPane().add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 360, 30));

        lblSubject.setText("Subject");
        getContentPane().add(lblSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 80, 30));

        cmbGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "A/L" }));
        cmbGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGradeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 90, 30));

        cmbSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Science", "Maths", "Geography", "Combined Maths", "Biology", "Chemistry" }));
        cmbSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSubActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 150, 30));

        jLabel5.setText("Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 70, 30));

        btnLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLoad.setText("Show All");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 810, 50));

        lblGrade.setText("Grade");
        getContentPane().add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 70, 30));

        jLabel7.setText("Staff ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtStaffID.setEditable(false);
        txtStaffID.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 22, 80, 30));

        cmbSrchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "NIC" }));
        getContentPane().add(cmbSrchBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 90, 40));

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Academic", "Non-Academic" }));
        cmbtype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbtypeMouseClicked(evt);
            }
        });
        cmbtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtypeActionPerformed(evt);
            }
        });
        getContentPane().add(cmbtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 150, 30));

        btnReport.setText("Generate Staff Member Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 480, 50));

        cmbName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Ms." }));
        cmbName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNameActionPerformed(evt);
            }
        });
        getContentPane().add(cmbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtStaffID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtNIC.setText("");
        cmbGrade.setSelectedIndex(0);
        cmbSub.setSelectedIndex(0);    
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String mail = txtEmail.getText().trim();
        String number = (txtContact.getText().trim());
        String name = txtName.getText().trim();
        String nic = txtNIC.getText().trim();
        
        if(txtName.getText().equals("")|| txtAddress.getText().equals("") || txtContact.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Please Fill the remaining details..");
        }
        else
        if(!(Pattern.matches("^[\\p{L} .'-]+$", name))){
            JOptionPane.showMessageDialog(null, "Invalid Name!! Please enter name correctly.");
        }
        else
        if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", mail))){
            
            JOptionPane.showMessageDialog(null, "Invalid email Address!! Please enter a valid email address.");
        }
        else
        if(!Pattern.matches("\\d{10}", number)){
            
            JOptionPane.showMessageDialog(null, "Invalid Phone number!! Please enter a valid Phone Number.");
        }
        else
        if(nic.length() > 10){
            
            JOptionPane.showMessageDialog(null, "Invalid NIC number!! Please enter a valid NIC.");
        }
        else{
            
        Staff.setStaffName(cmbName.getSelectedItem().toString()+ name);
        Staff.setStaffAddress(txtAddress.getText().trim());
        Staff.setStaffContact(Integer.parseInt(number));
        Staff.setStaffEmail(mail);
        Staff.setStaffNic(nic);
        Staff.setStaffType(cmbtype.getSelectedItem().toString());
        Staff.setStaffGrade(cmbGrade.getSelectedItem().toString());
        Staff.setStaffSub(cmbSub.getSelectedItem().toString());
        
        DatabaseLayer.DBUserConnection up = new DBUserConnection();

        up.AddStaff(Staff); 
        
        JOptionPane.showMessageDialog(rootPane, "Staff member added!");
        txtName.setText("");
        txtAddress.setText("");
        txtContact.setText(""); 
        txtEmail.setText(""); 
        txtNIC.setText("");
        cmbGrade.setSelectedIndex(0);
        cmbSub.setSelectedIndex(0);
        
        showTableData();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        showTableData();
        
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DBConnection con = new DBConnection();

        String sql = "delete from Staff where Staff_ID = ?";
        try{
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.setString(1,txtStaffID.getText().toString());
            prep.execute();

            JOptionPane.showMessageDialog(null, "Member Deleted!");

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

        txtStaffID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtNIC.setText("");
        cmbtype.setSelectedIndex(0);
        cmbGrade.setSelectedIndex(0);
        cmbSub.setSelectedIndex(0);
        
        showTableData();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        // TODO add your handling code here:
        //fill the txt when clicked table row
        int row= tblStaff.getSelectedRow();
        TableModel model =tblStaff.getModel();
        txtStaffID.setText(model.getValueAt(row, 0).toString());
        //txtName.setText(model.getValueAt(row, 1).toString());
        txtAddress.setText(model.getValueAt(row, 2).toString());
        txtEmail.setText(model.getValueAt(row,3).toString());
        txtContact.setText(model.getValueAt(row, 4).toString());
        txtNIC.setText(model.getValueAt(row, 5).toString());
        
        String name = model.getValueAt(row, 1).toString();
        
        if(name.contains("Mr.")){
            
            cmbName.setSelectedIndex(0);
        }
        
        if(name.contains("Ms.")){
            
            cmbName.setSelectedIndex(1);
        }
        
        if(name.contains("Miss.")){
            
            cmbName.setSelectedIndex(2);
        }
        
        txtName.setText(name.substring(3));
        
        String Type = model.getValueAt(row, 6).toString();
            switch(Type){
                case "Academic":
                    cmbtype.setSelectedIndex(0);
                    break;
                case "Non-Academic":
                    cmbtype.setSelectedIndex(1);
                    break;
            }
            
         String Grade = model.getValueAt(row, 7).toString();
            switch(Grade){
                case "1":
                    cmbGrade.setSelectedIndex(1);
                    break;
                case "2":
                    cmbGrade.setSelectedIndex(2);
                    break;           
                case "3":
                    cmbGrade.setSelectedIndex(3);
                    break; 
                case "4":
                    cmbGrade.setSelectedIndex(4);
                    break;
                case "5":
                    cmbGrade.setSelectedIndex(5);
                    break;
                case "6":
                    cmbGrade.setSelectedIndex(6);
                    break;
                case "7":
                    cmbGrade.setSelectedIndex(7);
                    break;
                case "8":
                    cmbGrade.setSelectedIndex(8);
                    break;
                case "9":
                    cmbGrade.setSelectedIndex(9);
                    break;
                case "10":
                    cmbGrade.setSelectedIndex(10);
                    break;
                case "11":
                    cmbGrade.setSelectedIndex(11);
                    break;
                case "A/L":
                    cmbGrade.setSelectedIndex(12);
                    break;                               
            }
            
            String Subject = model.getValueAt(row, 8).toString();
                switch (Subject){
                    case "Science":
                        cmbSub.setSelectedIndex(1);
                        break;
                    case "Maths":
                        cmbSub.setSelectedIndex(2);
                        break;
                    case "Geography":
                        cmbSub.setSelectedIndex(3);
                        break;
                    case "Combined Maths":
                        cmbSub.setSelectedIndex(4);
                        break;
                    case "Biology":
                        cmbSub.setSelectedIndex(5);
                        break;
                    case "Chemistry":
                        cmbSub.setSelectedIndex(6);
                        break;
                        
                }
        
    }//GEN-LAST:event_tblStaffMouseClicked

    private void btnSearchStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStaffActionPerformed
        // TODO add your handling code here:
        DBConnection con = new DBConnection();
        String sch = cmbSrchBy.getSelectedItem().toString();
        
        if(sch=="ID"){
        try
        {
            String search = txtSearchStaff.getText();
            String sql = "select * from Staff where Staff_ID='"+search+"'";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            ResultSet rs = prep.executeQuery();  
            tblStaff.setModel(DbUtils.resultSetToTableModel(rs));            
            
        }catch(Exception ex)
        {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Enter value to search");        
        }
        
        }
        else if(sch=="Name")
        {
        try    
         {
            String search = txtSearchStaff.getText();
            String sql = "select * from Staff where Name LIKE '%"+search+"%'";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            ResultSet rs = prep.executeQuery();  
            tblStaff.setModel(DbUtils.resultSetToTableModel(rs));            
            
        }catch(Exception ex)
        {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Enter value to search");        
        }       
        
        }
        else if(sch=="Occupation")
        {
        try    
         {
            String search = txtSearchStaff.getText();
            String sql = "select * from Staff where NIC='"+search+"'";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            ResultSet rs = prep.executeQuery();  
            tblStaff.setModel(DbUtils.resultSetToTableModel(rs));            
            
        }catch(Exception ex)
        {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Enter value to search");        
        }
       }
    }//GEN-LAST:event_btnSearchStaffActionPerformed

    private void cmbtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtypeActionPerformed
        // TODO add your handling code here:
        if(cmbtype.getSelectedItem().toString() == "Non-Academic"){
            
            cmbGrade.setVisible(false);
            cmbSub.setVisible(false);
            lblGrade.setVisible(false);
            lblSubject.setVisible(false);
        }
        else{
            cmbGrade.setVisible(true);
            cmbSub.setVisible(true);
            lblGrade.setVisible(true);
            lblSubject.setVisible(true);
        }
    }//GEN-LAST:event_cmbtypeActionPerformed

    private void cmbSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSubActionPerformed

    private void cmbtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbtypeMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbtypeMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        String upmail = txtEmail.getText().trim();
        String upnumber = (txtContact.getText().trim()); 
        String upname = txtName.getText().trim();
        String upnic = txtNIC.getText().trim();
        
        if(txtName.getText().equals("")|| txtAddress.getText().equals("") || txtContact.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Please Fill the remaining details..");
        }
        else
        if(!(Pattern.matches("^[\\p{L} .'-]+$", upname))){
            JOptionPane.showMessageDialog(null, "Invalid Name!! Please enter name correctly.");
        }
        else
        if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", upmail))){
            
            JOptionPane.showMessageDialog(null, "Please enter a valid email address");
        } 
        else
        if(!Pattern.matches("\\d{10}", upnumber)){
            
            JOptionPane.showMessageDialog(null, "Please enter a valid Phone Number");
        }
        else
        if(upnic.length() > 10){
            
            JOptionPane.showMessageDialog(null, "Invalid NIC number!! Please enter a valid NIC.");
        }
        else{
            
        Staff.setStaffName(cmbName.getSelectedItem().toString() + txtName.getText().trim());
        Staff.setStaffAddress(txtAddress.getText().trim());
        Staff.setStaffContact(Integer.parseInt(upnumber));
        Staff.setStaffEmail(upmail);
        Staff.setStaffNic(txtNIC.getText().trim());
        Staff.setStaffType(cmbtype.getSelectedItem().toString());
        Staff.setStaffGrade(cmbGrade.getSelectedItem().toString());
        Staff.setStaffSub(cmbSub.getSelectedItem().toString());
        Staff.setStaffID(Integer.parseInt(txtStaffID.getText()));
        
        DatabaseLayer.DBUserConnection up = new DBUserConnection();

        up.UpdateStaff(Staff); 
        
        JOptionPane.showMessageDialog(rootPane, "Staff member details updated!");
        txtStaffID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtContact.setText(""); 
        txtEmail.setText(""); 
        txtNIC.setText("");
        cmbGrade.setSelectedIndex(0);
        cmbSub.setSelectedIndex(0);

        showTableData();
        
        }
         
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffIDActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=celsm;user=eranda;password=3227";
             Connection con = null;
            con = DriverManager.getConnection(url);
            JasperDesign jdesign = JRXmlLoader.load("H:\\SLIIT Lectures\\2nd Year\\2nd Semester\\Project and Professional Aspects\\Project\\NetBeans\\CELS M sys (10.05)\\src\\Frontend\\StaffReport.jrxml");
        
            String sql = "select * from Staff";
         
            JRDesignQuery updQ = new JRDesignQuery();
            updQ.setText(sql);
            
            jdesign.setQuery(updQ);
            
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint print = JasperFillManager.fillReport(jreport, null, con);
            JasperViewer.viewReport(print, false);
            
        } catch (JRException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnReportActionPerformed

    private void cmbNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAddress.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContact.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNIC.requestFocus();
        }
    }//GEN-LAST:event_txtContactKeyPressed

    private void cmbGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGradeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGrpType;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearchStaff;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbGrade;
    private javax.swing.JComboBox<String> cmbName;
    private javax.swing.JComboBox<String> cmbSrchBy;
    private javax.swing.JComboBox<String> cmbSub;
    private javax.swing.JComboBox<String> cmbtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchStaff;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}
