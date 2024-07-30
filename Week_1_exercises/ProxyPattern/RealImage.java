package DigitalNuture;

public class RealImage implements Image {
	private String imageUrl;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromRemoteServer();
    }

    private void loadImageFromRemoteServer() {
        System.out.println("Loading image from " + imageUrl);
        // Simulate time-consuming image loading from a remote server
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image from " + imageUrl);
    }

}
