package sbt.jrakhm.proxy;

import javax.swing.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author rassoll
 * @created 19.09.2017
 * @$Author$
 * @$Revision$
 */
public class ImageProxyTestDrive
{
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws  Exception
    {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws  Exception
    {
        cds.put("Amy Macdonald: Under Stars", "https://avatars.yandex.net/get-music-content/175191/4791e753.a.4124323-1/m1000x1000");
        cds.put("Amy Macdonald: A Curious Thing", "https://avatars.yandex.net/get-music-content/32236/6ca527aa.a.2488278-1/m1000x1000");
        cds.put("Amy Macdonald: Life in a Beautiful Light", "https://avatars.yandex.net/get-music-content/63210/871b47ab.a.4418772-1/m1000x1000");
        cds.put("Amy Macdonald: This Is The Life", "https://avatars.yandex.net/get-music-content/193823/e13593a9.a.4419349-1/m1000x1000");

        URL initialURL = new URL((String)cds.get("Amy Macdonald: Under Stars"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements();)
        {
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener((ActionEvent event) -> imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand()))));
            frame.repaint();
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }

    private URL getCDUrl(String name)
    {
        try
        {
            return new URL((String)cds.get(name));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
