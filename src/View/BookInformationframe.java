/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Book;
import Model.Loan;
import Model.Member;
import Service.AdminService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BookInformationframe extends javax.swing.JFrame {
    AdminService adminService;
    DefaultTableModel defaultTableBookModel;
    Book book;
    /**
     * Creates new form BookInformationframe
     */
    public BookInformationframe(int bookID) {
        adminService = new AdminService();
        book = new Book();
        
        initComponents();
        
        
        book = adminService.getBookByID(bookID);
        
        defaultTableBookModel = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        loanMemberTable.setModel(defaultTableBookModel);
        defaultTableBookModel.addColumn("ID USER");
        defaultTableBookModel.addColumn("FULL NAME");
        defaultTableBookModel.addColumn("RETURN DATE");
        
        setLoanDataTable(defaultTableBookModel, adminService.getMemberLoanByBookID(bookID), 
                           adminService.getMemberLoanTransactionByBookID(bookID));
        
        bookIDTextField.setText(String.valueOf(book.getBookId()));
        nameBookInfoTextField.setText(book.getBookName());
        authorTextField.setText(book.getBookAuthor());
        descriptionTextArea.setText(book.getBookDescription());
        genreTextField.setText(book.getBookGerne());
        yearPublicTextField.setText(book.getYearPublic());
        availabilityTextField.setText(String.valueOf(book.getAvailability()));
    }
    
    private void setLoanDataTable(DefaultTableModel defaultTableBookModel, List<Member> loanList, List<Loan> loans){
        for (Member user : loanList) {
            for(Loan loan : loans) {
                if (user.getMemberID() == loan.getIdMember()) {
                    defaultTableBookModel.addRow(new Object[]{user.getMemberID(),
                                                              user.getFullName(),
                                                              loan.getReturnDate()}
                                                );
                }
            }
        }
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
        authorLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        yearPublicLabel = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        bookNameLabel = new javax.swing.JLabel();
        nameBookInfoTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        genreTextField = new javax.swing.JTextField();
        yearPublicTextField = new javax.swing.JTextField();
        availabilityTextField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loanMemberTable = new javax.swing.JTable();
        bookIDLabel = new javax.swing.JLabel();
        bookIDTextField = new javax.swing.JTextField();
        UpdateBookButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        showModeMenuItem = new javax.swing.JMenuItem();
        editModeMenuItem = new javax.swing.JMenuItem();

        setTitle("Book Infomation Frame");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        authorLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(0, 0, 0));
        authorLabel.setText("Author:");

        genreLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(0, 0, 0));
        genreLabel.setText("Genre:");

        yearPublicLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yearPublicLabel.setForeground(new java.awt.Color(0, 0, 0));
        yearPublicLabel.setText("Year Public:");

        availabilityLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        availabilityLabel.setForeground(new java.awt.Color(0, 0, 0));
        availabilityLabel.setText("Availability:");

        bookNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookNameLabel.setText("Name:");

        nameBookInfoTextField.setEditable(false);
        nameBookInfoTextField.setBackground(new java.awt.Color(255, 156, 192));

        authorTextField.setEditable(false);
        authorTextField.setBackground(new java.awt.Color(255, 156, 192));

        genreTextField.setEditable(false);
        genreTextField.setBackground(new java.awt.Color(255, 156, 192));

        yearPublicTextField.setEditable(false);
        yearPublicTextField.setBackground(new java.awt.Color(255, 156, 192));

        availabilityTextField.setEditable(false);
        availabilityTextField.setBackground(new java.awt.Color(255, 156, 192));

        descriptionLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel.setText("Description:");

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setBackground(new java.awt.Color(255, 156, 192));
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(descriptionTextArea);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("History List Member Borrow");

        loanMemberTable.setModel(new javax.swing.table.DefaultTableModel(
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
        loanMemberTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(loanMemberTable);

        bookIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookIDLabel.setText("Book ID:");

        bookIDTextField.setEditable(false);
        bookIDTextField.setBackground(new java.awt.Color(255, 156, 192));

        UpdateBookButton.setBackground(new java.awt.Color(157, 0, 57));
        UpdateBookButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBookButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBookButton.setText("Update");
        UpdateBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookNameLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descriptionLabel)
                            .addComponent(genreLabel)
                            .addComponent(bookIDLabel)
                            .addComponent(authorLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(availabilityLabel)
                                .addComponent(yearPublicLabel)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearPublicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bookIDTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(authorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameBookInfoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(genreTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(UpdateBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookIDLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameBookInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearPublicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearPublicLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(availabilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityLabel)
                            .addComponent(UpdateBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(157, 0, 57));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOK INFORMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenu1.setText("File");

        showModeMenuItem.setText("Show Info Mode");
        showModeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showModeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(showModeMenuItem);

        editModeMenuItem.setText("Edit Mode");
        editModeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editModeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(editModeMenuItem);

        bar.add(jMenu1);

        setJMenuBar(bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBookButtonActionPerformed
        // TODO add your handling code here:
        String name = nameBookInfoTextField.getText();
        String author = authorTextField.getText();
        String description = descriptionTextArea.getText();
        String genre = genreTextField.getText();
        String publicYear = yearPublicTextField.getText();
        String availability = availabilityTextField.getText();
        
        if (Integer.parseInt(publicYear) <= 0 
            || Integer.parseInt(availability) < 0) {
            JOptionPane.showMessageDialog(null,
                    "Year Public of book and Quantity of book cannot be negative or zero!",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            book.setBookName(name); 
            book.setBookAuthor(author);
            book.setBookDescription(description);
            book.setBookGerne(genre);
            book.setYearPublic(publicYear);
            book.setAvailability(Integer.parseInt(availability));
            
            String ConfirmationMessage = "Do you want to change this book to: \n"
                                       + "Name: " + name + "\n" 
                                       + "Author: " + author + "\n"
                                       + "Description: " + description + "\n"
                                       + "Genre: " + genre + "\n"
                                       + "Public Year: " + publicYear + "\n"
                                       + "availability: " + availability + "\n"; 
        
            int result = JOptionPane.showConfirmDialog(null, 
                                                 ConfirmationMessage, 
                                                 "CHANGE BOOK INFOMATION", 
                                                 JOptionPane.YES_NO_OPTION);
        
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, 
                                              "Change Success!", 
                                              "SUCCESS", 
                                              JOptionPane.INFORMATION_MESSAGE);
                adminService.updateBook(book);
            }
        }
    }//GEN-LAST:event_UpdateBookButtonActionPerformed

    private void showModeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showModeMenuItemActionPerformed
        // TODO add your handling code here:
        nameBookInfoTextField.setEditable(false);
        authorTextField.setEditable(false);
        descriptionTextArea.setEditable(false);
        genreTextField.setEditable(false);
        yearPublicTextField.setEditable(false);
        availabilityTextField.setEditable(false);
    }//GEN-LAST:event_showModeMenuItemActionPerformed

    private void editModeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editModeMenuItemActionPerformed
        // TODO add your handling code here:
        nameBookInfoTextField.setEditable(true);
        authorTextField.setEditable(true);
        descriptionTextArea.setEditable(true);
        genreTextField.setEditable(true);
        yearPublicTextField.setEditable(true);
        availabilityTextField.setEditable(true);
    }//GEN-LAST:event_editModeMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBookButton;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JTextField availabilityTextField;
    private javax.swing.JMenuBar bar;
    private javax.swing.JLabel bookIDLabel;
    private javax.swing.JTextField bookIDTextField;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JMenuItem editModeMenuItem;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JTextField genreTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable loanMemberTable;
    private javax.swing.JTextField nameBookInfoTextField;
    private javax.swing.JMenuItem showModeMenuItem;
    private javax.swing.JLabel yearPublicLabel;
    private javax.swing.JTextField yearPublicTextField;
    // End of variables declaration//GEN-END:variables
}
