package dependencyinversion.correct.ImageServices;

import dependencyinversion.correct.Imp.ImageServices;

public class RawImageService implements ImageServices {

    private byte[] images;

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    @Override
    public void saveImage() {
        //Raw image process
        System.out.println("Raw Image saved");
    }
}
