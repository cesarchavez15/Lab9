// version 1.0.1
import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String productName;
    Double price;

    Product(){
        productName = "Lays";
        price = 3.50;
    }

    Product(String productName, Double price){
        this.productName = productName;
        this.price = price;
    }

    public String getProductName(){return this.productName;}
    public Double getPrice(){return this.price;}
}

class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Product> menu = new ArrayList<Product>();
        while(true){
            System.out.println("Choose one:\n1.Add to Grocery list at" + 
            "any given index\n2.Remove from Grocery at any given index\n" +
            "3.Display the grocery List\n4.Show the current total of all the" +
            "in the Grocery List\n5.quit the program");
        }
    }
}