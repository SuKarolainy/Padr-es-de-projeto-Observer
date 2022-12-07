package com.mycompany.projetoobserver;

import java.io.File;

/**
 *
 * @author suKarolainy
 */
public interface EventListener {
    void update(String TipoEvento, File Arquivo);
}
