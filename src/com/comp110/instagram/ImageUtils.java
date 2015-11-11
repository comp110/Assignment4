package com.comp110.instagram;

/* 
 * This is support code for the project. 
 * 
 * You do not need to modify it in any way (/ probably should not modify.
 * Feel free to add your own personal class(es) that do things like this
 * if you want to tinker.)
 */

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtils {
  
  static void drawTriangles(Image image) {
    int midpointX = image.getWidth() / 2;
    int midpointY = image.getHeight() / 2;
    int size      = image.getHeight() / 8;
    int halfSize  = size / 2;
    // Center Triforce opening on Wilson's CPU HAT...
    int wilsonYOffset = -16;
    int wilsonXOffset = 10;
    drawTriangle(image, midpointX + wilsonXOffset, midpointY - size + wilsonYOffset, size);
    drawTriangle(image, midpointX - halfSize + wilsonXOffset, midpointY + wilsonYOffset, size);
    drawTriangle(image, midpointX + halfSize + wilsonXOffset, midpointY + wilsonYOffset, size);
  }
  
  static void drawTriangle(Image image, int xStart, int yStart, int height) {
    Color black = new Color(0,0,0);
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < y + 1; x++) {
        int yOffset = yStart + y;
        int xOffset = xStart - y / 2 + x;
        image.setPixel(xOffset, yOffset, black);
      }
    }
  }
  
  
  // Loading a photo from disk into an instance of your Image class is a little hairy.
  // Lots of Java classes and gorp required to scale down the photo to fit the size of
  // the image you're populating. Proceed with caution (and maybe shield your eyes!)
  static void loadPhoto(Image image, String photoPath) {
    try {
      BufferedImage input = ImageIO.read(new File(photoPath));
      BufferedImage scaled = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);
      AffineTransform t = new AffineTransform();
      t.scale((double)image.getWidth()/(double)input.getWidth(), (double)image.getHeight()/(double)input.getWidth());
      AffineTransformOp scaleOp = new AffineTransformOp(t, AffineTransformOp.TYPE_BILINEAR);
      scaled = scaleOp.filter(input, scaled);
      for(int x = 0; x < image.getWidth(); x++) {
          for(int y = 0; y < image.getHeight(); y++) {
            java.awt.Color awtColor = new java.awt.Color(scaled.getRGB(x, y));
            float[] pixel = new float[3];
            awtColor.getColorComponents(pixel);
            image.setPixel(x, y, new Color((double)pixel[0],(double)pixel[1],(double)pixel[2]));
          }
      }
    } catch(IOException e) {
      System.out.println("Could not find photo " + photoPath);
      System.exit(1);
    }
  }
  
}
