/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import com.interfaces.*;
import java.io.File;
import com.utilerias.*;
/**
 *
 * @author Usuario
 */
public class Caballo implements IPieza{
    
    private int color;
    private File imagen;
    
    public Caballo(int color){
        this.color = color;
        if(color == utileriasGlobal.BLANCAS){
            imagen = new File("imagenes/caballoBlanco.png");
        }
        else{
             imagen = new File("imagenes/caballoNegro.png");
        }
        System.out.println(imagen.getPath());
    }
    
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
