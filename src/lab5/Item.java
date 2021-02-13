package lab5; /****************************************************
 * ItemTest - class used to test the Item class (Lab 5)
 *
 * Anna Carvalho
 * 10/01/2020
 ****************************************************/

import java.text.NumberFormat;

public class Item
{

    private String itemCode;
    private String description;
    private double price;
    private int inventory;

    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public Item()
    {

        this.price = 0.0;
        this.inventory = 10;

    }

    public Item(String code, String desc, double cost, int units )
    {
        
        this.itemCode = code;
        this.description = desc;
        this.price = cost;
        this.inventory = units;

    }

    public String getItemCode()
    {
        return this.itemCode;
    }

    public String getDescription()
    {
        return this.description;
    }

    public double getPrice()
    {
        return this.price;
    }

    public int getInventory()
    {
        return this.inventory;
    }

    public void setItemCode( String code )
    {
        this.itemCode = code;
    }

    public void setDescription( String desc )
    {
        this.description = desc;
    }

    public void setPrice( double cost )
    {
        if(cost > 0){
            this.price = cost;
        } else{
            this.price = this.price;
        }
    
    }
    public void setInventory( int units )
    {
        if(units > 0){
            this.inventory = units;
        } else {
            this.inventory = this.inventory;
        }
    
    }
    public void addToInventory( int units )
    {
        if(units > 0){
            this.inventory += units;
        } else {
            this.inventory = this.inventory;
        }
    
    }    
    public void subtractFromInventory( int units )
    {
        if(units > 0){
            this.inventory -= units;
        } else {
            this.inventory = this.inventory;
        }
    
    }
    public String toString( )
    {
        return (
        this.itemCode + "\t" 
        + this.description + "\t" 
        + "$" + price + "\t" 
        + this.inventory
        );
    }
}
