package dependencyinversion.correct;

import dependencyinversion.correct.Imp.ImageServices;

public class StorageService {

    ImageServices imageService;

    public StorageService(ImageServices imageService) {
        this.imageService = imageService;
    }

    public void SaveFile() {
        imageService.saveImage();
    }
}
