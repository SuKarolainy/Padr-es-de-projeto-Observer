package com.mycompany.projetoobserver;

/**
 *
 * @author suKarolainy
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.add("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.add("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
