/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QuanLyBanVeMayBay.GUI.form;

import java.util.ArrayList;
import java.util.Vector;
import QuanLyBanVeMayBay.BUS.ChuyenBayBUS;
import QuanLyBanVeMayBay.DTO.ChuyenBay;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thepi314
 */
public class ChuyenBayGUI extends javax.swing.JPanel {

    /**
     * Creates new form ChuyenBayGUI
     */
    DefaultTableModel dtmChuyenBay = new DefaultTableModel();
    ChuyenBayBUS cbBUS = new ChuyenBayBUS();
    ArrayList<ChuyenBay> dscb = new ArrayList<>();

    public ChuyenBayGUI() {
        initComponents();
        getListChuyenBay();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaCB = new javax.swing.JTextField();
        txtMaTB = new javax.swing.JTextField();
        txtMaMB = new javax.swing.JTextField();
        txtNgayCC = new javax.swing.JTextField();
        txtNgayHC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtVeCL = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtTuKhoa = new javax.swing.JTextField();
        txtLuaChon = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableChuyenBay = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Chuyến Bay");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã Tuyến Bay");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã Máy Bay");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ngày Cất Cánh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ngày Hạ Cánh");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1btnThemKhuyenMai(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số Vé Còn Lại");

        txtVeCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVeCLActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Xuất Excel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Mã Tuyến Bay", "Mã Máy Bay" }));
        txtLuaChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuaChonActionPerformed(evt);
            }
        });

        jButton6.setText("Tìm Kiếm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(txtLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Nhập Excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(34, 34, 34)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaTB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtMaMB)
                            .addComponent(txtMaCB, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayCC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayHC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVeCL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtVeCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtMaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtNgayCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtNgayHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        tableChuyenBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Chuyến Bay", "Mã Tuyến Bay", "Mã Máy Bay", "Số Vé Còn Lạii", "Ngày Cất Cánh", "Ngày Hạ Cánh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableChuyenBay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChuyenBayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableChuyenBay);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Quản Lý Chuyến Bay");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1btnThemKhuyenMai(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1btnThemKhuyenMai
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1btnThemKhuyenMai

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        themChuyenBay();
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        suaChuyenBay();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        xoaChuyenBay();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtVeCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVeCLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVeCLActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtLuaChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuaChonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuaChonActionPerformed

    private void tableChuyenBayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChuyenBayMouseClicked
        // TODO add your handling code here:
        clickTableRowKM();
    }//GEN-LAST:event_tableChuyenBayMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        timKiemMayBay();
    }//GEN-LAST:event_jButton6ActionPerformed

    public void themChuyenBay() {
        try {
            String maTB = txtMaTB.getText();
            String maMB = txtMaMB.getText();
<<<<<<< HEAD
=======
//        String veCL = txtVeCL.getText();
//        int maChuyenBay = Integer.parseInt(maCB);
//        int maTuyenBay = Integer.parseInt(maTB);
//        int soVeCL = Integer.parseInt(veCL);
            String ngayCC = txtNgayCC.getText();
            String ngayHC = txtNgayHC.getText();
>>>>>>> 911a8f62867e3c85baf2d4db198343614a8bbd3a
            String ngayCatCanh = txtNgayCC.getText();
            String ngayHaCanh = txtNgayHC.getText();
            cbBUS.themChuyenBay(maTB, maMB, ngayCatCanh, ngayHaCanh);
            showListChuyenBay();
        } catch (Exception e1) {
            System.out.print(e1);
        }
    }

    public void suaChuyenBay() {
        try {
            String maCB = txtMaCB.getText();
            String maTB = txtMaTB.getText();
            String maMB = txtMaMB.getText();
            String ngayCatCanh = txtNgayCC.getText();
            String ngayHaCanh = txtNgayHC.getText();
            cbBUS.suaChuyenBay(maCB, maTB, maMB, ngayCatCanh, ngayHaCanh);
            showListChuyenBay();
        } catch (Exception e1) {
            System.out.print(e1);
        }
    }

    public void xoaChuyenBay() {
        String ma = txtMaCB.getText();
        int i = tableChuyenBay.getSelectedRow();
        if(cbBUS.xoaChuyenBay(ma)){
            cbBUS.xoaChuyenBay(ma);
            dtmChuyenBay.removeRow(i);
            tableChuyenBay.setModel(dtmChuyenBay);
            txtMaCB.setText("");
            txtMaTB.setText("");
            txtMaMB.setText("");
            txtNgayCC.setText("");
            txtNgayHC.setText("");
        }
        
    }

    /**
     *
     */
    public void getListChuyenBay() {
        try {
            dtmChuyenBay.setRowCount(0);
            dscb = cbBUS.getListChuyenBay();
            Vector<Object> header = new Vector<>();
<<<<<<< HEAD
            header.add("Mã Chuyến Bay");
            header.add("Mã Tuyến Bay");
            header.add("Mã Máy Bay");
            header.add("Số Lượng Vé Còn Lại");
            header.add("Ngày Cất Cánh");
            header.add("Ngày Hạ Cánh");
=======
            header.add("Mã Chuy?n Bay");
            header.add("Mã Tuy?n Bay");
            header.add("Mã Máy Bay");
            header.add("S? Lu?ng Vé Còn L?i");
            header.add("Ngày C?t Cánh");
            header.add("Ngày H? Cánh");
>>>>>>> 911a8f62867e3c85baf2d4db198343614a8bbd3a
            if (dtmChuyenBay.getRowCount() == 0) {
                dtmChuyenBay = new DefaultTableModel(header, 0);
            }
            for (ChuyenBay cb : dscb) {
                Vector<Object> vec = new Vector<>();
                vec.add(cb.getMaChuyenBay());
                vec.add(cb.getMaTuyenBay());
                vec.add(cb.getMaMayBay());
                vec.add(cb.getSoLgVeCL());
                vec.add(cb.getNgayCatCanh());
                vec.add(cb.getNgayHaCanh());

                dtmChuyenBay.addRow(vec);
            }
            tableChuyenBay.setModel(dtmChuyenBay);
        } catch (Exception e) {

        }

    }
<<<<<<< HEAD

=======
    
>>>>>>> 911a8f62867e3c85baf2d4db198343614a8bbd3a
    public void showListChuyenBay() {
        try {
            dtmChuyenBay.setRowCount(0);
            dscb = cbBUS.listCB();
            Vector<Object> header = new Vector<>();
<<<<<<< HEAD
            header.add("Mã Chuyến Bay");
            header.add("Mã Tuyến Bay");
            header.add("Mã Máy Bay");
            header.add("Số Lượng Vé Còn Lại");
            header.add("Ngày Cất Cánh");
            header.add("Ngày Hạ Cánh");
=======
            header.add("Mã Chuy?n Bay");
            header.add("Mã Tuy?n Bay");
            header.add("Mã Máy Bay");
            header.add("S? Lu?ng Vé Còn L?i");
            header.add("Ngày C?t Cánh");
            header.add("Ngày H? Cánh");
>>>>>>> 911a8f62867e3c85baf2d4db198343614a8bbd3a
            if (dtmChuyenBay.getRowCount() == 0) {
                dtmChuyenBay = new DefaultTableModel(header, 0);
            }
            for (ChuyenBay cb : dscb) {
                Vector<Object> vec = new Vector<>();
                vec.add(cb.getMaChuyenBay());
                vec.add(cb.getMaTuyenBay());
                vec.add(cb.getMaMayBay());
                vec.add(cb.getSoLgVeCL());
                vec.add(cb.getNgayCatCanh());
                vec.add(cb.getNgayHaCanh());

                dtmChuyenBay.addRow(vec);
            }
            tableChuyenBay.setModel(dtmChuyenBay);
        } catch (Exception e) {

        }

    }

    public void clickTableRowKM() {
        int row = tableChuyenBay.getSelectedRow();
        if (row > -1) {
            txtMaCB.setText(tableChuyenBay.getValueAt(row, 0) + "");
            txtMaTB.setText(tableChuyenBay.getValueAt(row, 1) + "");
            txtMaMB.setText(tableChuyenBay.getValueAt(row, 2) + "");
            txtVeCL.setText(tableChuyenBay.getValueAt(row, 3) + "");
            txtNgayCC.setText(tableChuyenBay.getValueAt(row, 4) + "");
            txtNgayHC.setText(tableChuyenBay.getValueAt(row, 5) + "");
        }
    }
    
    public void timKiemMayBay(){
        String tuKhoa = txtTuKhoa.getText();
        String luaChon = txtLuaChon.getSelectedItem().toString();
        if(tuKhoa == ""){
            // dialog thong bao'
            return ;
        }
        
        if(luaChon == "Tất Cả"){
            dscb = cbBUS.listCB();
        }
        
        if(luaChon == "Mã Tuyến Bay"){
            dscb = cbBUS.getChuyenBayTheoMaTuyenBay(tuKhoa);
        }
        
        if(luaChon == "Mã Máy Bay"){
            dscb = cbBUS.getChuyenBayTheoMaMayBay(tuKhoa);
        }
        
        dtmChuyenBay.setRowCount(0);
            Vector<Object> header = new Vector<>();
            header.add("Mã Chuyến Bay");
            header.add("Mã Tuyến Bay");
            header.add("Mã Máy Bay");
            header.add("Số Lượng Vé Còn Lại");
            header.add("Ngày Cất Cánh");
            header.add("Ngày Hạ Cánh");
            if (dtmChuyenBay.getRowCount() == 0) {
                dtmChuyenBay = new DefaultTableModel(header, 0);
            }
            for (ChuyenBay cb : dscb) {
                Vector<Object> vec = new Vector<>();
                vec.add(cb.getMaChuyenBay());
                vec.add(cb.getMaTuyenBay());
                vec.add(cb.getMaMayBay());
                vec.add(cb.getSoLgVeCL());
                vec.add(cb.getNgayCatCanh());
                vec.add(cb.getNgayHaCanh());

                dtmChuyenBay.addRow(vec);
            }
            tableChuyenBay.setModel(dtmChuyenBay);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableChuyenBay;
    private javax.swing.JComboBox<String> txtLuaChon;
    private javax.swing.JTextField txtMaCB;
    private javax.swing.JTextField txtMaMB;
    private javax.swing.JTextField txtMaTB;
    private javax.swing.JTextField txtNgayCC;
    private javax.swing.JTextField txtNgayHC;
    private javax.swing.JTextField txtTuKhoa;
    private javax.swing.JTextField txtVeCL;
    // End of variables declaration//GEN-END:variables
}
