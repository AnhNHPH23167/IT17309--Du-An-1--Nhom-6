package Views;

import Repository.RepositoryChiTietSanPham;
import ViewModel.ViewModelChiTietSanPham;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class NewJInternalFrame1 extends javax.swing.JInternalFrame {

    private RepositoryChiTietSanPham rp = new RepositoryChiTietSanPham();
    private ArrayList<ViewModelChiTietSanPham> list ;
    private DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
    private ArrayList<String> listcbb = new ArrayList<>();

    public NewJInternalFrame1() throws SQLException {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        list = rp.getCTSP();
        filldata();
        cbbSize.setModel(defaultComboBoxModel);
        for (int i = 0; i < list.size(); i++) {
           defaultComboBoxModel.addElement(list.get(i).getSize());
        }
    }

    public void filldata() throws SQLException {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (ViewModelChiTietSanPham viewModelChiTietSanPham : rp.getCTSP()) {
            dtm.addRow(new Object[]{
                viewModelChiTietSanPham.getMa(),
                viewModelChiTietSanPham.getSanPham().getTen(),
                viewModelChiTietSanPham.getLoaiSP().getTenLoaiSP(),
                viewModelChiTietSanPham.getSoluong(),
                viewModelChiTietSanPham.getGiaban(),
                viewModelChiTietSanPham.getSize().getTenSize(),
                viewModelChiTietSanPham.getMota(),
                viewModelChiTietSanPham.getMauSac().getTenMauSac(),
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblTenSanPham_SanPham1 = new javax.swing.JLabel();
        lblMaSanPham_SanPham1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbbMaLoaiSanPham_SanPham1 = new javax.swing.JComboBox<>();
        txtGiaNhap_SanPham1 = new javax.swing.JTextField();
        lblGiaNhap_SanPham1 = new javax.swing.JLabel();
        txtGiaBan_SanPham1 = new javax.swing.JTextField();
        lblGiaBan1 = new javax.swing.JLabel();
        txtTenSanPham_SanPham1 = new javax.swing.JTextField();
        txtMaSanPham_SanPham1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbbSize = new javax.swing.JComboBox<>();
        lblTonKho_SanPham = new javax.swing.JLabel();
        btnThem_SanPham = new javax.swing.JButton();
        bntSua_SanPham = new javax.swing.JButton();
        btnXoa_SanPham = new javax.swing.JButton();
        btnReset_SanPham = new javax.swing.JButton();
        cbbHangSanXuat_SanPham1 = new javax.swing.JComboBox<>();
        lblTonKho_SanPham1 = new javax.swing.JLabel();
        cbbHangSanXuat_SanPham2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(974, 504));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        lblTenSanPham_SanPham1.setText("Tên Sản PHẩm");

        lblMaSanPham_SanPham1.setText("Mã Sản Phẩm");

        jLabel14.setText("Loại Sản Phẩm");

        cbbMaLoaiSanPham_SanPham1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMaLoaiSanPham_SanPham1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaLoaiSanPham_SanPham1cbbMaLoaiSanPham_SanPhamActionPerformed(evt);
            }
        });

        lblGiaNhap_SanPham1.setText("So Luong");

        lblGiaBan1.setText("Giá Bán");

        txtMaSanPham_SanPham1.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaSanPham_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(lblGiaNhap_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenSanPham_SanPham1)
                            .addComponent(lblGiaBan1))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiaBan_SanPham1)
                            .addComponent(txtTenSanPham_SanPham1)
                            .addComponent(txtMaSanPham_SanPham1)
                            .addComponent(cbbMaLoaiSanPham_SanPham1, 0, 232, Short.MAX_VALUE)
                            .addComponent(txtGiaNhap_SanPham1)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSanPham_SanPham1)
                    .addComponent(txtMaSanPham_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenSanPham_SanPham1)
                    .addComponent(txtTenSanPham_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cbbMaLoaiSanPham_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaNhap_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaNhap_SanPham1))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaBan1))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel20.setText("Size");

        cbbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTonKho_SanPham.setText("Chat Lieu");

        btnThem_SanPham.setText("Thêm");
        btnThem_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_SanPhamActionPerformed(evt);
            }
        });

        bntSua_SanPham.setText("Sửa");
        bntSua_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSua_SanPhamActionPerformed(evt);
            }
        });

        btnXoa_SanPham.setText("Xóa");
        btnXoa_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_SanPhamActionPerformed(evt);
            }
        });

        btnReset_SanPham.setText("Reset");
        btnReset_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset_SanPhamActionPerformed(evt);
            }
        });

        cbbHangSanXuat_SanPham1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTonKho_SanPham1.setText("Mau Sac");

        cbbHangSanXuat_SanPham2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(79, 79, 79)
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTonKho_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cbbHangSanXuat_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTonKho_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbHangSanXuat_SanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnXoa_SanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntSua_SanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset_SanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbHangSanXuat_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTonKho_SanPham1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntSua_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTonKho_SanPham)
                        .addComponent(cbbHangSanXuat_SanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnXoa_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnReset_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ma SP", "Ten SP", "LoaiSanPham", "SoLuong", "Gia", "Size", "MoTa", "MauSac"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("San Pham");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbMaLoaiSanPham_SanPham1cbbMaLoaiSanPham_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaLoaiSanPham_SanPham1cbbMaLoaiSanPham_SanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMaLoaiSanPham_SanPham1cbbMaLoaiSanPham_SanPhamActionPerformed

    private void btnThem_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SanPhamActionPerformed

    }//GEN-LAST:event_btnThem_SanPhamActionPerformed

    private void bntSua_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_SanPhamActionPerformed

    }//GEN-LAST:event_bntSua_SanPhamActionPerformed

    private void btnXoa_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_SanPhamActionPerformed

    }//GEN-LAST:event_btnXoa_SanPhamActionPerformed

    private void btnReset_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_SanPhamActionPerformed

    }//GEN-LAST:event_btnReset_SanPhamActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        txtMaSanPham_SanPham1.setText(jTable1.getValueAt(row, 0).toString());
        txtTenSanPham_SanPham1.setText(jTable1.getValueAt(row, 1).toString());
        cbbMaLoaiSanPham_SanPham1.setSelectedItem(jTable1.getValueAt(row,2).toString());
        txtGiaNhap_SanPham1.setText(jTable1.getValueAt(row, 3).toString());
        txtGiaBan_SanPham1.setText(jTable1.getValueAt(row, 4).toString());
       cbbSize.setSelectedItem(jTable1.getValueAt(row, 5).toString());
       cbbHangSanXuat_SanPham1.setSelectedItem(jTable1.getValueAt(row, 6).toString());
       cbbHangSanXuat_SanPham2.setSelectedItem(jTable1.getValueAt(row, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua_SanPham;
    private javax.swing.JButton btnReset_SanPham;
    private javax.swing.JButton btnThem_SanPham;
    private javax.swing.JButton btnXoa_SanPham;
    private javax.swing.JComboBox<String> cbbHangSanXuat_SanPham1;
    private javax.swing.JComboBox<String> cbbHangSanXuat_SanPham2;
    private javax.swing.JComboBox<String> cbbMaLoaiSanPham_SanPham1;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblGiaBan1;
    private javax.swing.JLabel lblGiaNhap_SanPham1;
    private javax.swing.JLabel lblMaSanPham_SanPham1;
    private javax.swing.JLabel lblTenSanPham_SanPham1;
    private javax.swing.JLabel lblTonKho_SanPham;
    private javax.swing.JLabel lblTonKho_SanPham1;
    private javax.swing.JTextField txtGiaBan_SanPham1;
    private javax.swing.JTextField txtGiaNhap_SanPham1;
    private javax.swing.JTextField txtMaSanPham_SanPham1;
    private javax.swing.JTextField txtTenSanPham_SanPham1;
    // End of variables declaration//GEN-END:variables
}
