/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import com.interfaces.IPieza;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Casilla extends JPanel implements ActionListener,MouseListener{
    
    private String letra;
    private int numero;
    private Color color;
    private boolean ocupada;
    private IPieza pieza;
    public Casilla(){
        
    }
    
    public Casilla(String letra, int numero, Color color){
        this.letra = letra;
        this.numero = numero;
        this.color = color;
        ocupada = false;
        setBackground(color);
        
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }   

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setOcupada(boolean ocupada){
        this.ocupada = ocupada;
    }    
    
    public boolean getOcupada(){
        return this.ocupada;
    }

    public IPieza getPieza() {
        return pieza;
    }

    public void setPieza(IPieza pieza) {
        this.pieza = pieza;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(pieza != null){
            setBackground(new Color(140,223,255));  
            System.out.println("detectó el click");
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    
}
