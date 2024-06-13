/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra1;

/**
 *
 * @author javier
 */
public class Profesor {
    public String nombre;
    public String apellido;
    public String usuario;
    public String password;
    
    @Override
    public String toString(){
        return nombre + " " + apellido;
    }
}
