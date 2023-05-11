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
public class Breakfast {

    private String itemType;
    private String topping;

    public Breakfast(String itemType, String topping) {
        this.itemType = itemType;
        this.topping = topping;
    }

    public Breakfast() {
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public double calculatePrice4() {
        double price = 3;
        if (itemType.equalsIgnoreCase("Sandwich")) {
            if (!topping.equalsIgnoreCase("Egg") && !topping.equalsIgnoreCase("Turkey")) {
                System.out.println("Sandwich can only go with egg or turkey");
            } else {
                price += 1;
            }
        } else if(itemType.equalsIgnoreCase("Bagels")){
             if (!topping.equalsIgnoreCase("Butter") && !topping.equalsIgnoreCase("Cream Cheese")) {
                System.out.println("Bagels  can only go with Butter or Cream Cheese");
            } else {
                price += 0.5;
            }
        }
        return price;
    }
}
