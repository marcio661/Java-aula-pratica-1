/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaula;

/**
 *
 * @author AlunoBCC
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
public class Janela extends JFrame implements KeyListener{

    Desenha desenha = new Desenha(10,10);
    public Janela() {
        this.add(desenha);
        this.addKeyListener(this);
        this.setTitle("Primeiro gráfico");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
       
    }     

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT);
        desenha.setRight();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }
        
        
        
}
    