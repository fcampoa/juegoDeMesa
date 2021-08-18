/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas;

import com.modelos.Casilla;
import javax.swing.JFrame;

/**
 *
 * @author felix
 */
public class Tablero extends JFrame{
    
    private final int filas = 8;
    private final int columnas = 8;

    private Casilla[][] casillas;

    public Tablero(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }
    
    public void initUI() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                dibujaCasilla(casillas[i][j]);
            }
        }
    }
    
    private void dibujaCasilla(Casilla c) {
        add(c);
    }

}
