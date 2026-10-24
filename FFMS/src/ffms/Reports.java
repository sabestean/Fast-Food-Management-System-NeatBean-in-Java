package ffms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Sabestean
 */
public class Reports extends javax.swing.JFrame {

    
        
    public void tablesale(){
    try {
        DBConnection obj = new DBConnection();
        Connection db = obj.db();
        String query = "SELECT Customer_ID,Product_Name,Price,Quantity FROM OrderSystem";
        PreparedStatement ps = db.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
       

        DefaultTableModel model = (DefaultTableModel) sales_tbl.getModel();

        // Set the new data from the ResultSet
        sales_tbl.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        
       
    } catch (Exception e) {
        e.printStackTrace();
        // Handle the exception
    }
    
    }
    
    public Reports() {
        initComponents();
        tablesale();
    }

    public void init(){
    
    }
    
   
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backbtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sales_tbl = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jfood_id = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        trs = new javax.swing.JLabel();
        total_text = new javax.swing.JTextField();
        resetbtn_tbl3 = new javax.swing.JButton();
        total_btn = new javax.swing.JButton();
        print_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        totalamount_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(242, 133, 0));

        backbtn.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\back-arrow.png")); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SPICY CORNER ");

        closebtn.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\close-window.png")); // NOI18N
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        sales_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Food Name", "Quantity", "Price"
            }
        ));
        sales_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sales_tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sales_tbl);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 133, 0));
        jLabel5.setText("REPORT & SALES");

        jPanel3.setBackground(new java.awt.Color(249, 246, 238));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\idd.png")); // NOI18N
        jLabel3.setText(" ID");

        id.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jfood_id.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\qorder.png")); // NOI18N
        jLabel18.setText("Quantity");

        quantity.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\price.png")); // NOI18N
        jLabel15.setText("Price");

        price.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        add_btn.setBackground(new java.awt.Color(255, 255, 255));
        add_btn.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        add_btn.setForeground(new java.awt.Color(0, 51, 102));
        add_btn.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\cart.png")); // NOI18N
        add_btn.setText("Add Amount");
        add_btn.setToolTipText("add");
        add_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\food.png")); // NOI18N
        jLabel7.setText("Food Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfood_id)
                            .addComponent(quantity)
                            .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfood_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(249, 246, 238));

        trs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trs.setForeground(new java.awt.Color(51, 51, 51));
        trs.setText("Total Sales Amount  Rs:");

        total_text.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        total_text.setToolTipText("Total");
        total_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_textActionPerformed(evt);
            }
        });

        resetbtn_tbl3.setBackground(new java.awt.Color(255, 255, 255));
        resetbtn_tbl3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        resetbtn_tbl3.setForeground(new java.awt.Color(153, 0, 0));
        resetbtn_tbl3.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\reset.png")); // NOI18N
        resetbtn_tbl3.setText("Reset");
        resetbtn_tbl3.setToolTipText("reset");
        resetbtn_tbl3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        resetbtn_tbl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtn_tbl3ActionPerformed(evt);
            }
        });

        total_btn.setBackground(new java.awt.Color(255, 255, 255));
        total_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        total_btn.setForeground(new java.awt.Color(0, 102, 102));
        total_btn.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\total.png")); // NOI18N
        total_btn.setText("Total ");
        total_btn.setToolTipText("total");
        total_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        total_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_btnActionPerformed(evt);
            }
        });

        print_btn.setBackground(new java.awt.Color(255, 255, 255));
        print_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        print_btn.setForeground(new java.awt.Color(0, 51, 102));
        print_btn.setIcon(new javax.swing.ImageIcon("E:\\Superior\\4 semester\\JAVA Progamming Language\\Fast & Food Management System\\FFMS\\src\\ffms\\print.png")); // NOI18N
        print_btn.setText("Print");
        print_btn.setToolTipText("print");
        print_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trs)
                .addGap(18, 18, 18)
                .addComponent(total_text, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetbtn_tbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(total_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trs)
                    .addComponent(total_text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetbtn_tbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        totalamount_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Food Name", "Quantity", "Price", "Sub.Total"
            }
        ));
        jScrollPane2.setViewportView(totalamount_tbl);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(333, 333, 333))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backbtn)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 659, Short.MAX_VALUE)
                        .addComponent(closebtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closebtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        DashBoard dash = new DashBoard();
        dash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbtnMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    
    // Table 1 Code to Table Form
    private void sales_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sales_tblMouseClicked
      
           DefaultTableModel model = (DefaultTableModel) sales_tbl.getModel();
        int selectedRow =sales_tbl.getSelectedRow();

        // Populate text fields with data from the selected row
        id.setText(model.getValueAt(selectedRow, 0).toString());
        jfood_id.setText(model.getValueAt(selectedRow, 1).toString());
        price.setText(model.getValueAt(selectedRow, 2).toString());
        quantity.setText(model.getValueAt(selectedRow, 3).toString());
        
        
    }//GEN-LAST:event_sales_tblMouseClicked

    private void total_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_textActionPerformed

    
    // add button
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) totalamount_tbl.getModel();

            // Assuming you have the following variables:
            String orderPriceStr = price.getText();
            String jquantityStr = quantity.getText();

            // Convert order_price and jquantity to float
            float orderPriceFloat;
            float jquantityFloat;
            try {
                orderPriceFloat = Float.parseFloat(orderPriceStr);
                jquantityFloat = Float.parseFloat(jquantityStr);
            } catch (NumberFormatException ex) {
                // Handle invalid input (e.g., non-numeric values)
                JOptionPane.showMessageDialog(null, "Error: Please enter valid numeric values for order price and quantity.");
                return;
            }

            // Calculate the total
            float total = orderPriceFloat * jquantityFloat;

            // Create a new row with data from text fields
            Object[] rowData = {
                jfood_id.getText(),
                price.getText(),
                quantity.getText(),

                String.valueOf(total), // Display the total in the table
            };

            // Insert the new row at the top of the table model
            model.insertRow(0, rowData);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_add_btnActionPerformed

         private void clearTableData() {
    DefaultTableModel model = (DefaultTableModel)  totalamount_tbl.getModel();
    model.setRowCount(0); // This will remove all rows from the table
    }
    
    // reset button
    private void resetbtn_tbl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtn_tbl3ActionPerformed

        clearTableData();
        id.setText("");
        jfood_id.setText("");
        quantity.setText("");
        price.setText("");
        total_text.setText("");
    }//GEN-LAST:event_resetbtn_tbl3ActionPerformed

    
    // total button
    private void total_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_btnActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) totalamount_tbl.getModel();

            float totalSum = 0;

            // Iterate over each row in the table
            for (int i = 0; i < model.getRowCount(); i++) {
                // Extract the value of the "Total" column from each row and add it to the total sum
                totalSum += Float.parseFloat(model.getValueAt(i, 3).toString());
                total_text.setText(String.valueOf(totalSum));
            }

            // Display the total sum in the total_text field

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        // Display the total price
    }//GEN-LAST:event_total_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed

        try {
            // Get current date and time
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateTime = dateFormat.format(new Date());

            // Create a MessageFormat for the header including the total amount and date/time
            double totalPrice = Double.parseDouble(total_text.getText());
            MessageFormat header = new MessageFormat("Today Total Sales: " + totalPrice + "  Date/Time: " + dateTime);

            // Print the table along with the header
            totalamount_tbl.print(JTable.PrintMode.NORMAL, header, null);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_print_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel backbtn;
    private javax.swing.JLabel closebtn;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jfood_id;
    private javax.swing.JTextField price;
    private javax.swing.JButton print_btn;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton resetbtn_tbl3;
    private javax.swing.JTable sales_tbl;
    private javax.swing.JButton total_btn;
    private javax.swing.JTextField total_text;
    private javax.swing.JTable totalamount_tbl;
    private javax.swing.JLabel trs;
    // End of variables declaration//GEN-END:variables
}
