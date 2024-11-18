import java.io.*;
import java.nio.file.*;

public class FileCopy {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("C:\\Users\\User\\Desktop\\Бондаренко.txt");

        Path destinationDir = Paths.get("C:\\Users\\User\\Desktop\\untitled3");

        Path destinationPath = destinationDir.resolve(sourcePath.getFileName());

        try {
             if (!Files.exists(destinationDir)) {
                Files.createDirectories(destinationDir);
                System.out.println("Цільова директорія не існувала, вона була створена.");
            }
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Файл успішно скопійовано. " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Сталася помилка при копіюванні файлу:");
        }
    }
}

