/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoobserver;

import java.io.File;

/**
 *
 * @author ho.aecsky
 */
public class LogOpenListener implements EventListener {
    private File registro;

    public LogOpenListener(String fileName) {
        this.registro = new File(fileName);
    }

    @Override
    public void update(String tipoEvento, File arquivo) {
        System.out.println("Regitrado em: " + registro + "\nAlguém realizou operação: " + tipoEvento + ", com o seguinte arquivo: " + arquivo.getName());
    }
}