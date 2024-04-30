package edu.iu.jts11.flowershopbackend.repository;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class FlowerFileRepository {
    private String IMAGES_FOLDER_PATH = "flowers/images/";

    public FlowerFileRepository() {
        File imagesFolder = new File(IMAGES_FOLDER_PATH);
        if (!imagesFolder.exists()) {
            imagesFolder.mkdirs();
        }
    }

    public boolean uploadImage(int id, MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());

        String fileExtension = ".png";
        Path path = Paths.get(IMAGES_FOLDER_PATH + id + fileExtension);
        System.out.println("The file " + path + " was saved successfully.");
        file.transferTo(path);
        return true;
    }

    public byte[] getImage(int id) throws IOException {
        String fileExtension = ".png";
        Path path = Paths.get(IMAGES_FOLDER_PATH + id + fileExtension);
        return Files.readAllBytes(path);
    }
}
