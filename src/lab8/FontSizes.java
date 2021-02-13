package lab8;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Font;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;


// import java.awt.Color;
// class CheckBoxIcon implements Icon {
//     public void paintIcon(Component component, Graphics g, int x, int y) {
//         AbstractButton abstractButton = (AbstractButton)component;
//         ButtonModel buttonModel = abstractButton.getModel();
// 
//         if(buttonModel.isSelected()) 
//             g.drawImage(createImage("resources/checkbox2.png"), x, y, component);
//         else
//             g.drawImage(createImage("resources/checkbox1.png"), x, y, component);
//     }
//     public int getIconWidth() {
//         return 13;
//     }
//     public int getIconHeight() {
//         return 13;
//     }
// 
//     protected Image createImage(String path) {
//         URL imageURL = CheckBoxIcon.class.getResource(path);
//         Image icn = null;
// 
//         if (imageURL == null) {
//             if(null==icn){
//                 //System.out.println("path: "+path);
//                 icn = new ImageIcon (MyGUI.class.getResource(path)).getImage();
//                 if(null!=icn)
//                     return icn;
//                 else{ 
//                     System.err.println("Resource not found: " + path);
//                     return null;
//                 }
//             }
//             return null;
//         } else {
//             return (new ImageIcon(imageURL)).getImage();
//         }
//     }
// }

public class FontSizes
{

    public static void resetFontSizes( int size )
    {

        UIManager.put( "OptionPane.messageFont", new Font( "Calibri", Font.PLAIN, size ) );
        UIManager.put( "OptionPane.buttonFont",  new Font( "Calibri", Font.PLAIN, size ) );     
        UIManager.put( "TextField.font",         new Font( "Calibri", Font.PLAIN, size ) );  
//         UIManager.put( "CheckBox.icon",          new CheckBoxIcon());
        
        UIManager.put( "List.font",              new Font( "Calibri", Font.PLAIN, size ) );  
        UIManager.put( "Label.font",             new Font( "Calibri", Font.PLAIN, size ) );  
        UIManager.put( "ComboBox.font",          new Font( "Calibri", Font.PLAIN, size ) );  
        UIManager.put( "Button.font",            new Font( "Calibri", Font.PLAIN, size ) );  
        UIManager.put( "TableHeader.font",       new Font( "Calibri", Font.PLAIN, size ) );  
        UIManager.put( "Table.font",             new Font( "Calibri", Font.PLAIN, size ) );  
        UIManager.put( "ToggleButton.font",      new Font( "Calibri", Font.PLAIN, size ) );  

    }

    public static void resetButtonFontSize( int size )
    {
        UIManager.put( "Button.font", new Font( "Calibri", Font.PLAIN, size ) );     
    }  
}
