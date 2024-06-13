/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoprogra1;

/**
 *
 * @author javier
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Panel Administrador");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        Crear_profe = new javax.swing.JMenuItem();
        consultar_profe = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        Crear_alumno = new javax.swing.JMenuItem();
        consultar_alumno = new javax.swing.JMenuItem();
        asignar_e_curso = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        Crear_curso = new javax.swing.JMenuItem();
        consultar_cursos = new javax.swing.JMenuItem();
        consultar_e_asignados = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("File");
        jMenuBar4.add(jMenu5);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido Admin");

        jMenu6.setText("Profesores");

        Crear_profe.setText("Crear Profesor");
        Crear_profe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_profeActionPerformed(evt);
            }
        });
        jMenu6.add(Crear_profe);

        consultar_profe.setText("Consultar Profesores");
        consultar_profe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_profeActionPerformed(evt);
            }
        });
        jMenu6.add(consultar_profe);

        jMenuBar1.add(jMenu6);

        jMenu9.setText("Alumnos");

        Crear_alumno.setText("Crear Alumno");
        Crear_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_alumnoActionPerformed(evt);
            }
        });
        jMenu9.add(Crear_alumno);

        consultar_alumno.setText("Consultar Alumnos");
        consultar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_alumnoActionPerformed(evt);
            }
        });
        jMenu9.add(consultar_alumno);

        asignar_e_curso.setText("Asignación de alumnos a curso");
        asignar_e_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_e_cursoActionPerformed(evt);
            }
        });
        jMenu9.add(asignar_e_curso);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Cursos");

        Crear_curso.setText("Crear cursos");
        Crear_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_cursoActionPerformed(evt);
            }
        });
        jMenu10.add(Crear_curso);

        consultar_cursos.setText("Consultar Cursos");
        consultar_cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_cursosActionPerformed(evt);
            }
        });
        jMenu10.add(consultar_cursos);

        consultar_e_asignados.setText("Consulta de estudiantes asiganados a un curso");
        consultar_e_asignados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_e_asignadosActionPerformed(evt);
            }
        });
        jMenu10.add(consultar_e_asignados);

        jMenuBar1.add(jMenu10);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Crear_profeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_profeActionPerformed
        CrearProfesor c = new CrearProfesor();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Crear_profeActionPerformed

    private void Crear_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_alumnoActionPerformed
        CrearAlumno a = new CrearAlumno();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Crear_alumnoActionPerformed

    private void logoutMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_logoutMenuSelected
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMenuSelected

    private void consultar_profeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_profeActionPerformed
        Consultar_profesores p = new Consultar_profesores();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consultar_profeActionPerformed

    private void Crear_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_cursoActionPerformed
        CrearCurso cr = new CrearCurso();
        cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Crear_cursoActionPerformed

    private void consultar_cursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_cursosActionPerformed
        Consultar_cursos c = new Consultar_cursos();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consultar_cursosActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void consultar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_alumnoActionPerformed
       Consultar_Alumno a = new Consultar_Alumno();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_consultar_alumnoActionPerformed

    private void consultar_e_asignadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_e_asignadosActionPerformed
        listado_e_asignados list = new listado_e_asignados();
        list.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consultar_e_asignadosActionPerformed

    private void asignar_e_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_e_cursoActionPerformed
        Asignar_estudiantes a = new Asignar_estudiantes();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_asignar_e_cursoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Crear_alumno;
    private javax.swing.JMenuItem Crear_curso;
    private javax.swing.JMenuItem Crear_profe;
    private javax.swing.JMenuItem asignar_e_curso;
    private javax.swing.JMenuItem consultar_alumno;
    private javax.swing.JMenuItem consultar_cursos;
    private javax.swing.JMenuItem consultar_e_asignados;
    private javax.swing.JMenuItem consultar_profe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu logout;
    // End of variables declaration//GEN-END:variables
}