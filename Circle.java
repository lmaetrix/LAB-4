/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manait_loriemae_circlelab;

/**
 *
 * @author Abram
 */
class Circle {
  
    //codes for default
    public double defarea() {
        double area = 0.0;

        double getarea = Math.PI * Math.pow(7, 2);
        area += getarea;

        return area;
    }

    public double defaultcircumfer() {
        double circum = 0;
        double cir = 2 * Math.PI * 8;
        circum += cir;

        return circum;
    }

    public double defdiameter() {
        double defdiameter = 00.00;

        double getdiameter = 6 * 2;
        defdiameter += getdiameter;

        return defdiameter;
    }
    // Code for the user-end//

    public double area(double rad) {
        double area = 0.0;
        double getarea = Math.PI * Math.pow(rad, 2);
        area += getarea;
        return area;
    }

    public double circumfer(double radius) {
        double circum = 0;
        double res = 2 * Math.PI * radius;
        circum += res;
        return circum;
    }

    public double diameter(double radius) {
        double diameter = 00.00;
        double getdiameter = 2 * radius;
        diameter += getdiameter;
        return diameter;
    }
}

