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
public class main {
        public static void main(String[] args) throws Exception {
        Coffee coffee= new Coffee("Blended", "L", true, 0, false);
         Coffee coffee1= new Coffee("Hot", "M", true, 3, false);
         Coffee coffee2= new Coffee("Cold", "S", true, 0, true);
         Coffee coffee3= new Coffee("Blended", "XL", false, 0, true);
         Breakfast breakfast = new Breakfast("Sandwich","egg");
         Breakfast breakfast1 = new Breakfast("Sandwich","turkey");
         Breakfast breakfast2 = new Breakfast("Bagel","butter");
         Breakfast breakfast3 = new Breakfast("Bagel","Cream Cheese");
         Order order = new Order();
         order.addCoffee(coffee);
         order.addCoffee(coffee1);
         order.addCoffee(coffee2);
         order.addCoffee(coffee3);
         order.addBreakfastItem(breakfast);
         order.addBreakfastItem(breakfast1);
         order.addBreakfastItem(breakfast2);
         order.addBreakfastItem(breakfast3);
//            System.out.println(order.getCoffees());
            System.out.println(order.Calculate5());
         

    }
}
