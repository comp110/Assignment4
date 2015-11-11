package com.comp110.instagram;

import com.comp110.instagram.test.ColorDefinitionTests;
import com.comp110.instagram.test.ColorSemanticsTests;
import com.comp110.instagram.test.ColorPlayground;
import com.comp110.instagram.test.ImageDefinitionTests;
import com.comp110.instagram.test.ImageSemanticsTests;
import com.comp110.instagram.test.ImagePlayground;

public class Assignment4A {

  public static void main(String[] args) {

    /*
     * Color Class Tests
     */
    // Part 2
    ColorDefinitionTests.run();
    // Part 3 - Uncomment the line below to test Part 3
//    ColorSemanticsTests.run();

    /* =====================
       ** ColorPlayground **
       =====================
     When *all* of your Parts 2 and 3 tests pass,
     fist pump vigorously and then spend a minute
     enjoying the fruits of your labor by playing around
     with RGB values. Uncomment the next few lines... */
//    Color color = new Color();
//    color.setRed(0.482);
//    color.setGreen(0.686);
//    color.setBlue(0.831);
//    System.out.println(color);
//    ColorPlayground.run(color);


    /* 
     * Image Class Tests
     */
    // Part 4 - Uncomment line below to test Part 4
//    ImageDefinitionTests.run();
    // Part 5 - Uncomment line below to test Part 5
//    ImageSemanticsTests.run();

    /* =====================
       ** ImagePlayground **
       =====================

     When *all* of your tests pass, welcome to 
     // It's time for your
     first "Black Triangle" moment... 
     (see http://rampantgames.com/blog/?p=7745 )
     Uncomment the lines below... */

//    Image image = new Image(512, 512);
//    ImageUtils.loadPhoto(image, "photos/wilson_wearing_cpu_hat.jpg");
//    ImageUtils.drawTriangles(image);
//    ImagePlayground.run(image);

  }

}