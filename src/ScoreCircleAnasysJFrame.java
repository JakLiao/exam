
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;   
import javax.swing.*;   
import java.awt.*;   
import java.util.*;   
/*  
 *  
 * @author drawen  
 */   
public class ScoreCircleAnasysJFrame extends JFrame{   
    private ScoreMenu scoreMenu;   
    /** Creates a new instance of ScoreCircleAnasys */   
    public ScoreCircleAnasysJFrame(ScoreMenu scoreMenu) {   
        this.setTitle("�ɼ�����״ͼ");   
        this.scoreMenu=scoreMenu;   
        JPanel right=new JPanel(new GridLayout(3,1));   
        right.add(new JLabel(""));   
        right.add(new TipJPanel());   
        right.add(new JLabel(""));   
        add(right,BorderLayout.EAST);   
        add(new CircleTypeJPanel());   
    }   
    class CircleTypeJPanel extends JPanel{   
        CircleTypeJPanel(){   
            this.repaint();   
        }   
 //           int[] colors={Color.BLUE,Color.PINK,Color.YELLOW,Color.GREEN,Color.RED};           
        protected void paintComponent(Graphics g){   
            super.paintComponent(g);   
            int centerX=this.getWidth()/2;   
            int centerY=this.getHeight()/2;   
            int radius=Math.min(this.getHeight(),this.getWidth())/4*3;   
            int x=centerX-radius/2;   
            int y=centerY-radius/2;   
            int []score=scoreMenu.getAnasisOfScore();   
            int number=scoreMenu.getNumberOfAttendTestStudent();   
            int[] degree=new int[5];   
            for(int i=0;i<5;i++){   
                degree[i]=(int)Math.toDegrees(2*Math.PI*score[i]/number);   
            }   
            g.setColor(Color.BLUE);   
            g.fillArc(x,y,radius,radius,0,degree[0]);   
            g.setColor(Color.PINK);   
            g.fillArc(x,y,radius,radius,degree[0],degree[1]);   
            g.setColor(Color.YELLOW);   
            g.fillArc(x,y,radius,radius,degree[0]+degree[1],degree[2]);   
            g.setColor(Color.GREEN);   
            g.fillArc(x,y,radius,radius,degree[0]+degree[1]+degree[2],degree[3]);   
            g.setColor(Color.RED);   
            g.fillArc(x,y,radius,radius,degree[0]+degree[1]+degree[2]+degree[3],degree[4]);   
        }   
    }   
    class TipJPanel extends JPanel{   
        TipJPanel(){   
            setLayout(new GridLayout(5,3));   
            int[] score=scoreMenu.getAnasisOfScore();   
            int number=scoreMenu.getNumberOfAttendTestStudent();   
            Color[] colors={Color.BLUE,Color.PINK,Color.YELLOW,Color.GREEN,Color.RED};           
            String[] text={"<60��","60-69��","70-79��","80-89��",">=90��"};   
            JButton button;   
            for(int i=0;i<5;i++){   
                button=new JButton("  ");   
                button.setEnabled(false);   
                button.setBackground(colors[i]);   
                add(button);   
                add(new JLabel(text[i]));   
                add(new JLabel((int)(score[i]*100.0/number)+"%"));   
            }   
        }   
    }   
}   