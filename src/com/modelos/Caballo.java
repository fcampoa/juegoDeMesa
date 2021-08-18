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
public class Caballo extends Pieza {

    public Caballo(int color) {
        this.color = color;
        if (color == utileriasGlobal.BLANCAS) {
            imagen = new File("imagenes/caballoBlanco.png");
        } else {
            imagen = new File("imagenes/caballoNegro.png");
        }
        System.out.println(imagen.getPath());
    }


}
