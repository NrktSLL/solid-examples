package dependencyinversion.wrong;

import java.util.Base64;

public class ImageService {

    private byte[] images;

    public ImageService(byte[] images) {
        this.images = images;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    String ProcessImage() {
        return Base64.getEncoder().encodeToString(getImages());
    }

    public void SaveImage() {
        ProcessImage();
    }
}
