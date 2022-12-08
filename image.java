public void writeToImage() throws MalformedURLException, IOException {

    Graphics g = image.getGraphics();
    ImageIO.write(image, "png", new File("HH.jpg"));
}