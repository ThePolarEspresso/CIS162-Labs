package lab5;

/****************************************************
 * ItemTest - class used to test the Item class (Lab 5)
 *
 * Anna Carvalho
 * 10/01/2020
 ****************************************************/

public class ItemTest
{

    public static void main(String [] args)
    {
        // instantiating an item
        Item item1 = new Item("Item1", "GVSU t-shirt", 29.99, 100);

        // TO DO:  print the item1
        System.out.println(item1);

        // TO DO:  add 3 units to the inventory of item1
        item1.addToInventory(3);

        // TO DO:  Change the price of item1 to a new value //(make up the price)
        item1.setPrice(50.99);

        // TO DO:  print the price of item1
        System.out.println(item1.getPrice());

        // TO DO:  print the item1 
        System.out.println(item1.toString());

        // TO DO:  Create another item with any given values 
        Item item2 = new Item("Item 2", "Cat Mug", 20.00, 100);

        // TO DO:  invoke some of the methods to change the description, code, and inventory
        item2.setDescription("Mug With Cat Ears and Face");
        item2.setItemCode("Item250");
        item2.addToInventory(50);

        // TO DO:  print the item created above.
        System.out.println(item2.toString());

    }    
}  
