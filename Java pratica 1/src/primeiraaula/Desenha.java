/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaula;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
/**
 *
 * @author AlunoBCC
 */
public class Desenha extends JComponent {
    private int px,py;
    
    public Desenha(int px, int py){
        this.px=px;
        this.py=py;
    }
    
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.blue);
        g.fillOval(px,py,90,60);

    }
    public void setRight(){
    px+=10;
    repaint();
    }
}


