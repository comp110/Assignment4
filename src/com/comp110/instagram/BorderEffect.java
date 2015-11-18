package com.comp110.instagram;

public class BorderEffect implements Effect {

  public Image process(Image input) {
    
    // Part 2.3
    return input.copy(); // Note: you'll need to rewrite this return line.
    
  }
  
  
  /* 
   * 110-provided code below. 
   * You should understand what it all does but you should not modify.
   */
  
  private double amount;
  private Color  color;

  public BorderEffect(Color color) {
    this.amount = 0.0;
    this.color = color;
  }
  
  public BorderEffect(double amount, Color color) {
    this.amount = amount;
    this.color = color;
  }
  
  public double getAmount() {
    return this.amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }
  
  public Color getColor() {
    return this.color;
  }
  
  public void setColor(Color color) {
    this.color = color;
  }
  
  public String toString() {
    return "Border";
  }

}
