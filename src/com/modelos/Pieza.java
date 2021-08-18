/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import com.interfaces.IPieza;
import java.io.File;

/**
 *
 * @author felix
 */
public class Pieza implements IPieza {

    protected int color;
    protected File imagen;

    @Override
    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    @Override
    public File getImagen() {
        return imagen;
    }

    @Override
    public void mover(Casilla actual, Casilla destino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }
}
