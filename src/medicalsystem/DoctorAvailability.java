/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DoctorAvailability extends javax.swing.JFrame {

    /**
     * Creates new form DoctorAvailability
     */
    public DoctorAvailability() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenuTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Doc_Avail_Title = new javax.swing.JLabel();
        Main_Menu_Btn_2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        Doctor_Status_1 = new javax.swing.JPanel();
        Doctor_Name_1 = new javax.swing.JLabel();
        Doctor_Name_2 = new javax.swing.JLabel();
        Doctor_Status_2 = new javax.swing.JPanel();
        Doctor_Status_3 = new javax.swing.JPanel();
        Doctor_Name_3 = new javax.swing.JLabel();
        Doctor_Name_4 = new javax.swing.JLabel();
        Doctor_Status_4 = new javax.swing.JPanel();
        Doctor_Status_5 = new javax.swing.JPanel();
        Doctor_Name_5 = new javax.swing.JLabel();
        Doctor_Status_6 = new javax.swing.JPanel();
        Doctor_Status_7 = new javax.swing.JPanel();
        Doctor_Status_8 = new javax.swing.JPanel();
        Doctor_Status_9 = new javax.swing.JPanel();
        Doctor_Status_10 = new javax.swing.JPanel();
        Doctor_Name_9 = new javax.swing.JLabel();
        Doctor_Name_6 = new javax.swing.JLabel();
        Doctor_Name_7 = new javax.swing.JLabel();
        Doctor_Name_8 = new javax.swing.JLabel();
        Doctor_Name_10 = new javax.swing.JLabel();
        Register_New_Doctor = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainMenuTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        MainMenuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainMenuTitle.setText("Medical Resource Managment System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Doc_Avail_Title.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Doc_Avail_Title.setText("Doctor Availbility");

        Main_Menu_Btn_2.setText("Main Menu");
        Main_Menu_Btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Btn_2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology", "Pulmonology", "Infectious Disease", "Hematology", "Intensive Care Medicine", "Neurology", "Ophthalmology", "Orthopedics", "Urology", "Surgery" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        Doctor_Status_1.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_1.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_1Layout = new javax.swing.GroupLayout(Doctor_Status_1);
        Doctor_Status_1.setLayout(Doctor_Status_1Layout);
        Doctor_Status_1Layout.setHorizontalGroup(
            Doctor_Status_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_1Layout.setVerticalGroup(
            Doctor_Status_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Doctor_Name_1.setText("Unregistered");

        Doctor_Name_2.setText("Unregistered");

        Doctor_Status_2.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_2.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_2Layout = new javax.swing.GroupLayout(Doctor_Status_2);
        Doctor_Status_2.setLayout(Doctor_Status_2Layout);
        Doctor_Status_2Layout.setHorizontalGroup(
            Doctor_Status_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_2Layout.setVerticalGroup(
            Doctor_Status_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Status_3.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_3.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_3Layout = new javax.swing.GroupLayout(Doctor_Status_3);
        Doctor_Status_3.setLayout(Doctor_Status_3Layout);
        Doctor_Status_3Layout.setHorizontalGroup(
            Doctor_Status_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_3Layout.setVerticalGroup(
            Doctor_Status_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Name_3.setText("Unregistered");

        Doctor_Name_4.setText("Unregistered");

        Doctor_Status_4.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_4.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_4Layout = new javax.swing.GroupLayout(Doctor_Status_4);
        Doctor_Status_4.setLayout(Doctor_Status_4Layout);
        Doctor_Status_4Layout.setHorizontalGroup(
            Doctor_Status_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_4Layout.setVerticalGroup(
            Doctor_Status_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Status_5.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_5.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_5Layout = new javax.swing.GroupLayout(Doctor_Status_5);
        Doctor_Status_5.setLayout(Doctor_Status_5Layout);
        Doctor_Status_5Layout.setHorizontalGroup(
            Doctor_Status_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_5Layout.setVerticalGroup(
            Doctor_Status_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Name_5.setText("Unregistered");

        Doctor_Status_6.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_6.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_6Layout = new javax.swing.GroupLayout(Doctor_Status_6);
        Doctor_Status_6.setLayout(Doctor_Status_6Layout);
        Doctor_Status_6Layout.setHorizontalGroup(
            Doctor_Status_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_6Layout.setVerticalGroup(
            Doctor_Status_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Status_7.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_7.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_7Layout = new javax.swing.GroupLayout(Doctor_Status_7);
        Doctor_Status_7.setLayout(Doctor_Status_7Layout);
        Doctor_Status_7Layout.setHorizontalGroup(
            Doctor_Status_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_7Layout.setVerticalGroup(
            Doctor_Status_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Status_8.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_8.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_8Layout = new javax.swing.GroupLayout(Doctor_Status_8);
        Doctor_Status_8.setLayout(Doctor_Status_8Layout);
        Doctor_Status_8Layout.setHorizontalGroup(
            Doctor_Status_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_8Layout.setVerticalGroup(
            Doctor_Status_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Status_9.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_9.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_9Layout = new javax.swing.GroupLayout(Doctor_Status_9);
        Doctor_Status_9.setLayout(Doctor_Status_9Layout);
        Doctor_Status_9Layout.setHorizontalGroup(
            Doctor_Status_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_9Layout.setVerticalGroup(
            Doctor_Status_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Status_10.setBackground(new java.awt.Color(204, 204, 204));
        Doctor_Status_10.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout Doctor_Status_10Layout = new javax.swing.GroupLayout(Doctor_Status_10);
        Doctor_Status_10.setLayout(Doctor_Status_10Layout);
        Doctor_Status_10Layout.setHorizontalGroup(
            Doctor_Status_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        Doctor_Status_10Layout.setVerticalGroup(
            Doctor_Status_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        Doctor_Name_9.setText("Unregistered");

        Doctor_Name_6.setText("Unregistered");

        Doctor_Name_7.setText("Unregistered");

        Doctor_Name_8.setText("Unregistered");

        Doctor_Name_10.setText("Unregistered");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_9, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_10, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Doctor_Status_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Doctor_Name_6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Doctor_Status_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Doctor_Name_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doctor_Status_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Name_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doctor_Status_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Name_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doctor_Status_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Name_4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Doctor_Name_5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Status_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Doctor_Status_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Doctor_Name_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Doctor_Status_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Name_7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Doctor_Status_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Name_8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Doctor_Status_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Name_9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Doctor_Status_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Doctor_Name_10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Doc_Avail_Title)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(Main_Menu_Btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Doc_Avail_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Main_Menu_Btn_2)
                .addGap(24, 24, 24))
        );

        jMenu2.setText("Options");

        jMenuItem2.setText("Main Menu");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setText("Exit System");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        Register_New_Doctor.add(jMenu2);

        jMenu3.setText("Help");
        Register_New_Doctor.add(jMenu3);

        setJMenuBar(Register_New_Doctor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        MainMenu m = new MainMenu();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Main_Menu_Btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Btn_2ActionPerformed
        this.setVisible(false);
        MainMenu a = new MainMenu();
        a.setVisible(true);
        ReadInDoctors doc = new ReadInDoctors();
        String str = doc.getDataAsString(0, 0);
        //method to reference the 2d array
      
    }//GEN-LAST:event_Main_Menu_Btn_2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
              Doctor_Name_1.setText("undefined");
              Doctor_Name_2.setText("undefined");
              Doctor_Name_3.setText("undefined");
              Doctor_Name_4.setText("undefined");
              Doctor_Name_5.setText("undefined");
              Doctor_Name_6.setText("undefined");
              Doctor_Name_7.setText("undefined");
              Doctor_Name_8.setText("undefined");
              Doctor_Name_9.setText("undefined");
              Doctor_Name_10.setText("undefined");
              //clearing the labels 
            String[] doctorsNames = new String[10];
            int foundAmount = 0;
            String name ;
        
            ReadInDoctors doc = new ReadInDoctors();
            int len = 100;
     //current size of the array 
            int i = 0;
            Object searchObject = jComboBox1.getSelectedItem();
            //value of the combo boxis used as a string to compare 
            String searchString = searchObject.toString();
            System.out.println(searchString);
            

           
            while(len > i){
                if(searchString.equals(doc.getDataAsString(i, 4))){
                    //retriving element 4 from the array as this will always be the speciality 
                    System.out.println("New result found: " + (doc.getDataAsString(i, 0)));
                    foundAmount ++ ;
                   name = (doc.getDataAsString(i, 0));
                    switch (foundAmount) {
                    case 1: 
                     Doctor_Name_1.setText(name);
                     break;
                     
                     case 2: 
                     Doctor_Name_2.setText(name);
                     break;
                     case 3: 
                     Doctor_Name_3.setText(name);
                     break;
                     case 4: 
                     Doctor_Name_4.setText(name);
                     break;
                     case 5: 
                     Doctor_Name_5.setText(name);
                     break;
                     case 6: 
                     Doctor_Name_6.setText(name);
                     break;
                     case 7: 
                     Doctor_Name_7.setText(name);
                     break;
                     case 8: 
                     Doctor_Name_8.setText(name);
                     break;
                     case 9: 
                     Doctor_Name_9.setText(name);
                     break;
                     case 10: 
                     Doctor_Name_10.setText(name);
                     break;
                }
                  
               
                   //outputting the doctors name 
                 
                }
                i++;
                
            }
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorAvailability().setVisible(true);
                 ReadInDoctors readIn= new ReadInDoctors();       
                try {
                           
            Object[][] obj = readIn.readData();
            System.out.println(obj);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Doc_Avail_Title;
    private javax.swing.JLabel Doctor_Name_1;
    private javax.swing.JLabel Doctor_Name_10;
    private javax.swing.JLabel Doctor_Name_2;
    private javax.swing.JLabel Doctor_Name_3;
    private javax.swing.JLabel Doctor_Name_4;
    private javax.swing.JLabel Doctor_Name_5;
    private javax.swing.JLabel Doctor_Name_6;
    private javax.swing.JLabel Doctor_Name_7;
    private javax.swing.JLabel Doctor_Name_8;
    private javax.swing.JLabel Doctor_Name_9;
    private javax.swing.JPanel Doctor_Status_1;
    private javax.swing.JPanel Doctor_Status_10;
    private javax.swing.JPanel Doctor_Status_2;
    private javax.swing.JPanel Doctor_Status_3;
    private javax.swing.JPanel Doctor_Status_4;
    private javax.swing.JPanel Doctor_Status_5;
    private javax.swing.JPanel Doctor_Status_6;
    private javax.swing.JPanel Doctor_Status_7;
    private javax.swing.JPanel Doctor_Status_8;
    private javax.swing.JPanel Doctor_Status_9;
    private javax.swing.JLabel MainMenuTitle;
    private javax.swing.JButton Main_Menu_Btn_2;
    private javax.swing.JMenuBar Register_New_Doctor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}