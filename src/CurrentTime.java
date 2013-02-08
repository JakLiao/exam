
import java.awt.Graphics;   
import javax.swing.*;   
import java.awt.*;   
import java.awt.event.*;   
/**  
 *显示当前时间类  
 * @author drawen  
 */   
public class CurrentTime extends JFrame {   
    Clock clock=new Clock();   
    JLabel text=new JLabel();   
    /** Creates a new instance of CurrentTime */   
    public CurrentTime(String string) {   
        super(string);   
        JPanel jpanel=new JPanel(new GridLayout(0,5));   
        jpanel.add(new JLabel());   
        jpanel.add(new JLabel());   
        jpanel.add(text);           
        new Thread(clock).start();   
        add(jpanel,BorderLayout.NORTH);   
        add(clock,BorderLayout.CENTER);           
    }   
    class Clock extends JPanel implements Runnable{   
        private int hour,minute,second;   
        Clock(){   
            getCurrentTime();   
            repaint();   
        }   
        public void run(){   
            while(true){   
                try{                       
                    clock.updateTime();   
                    text.setText((clock.hour>12?"下午":"上午")+clock.hour%12+":"+clock.minute+":"+clock.second);   
                    Thread.sleep(1000);   
                }catch(InterruptedException e){}   
            }   
        }   
        public void getCurrentTime(){   
            long intervals=(System.currentTimeMillis())/1000;   
            second=(int)intervals%60;   
            intervals/=60;   
            minute=(int)intervals%60;   
            intervals/=60;   
            hour=(int)(intervals+8)%24;        
        }           
        protected void paintComponent(Graphics g){   
            super.paintComponent(g);   
            int x,y,rudius;   
            x=getWidth()/2;   
            y=getHeight()/2;   
            g.fillOval(x-5,y-5,10,10);   
            rudius=(int)(Math.min(x,y)*0.8);   
            g.drawOval(x-rudius,y-rudius,2*rudius,2*rudius);   
            g.drawString("12",x-5,y-rudius+15);   
            g.drawString("6",x-3,y+rudius-5);   
            g.drawString("3",x+rudius-10,y+5);   
            g.drawString("9",x-rudius+5,y+5);   
           
            int mLength=(int)(rudius*0.6);   
            g.drawLine(x,y,x+(int)(Math.sin(Math.PI/30*(minute+second/60.0))*mLength),   
                y-(int)(Math.cos(Math.PI/30*minute)*mLength));   
           
            int hLength=(int)(rudius*0.4);   
            g.drawLine(x,y,x+(int)(Math.sin(Math.PI/6*(hour%12+minute/60.0))*hLength),   
                y-(int)(Math.cos(Math.PI/6*(hour%12+minute/60.0))*hLength));   
           
            int sLength=(int)(rudius*0.8);   
            g.drawLine(x,y,x+(int)(Math.sin(Math.PI/30*second)*sLength),   
                y-(int)(Math.cos(Math.PI/30*second)*sLength));           
        }      
        public void updateTime(){   
            getCurrentTime();   
            repaint();   
        }   
    }   
}   
