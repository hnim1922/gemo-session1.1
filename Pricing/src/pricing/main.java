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
         Breakfast breakfast = new Breakfast("Sandwich","egg");
         Order order = new Order();
         order.addCoffee(coffee);
         order.addBreakfastItem(breakfast);
         
            
            System.out.println(order.Calculate5());
         

    }
}
