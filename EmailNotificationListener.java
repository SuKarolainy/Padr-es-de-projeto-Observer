package com.mycompany.projetoobserver;

import java.io.File;

/**
 *
 * @author suKarolainy
 */
public class EmailNotificationListener implements EventListener { // EmailNotificationListener >> EmailAlertsListener
    private String email;

    public EmailNotificationListener(String email) { // EmailNotificationListener >> EmailAlertsListener
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email " + email + "\nAlguém realizou operação " + eventType + ", com o seguinte arquivo: " + file.getName());
    }
}
