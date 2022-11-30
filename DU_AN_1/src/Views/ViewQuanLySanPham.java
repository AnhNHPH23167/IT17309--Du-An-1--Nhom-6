package Views;

import Repository.RepositoryChiTietSanPham;
import DoMain.ChatLieu;
import ViewModel.ViewModelChiTietSanPham;
import DoMain.LoaiSP;
import DoMain.MauSac;
import DoMain.SanPham;
import DoMain.Size;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class ViewQuanLySanPham extends javax.swing.JInternalFrame {

    private RepositoryChiTietSanPham rp = new RepositoryChiTietSanPham();
    private DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
    private DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
    private DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
    private ArrayList<ViewModelChiTietSanPham> list = rp.getCTSP();
    private ArrayList<ViewModelChiTietSanPham> listsearch = new ArrayList<>();
    private ArrayList<Size> listcbb = rp.getsize();
    private ArrayList<MauSac> listcbb1 = rp.getMauSac();
    private ArrayList<ChatLieu> listcbb2 = rp.getChatLieu();
    private ArrayList<LoaiSP> listcbb3 = rp.getLoaiSP();

    public ViewQuanLySanPham() throws SQLException {
        initComponents();
        Filldata(list);
        Positions();
        cbbsize();
        cbbMauSac();
        cbbChatLieu();
        cbbLoaiSP();
    }

    private void Positions() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    private void cbbsize() {
        cbbSize.setModel(defaultComboBoxModel);
        for (int i = 0; i < listcbb.size(); i++) {
            defaultComboBoxModel.addElement(listcbb.get(i).getTenSize());
        }
    }

    private void cbbMauSac() {
        cbbMauSac.setModel(defaultComboBoxModel1);
        defaultComboBoxModel1.removeAllElements();
        for (int i = 0; i < listcbb1.size(); i++) {
            defaultComboBoxModel1.addElement(listcbb1.get(i).getTenMauSac());
        }
    }

    private void cbbChatLieu() {
        cbbChatLieu.setModel(defaultComboBoxModel2);
        for (int i = 0; i < listcbb2.size(); i++) {
            defaultComboBoxModel2.addElement(listcbb2.get(i).getTenChatLieu());
        }
    }

    private void cbbLoaiSP() {
        cbbLoaiSP.setModel(defaultComboBoxModel3);
        for (int i = 0; i < listcbb3.size(); i++) {
            defaultComboBoxModel3.addElement(listcbb3.get(i).getTenLoaiSP());
        }
    }

    public void Filldata(ArrayList<ViewModelChiTietSanPham> list) throws SQLException {
        DefaultTableModel dtm = (DefaultTableModel) tblSanPham.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            dtm.addRow(new Object[]{
                 list.get(i).getMa(),
                 list.get(i).getSanPham().getTenSanPham(),
                 list.get(i).getLoaiSP().getTenLoaiSP(),
                 list.get(i).getSoluong(),
                 list.get(i).getGiaban(),
                 list.get(i).getSize().getTenSize(),
                 list.get(i).getMota(),
                 list.get(i).getMauSac().getTenMauSac(),
                 list.get(i).getChatLieu().getTenChatLieu(),});

        }
    }

    private ViewModelChiTietSanPham getData() {
        String Ma = txtMasp.getText();
        String TenSp = txtTensp.getText();
        int Soluong = Integer.parseInt(txtSoLuong.getText());
        double Gia = Double.parseDouble(txtGiaBan.getText());
        String Mota = txtMota.getText();
        String LoaiSP = cbbLoaiSP.getSelectedItem().toString();
        String Size = cbbSize.getSelectedItem().toString();
        String ChatLieu = cbbChatLieu.getSelectedItem().toString();
        String MauSac = cbbMauSac.getSelectedItem().toString();
        Size size = new Size("", Size);
        ChatLieu chatlieu = new ChatLieu("", ChatLieu);
        LoaiSP loaiSP = new LoaiSP("", LoaiSP);
        MauSac mausac = new MauSac("", MauSac);
        SanPham sanpham = new SanPham("", TenSp);
        ViewModelChiTietSanPham ctsp = new ViewModelChiTietSanPham(Ma, sanpham, size, loaiSP, mausac, chatlieu, Soluong, Gia, Mota);
        return ctsp;
    }

    private void ClearForm() {
        this.txtMasp.setText("");
        this.txtTensp.setText("");
        this.cbbLoaiSP.setSelectedItem(0);
        this.txtSoLuong.setText("");
        this.txtGiaBan.setText("");
        this.cbbSize.setSelectedItem(0);
        this.txtMota.setText("");
        this.cbbMauSac.setSelectedItem(0);
        this.cbbChatLieu.setSelectedItem(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblTenSanPham_SanPham1 = new javax.swing.JLabel();
        lblMaSanPham_SanPham1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbbLoaiSP = new javax.swing.JComboBox<>();
        txtSoLuong = new javax.swing.JTextField();
        lblGiaNhap_SanPham1 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();
        lblGiaBan1 = new javax.swing.JLabel();
        txtTensp = new javax.swing.JTextField();
        txtMasp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbbSize = new javax.swing.JComboBox<>();
        lblTonKho_SanPham = new javax.swing.JLabel();
        btnThem_SanPham = new javax.swing.JButton();
        bntSua_SanPham = new javax.swing.JButton();
        btnXoa_SanPham = new javax.swing.JButton();
        btnReset_SanPham = new javax.swing.JButton();
        cbbMauSac = new javax.swing.JComboBox<>();
        lblTonKho_SanPham1 = new javax.swing.JLabel();
        cbbChatLieu = new javax.swing.JComboBox<>();
        lblTonKho_SanPham2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMota = new javax.swing.JTextArea();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        lblTenSanPham_SanPham1.setText("Tên Sản PHẩm");

        lblMaSanPham_SanPham1.setText("Mã Sản Phẩm");

        jLabel14.setText("Loại Sản Phẩm");

        cbbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiSPcbbMaLoaiSanPham_SanPhamActionPerformed(evt);
            }
        });

        lblGiaNhap_SanPham1.setText("So Luong");

        lblGiaBan1.setText("Giá Bán");

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
                            .addComponent(txtGiaBan)
                            .addComponent(txtTensp)
                            .addComponent(txtMasp)
                            .addComponent(cbbLoaiSP, 0, 234, Short.MAX_VALUE)
                            .addComponent(txtSoLuong)))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSanPham_SanPham1)
                    .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenSanPham_SanPham1)
                    .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cbbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGiaNhap_SanPham1))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        cbbMauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTonKho_SanPham1.setText("Mau Sac");

        cbbChatLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTonKho_SanPham2.setText("Mo Ta");

        txtMota.setColumns(20);
        txtMota.setRows(5);
        jScrollPane1.setViewportView(txtMota);

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTonKho_SanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTonKho_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(73, 73, 73)
                        .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblTonKho_SanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntSua_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(15, 15, 15))
                    .addComponent(btnThem_SanPham, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnXoa_SanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntSua_SanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReset_SanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTonKho_SanPham1)
                            .addComponent(cbbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTonKho_SanPham)
                            .addComponent(cbbChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTonKho_SanPham2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ma SP", "Ten SP", "LoaiSanPham", "SoLuong", "Gia", "Size", "MoTa", "MauSac", "ChatLieu"
            }
        ));
        tblSanPham.setPreferredSize(new java.awt.Dimension(1282, 856));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPham);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Quản Lý Sản Phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbLoaiSPcbbMaLoaiSanPham_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiSPcbbMaLoaiSanPham_SanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLoaiSPcbbMaLoaiSanPham_SanPhamActionPerformed

    private void btnThem_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_SanPhamActionPerformed
        ViewModelChiTietSanPham ctsp = getData();
        try {
            Filldata(list);
        } catch (SQLException ex) {
            Logger.getLogger(ViewQuanLySanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThem_SanPhamActionPerformed

    private void bntSua_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_SanPhamActionPerformed
        ViewModelChiTietSanPham ctsp = new ViewModelChiTietSanPham();
        int row = tblSanPham.getSelectedRow();
        String Ma = tblSanPham.getValueAt(row, 0).toString();
        rp.updateCTSP(Ma, ctsp);
        try {
            Filldata(list);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_bntSua_SanPhamActionPerformed

    private void btnXoa_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_SanPhamActionPerformed

    }//GEN-LAST:event_btnXoa_SanPhamActionPerformed

    private void btnReset_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset_SanPhamActionPerformed
        ClearForm();
    }//GEN-LAST:event_btnReset_SanPhamActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int row = tblSanPham.getSelectedRow();
        txtMasp.setText(tblSanPham.getValueAt(row, 0).toString());
        txtTensp.setText(tblSanPham.getValueAt(row, 1).toString());
        cbbLoaiSP.setSelectedItem(tblSanPham.getValueAt(row, 2).toString());
        txtSoLuong.setText(tblSanPham.getValueAt(row, 3).toString());
        txtGiaBan.setText(tblSanPham.getValueAt(row, 4).toString());
        cbbSize.setSelectedItem(tblSanPham.getValueAt(row, 5).toString());
        txtMota.setText(tblSanPham.getValueAt(row, 6).toString());
        cbbMauSac.setSelectedItem(tblSanPham.getValueAt(row, 7).toString());
        cbbChatLieu.setSelectedItem(tblSanPham.getValueAt(row, 8).toString());
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String Ma = txtMasp.getText();
            listsearch = rp.Search(Ma);
            Filldata(listsearch);
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua_SanPham;
    private javax.swing.JButton btnReset_SanPham;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThem_SanPham;
    private javax.swing.JButton btnXoa_SanPham;
    private javax.swing.JComboBox<String> cbbChatLieu;
    private javax.swing.JComboBox<String> cbbLoaiSP;
    private javax.swing.JComboBox<String> cbbMauSac;
    private javax.swing.JComboBox<String> cbbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGiaBan1;
    private javax.swing.JLabel lblGiaNhap_SanPham1;
    private javax.swing.JLabel lblMaSanPham_SanPham1;
    private javax.swing.JLabel lblTenSanPham_SanPham1;
    private javax.swing.JLabel lblTonKho_SanPham;
    private javax.swing.JLabel lblTonKho_SanPham1;
    private javax.swing.JLabel lblTonKho_SanPham2;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextArea txtMota;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTensp;
    // End of variables declaration//GEN-END:variables
}
