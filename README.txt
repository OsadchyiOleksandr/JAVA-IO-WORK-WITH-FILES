За допомогою можливостей File IO API необхідно створити файл та прочитати його.

Результат виведення має бути

RESULT: Success.
FILE CONTENT: My very important information.

1) Cтворіть проект File-Handler на локальній машині через IntelliJ IDEA (IDE). В кореневій папці проекту створіть внутрішню директорію files,
 яка буде використовуватись для роботи з файлом.

Рекомендація як створити цю директорію: Правий клік мишею на кореневу директорію проекту > New > Directory >
Лівий клік мишею на Directory > У віконці ввести files > Натиснути Enter

(2) Структура проекту має бути такою:

(3) Функціонал класу Main

package app;

public class Main {

  private final static String BASE_PATH = "files/";

  public static void main(String[] args) {
    FileHandler handler = new FileHandler();
    String fileName = "myfile";
    String fileContent = "My very important information.";
    String result = handler.writeFile(fileName, fileContent);
    String content = handler.readFile(BASE_PATH + fileName + ".txt");
    getOutput("RESULT: " + result);
    getOutput("FILE CONTENT: " + content);
  }

  private static void getOutput(String output) {
    System.out.println(output);
  }
}

(4) Доопрацюйте функціонал класу FileHandler


package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

  private final static String BASE_PATH = "files/";

  public String writeFile(String fileContent) {
    try(FileWriter fw = fileName + ".txt") {
      fw(fileContent);
      return "Success.";
    } catch (Exception e) {
      return
    }
  }

  public String readFile(String path) {
    try (FileReader reader = new FileReader()) {
      int sym;
      new StringBuilder();
      while ((sym = reader.read()) != -1) {
        stringBuilder.append((char) sym);
      }
      return
    } catch (IOException ex) {
      return ex.getMessage();
    }
  }
}

(5) Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.