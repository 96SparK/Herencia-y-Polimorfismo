package BotaPelota;

import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame
{
    private Lienzo dibujo;
    
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho,alto);
        dibujo = new Lienzo();
        this.add(dibujo); 
        EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
        this.addKeyListener(escuchaTeclado);
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        Timer tiempo = new Timer(1000, escuchaTiempo);
        tiempo.start();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Hola pelota!");
        }
    }
    
    class EscuchadorTeclado implements KeyListener
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyChar() == 'd')
            {
                tiempo.stop();
            }
            else if(e.getKeyChar() == 'i')
            {
                tiempo.start();
            }
            //System.out.println("keyPressed.."+e.getKeyChar());
        }
        
        @Override
        public void keyReleased(KeyEvent e)
        {
            System.out.println("released.."+e.getKeyChar());
        }
        
        @Override
        public void keyTyped(KeyEvent e)
        {
            System.out.println("keyTyped.."+e.getKeyChar());
        }
    }
}
