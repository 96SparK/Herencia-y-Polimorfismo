package BotaPelota;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Lienzo extends JPanel
{
    private Pelota pelota;
    
    public Lienzo()
    {
        pelota = new Pelota(100,100,10);
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        Timer tiempo = new Timer(1000, escuchaTiempo);
        tiempo.start();
        //this.addKeyListener(this);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
}
