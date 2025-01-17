/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoprogra1;

/**
 *
 * @author javier
 */
public class BienvenidaAlumno extends javax.swing.JFrame {

    /**
     * Creates new form BienvenidaAlumno
     */
    public BienvenidaAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Panel Alumno");
        
        jLabel1.setText("Bienvenido Alumno: "+Proyectoprogra1.alumnoLogeado.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Asignar_Curso = new javax.swing.JMenuItem();
        Consultar_Asignacion = new javax.swing.JMenuItem();
        btn_miperfil = new javax.swing.JMenu();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("AnjaliOldLipi", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Bienvenido Alumno");

        jMenu1.setText("Cursos");

        Asignar_Curso.setText("Asignarse a Curso");
        Asignar_Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Asignar_CursoActionPerformed(evt);
            }
        });
        jMenu1.add(Asignar_Curso);

        Consultar_Asignacion.setText("Consultar Asignaciones");
        Consultar_Asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_AsignacionActionPerformed(evt);
            }
        });
        jMenu1.add(Consultar_Asignacion);

        jMenuBar1.add(jMenu1);

        btn_miperfil.setText("Mi Perfil");
        btn_miperfil.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btn_miperfilMenuSelected(evt);
            }
        });
        btn_miperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_miperfilActionPerformed(evt);
            }
        });
        jMenuBar1.add(btn_miperfil);

        logout.setBackground(new java.awt.Color(255, 153, 153));
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("Logout");
        logout.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        logout.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                logoutMenuSelected(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void Asignar_CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Asignar_CursoActionPerformed
        Asignarse_curso a = new Asignarse_curso();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Asignar_CursoActionPerformed

    private void logoutMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_logoutMenuSelected
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMenuSelected

    private void Consultar_AsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_AsignacionActionPerformed
        Cursos_asig_estudiante c = new Cursos_asig_estudiante();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Consultar_AsignacionActionPerformed

    private void btn_miperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_miperfilActionPerformed
        Miperfil_alumno m = new Miperfil_alumno();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_miperfilActionPerformed

    private void btn_miperfilMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btn_miperfilMenuSelected
        Miperfil_alumno m = new Miperfil_alumno();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_miperfilMenuSelected

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Asignar_Curso;
    private javax.swing.JMenuItem Consultar_Asignacion;
    private javax.swing.JMenu btn_miperfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logout;
    // End of variables declaration//GEN-END:variables

}
