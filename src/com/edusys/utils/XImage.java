
package com.edusys.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class XImage {
  public static Image getAppIcon()
  {
      URL url = XImage.class.getResource("/com/edusys/icon/logo.jpg");
      return new ImageIcon(url).getImage();
  }
  public static boolean save(File src){
     File dst = new File ("src\\com\\edusys\\icon",src.getName());
     if(!dst.getParentFile().exists()){
         dst.getParentFile().mkdirs();
     }
      try {
          Path from=Paths.get(src.getAbsolutePath());
          Path to = Paths.get(dst.getAbsolutePath());
          Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);
          return true;
      } catch (Exception e) {
          return false;
      }
  }
  public static ImageIcon read(String FileName){
      File path = new File("src\\com\\edusys\\icon",FileName);
      return new ImageIcon(path.getAbsolutePath());
  }
  public static Image resize(Image originalImage, int targetWidth, int targetHeight) {
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);
        return resultingImage;
    }
}
