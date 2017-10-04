package sbt.jrakhm.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * @author rassoll
 * @created 19.09.2017
 * @$Author$
 * @$Revision$
 */
public class ImageComponent extends JComponent
{
    private Icon icon;

    public ImageComponent(Icon icon)
    {
        this.icon = icon;
    }

    public void setIcon(Icon icon)
    {
        this.icon = icon;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (1000 - w)/2;
        int y = (1000 - h)/2;
        icon.paintIcon(this,g,x,y);
    }
}
