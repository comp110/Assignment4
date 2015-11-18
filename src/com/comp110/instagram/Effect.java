package com.comp110.instagram;

/*
 * This is an "interface" for an Effect. You shouldn't modify this file but
 * certainly read for understanding if you're curious.
 * 
 * You'll learn all about interfaces in 401, but the short story is pretty
 * simple and really cool:
 * 
 * We can define an interface that specifies method signatures. If a class
 * advertises that it is compatible with some interface we know that objects
 * of that class can be used interchangeably with others which also implement
 * the interface. We can declare a variable's *type* as the *interface* while
 * assigning to that variable *objects* whose *class* implements the *interface*:
 * 
 *    Effect anEffect = new EnhanceEffect();
 *    
 * For a real world analogy, think about a power socket as an interface.
 * In the US these are three pronged and are AC. Tons of different electrical
 * devices are able to receive power and do various jobs by virtue of conforming
 * to this standard interface for receiving power as an input.
 * 
 * Similarly, in our application, as long as each effect like Border or Brightness
 * adheres to the same Effect interface, we can use them interchangeably in
 * our programs. There's a fancy term you might see used around this concept called
 * polymorphism. By conforming to this interface, an effect can "process" an image
 * by taking one image as an input and returning the processed image as an output.
 * Since the input and output are of the same type: Image - we can chain together
 * multiple effects by feeding the output of one into the input of another.
 */

public interface Effect {

  public Image process(Image image);
  
  public double getAmount();
  
  public void setAmount(double amount);
  
  public String toString();
  
}