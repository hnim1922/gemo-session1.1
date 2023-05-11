/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

/**
 *
 * @author AN515
 */
public class Coffee {

    private static String type;
    private static String size;
    private static boolean whippedCream;
    private static int chocolateSauce;
    private static boolean almondMilk;

    public Coffee() {
    }

    public Coffee(String type, String size, boolean whipcream, int chocolateSauce, boolean almondMilk) {
        Coffee.type = type;
        Coffee.size = size;
        Coffee.whippedCream = whipcream;
        Coffee.chocolateSauce = chocolateSauce;
        Coffee.almondMilk = almondMilk;
    }

    public static boolean hasWhippedCream() {
        return whippedCream;
    }

    public static void setWhippedCream(boolean whippedCream) {
        Coffee.whippedCream = whippedCream;
    }

    public static boolean hasAlmondMilk() {
        return almondMilk;
    }

    public static void setAlmondMilk(boolean almondMilk) {
        Coffee.almondMilk = almondMilk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getChocolateSauce() {
        return chocolateSauce;
    }

    public void setChocolateSauce(int chocolateSauce) {
        this.chocolateSauce = chocolateSauce;
    }

    public static double calculatePrice1() {
        double price = 2.0;

        if (type.equalsIgnoreCase("blended")) {
            price += 1.0;
        }
        if ((type.equalsIgnoreCase("cold") || type.equalsIgnoreCase("blended"))) {
            if (size.equals("L")) {
                price += 1.0;
            }
            if (size.equalsIgnoreCase("M")) {
                price += 0.5;
            }
        } else {
            if (!size.equalsIgnoreCase("L")) {
                System.out.println("L size is only available for cold and blended drinks");
            } else if (size.equalsIgnoreCase("M")) {
                price += 0.5;
            }
        }

        if (whippedCream) {
            price += 0.5;
        }
        return price;
    }

    public static double calculatePrice2() {
        double price = 0;

        if (type.equalsIgnoreCase("milk tea")) {
            price = 2.25;
            if (size.equalsIgnoreCase("M")) {
                price += 0.5;
            }
            if (whippedCream) {
                price += 0.5;
            }
        } else if (!type.equalsIgnoreCase("milk tea")) {
            price = calculatePrice1();
        }
        if (almondMilk) {
            price += 0.5;
        }
        return price;
    }

    public static double calculatePrice3() {
        double price = 2.0;
        if (size.equalsIgnoreCase("M")) {
            price += 0.5;
        }
        if (whippedCream) {
            price += 0.5;
        }
        if (chocolateSauce > 0) {

            if (chocolateSauce > 2 && chocolateSauce < 6) {
                price += (chocolateSauce - 2) * 0.5;
            }
            if (chocolateSauce > 6) {
                System.out.println("The maximum amount of pump is 6");
            }
        } else {
            System.out.println("Chocolate Sause only avalable for hot drinks");
        }

        return price;
    }
}
