package com.solid.solidexample;

import dependencyinversion.correct.ImageServices.RawImageService;
import dependencyinversion.correct.Imp.ImageServices;
import dependencyinversion.correct.StorageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidExampleApplication {

    public static void main(String[] args) {

        ImageServices imageService = new RawImageService();
        StorageService storageService = new StorageService(imageService);
        storageService.SaveFile();

        SpringApplication.run(SolidExampleApplication.class, args);
    }

}
