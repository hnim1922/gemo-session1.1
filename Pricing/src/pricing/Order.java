/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import java.util.ArrayList;

/**
 *
 * @author AN515
 */
public class Order {

    private ArrayList<Coffee> coffees;
    private ArrayList<Breakfast> breakfastItems;

    public Order() {
        coffees = new ArrayList<>();
        breakfastItems = new ArrayList<>();
    }

    public void addCoffee(Coffee coffee) {
        coffees.add(coffee);
    }

    public void addBreakfastItem(Breakfast breakfast) {
        breakfastItems.add(breakfast);
    }

    public ArrayList<Coffee> getCoffees() {
        return coffees;
    }

    public ArrayList<Breakfast> getBreakfastItems() {
        return breakfastItems;
    }

    public String Calculate5() throws Exception {
        double totalPrice = 0.0;

        for (Coffee coffee : coffees) {
            if (coffee.getType().equalsIgnoreCase("hot")) {
                if (coffee.getSize().equalsIgnoreCase("L") || coffee.getSize().equalsIgnoreCase("XL")) {
                    throw new Exception("M or S for hot");
                } else {
                    totalPrice = coffee.calculatePrice3();
                }
            } else {
                totalPrice = coffee.calculatePrice2();
            }
        }
        for (Breakfast breakfast : breakfastItems) {
            totalPrice += breakfast.calculatePrice4();
        }
        totalPrice *= 1.0725;

        String breakdown = "";

        for (Coffee coffee : coffees) {
            breakdown += "Coffee: ";
            breakdown += coffee.getType() + " ";
            breakdown += "size " + coffee.getSize() + " ";

            if (coffee.hasWhippedCream()) {
                breakdown += "with whipped cream ";
            }
            if (coffee.hasAlmondMilk()) {
                breakdown += "with almond milk ";
            }

            if (coffee.getType().equalsIgnoreCase("hot") && coffee.getChocolateSauce() > 0) {
                breakdown += "and" + coffee.getChocolateSauce() + " pumps of chocolate sauce";
            }
            breakdown += "\n";

            switch (coffee.getType().toLowerCase()) {
                case "hot":
                    breakdown += "$2 for Hot\n";
                    break;
                case "cold":
                    breakdown += "$2 for Cold\n";
                    break;
                case "blended":
                    breakdown += "$3 for Blended\n";

                    break;
            }
            switch (coffee.getSize().toUpperCase()) {
                case "S":
                    breakdown += "$0 for size S\n";
                    break;
                case "M":
                    breakdown += "$0.5 for size M\n";
                    break;
                case "L":
                    breakdown += "$1 for L size \n";
                    break;
                case "XL":
                    breakdown += "$1.5 for size XL\n";
                    break;
            }
            if (coffee.hasWhippedCream()) {
                breakdown += "$0.50 for whipped cream\n";
            }
            if (coffee.hasAlmondMilk()) {
                breakdown += "$0.50 for almond milk ";
            }
            if (coffee.getType().equalsIgnoreCase("hot") && coffee.getChocolateSauce() > 0) {
                double chocolateSaucePrice = Math.min(2, Math.max(0, coffee.getChocolateSauce() - 2)) * 0.5;
                breakdown += String.format("+ $" + chocolateSaucePrice + " for " + coffee.getChocolateSauce() + " pumps of chocolate sauce\n");
            }
        }
        for (Breakfast breakfast : breakfastItems) {
            breakdown += "Breakfast item: ";
            if (breakfast.getItemType().equalsIgnoreCase("Sandwich")) {
                breakdown += " sandwich ";
                if (breakfast.getTopping().equalsIgnoreCase("Egg")) {
                    breakdown += "with egg ";
                } else if (breakfast.getTopping().equalsIgnoreCase("Turkey")) {
                    breakdown += "with turkey ";
                }
            } else if (breakfast.getItemType().equalsIgnoreCase("Bagel")) {
                breakdown += "Bagel with ";
                if (breakfast.getTopping().equalsIgnoreCase("Butter")) {
                    breakdown += "butter ";
                } else if (breakfast.getTopping().equalsIgnoreCase("Cream Cheese")) {
                    breakdown += "cream cheese ";
                }
            }
            breakdown += "\n";
            switch (breakfast.getItemType().toLowerCase()) {
                case ("sandwich"):
                    breakdown += "$3 for Sandwich\n";
                    break;
                case ("bagel"):
                    breakdown += "$3 for Bagel\n";
                    break;
            }
            switch (breakfast.getTopping().toLowerCase()) {
                case ("egg"):
                    breakdown += "$1 for Egg\n";
                    break;
                case ("turkey"):
                    breakdown += "$1 for Turkey\n";
                    break;
                case ("butter"):
                    breakdown += "$0.5 for Butter\n";
                    break;
                case ("cream cheese"):
                    breakdown += "$0.5 for Cream Cheese\n";
                    break;
            }
        }

        breakdown += String.format("\nTotal price: $%.2f", totalPrice);
        return breakdown;
    }
}
