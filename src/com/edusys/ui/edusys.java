
package com.edusys.ui;

import com.edusys.utils.Auth;
import com.edusys.utils.XImage;
import com.edusys.utils.XMsgBox;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.Timer;


public class edusys extends javax.swing.JFrame {

    
    public edusys() {
        initComponents();
        init();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangxuat = new javax.swing.JButton();
        btnKetthuc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTrangthai = new javax.swing.JLabel();
        lblDongho = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        btnChuyende = new javax.swing.JButton();
        btnNguoihoc = new javax.swing.JButton();
        btnKhoahoc = new javax.swing.JButton();
        btnThanhvien = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        btnHuongdan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHethong = new javax.swing.JMenu();
        mniDangnhap = new javax.swing.JMenuItem();
        mniDangxuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniDoimatkhau = new javax.swing.JMenuItem();
        mniKetthuc = new javax.swing.JMenuItem();
        mnuQuanly = new javax.swing.JMenu();
        mniChuyende = new javax.swing.JMenuItem();
        mniKhoahoc = new javax.swing.JMenuItem();
        mniHocvien = new javax.swing.JMenuItem();
        mniNguoihoc = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniNhanvien = new javax.swing.JMenuItem();
        mnuThongke = new javax.swing.JMenu();
        mniBangdiem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniSoluong = new javax.swing.JMenuItem();
        mniDiemchuyende = new javax.swing.JMenuItem();
        mniDoanhthu = new javax.swing.JMenuItem();
        mnuTrogiup = new javax.swing.JMenu();
        mniHowto = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniGioithieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO ");

        jToolBar1.setRollover(true);

        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/logout (1).png"))); // NOI18N
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.setFocusable(false);
        btnDangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangxuat);

        btnKetthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/forbidden.png"))); // NOI18N
        btnKetthuc.setText("Kết thúc");
        btnKetthuc.setFocusable(false);
        btnKetthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetthucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetthuc);

        lblTrangthai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/info.png"))); // NOI18N
        lblTrangthai.setText("Hệ quản lý đào tạo");

        lblDongho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/clock (1).png"))); // NOI18N
        lblDongho.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongho, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangthai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDongho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar2.setRollover(true);

        btnChuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/book.png"))); // NOI18N
        btnChuyende.setText("Chuyên đề");
        btnChuyende.setFocusable(false);
        btnChuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyendeActionPerformed(evt);
            }
        });
        jToolBar2.add(btnChuyende);

        btnNguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/student.png"))); // NOI18N
        btnNguoihoc.setText("Người học");
        btnNguoihoc.setFocusable(false);
        btnNguoihoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoihoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoihocActionPerformed(evt);
            }
        });
        jToolBar2.add(btnNguoihoc);

        btnKhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/elearning.png"))); // NOI18N
        btnKhoahoc.setText("Khóa học");
        btnKhoahoc.setFocusable(false);
        btnKhoahoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoahoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoahocActionPerformed(evt);
            }
        });
        jToolBar2.add(btnKhoahoc);

        btnThanhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/team.png"))); // NOI18N
        btnThanhvien.setText("Học viên");
        btnThanhvien.setFocusable(false);
        btnThanhvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThanhvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThanhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhvienActionPerformed(evt);
            }
        });
        jToolBar2.add(btnThanhvien);

        jToolBar3.setRollover(true);

        btnHuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/idea.png"))); // NOI18N
        btnHuongdan.setText("Hướng dẫn");
        btnHuongdan.setFocusable(false);
        btnHuongdan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongdan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongdanActionPerformed(evt);
            }
        });
        jToolBar3.add(btnHuongdan);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/fpt.png"))); // NOI18N
        jLabel1.setOpaque(true);

        mnuHethong.setText("Hệ thống");

        mniDangnhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/login.png"))); // NOI18N
        mniDangnhap.setText("Đăng nhập");
        mniDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangnhapActionPerformed(evt);
            }
        });
        mnuHethong.add(mniDangnhap);

        mniDangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/logout.png"))); // NOI18N
        mniDangxuat.setText("Đăng xuất");
        mniDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangxuatActionPerformed(evt);
            }
        });
        mnuHethong.add(mniDangxuat);
        mnuHethong.add(jSeparator1);

        mniDoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/password.png"))); // NOI18N
        mniDoimatkhau.setText("Đổi mật khẩu");
        mniDoimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoimatkhauActionPerformed(evt);
            }
        });
        mnuHethong.add(mniDoimatkhau);

        mniKetthuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/stop.png"))); // NOI18N
        mniKetthuc.setText("Kết thúc");
        mniKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetthucActionPerformed(evt);
            }
        });
        mnuHethong.add(mniKetthuc);

        jMenuBar1.add(mnuHethong);

        mnuQuanly.setText("Quản lý");

        mniChuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniChuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/book.png"))); // NOI18N
        mniChuyende.setText("Chuyên đề");
        mniChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyendeActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniChuyende);

        mniKhoahoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/elearning.png"))); // NOI18N
        mniKhoahoc.setText("Khóa học");
        mniKhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoahocActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniKhoahoc);

        mniHocvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/student (1).png"))); // NOI18N
        mniHocvien.setText("Học viên");
        mniHocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocvienActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniHocvien);

        mniNguoihoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/student.png"))); // NOI18N
        mniNguoihoc.setText("Người học");
        mniNguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoihocActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniNguoihoc);
        mnuQuanly.add(jSeparator2);

        mniNhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/employee.png"))); // NOI18N
        mniNhanvien.setText("Nhân viên");
        mniNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanvienActionPerformed(evt);
            }
        });
        mnuQuanly.add(mniNhanvien);

        jMenuBar1.add(mnuQuanly);

        mnuThongke.setText("Thống kê");

        mniBangdiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniBangdiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/online-course.png"))); // NOI18N
        mniBangdiem.setText("Bảng điểm");
        mniBangdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangdiemActionPerformed(evt);
            }
        });
        mnuThongke.add(mniBangdiem);
        mnuThongke.add(jSeparator3);

        mniSoluong.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniSoluong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/ancestors.png"))); // NOI18N
        mniSoluong.setText("Lượng người học");
        mniSoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSoluongActionPerformed(evt);
            }
        });
        mnuThongke.add(mniSoluong);

        mniDiemchuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniDiemchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/book (1).png"))); // NOI18N
        mniDiemchuyende.setText("Điểm chuyên đề");
        mniDiemchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemchuyendeActionPerformed(evt);
            }
        });
        mnuThongke.add(mniDiemchuyende);

        mniDoanhthu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniDoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/salary.png"))); // NOI18N
        mniDoanhthu.setText("Doanh thu");
        mniDoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhthuActionPerformed(evt);
            }
        });
        mnuThongke.add(mniDoanhthu);

        jMenuBar1.add(mnuThongke);

        mnuTrogiup.setText("trợ giúp");

        mniHowto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHowto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/hand.png"))); // NOI18N
        mniHowto.setText("Hướng dẫn sử dụng");
        mniHowto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHowtoActionPerformed(evt);
            }
        });
        mnuTrogiup.add(mniHowto);
        mnuTrogiup.add(jSeparator4);

        mniGioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icon/idea.png"))); // NOI18N
        mniGioithieu.setText("Giới thiệu");
        mniGioithieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioithieuActionPerformed(evt);
            }
        });
        mnuTrogiup.add(mniGioithieu);

        jMenuBar1.add(mnuTrogiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoimatkhauActionPerformed
        this.openchangePass();
    }//GEN-LAST:event_mniDoimatkhauActionPerformed

    private void mniKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetthucActionPerformed
        this.openKetthuc();
    }//GEN-LAST:event_mniKetthucActionPerformed

    private void mniDoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhthuActionPerformed
        this.openThongke(3);
    }//GEN-LAST:event_mniDoanhthuActionPerformed

    private void mniChuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyendeActionPerformed
        this.openChuyende();
    }//GEN-LAST:event_mniChuyendeActionPerformed

    private void btnChuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyendeActionPerformed
        this.openChuyende();
    }//GEN-LAST:event_btnChuyendeActionPerformed

    private void btnKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetthucActionPerformed
       this.openKetthuc();
    }//GEN-LAST:event_btnKetthucActionPerformed

    private void btnNguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoihocActionPerformed
        this.openNguoihoc();
    }//GEN-LAST:event_btnNguoihocActionPerformed

    private void btnKhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoahocActionPerformed
        this.openKhoahoc();
    }//GEN-LAST:event_btnKhoahocActionPerformed

    private void btnThanhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhvienActionPerformed
        this.openHocvien();
    }//GEN-LAST:event_btnThanhvienActionPerformed

    private void mniKhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoahocActionPerformed
        this.openKhoahoc();
    }//GEN-LAST:event_mniKhoahocActionPerformed

    private void mniHocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocvienActionPerformed
        this.openHocvien();
    }//GEN-LAST:event_mniHocvienActionPerformed

    private void mniNguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoihocActionPerformed
        this.openNguoihoc();
    }//GEN-LAST:event_mniNguoihocActionPerformed

    private void mniNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanvienActionPerformed
        this.openNhanvien();
    }//GEN-LAST:event_mniNhanvienActionPerformed

    private void mniBangdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangdiemActionPerformed
        this.openThongke(0);
    }//GEN-LAST:event_mniBangdiemActionPerformed

    private void mniSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSoluongActionPerformed
        this.openThongke(2);
    }//GEN-LAST:event_mniSoluongActionPerformed

    private void mniDiemchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemchuyendeActionPerformed
        this.openThongke(3);
    }//GEN-LAST:event_mniDiemchuyendeActionPerformed

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        this.openDangxuat();
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void mniDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangnhapActionPerformed
        this.openDangnhap();
    }//GEN-LAST:event_mniDangnhapActionPerformed

    private void mniDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangxuatActionPerformed
        this.openDangxuat();
    }//GEN-LAST:event_mniDangxuatActionPerformed

    private void mniHowtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHowtoActionPerformed
        this.openHuongdan();
    }//GEN-LAST:event_mniHowtoActionPerformed

    private void mniGioithieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioithieuActionPerformed
        this.openGioithieu();
    }//GEN-LAST:event_mniGioithieuActionPerformed

    private void btnHuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongdanActionPerformed
        this.openHuongdan();
    }//GEN-LAST:event_btnHuongdanActionPerformed

  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quanly_Khoahoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanly_Khoahoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanly_Khoahoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanly_Khoahoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edusys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyende;
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnHuongdan;
    private javax.swing.JButton btnKetthuc;
    private javax.swing.JButton btnKhoahoc;
    private javax.swing.JButton btnNguoihoc;
    private javax.swing.JButton btnThanhvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel lblDongho;
    private javax.swing.JLabel lblTrangthai;
    private javax.swing.JMenuItem mniBangdiem;
    private javax.swing.JMenuItem mniChuyende;
    private javax.swing.JMenuItem mniDangnhap;
    private javax.swing.JMenuItem mniDangxuat;
    private javax.swing.JMenuItem mniDiemchuyende;
    private javax.swing.JMenuItem mniDoanhthu;
    private javax.swing.JMenuItem mniDoimatkhau;
    private javax.swing.JMenuItem mniGioithieu;
    private javax.swing.JMenuItem mniHocvien;
    private javax.swing.JMenuItem mniHowto;
    private javax.swing.JMenuItem mniKetthuc;
    private javax.swing.JMenuItem mniKhoahoc;
    private javax.swing.JMenuItem mniNguoihoc;
    private javax.swing.JMenuItem mniNhanvien;
    private javax.swing.JMenuItem mniSoluong;
    private javax.swing.JMenu mnuHethong;
    private javax.swing.JMenu mnuQuanly;
    private javax.swing.JMenu mnuThongke;
    private javax.swing.JMenu mnuTrogiup;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new chao(this, true).setVisible(true);
        new Loggin(this, true).setVisible(true);
         new Timer(1000, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              Date now= new Date();
              SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
              String text = formater.format(now);
              lblDongho.setText(text);
           }
       }).start();
    }

    private void openChuyende() {
         if(Auth.isLogin()){
             new Quanly_chuyende(this,true).setVisible(true);
             
         }else {
             XMsgBox.alert(this, "Bạn phải đăng nhập");
         }
    }
    private void openchangePass() {
         if(Auth.isLogin()){
             new changePass(this,true).setVisible(true);
         }else{
             XMsgBox.alert(this,"Bạn phải đăng nhập");
         }
    }
    private void openKhoahoc() {
         if(Auth.isLogin()){
             new Quanly_Khoahoc(this,true).setVisible(true);
             
         }else {
             XMsgBox.alert(this, "Bạn phải đăng nhập");
         }
    }
    private void openNguoihoc() {
         if(Auth.isLogin()){
             new Quanly_Nguoihoc(this,true).setVisible(true);
             
         }else {
             XMsgBox.alert(this, "Bạn phải đăng nhập");
         }
    }
    private void openNhanvien() {
         if(Auth.isLogin()){
             new Quanly_Nhanvien(this,true).setVisible(true);
             
         }else {
             XMsgBox.alert(this, "Bạn phải đăng nhập");
         }
    }
    private void openHocvien() {
         if(Auth.isLogin()){
             new Quanly_Hocvien(this,true).setVisible(true);
             
         }else {
             XMsgBox.alert(this, "Bạn phải đăng nhập");
         }
    }
    private void openThongke(int index) {
         if(Auth.isLogin()){
             if(index ==3 && !Auth.isManager()){
                 XMsgBox.alert(this,"Bạn không có quyền xem doanh thu");
             }else{
                 Thongke tkwin = new Thongke(this, true);
                 tkwin.setVisible(true);
                 tkwin.selectTab(index);
             }
         }else{
             XMsgBox.alert(this,"Vui lòng đăng nhập");
         }
         
    }
    private void openDangnhap(){
        new Loggin(this,true).setVisible(true);
        this.setLocationRelativeTo(null);
    }
    private void openDangxuat(){
        Auth.clear();
        new Loggin(this,true).setVisible(true);
    }
    private void openKetthuc(){
        
     if(XMsgBox.confirm(this,"Bạn có muốn kết thúc không?")){
            System.exit(0);
        }
    }
    private void openHuongdan(){
        try {
            Desktop.getDesktop().browse(new File("/HK4/du_an_mau/EduSys/src/help/index.html").toURI());
            
        } catch (IOException ex) {
            ex.printStackTrace();
            XMsgBox.alert(this,"Không tìm thấy file hướng dẫn");
        }
    }
    private void openGioithieu(){
        try {
            Desktop.getDesktop().browse(new File("/HK4/du_an_mau/EduSys/src/help/index.html").toURI());
            
        } catch (IOException ex) {
            ex.printStackTrace();
            XMsgBox.alert(this,"Không tìm thấy file hướng dẫn");
        }
    }
}
