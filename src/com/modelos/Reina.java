/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelos;

import com.interfaces.*;
import com.utilerias.utileriasGlobal;
import java.io.File;

/**
 *
 * @author Usuario
 */
public class Reina extends Pieza implements IPieza {

    public Reina(int color) {
        this.color = color;
        if (color == utileriasGlobal.BLANCAS) {
            imagen = new File("imagenes/reinaBlanca.png");
        } else {
            imagen = new File("imagenes/reinaNegra.png");
        }
        System.out.println(imagen.getPath());
    }
}
