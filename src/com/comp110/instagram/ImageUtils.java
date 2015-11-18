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
  
  public static void drawTriangles(Image image) {
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
  
  public static void drawTriangle(Image image, int xStart, int yStart, int height) {
    Color bestColor = new Color(0.482,0.686,0.831);
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < y + 1; x++) {
        int yOffset = yStart + y;
        int xOffset = xStart - y / 2 + x;
        image.setPixel(xOffset, yOffset, bestColor);
      }
    }
  }
  
  public static void checkerboard(Image image, int cells, Color light, Color dark) {
    int squareWidth   = image.getWidth()  / cells;
    int squareHeight  = image.getHeight() / cells;
    for(int x = 0; x < image.getWidth(); x++) {
      for(int y = 0; y < image.getHeight(); y++) {
        int xCell = x % (2 * squareWidth);
        int yCell = y % (2 * squareWidth);
        boolean isLight;
        if(xCell < squareWidth) {
          isLight = true;
        } else {
          isLight = false;
        }
        if(yCell >= squareHeight) {
          isLight = !isLight;
        }
        if(isLight) {
          image.setPixel(x, y, light);
        } else {
          image.setPixel(x, y, dark);
        }
      }
    }
  }
  
  // Loading/saving a photo from disk into an instance of your Image class is a little hairy.
  // Lots of Java classes and gorp required to scale down the photo to fit the size of
  // the image you're populating. Proceed with caution (and maybe shield your eyes!)
  public static void loadPhoto(Image image, String photoPath) {
    loadPhoto(image, new File(photoPath));
  }
  
  public static void loadPhoto(Image image, File photo) {
    try {
      BufferedImage input = ImageIO.read(photo);
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
      e.printStackTrace();
      System.err.println(e.getMessage());
      System.out.println("Could not find photo " + photo.getAbsolutePath());
      System.exit(1);
    }
  }
  
  public static void savePhoto(Image image, String photoPath) {
    loadPhoto(image, new File(photoPath));
  }
  
  public static void savePhoto(Image image, File photo) {
    try {
      BufferedImage output = new BufferedImage(
          image.getWidth(),
          image.getHeight(),
          BufferedImage.TYPE_INT_RGB
      );
      for(int x = 0; x < image.getWidth(); x++) {
          for(int y = 0; y < image.getHeight(); y++) {
            Color pixel = image.getPixel(x, y);
            java.awt.Color awtColor = new java.awt.Color((float)pixel.getRed(),(float)pixel.getGreen(),(float)pixel.getBlue());
            output.setRGB(x, y, awtColor.getRGB());
          }
      }
      ImageIO.write(output, "jpg", photo);
    } catch(IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
  
}