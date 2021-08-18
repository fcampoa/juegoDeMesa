/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

import com.modelos.Casilla;
import java.awt.Image;
import java.io.File;

/**
 *
 * @author Usuario
 */
public interface IPieza {
    
    public void setImagen(File imagen);
    
    public  File getImagen();
    
    public void mover(Casilla actual, Casilla destino);
    
    public int getColor();
    
    public void setColor(int color);
}
