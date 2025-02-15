package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "files/";

    public String writeFile(String fileName, String fileContent) {
        try(FileWriter fw = new FileWriter(BASE_PATH + fileName + ".txt")) {
            fw.write(fileContent);
            return "Success.";
        } catch (Exception e) {
            return "Error writing file: " + e.getMessage();
        }
    }

    public String readFile(String path) {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            int sym;
            new StringBuilder();
            while ((sym = reader.read()) != -1) {
                content.append((char) sym);
            }
            return content.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
