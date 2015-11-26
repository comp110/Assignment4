package com.comp110.instagram;

import com.comp110.instagram.test.PartBTests;

public class Assignment4BTests {

  public static void main(String[] args) {

    PartBTests.run();
    
    // Failing an Effect test?
    // Remove the block comments below for an example of how you can
    // test your Effects with more precision by using them as objects
    // yourself.
    
    /* --- Delete this line ---

    // Declare our variables
    Image input, output;
    Effect effect;
    
    // Setup the test case
    input = new Image(8,8);
    fill(input, new Color(1,1,1));
    effect = new BorderEffect(0.25, new Color(0,0,0));
    output = effect.process(input);
    
    // Inspect a pixel of the input vs output
    System.out.println(effect + " Effect");
    int x = 0,
        y = 0;
    System.out.println("Input  Image getPixel(" + x + ", " + y + "): " + input.getPixel(x,y));
    System.out.println("Output Image getPixel(" + x + ", " + y + "): " + output.getPixel(x,y));
    
     --- Delete this line, too --- */
    
  }
  
  private static void fill(Image image, Color color) {
    for(int x = 0; x < image.getWidth(); x++) {
      for(int y = 0; y < image.getHeight(); y++) {
        image.setPixel(x, y, color.copy());
      }
    }
  }

}
