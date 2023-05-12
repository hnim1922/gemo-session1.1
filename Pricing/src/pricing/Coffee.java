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

    private  String type;
    private  String size;
    private  boolean whippedCream;
    private  int chocolateSauce;
    private  boolean almondMilk;

    public Coffee() {
    }

    public Coffee(String type, String size, boolean whippedCream, int chocolateSauce, boolean almondMilk) {
        this.type = type;
        this.size = size;
        this.whippedCream = whippedCream;
        this.chocolateSauce = chocolateSauce;
        this.almondMilk = almondMilk;
    }

    public boolean hasWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public boolean hasAlmondMilk() {
        return almondMilk;
    }

    public void setAlmondMilk(boolean almondMilk) {
        this.almondMilk = almondMilk;
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

    public  double calculatePrice1() {
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
            if (size.equalsIgnoreCase("L")) {
               throw new Error("L size is only available for cold and blended drinks");
            } else if (size.equalsIgnoreCase("M")) {
                price += 0.5;
            }
        }

        if (whippedCream) {
            price += 0.5;
        }
        return price;
    }

    public  double calculatePrice2() {
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

    public  double calculatePrice3() {
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
