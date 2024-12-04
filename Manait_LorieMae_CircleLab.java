/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manait_loriemae_circlelab;

import javax.swing.JOptionPane;

/**
 *
 * @author Abram
 */
public class Manait_LorieMae_CircleLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        boolean loop = true;

        while (loop == true) {
            Circle cir = new Circle();

            String response;
            String response2;
            double radius = 0.0;
            double angle = 0;
            int convert = 0;
            int convert2 = 0;

            // TODO code application logic here
            int opt = JOptionPane.showConfirmDialog(null, "Welcome to circle calculator", "Continue? Selecting 'no' will be redirecting to default results.", JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                String respo = JOptionPane.showInputDialog("Select a specific method"
                        + "\n Calculation                         code"
                        + "\n Area of a Circle                      1 "
                        + "\n Circumference of a cirlce             2 "
                        + "\n Diameter of a Circle                  3 ");
                switch (respo) {
                    case "1":
                        response = JOptionPane.showInputDialog("Input radius");
                        convert = Integer.parseInt(response);
                        JOptionPane.showMessageDialog(null, "Area of a Cirle is " + cir.area(convert));
                        break;
                    case "2":
                        response = JOptionPane.showInputDialog("Input radius");
                        convert = Integer.parseInt(response);
                        JOptionPane.showMessageDialog(null, "The Circumference of a circle is " + cir.circumfer(convert));
                        break;
                    case "3":
                        response = JOptionPane.showInputDialog("Input radius");
                        convert = Integer.parseInt(response);
                        JOptionPane.showMessageDialog(null, "The Diameter of a Cirle is " + cir.diameter(convert));
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Response!");
                }

            } else if (opt == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Default calculations " + "\n when radius is 7, the area of a Circle is " + cir.defarea());
                JOptionPane.showMessageDialog(null, "Default calculations " + "\n when radius is 8,the circumference of a Circle is " + cir.defaultcircumfer());
                JOptionPane.showMessageDialog(null, "Default calculations " + "\n when radius is 6, the diameter of a Circle is " + cir.defdiameter());

                int res = JOptionPane.showConfirmDialog(null, "Do you want to perform another calculation?", "Continue?", JOptionPane.YES_NO_OPTION);

                if (res == JOptionPane.NO_OPTION) {
                    loop = false;
                }
            }

        }

    }
}
    
    

