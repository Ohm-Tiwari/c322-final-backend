package edu.iu.otiwari.c322finalbackend.repository;

import edu.iu.otiwari.c322finalbackend.model.Flower;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import edu.iu.otiwari.c322finalbackend.model.Flower;

@Repository
public class FlowersFileRepository {
    private String IMAGES_FOLDER_PATH = "flowers/images/";
    public byte[] getImage(int id) throws IOException {
        String fileExtension = ".jpeg";
        Path path = Paths.get(IMAGES_FOLDER_PATH
                + id + fileExtension);
        byte[] image = Files.readAllBytes(path);
        return image;
    }

    public boolean updateImage(int id, MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());

        String fileExtension = ".jpeg";
        Path path = Paths.get(IMAGES_FOLDER_PATH
                + id + fileExtension);
        System.out.println("The file " + path + " was saved successfully.");
        file.transferTo(path);
        return true;
    }

    public List<Flower> search(Iterable<Flower> allF, Flower sf) {
        List<Flower> f = new ArrayList<>();
        for (Flower flower : allF) {
            if (sf.getOccasion() != null && !sf.getOccasion().equals(flower.getOccasion())) {continue;}
            if (sf.getColor() != null && !sf.getColor().equals(flower.getColor())) {continue;}
            if (sf.getType() != null && !sf.getType().equals(flower.getType())) {continue;}
            f.add(flower);
        }
        return f;
    }

}
