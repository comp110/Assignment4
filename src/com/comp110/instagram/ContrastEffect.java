package com.comp110.instagram;

public class ContrastEffect implements Effect {

  public Image process(Image input) {
    
    // Part 2.6
    return input.copy(); // Note: you'll need to rewrite this return line.
    
  }
  
  
  /* 
   * 110-provided code below. 
   * You should understand what it all does but you should not modify.
   */
  
  private double amount;
  
  public ContrastEffect() {
    this.amount = 0.5;
  }
  
  public ContrastEffect(double amount) {
    this.amount = amount;
  }
    
  public double getAmount() {
    return this.amount;
  }
  
  public void setAmount(double amount) {
    this.amount = amount;
  }
  
  public String toString() {
    return "Contrast";
  }
  
}