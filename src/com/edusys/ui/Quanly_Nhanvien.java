
package com.edusys.ui;

import com.edusys.DAO.NhanvienDAO;
import com.edusys.entity.Nhanvien;
import com.edusys.utils.Auth;
import com.edusys.utils.XImage;
import com.edusys.utils.XMsgBox;
import java.awt.Color;
import java.util.ArrayList;
import javax.mail.Header;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Quanly_Nhanvien extends javax.swing.JDialog {

   
    
    public Quanly_Nhanvien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        fillTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdoNhanvien = new javax.swing.JRadioButton();
        rdoTruongphong = new javax.swing.JRadioButton();
        txtPass = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanvien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ CHUYÊN ĐỀ");

        jLabel2.setText("Mã nhân viên");

        jLabel3.setText("Mật khẩu");

        jLabel4.setText("Xác nhận mật khẩu");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/add.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/delete.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/refresh.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/edit-alt.png"))); // NOI18N
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnThem)
                .addGap(5, 5, 5)
                .addComponent(btnXoa)
                .addGap(5, 5, 5)
                .addComponent(btnSua)
                .addGap(5, 5, 5)
                .addComponent(btnMoi))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/angle-left.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/angle-double-left.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/angle-double-right.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/angle-right.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnFirst)
                .addGap(0, 0, 0)
                .addComponent(btnPrev)
                .addGap(0, 0, 0)
                .addComponent(btnNext)
                .addGap(0, 0, 0)
                .addComponent(btnLast)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFirst)
            .addComponent(btnPrev)
            .addComponent(btnNext)
            .addComponent(btnLast)
        );

        jLabel5.setText("Họ và tên");

        jLabel6.setText("Vai trò");

        buttonGroup1.add(rdoNhanvien);
        rdoNhanvien.setText("Nhân viên");

        buttonGroup1.add(rdoTruongphong);
        rdoTruongphong.setText("Trưởng phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtManv)
                            .addComponent(txtHoten)
                            .addComponent(txtConfirmPass)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdoNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoTruongphong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNhanvien)
                    .addComponent(rdoTruongphong))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CẬP NHẬT", jPanel1);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        tblNhanvien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanvienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanvien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("DANH SÁCH", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quản lý nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 459, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        last();
        
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(check()==true){
            update();
                    }
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(check()== true){
           insert(); 
        }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        newForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        first();
       
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prev();
        
    }//GEN-LAST:event_btnPrevActionPerformed

    private void tblNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanvienMouseClicked
        if(evt.getClickCount()==2){
            this.row =tblNhanvien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhanvienMouseClicked

 
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
            java.util.logging.Logger.getLogger(Quanly_Nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanly_Nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanly_Nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanly_Nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Quanly_Nhanvien dialog = new Quanly_Nhanvien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoNhanvien;
    private javax.swing.JRadioButton rdoTruongphong;
    private javax.swing.JTable tblNhanvien;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtManv;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
    NhanvienDAO dao = new NhanvienDAO();
    int row=-1;
    
    private void init() {
       setLocationRelativeTo(null);
       this.setIconImage(XImage.getAppIcon());
       this.fillTable();
       this.updateStatus();
//       this.updateDSStatus();
    }
    private void fillTable(){
        String header[] = {"Mã Nhân viên", "Mật khẩu", "Họ tên", "Vai trò"};
        DefaultTableModel model = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
//        DefaultTableModel model = (DefaultTableModel)tblNhanvien.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Nhanvien> list= dao.selectAll();
            for(Nhanvien nv: list){
                Object[] row={nv.getManv(),nv.getMatkhau(),nv.getHoten(),nv.getVaitro() ? "Trưởng phòng" : "Nhân viên"
            };
                model.addRow(row);
                tblNhanvien.setModel(model);
            }
        } catch (Exception e) {
            XMsgBox.alert(this, "Lỗi truy vẫn dữ liệu");
        }
    }
    private void setForm(Nhanvien nv){
        txtManv.setText(nv.getManv());
        txtPass.setText(nv.getMatkhau());
        txtConfirmPass.setText(nv.getMatkhau());
        txtHoten.setText(nv.getHoten());
        if(txtManv.getText().equals("")){
            buttonGroup1.clearSelection();
        }else{
        rdoTruongphong.setSelected(nv.getVaitro());
        rdoNhanvien.setSelected(!nv.getVaitro());
    }
    }
    Nhanvien getForm(){
        Nhanvien nv = new Nhanvien();
        nv.setManv(txtManv.getText());
        nv.setMatkhau(new String(txtPass.getPassword()));
        nv.setMatkhau(new String(txtConfirmPass.getPassword()));
        nv.setHoten(txtHoten.getText());
        nv.setVaitro(rdoTruongphong.isSelected());
        return nv;
    }
    private void newForm(){
        Nhanvien nv= new Nhanvien();
        this.setForm(nv);
        this.row=-1;
        this.updateStatus();
    }
    private void edit(){
        String manv=(String) tblNhanvien.getValueAt(this.row, 0);
        Nhanvien nv =dao.selectByid(manv);
        this.setForm(nv);
        
        jTabbedPane1.setSelectedIndex(0);
        this.updateStatus();
    }
    private void insert(){
        Nhanvien nv =getForm();
        String Pass2 = new String(txtConfirmPass.getPassword());
        if(!Pass2.equals(nv.getMatkhau())){
            XMsgBox.alert(this, "Xác nhận mật khẩu không đúng");
        }else{
            try {
                dao.insert(nv);
                this.fillTable();
                this.newForm();
                XMsgBox.alert(this, "Thêm thành công");
            } catch (Exception e) {
                XMsgBox.alert(this,"Thêm mới thất bại");
                e.printStackTrace();
            }
        }
    }
    private void update(){
        Nhanvien nv =getForm();
        String Pass2 = new String(txtConfirmPass.getPassword());
        if(!Pass2.equals(nv.getMatkhau())){
            XMsgBox.alert(this, "Xác nhận mật khẩu không đúng");
        }else{
            try {
                dao.update(nv);
                this.fillTable();
                
                XMsgBox.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                XMsgBox.alert(this,"Cập nhật thất bại");
            }
        }
    }
    private void delete(){
        if(!Auth.isManager()){
            XMsgBox.alert(this, "Bạn không có quyền xóa nhân viên");
        }else{
            String manv =txtManv.getText();
            if(manv.equals(Auth.user.getManv())){
                XMsgBox.alert(this, "Bạn không được xóa chính bạn!");
            }else if(XMsgBox.confirm(this, "Bạn muốn xóa nhân viên này?")){
                try {
                    dao.delete(manv);this.fillTable();this.newForm();
                    XMsgBox.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    XMsgBox.alert(this, "Xóa thất bại");
                }
            }
        }
    }
    private void first(){
        this.row= 0;
        tblNhanvien.setRowSelectionInterval(row,row);
        this.edit();
        
    }
    private void prev(){
        if(this.row>0){
            this.row--;
            tblNhanvien.setRowSelectionInterval(row,row);
            this.edit();
           
        }
    }
    private void next(){
        if(this.row<tblNhanvien.getRowCount()-1){
            this.row++;
             tblNhanvien.setRowSelectionInterval(row,row);
            this.edit();
            
        }
    } 
    private void last(){
        this.row=tblNhanvien.getRowCount()-1;
        tblNhanvien.setRowSelectionInterval(row,row);
        this.edit();
        
    }
    // các nút điều hướng danh sách
//    private void firstDS(){
//        this.row= 0;
//         tblNhanvien.setRowSelectionInterval(row,row);
//         updateDSStatus();
//        
//    }
//    private void prevDS(){
//        if(this.row>0){
//            this.row--;
//            tblNhanvien.setRowSelectionInterval(row,row);;
//            updateDSStatus();
//        }
//    }
//    private void nextDS(){
//        if(this.row<tblNhanvien.getRowCount()-1){
//            this.row++;
//            tblNhanvien.setRowSelectionInterval(row,row);;
//            updateDSStatus();
//        }
//    }
//    private void lastDS(){
//        this.row=tblNhanvien.getRowCount()-1;
//         tblNhanvien.setRowSelectionInterval(row,row);
//         updateDSStatus();
//        
//    }
    
//     private void updateDSStatus() {
//        boolean edit = (this.row >= 0);
//        boolean first = this.row == 0;
//        boolean last = this.row == tblNhanvien.getRowCount() - 1;
//        btnfirstt.setEnabled(edit && !first);
//        btnprevv.setEnabled(edit && !first);
//        btnnextt.setEnabled(edit && !last);
//        btnLastt.setEnabled(edit && !last);
//    }
    private void updateStatus(){
            boolean edit = (this.row >= 0);
        boolean first = this.row == 0;
        boolean last = this.row == tblNhanvien.getRowCount() - 1;
        btnXoa.setEnabled(edit);
        btnSua.setEnabled(edit);
        btnThem.setEnabled(!edit);
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);     
    }
    private boolean check() {
        if (txtManv.getText().trim().equals("")) {
            XMsgBox.alert(this, "Mã số nhân viên không được trống");
            txtManv.requestFocus();
           
            return false;
        }
        if (txtHoten.getText().trim().equals("")) {
            XMsgBox.alert(this, "Họ tên không được trống");
            
            return false;
        }
        if (txtPass.getText().trim().equals("")) {
            XMsgBox.alert(this, "Mật khẩu không được trống");
            txtPass.requestFocus();
           
            return false;
        }
        if (txtConfirmPass.getText().trim().equals("")) {
            XMsgBox.alert(this, "Xác nhận mật khẩu không đúng");
            txtConfirmPass.requestFocus();
            
            return false;
        }
        if (!(rdoTruongphong.isSelected() || rdoNhanvien.isSelected())) {
            XMsgBox.alert(this, "vai trò không được để trống không được trống");
           
          
            return false;
        }
        
            
          

        return true;
    }
}
//