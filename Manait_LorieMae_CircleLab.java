/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manait_loriemae_circlelab;

import javax.swing.JOptionPane;

/**
 *
 * @lorie
 */
public class Manait_LorieMae_CircleLab {

    public static void main(String[] args) {

        boolean loop = true;
        while (loop == true) {
            int opt = JOptionPane.showConfirmDialog(null, "Welcome to circle calculator, \nContinue? Selecting 'no' will be redirecting to default results.", "Circle Calculator", JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                String input = JOptionPane.showInputDialog("Enter the radius for circle:");
                double userRadius = Double.parseDouble(input);
                Circle customCircle = new Circle(userRadius);
                JOptionPane.showMessageDialog(null, "\nCustom Circle:" + "\nArea: " + customCircle.area() + "\nCircumference: " + customCircle.circumference());
                int respo = JOptionPane.showConfirmDialog(null, "Do you want to perform another calculation?", "Continue?", JOptionPane.YES_NO_OPTION);
                if (respo == JOptionPane.NO_OPTION) {
                    loop = false;
                }
            } else if (opt == JOptionPane.NO_OPTION) {
                Circle defaultCircle = new Circle();
                JOptionPane.showMessageDialog(null, "Default Circle: with an 8.5 value" + "\n Area: " + defaultCircle.area() + "\n Circumference: " + defaultCircle.circumference());
                int[] radii = {5, 4, 6, 7, 2, 4};
                for (int i = 0; i < radii.length; i++) {
                    JOptionPane.showMessageDialog(null, "Default Circle: with a radius of " + radii[i] + "\n Area: " + defaultCircle.arearadii(radii[i]) + "\n Circumference: " + defaultCircle.circumradii(radii[i]));
                }
                int res = JOptionPane.showConfirmDialog(null, "Would you like to perform another calculation?", "Continue?", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.NO_OPTION) {
                    loop = false;
                }

            }
        }
    }
}
