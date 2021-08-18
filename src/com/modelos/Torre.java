/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import com.interfaces.*;
import com.utilerias.utileriasGlobal;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Torre extends Pieza implements IPieza {

    public Torre(int color) {
        this.color = color;
        if (color == utileriasGlobal.BLANCAS) {
            imagen = new File("imagenes/TorreBlanca.png");
        } else {
            imagen = new File("imagenes/torreNegra.png");
        }
        System.out.println(imagen.getPath());
    }
}
