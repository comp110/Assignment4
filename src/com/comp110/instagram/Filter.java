package com.comp110.instagram;

public class Filter {

  public Image process(Image input) {
    //
    // Section 3.1
    //
    // TODO: Take the input image and run it through
    //       each of the effects in this.effects array
    //       
    //       You can use an Effect's process method like:
    //       this.effects[i].process(input)
    //      
    //       Your loop condition should run while your
    //       counter variable is less than this.effectCount
    //
    return input;
  }
  
  /* 
   * 110-provided code below. 
   * You should understand what it all does but you should not modify.
   */
  
  private String name;

  private int effectCount = 0;
  private Effect[] effects = new Effect[50];
  
  public Filter(String name) {
    this.name = name;
  }
  
  public Effect[] getEffects() {
    return this.effects;
  }
  
  public void addEffect(Effect effect) {
    if(this.effectCount < this.effects.length) {
      this.effects[this.effectCount] = effect;
      this.effectCount++;
    }
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String toString() {
    return this.name;
  }
  
}