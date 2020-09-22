package dependencyinversion.correct.ImageServices;

import dependencyinversion.correct.Imp.ImageServices;

import java.util.Base64;

public class Base64ImageService implements ImageServices {

    private byte[] images;

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    String ProcessImage() {
        if (getImages() == null) return null;
        return Base64.getEncoder().encodeToString(getImages());
    }

    @Override
    public void saveImage() {

        ProcessImage();
        System.out.println("Base64 Image saved");
    }

}
