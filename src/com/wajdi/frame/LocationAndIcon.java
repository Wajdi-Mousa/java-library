/**
 * LocationAndIcon class one of classes in this package ,
 * to manage JFrame shape and centralize it in the screen.
 * Version : 0.1
 * Author : Wajdi Yousif Hassan Mousa.
 * Last modified date : 04/14/2017.
 */
package com.wajdi.frame;

import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LocationAndIcon {

    /**
     * Instance var use in drag and press method.
     */
    static int xMouse;
    static int yMouse;

    /**
     * Open decorated JFrame.
     *
     * @param a : JFrame variable.
     * @param title : Title of JFrame.
     * @param onTop : OnTop JFrame state.
     * @param imageName : JFrame icon.
     */
    public static void openFormWithDecoration(JFrame a, String title, int onTop, String imageName) {
        try {
            switch (onTop) {
                case 1:
                    a.setAlwaysOnTop(true);
                    break;
                case 2:
                    a.setAlwaysOnTop(false);
                    break;
                default:
                    a.setAlwaysOnTop(false);
            }
            a.setTitle(title);
            a.setLocationRelativeTo(null);
            Image img = ImageIO.read(LocationAndIcon.class.getResource(imageName));
            a.setIconImage(img);
            a.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * Open decorated JFrame with specific size.
     *
     * @param a : JFrame variable.
     * @param title : Title of JFrame.
     * @param onTop : OnTop JFrame state.
     * @param imageName : JFrame icon.
     * @param height : JFrame height.
     * @param width : JFrame width.
     */
    public static void openFormWithDecoration(JFrame a, String title, int onTop, String imageName, int height, int width) {
        try {
            switch (onTop) {
                case 1:
                    a.setAlwaysOnTop(true);
                    break;
                case 2:
                    a.setAlwaysOnTop(false);
                    break;
                default:
                    a.setAlwaysOnTop(false);
            }
            a.setTitle(title);
            a.setLocationRelativeTo(null);
            a.setSize(width, height);
            Image img = ImageIO.read(LocationAndIcon.class.getResource(imageName));
            a.setIconImage(img);
            a.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * Open undecorated JFrame.
     *
     * @param a : JFrame variable.
     * @param onTop : OnTop JFrame state.
     * @param imageName : JFrame icon.
     */
    public static void openFormWithOutDecoration(JFrame a, int onTop, String imageName) {
        try {
            switch (onTop) {
                case 1:
                    a.setAlwaysOnTop(true);
                    break;
                case 2:
                    a.setAlwaysOnTop(false);
                    break;
                default:
                    a.setAlwaysOnTop(false);
            }
            a.setLocationRelativeTo(null);
            a.dispose();
            a.setUndecorated(true);
            Image img = ImageIO.read(LocationAndIcon.class.getResource(imageName));
            a.setIconImage(img);
            a.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * Open undecorated JFrame with specific size.
     *
     * @param a : JFrame variable.
     * @param onTop : OnTop JFrame state.
     * @param imageName : JFrame icon.
     * @param height : JFrame height.
     * @param width : JFrame width.
     */
    public static void openFormWithOutDecoration(JFrame a, int onTop, String imageName, int width, int height) {
        try {
            switch (onTop) {
                case 1:
                    a.setAlwaysOnTop(true);
                    break;
                case 2:
                    a.setAlwaysOnTop(false);
                    break;
                default:
                    a.setAlwaysOnTop(false);
            }
            Image img = ImageIO.read(LocationAndIcon.class.getResource(imageName));
            a.setIconImage(img);
            a.setLocationRelativeTo(null);
            a.setSize(width, height);
            a.dispose();
            a.setUndecorated(true);

            a.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * To move undecorated JFrame , this method placed in drag mouse event.
     *
     * @param a : JFrame that use this method.
     * @param evt : mouse event.
     */
    public static void mouseDrag(JFrame a, MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        a.setLocation(x - xMouse, y - yMouse);
    }

    /**
     * To move undecorated JFrame , this method placed in press mouse event.
     *
     * @param evt : mouse event.
     */
    public static void mousePress(MouseEvent evt) {
        xMouse = evt.getX();
        yMouse = evt.getY();
    }

}
