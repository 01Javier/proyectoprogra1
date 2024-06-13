/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra1;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Curso {
    private static int contadorID = 1;
    private int ID;
    private String Nombre;
    private String Seccion;
    private String Fecha_inicio;
    private String Fecha_fin;
    private String H_inicio;
    private String H_fin;
    private String profesor;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    
    public Curso() {
        this.ID = contadorID++;
    }
    
    @Override
    public String toString() {
        return getNombre() + " " + getSeccion()+" "+ getProfesor();
        
    }

    /**
     * @return the contadorID
     */
    public static int getContadorID() {
        return contadorID;
    }

    /**
     * @param aContadorID the contadorID to set
     */
    public static void setContadorID(int aContadorID) {
        contadorID = aContadorID;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Seccion
     */
    public String getSeccion() {
        return Seccion;
    }

    /**
     * @param Seccion the Seccion to set
     */
    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    /**
     * @return the Fecha_inicio
     */
    public String getFecha_inicio() {
        return Fecha_inicio;
    }

    /**
     * @param Fecha_inicio the Fecha_inicio to set
     */
    public void setFecha_inicio(String Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    /**
     * @return the Fecha_fin
     */
    public String getFecha_fin() {
        return Fecha_fin;
    }

    /**
     * @param Fecha_fin the Fecha_fin to set
     */
    public void setFecha_fin(String Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
    }

    /**
     * @return the H_inicio
     */
    public String getH_inicio() {
        return H_inicio;
    }

    /**
     * @param H_inicio the H_inicio to set
     */
    public void setH_inicio(String H_inicio) {
        this.H_inicio = H_inicio;
    }

    /**
     * @return the H_fin
     */
    public String getH_fin() {
        return H_fin;
    }

    /**
     * @param H_fin the H_fin to set
     */
    public void setH_fin(String H_fin) {
        this.H_fin = H_fin;
    }

    /**
     * @return the profesor
     */
    public String getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
