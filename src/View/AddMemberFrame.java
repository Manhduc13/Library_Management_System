/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Member;
import Service.AdminService;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class AddMemberFrame extends javax.swing.JFrame {
    AdminService adminService;
    Member member;
    /**
     * Creates new form AddUserFrame
     */
    public AddMemberFrame() {
        initComponents();
        adminService = new AdminService();
        member = new Member();
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
        requireLabel4 = new javax.swing.JLabel();
        requireLabel3 = new javax.swing.JLabel();
        requireLabel1 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        phoneTextField = new javax.swing.JTextField();
        fullnameTextField = new javax.swing.JTextField();
        memberShipLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        fullNameLabel = new javax.swing.JLabel();
        memberShipTypeComboBox = new javax.swing.JComboBox<>();
        requireLabel2 = new javax.swing.JLabel();
        dobDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        addMemberTitleLabel = new javax.swing.JLabel();

        setTitle("Member Register Frame");

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        requireLabel4.setForeground(new java.awt.Color(255, 0, 0));
        requireLabel4.setText("(*)");

        requireLabel3.setForeground(new java.awt.Color(255, 0, 0));
        requireLabel3.setText("(*)");

        requireLabel1.setForeground(new java.awt.Color(255, 0, 0));
        requireLabel1.setText("(*)");

        registerButton.setBackground(new java.awt.Color(157, 0, 57));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        phoneTextField.setBackground(new java.awt.Color(255, 156, 192));
        phoneTextField.setForeground(new java.awt.Color(0, 0, 0));

        fullnameTextField.setBackground(new java.awt.Color(255, 156, 192));
        fullnameTextField.setForeground(new java.awt.Color(0, 0, 0));

        memberShipLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        memberShipLabel.setForeground(new java.awt.Color(0, 0, 0));
        memberShipLabel.setText("Membership:");

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(0, 0, 0));
        phoneLabel.setText("Phone Number:");

        dobLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(0, 0, 0));
        dobLabel.setText("Date Of Birth:");

        fullNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        fullNameLabel.setText("Full Name:");

        memberShipTypeComboBox.setBackground(new java.awt.Color(157, 0, 57));
        memberShipTypeComboBox.setForeground(new java.awt.Color(255, 255, 255));
        memberShipTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Six months", "A Year", "Two Years" }));

        requireLabel2.setForeground(new java.awt.Color(255, 0, 0));
        requireLabel2.setText("(*)");

        dobDateChooser.setBackground(new java.awt.Color(255, 156, 192));
        dobDateChooser.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(requireLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberShipLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(memberShipTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(requireLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requireLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requireLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fullNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(phoneLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(dobLabel)
                                                .addGap(30, 30, 30)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(phoneTextField)
                                            .addComponent(dobDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))))
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameLabel)
                    .addComponent(requireLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dobLabel)
                        .addComponent(requireLabel3))
                    .addComponent(dobDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLabel)
                    .addComponent(requireLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requireLabel2)
                    .addComponent(memberShipLabel)
                    .addComponent(memberShipTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(157, 0, 57));

        addMemberTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        addMemberTitleLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addMemberTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        addMemberTitleLabel.setText("NEW MEMBER REGISTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(addMemberTitleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addMemberTitleLabel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        if(fullnameTextField.getText().isEmpty() 
            || dobDateChooser.getDate() == null
            || phoneTextField.getText().isEmpty()) {
            
            warningLabel.setText("Enter the (*) requirement");
            warningLabel.setForeground(Color.red);
            
        } else {
            String name = fullnameTextField.getText();
            String dob = new SimpleDateFormat("yyyy-MM-dd").format(dobDateChooser.getDate());
            String phone = phoneTextField.getText();
            String startDate = LocalDate.now().toString();
            String endDate = null;
            if(memberShipTypeComboBox.getSelectedItem().equals("Six months")) {
                endDate = LocalDate.now().plusMonths(6).toString();
            } else if (memberShipTypeComboBox.getSelectedItem().equals("A Year")) {
                endDate = LocalDate.now().plusYears(1).toString();
            } else if (memberShipTypeComboBox.getSelectedItem().equals("Two Years")) {
                endDate = LocalDate.now().plusYears(2).toString();
            }
            
            member.setFullName(name);
            member.setDob(Date.valueOf(dob));
            member.setPhone(phone);
            member.setStartDate(Date.valueOf(startDate));
            member.setEndDate(Date.valueOf(endDate));
            
            String ConfirmationMessage = "Do you want to add a new member: \n"
                                       + "Name: " + name + "\n" 
                                       + "Date of birth: " + dob + "\n"
                                       + "Phone number: " + phone + "\n"
                                       + "Start membership:" + startDate + "\n"
                                       + "End memberShip: " + endDate + "\n";
        
            int result = JOptionPane.showConfirmDialog(null, 
                                                 ConfirmationMessage, 
                                                 "NEW MEMBER CONFIRMATION", 
                                                 JOptionPane.YES_NO_OPTION);
        
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, 
                                              "Registered Success!", 
                                              "Success", 
                                              JOptionPane.INFORMATION_MESSAGE);
                adminService.addMember(member);
            }
        
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addMemberTitleLabel;
    private com.toedter.calendar.JDateChooser dobDateChooser;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullnameTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel memberShipLabel;
    private javax.swing.JComboBox<String> memberShipTypeComboBox;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel requireLabel1;
    private javax.swing.JLabel requireLabel2;
    private javax.swing.JLabel requireLabel3;
    private javax.swing.JLabel requireLabel4;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
