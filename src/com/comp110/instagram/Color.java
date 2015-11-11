package com.comp110.instagram;

public class Color {
  
  // TODO: 2.2 - Define private instance variables
  
  public Color() {
    this.setRed(1.0);
    this.setGreen(1.0);
    this.setBlue(1.0);
  }
  
  public Color(double red, double green, double blue) {
    this.setRed(red);
    this.setGreen(green);
    this.setBlue(blue);
  }
  
  public String toString() {
    return "Color("+this.getRed()+","+this.getGreen()+","+this.getBlue()+")";
  }
  
  // TODO: 2.3, 2.4 - Add other instance definitions
  
}