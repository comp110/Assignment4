package com.comp110.instagram;

import com.comp110.instagram.test.AppModel;
import com.comp110.instagram.test.AppGUI;

public class Assignment4B {
  
  public static void main(String[] args) {
    AppModel appModel = initAppModel();
    Image image = new Image(512, 512);
    
    // You should place a square selfie in this project's photos/ folder
    // and use it for testing, instead. Just change the name of the
    // file in the String below.
    ImageUtils.loadPhoto(image, "photos/old-well.jpg");
    
    // Or, if you want to work on something simpler than a photo first
    // comment out the loadPhoto line above and uncomment the line below.
    // ImageUtils.checkerboard(image, 8, carolinaBlue, hardenedTar);
    
    appModel.setInput(image);
    AppGUI.run(appModel);
  }
  
  public static AppModel initAppModel() {
    AppModel app = new AppModel();
    
    Effect[] effects = {
// Part 2 - Effects - Uncomment Below to Begin
//        new BorderEffect(carolinaBlue),
//        new BrightnessEffect(),
//        new ColorizeEffect(carolinaBlue),
//        new SaturationEffect(),
//        new ContrastEffect(),
        new InvertEffect(),
    };
    app.setEffects(effects);
    
    Filter[] filters = {
        vintageCarolinaFilter(),
        // Add your own filters here in part 3.2
    };
    app.setFilters(filters);
    
    return app;
  }
  
  private static Filter vintageCarolinaFilter() {
    Filter filter = new Filter("Vintage Carolina");
    filter.addEffect(new SaturationEffect(0.05));
    filter.addEffect(new ColorizeEffect(0.45, carolinaBlue));
    filter.addEffect(new ContrastEffect(0.4));
    filter.addEffect(new BrightnessEffect(0.65));
    filter.addEffect(new BorderEffect(0.07, classyPearl));
    return filter;
  }
  
  private static Color carolinaBlue = new Color(0.482, 0.686, 0.831);
  private static Color hardenedTar = new Color(0.208, 0.208, 0.208);
  private static Color classyPearl = new Color(0.96, 0.96, 0.96);

}