
import javax.swing.*;   
/**  
 *  
 * @author drawen  
 */   
public class Main {   
    /** Creates a new instance of Main */   
    public Main() {   
        MainWindow mainWindow=new MainWindow();   
        java.awt.Dimension screen=java.awt.Toolkit.getDefaultToolkit().getScreenSize();   
        mainWindow.setLocation((screen.width-mainWindow.getWidth())/2,(screen.height-mainWindow.getHeight())/2);   
        mainWindow.setVisible(true);   
    }   
       
    /**  
     * @param args the command line arguments  
     */   
    public static void main(String []args){   
        new Main();   
    }   
       
}   
