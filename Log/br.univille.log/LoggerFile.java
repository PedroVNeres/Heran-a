package br.univille.log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    private String fileName;

    public LoggerFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(Level level, String message) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(time + " " + level + ": " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}