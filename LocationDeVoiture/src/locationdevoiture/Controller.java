/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationdevoiture;

import javax.swing.JPanel;

/**
 *
 * @author Julien
 */
public class Controller {
    
    public static void connection(JPanel present, JPanel next)
    {
        present.setVisible(false);
        next.setVisible(true);
    }
    
    public static void location(JPanel present, JPanel next)
    {
        present.setVisible(false);
        next.setVisible(true);
    }
    
    public static void retourLocation(JPanel present, JPanel next)
    {
        present.setVisible(false);
        next.setVisible(true);
    }
    
    public static void deconnection(JPanel present, JPanel next)
    {
        present.setVisible(false);
        next.setVisible(true);
    }
    
    public static void retourAcceuil(JPanel present, JPanel next)
    {
        present.setVisible(false);
        next.setVisible(true);
    }
    
    public static void confirmationLocation(JPanel present, JPanel next)
    {
        present.setVisible(false);
        next.setVisible(true);
    }
    
    public static void confirmationRetour(JPanel present, JPanel next)
    {
        present.setVisible(false);
        next.setVisible(true);
    }
}
