/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectoprogra1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class Cursos_asig_estudiante extends javax.swing.JFrame {

    /**
     * Creates new form Cursos_asig_estudiante
     */
    public Cursos_asig_estudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Consultar mis cursos");

        Alumno alumnoLogeado = Proyectoprogra1.alumnoLogeado;

        if (alumnoLogeado != null) {
            DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre", "Sección", "Profesor", "Nota"}, 0);

            for (Curso c : Proyectoprogra1.cursos) {
                for (Alumno a : c.getAlumnos()) {
                    if (a.getNombre().equals(alumnoLogeado.getNombre())) {
                        data.addRow(new Object[]{c.getNombre(), c.getSeccion(), c.getProfesor(), a.getNota()});
                        break;
                    }
                }
            }
            jTable2.setModel(data);
        } else {
            System.out.println("No se encontro el alumno");
        }
    }

    public void actualizarDatos() {
        Alumno alumnoLogeado = Proyectoprogra1.alumnoLogeado;

        if (alumnoLogeado != null) {
            DefaultTableModel data = new DefaultTableModel(new String[]{"Nombre", "Sección", "Profesor", "Nota"}, 0);

            for (Curso c : Proyectoprogra1.cursos) {
                for (Alumno a : c.getAlumnos()) {
                    if (a.getNombre().equals(alumnoLogeado.getNombre())) {
                        data.addRow(new Object[]{c.getNombre(), c.getSeccion(), c.getProfesor(), a.getNota()});
                        break;
                    }
                }
            }
            jTable2.setModel(data);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        btn_desasignarse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setBackground(new java.awt.Color(102, 204, 255));
        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cursos Asignados");

        btn_salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_desasignarse.setBackground(new java.awt.Color(0, 204, 0));
        btn_desasignarse.setForeground(new java.awt.Color(255, 255, 255));
        btn_desasignarse.setText("Desasignarse");
        btn_desasignarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desasignarseActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btn_salir)
                .addGap(18, 18, 18)
                .addComponent(btn_desasignarse)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir)
                    .addComponent(btn_desasignarse))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        BienvenidaAlumno a = new BienvenidaAlumno();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_desasignarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desasignarseActionPerformed
        Alumno alumnoLogeado = Proyectoprogra1.alumnoLogeado;
        System.out.println("");
        if (alumnoLogeado != null) {
            int cursoAsignadoIndex = jTable2.getSelectedRow();
            if (cursoAsignadoIndex == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona un curso para desasignarte", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String nombreCurso = jTable2.getValueAt(cursoAsignadoIndex, 0).toString();
                String seccionCurso = jTable2.getValueAt(cursoAsignadoIndex, 1).toString();
                String profesorCurso = jTable2.getValueAt(cursoAsignadoIndex, 2).toString();
                Curso cursoSeleccionado = null;

                for (Curso c : Proyectoprogra1.cursos) {
                    if (c.getNombre().equals(nombreCurso) && c.getSeccion().equals(seccionCurso) && c.getProfesor().equals(profesorCurso)) {
                        cursoSeleccionado = c;
                        break;
                    }
                }
                if (cursoSeleccionado != null) {
                    boolean alumnoEncontrado = false;
                    for (Alumno a : cursoSeleccionado.getAlumnos()) {
                        if (a.getCarnet().equals(alumnoLogeado.getCarnet())) {
                            cursoSeleccionado.getAlumnos().remove(a);
                            alumnoEncontrado = true;
                            break;
                        }
                    }
                    if (alumnoEncontrado) {
                        JOptionPane.showMessageDialog(this, "Te desasignaste exitosamente");
                        actualizarDatos();
                    } else {
                        JOptionPane.showMessageDialog(this, "El alumno no está asignado a este curso", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btn_desasignarseActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_desasignarse;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
