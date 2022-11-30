package com.mycompany.projetoobserver;

import java.io.File;

/*
* @author suKarolainy
*/
public class LogOpenListener implements EventListener { // LogOpenListener >> LoggingListener
    private File registro;

    public LogOpenListener(String fileName) { // LogOpenListener >> LoggingListener
        this.registro = new File(fileName);
    }

    @Override
    public void update(String tipoEvento, File arquivo) {
        System.out.println("Regitrado em: " + registro + "\nAlguém realizou operação: " + tipoEvento + ", com o seguinte arquivo: " + arquivo.getName());
    }
}
