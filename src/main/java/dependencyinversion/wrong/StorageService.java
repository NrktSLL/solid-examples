package dependencyinversion.wrong;

/*
 * StorageService ImageService'den daha yüksek seviye bir calss olmasına rağmen
 * ImageService'e bağımlıdır.Bu servis yapısı içinde yapı değişip Byte[] şeklinde image depolanmak istenirse.
 * Tüm yapının değişmesi gerekir.
 */

public class StorageService {

    private ImageService imageService;

    public StorageService(ImageService imageService) {
        this.imageService = imageService;
    }

    public void SaveFile() {
        String image = imageService.ProcessImage();
        System.out.println("image Saved" + image);
        imageService.SaveImage();
    }
}
