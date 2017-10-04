package sbt.jrakhm.proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author rassoll
 * @created 19.09.2017
 * @$Author$
 * @$Revision$
 */
public class ImageProxy implements Icon
{
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL)
    {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        if (imageIcon != null)
        {
            imageIcon.paintIcon(c,g,x,y);
        }
        else
        {
            g.drawString("Loading CD Cover, please wait...", x + 300, y + 190);
            if (!retrieving)
            {
                retrieving = true;
                retrievalThread = new Thread(() ->
                {
                    try
                    {
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        c.repaint();
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth()
    {
        if (imageIcon != null)
        {
            return imageIcon.getIconWidth();
        }
        else
        {
            return 1000;
        }
    }

    @Override
    public int getIconHeight()
    {
        if (imageIcon != null)
        {
            return imageIcon.getIconHeight();
        }
        else
        {
            return 1000;
        }
    }
}
