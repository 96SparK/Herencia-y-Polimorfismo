package BotaPelota;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.LinkedList;

public class Lienzo extends JPanel // implements KeyListener
{
    private LinkedList<Pelota> pelotas;
    
    public Lienzo()
    {
        pelotas = new LinkedList<Pelota>();
        pelotas.add(new Pelota(100, 100, 10));
        EscuchadorRaton escuchaRaton = new EscuchadorRaton();
        this.addMouseListener(escuchaRaton);
    }
    
    public void actua()
    {
        for(Pelota p: pelotas)
        {
            p.muevete(this.getBounds());
            this.repaint();
        }
        
    }    
    
    @Override
    public void paintComponent(Graphics g)
    {
        //borra el panel para dibujar pelotas en nuevas posiciones
        super.paintComponent(g);        
        for(Pelota p: pelotas)
        {
            p.dibujate(g);
        }
    }
    
    class EscuchadorRaton extends MouseAdapter
    {
         @Override
         public void mouseClicked(MouseEvent me)
         {
             //obtener un numero aleatorio de 10 a 30
             int tamRandom = 10 + (int)(Math.random()*20);
             System.out.println(me.getX() + " , " + me.getY());
             Pelota pelotaNueva = new Pelota(me.getX(), me.getY(), tamRandom);
             pelotas.add(pelotaNueva);
         }
    }
}
