/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas;

import com.modelos.Alfil;
import com.modelos.Caballo;
import com.modelos.Casilla;
import com.modelos.Peon;
import com.modelos.Reina;
import com.modelos.Rey;
import com.modelos.Torre;
import com.utilerias.utileriasGlobal;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.*;
/**
 *
 * @author Usuario
 */
public class ventanaAjedrez extends JFrame {
    
    private Casilla casillas[][]=new Casilla[8][8];
    private JPanel panelCasillas;
    private BufferedImage dbi;
    
    public ventanaAjedrez(){
        InitComponents();
        creaCasillas();       
        setSize(600,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    private void InitComponents(){
        setLayout(null);
        panelCasillas = new JPanel();
        //panelCasillas.addMouseListener(this);
        panelCasillas.setLayout(null);
        panelCasillas.setBounds(new Rectangle(30,30,400,400));        
        add(panelCasillas,null);
    }

    
    private void creaCasillas(){   
    Color color;
    char letra = 97;
    int numero = 8;
    double x = 0;
    double y = 0;
    for (int i = 1; i <=8; i++) {
        addLabel(String.valueOf(numero), (int)(x + 15), (int)((y + 30) + 25));
        for (int j = 1; j <=8; j++) {    
            addLabel(String.valueOf(letra).toUpperCase() ,(int)((x + 30) + 25) ,(int)(y + 10));
            if((i+j) % 2 == 0 ){
                color = new Color(242,230,230);
            }
            else{
                color = new Color(88,73,71);
            }
            Casilla c = new Casilla(String.valueOf(letra),numero,color);
            c.setBounds(new Rectangle((int)x,(int)y, 50, 50));
            c.setBorder(BorderFactory.createLineBorder(Color.black));
            asignaPiezaInicial(c);                
            if(c.getPieza() != null)dibuja(c);           
            casillas[i - 1][j - 1] = c;           
            panelCasillas.add(c,null);
            letra++;
            x += 50;
        }
        numero--;
        letra=97;
        y += 50;
        x = 0;
    }   
}
    private void addLabel(String texto, int x, int y){
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(new Rectangle(x,y,10,10));
        etiqueta.setText(texto);
        add(etiqueta,null);
    }  
   
    
    private void asignaPiezaInicial(Casilla c){
        if(c.getNumero() == 2){
           c.setPieza(new Peon(utileriasGlobal.BLANCAS));
        }
        if(c.getNumero() == 7){
            c.setPieza(new Peon(utileriasGlobal.NEGRAS));
        }
        if(c.getNumero() == 1){
            if(c.getLetra().equalsIgnoreCase("a") || c.getLetra().equalsIgnoreCase("h")){
                c.setPieza(new Torre(utileriasGlobal.BLANCAS));
            }
            if(c.getLetra().equalsIgnoreCase("b") || c.getLetra().equalsIgnoreCase("g")){
                c.setPieza(new Caballo(utileriasGlobal.BLANCAS));
            }
            if(c.getLetra().equalsIgnoreCase("c") || c.getLetra().equalsIgnoreCase("f")){
                c.setPieza(new Alfil(utileriasGlobal.BLANCAS));
            }
            if(c.getLetra().equalsIgnoreCase("d")){
                c.setPieza(new Reina(utileriasGlobal.BLANCAS));
            }
            if(c.getLetra().equalsIgnoreCase("e")){
                c.setPieza(new Rey(utileriasGlobal.BLANCAS));
            }            
        }
        if(c.getNumero() == 8){
            if(c.getLetra().equalsIgnoreCase("a") || c.getLetra().equalsIgnoreCase("h")){
                c.setPieza(new Torre(utileriasGlobal.NEGRAS));
            }
            if(c.getLetra().equalsIgnoreCase("b") || c.getLetra().equalsIgnoreCase("g")){
                c.setPieza(new Caballo(utileriasGlobal.NEGRAS));
            }
            if(c.getLetra().equalsIgnoreCase("c") || c.getLetra().equalsIgnoreCase("f")){
                c.setPieza(new Alfil(utileriasGlobal.NEGRAS));
            }
            if(c.getLetra().equalsIgnoreCase("d")){
                c.setPieza(new Reina(utileriasGlobal.NEGRAS));
            }
            if(c.getLetra().equalsIgnoreCase("e")){
                c.setPieza(new Rey(utileriasGlobal.NEGRAS));
            }
        }
    }
 private void dibuja(Casilla casilla){
    ImageIcon Imagen;    
    Imagen = new ImageIcon(casilla.getPieza().getImagen().getPath());
    JLabel Img = new JLabel(Imagen);
    Img.setSize(50, 50);
    casilla.add(Img);  
    }

}
