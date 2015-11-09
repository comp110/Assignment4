package com.comp110.instagram;

import com.comp110.instagram.test.ColorTests;
import com.comp110.instagram.test.ColorPlayground;
import com.comp110.instagram.test.ImageTests;
import com.comp110.instagram.test.ImagePlayground;

public class Assignment4A {

  public static void main(String[] args) {
    /* Color Class (Parts 2 & 3) */
    ColorTests.run();
    
    // If you want to simulate test scenarios of your own, feel
    // free to tinker with a Color object directly once your definitions
    // are passing. Just uncomment the next 5 lines below:
    
//    Color color = new Color();
//    color.setRed(0.482);
//    color.setGreen(0.686);
//    color.setBlue(0.831);
//    System.out.println(color);
    
    // When *all* of your Parts 2 and 3 tests pass,
    // fist pump vigorously and then spend a minute
    // enjoying the fruits of your labor by playing around
    // with RGB values. Uncomment the next line...
    
//     com.comp110.instagram.test.ColorPlayground.run(new Color(0.482,0.686,0.831));
    
    
    /* Image Class (Parts 4 & 5) */
//    ImageTests.run();
    
    // When *all* of your Parts 2, 3, 4 and 5 tests pass,
    // welcome to the ImagePlayground. It's time for your
    // first "Black Triangle" moment... 
    // (see http://rampantgames.com/blog/?p=7745 )
    // Uncomment the 3 lines below AND delete the start
    // and end block comment lines after the main method.
//    Image image = new Image(512, 512);
//    drawTriangles(image);
//    com.comp110.instagram.test.ImagePlayground.run(image);
  }
  
  
/* Once you're to Image Playground, delete THIS line and the line toward the end
 
  static void drawTriangles(Image image) {
    int midpointX = image.getWidth() / 2;
    int midpointY = image.getHeight() / 2;
    int size      = image.getHeight() / 8;
    int halfSize  = size / 2;
    drawTriangle(image, midpointX, midpointY - size, size);
    drawTriangle(image, midpointX - halfSize, midpointY, size);
    drawTriangle(image, midpointX + halfSize, midpointY, size);
  }
  
  static void drawTriangle(Image image, int xStart, int yStart, int height) {
    Color theBestColor = new Color(0.482,0.686,0.831);
    for(int y = 0; y < height; y++) {
      for(int x = 0; x < y + 1; x++) {
        int yOffset = yStart + y;
        int xOffset = xStart - y / 2 + x;
        image.setPixel(xOffset, yOffset, theBestColor);
      }
    }
  }
 
Delete THIS line too... */

}
