/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package QuanLyBanVeMayBay.GUI.form;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import QuanLyBanVeMayBay.GUI.form.HangBayGUI;
import QuanLyBanVeMayBay.BUS.HangBayBUS;
import QuanLyBanVeMayBay.DTO.HangBayDTO;

/**
 *
 * @author Dell
 */
public class HangBayGUI extends javax.swing.JPanel {

    /**
     * Creates new form HangBayGUI
     */
    HangBayBUS hangbayBUS = new HangBayBUS();
    DefaultTableModel dtmHangBay;
    ArrayList<HangBayDTO> dshb = null;

    public HangBayGUI() {
        initComponents();
        getListHangBay();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTenHB = new javax.swing.JTextField();
        jButtonThemHangBay = new javax.swing.JButton();
        jButtonSuaHangBay = new javax.swing.JButton();
        jButtonXoaHangBay = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHangBay = new javax.swing.JTable();
        txtTuKhoa = new javax.swing.JTextField();
        selectLuaChon = new javax.swing.JComboBox<>();
        searchHangBay = new javax.swing.JButton();

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPane1.setText("QUẢN LÝ HÃNG BAY");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã hãng bay");

        txtMaHB.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tên hãng bay");

        txtTenHB.setText("jTextField2");
        txtTenHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenHBActionPerformed(evt);
            }
        });

        jButtonThemHangBay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonThemHangBay.setText("Thêm");
        jButtonThemHangBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemHangBayActionPerformed(evt);
            }
        });

        jButtonSuaHangBay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSuaHangBay.setText("Sửa");
        jButtonSuaHangBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuaHangBayActionPerformed(evt);
            }
        });

        jButtonXoaHangBay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonXoaHangBay.setText("Xóa");
        jButtonXoaHangBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaHangBayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaHB, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtTenHB)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButtonThemHangBay)
                        .addGap(59, 59, 59)
                        .addComponent(jButtonSuaHangBay)
                        .addGap(79, 79, 79)
                        .addComponent(jButtonXoaHangBay)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMaHB)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenHB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonThemHangBay)
                    .addComponent(jButtonSuaHangBay)
                    .addComponent(jButtonXoaHangBay))
                .addGap(26, 26, 26))
        );

        tableHangBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã hãng bay", "Tên hãng"
            }
        ));
        tableHangBay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHangBayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHangBay);

        txtTuKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuKhoaActionPerformed(evt);
            }
        });

        selectLuaChon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã hãng bay", "Tên hãng bay" }));

        searchHangBay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchHangBay.setText("Tìm kiếm");
        searchHangBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHangBayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(selectLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(searchHangBay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTuKhoa)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectLuaChon)
                        .addComponent(searchHangBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenHBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenHBActionPerformed

    private void jButtonThemHangBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemHangBayActionPerformed
        // TODO add your handling code here:
        themHangBay();
    }//GEN-LAST:event_jButtonThemHangBayActionPerformed

    private void jButtonSuaHangBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuaHangBayActionPerformed
        // TODO add your handling code here:
        suaHangBay();
    }//GEN-LAST:event_jButtonSuaHangBayActionPerformed

    private void jButtonXoaHangBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaHangBayActionPerformed
        // TODO add your handling code here:
        xoaHangBay();
    }//GEN-LAST:event_jButtonXoaHangBayActionPerformed

    private void tableHangBayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHangBayMouseClicked
        // TODO add your handling code here:
        clickTableRowHB();
    }//GEN-LAST:event_tableHangBayMouseClicked

    private void searchHangBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHangBayActionPerformed
        // TODO add your handling code here:
        timKiemHangBay();
    }//GEN-LAST:event_searchHangBayActionPerformed

    private void txtTuKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuKhoaActionPerformed

    public void themHangBay() {
        String tenHB = txtTenHB.getText();

        HangBayDTO hb = new HangBayDTO();
        hb.setTenHang(tenHB);

        hangbayBUS.themHangBay(hb);
    }

    public void suaHangBay() {
        String maHB = txtMaHB.getText();
        String tenHB = txtTenHB.getText();
        HangBayDTO hb = new HangBayDTO(maHB, tenHB);
        hangbayBUS.suaHangBay(hb);
    }

    public void xoaHangBay() {
        String maHB = txtMaHB.getText();
        hangbayBUS.xoaHangBay(maHB);
    }

    public void getListHangBay() {
        dtmHangBay.setRowCount(0);
        dshb = hangbayBUS.getDanhSachHangBay();

        for (HangBayDTO hb : dshb) {
            Vector vec = new Vector();
            vec.add(hb.getMaHang());
            vec.add(hb.getTenHang());

            dtmHangBay.addRow(vec);
        }
        tableHangBay.setModel(dtmHangBay);
    }

    public void clickTableRowHB() {
        int row = tableHangBay.getSelectedRow();
        if (row > -1) {
            txtMaHB.setText(tableHangBay.getValueAt(row, 0) + "");
            txtTenHB.setText(tableHangBay.getValueAt(row, 1) + "");
        }
    }

    public void timKiemHangBay() {
        String luaChon = selectLuaChon.getSelectedItem().toString();
        String tuKhoa = txtTuKhoa.getText();
        if (luaChon == "Mã hãng bay") {
            dshb = hangbayBUS.timKiemHangBayTheoMa(tuKhoa);
        } else {
            // k tim thay
        }

        if (luaChon == "Tên hãng bay") {
            dshb = hangbayBUS.timKiemHangBayTheoTen(tuKhoa);
        } else {
            // khong tim thay
        }

        for (HangBayDTO hb : dshb) {
            Vector vec = new Vector();
            vec.add(hb.getMaHang());
            vec.add(hb.getTenHang());

            dtmHangBay.addRow(vec);
        }
        tableHangBay.setModel(dtmHangBay);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSuaHangBay;
    private javax.swing.JButton jButtonThemHangBay;
    private javax.swing.JButton jButtonXoaHangBay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton searchHangBay;
    private javax.swing.JComboBox<String> selectLuaChon;
    javax.swing.JTable tableHangBay;
    private javax.swing.JTextField txtMaHB;
    private javax.swing.JTextField txtTenHB;
    javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables
}