package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String[] paths = new String[3];
        paths[0] = "/home/soher/.var/app/com.jetbrains.IntelliJ-IDEA-Ultimate/config/JetBrains/IntelliJIdea2023.3/.lock";
        paths[1] = "/home/soher/.var/app/com.jetbrains.IntelliJ-IDEA-Community/config/JetBrains/IdeaIC2023.3/.lock";
        paths[2] = "/home/soher/.var/app/com.jetbrains.PyCharm-Professional/config/JetBrains/PyCharm2023.3/.lock";

        for (String path : paths) {
            File file = new File(path);
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("Deleted: " + path);
                } else {
                    System.out.println("Failed to delete: " + path);
                }
            } else {
                System.out.println("File does not exist: " + path);
            }
        }
    }
}
