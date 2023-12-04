// version 1.0.1
import java.util.ArrayList;
import java.util.Scanner;

//product class
class Product{
    //attributes
    String productName;
    Double price;


    //no arg constructor
    Product(){
        productName = null;
        price = null;
    }

    //2 arg constructor
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
        Boolean x = true;

        ArrayList<Product> menu = new ArrayList<Product>();
        while(x == true){
            System.out.println("Choose one:\n1.Add to Grocery list at any" +
            " given index\n2.Remove from Grocery at any given index\n" +
            "3.Display the grocery List\n4.Show the current total of all the" +
            " Products in the Grocery List\n5.quit the program");
            Integer option = in.nextInt();

            if (option == 1){   
                Add(menu);
            }
            else if(option == 2){
                Remove(menu);
            }
            else if(option == 3){
                Display(menu);
            }
            else if(option== 4){
                Total(menu);
            }
            else if(option == 5){
                x = false;
            }
            else{
                System.out.println("Give correct number");
            }
        }
    }

    //@params:takes in ArrayList menu
    //returns:none, void
    //Adds an element to the menu ArrayList
    public static void Add(ArrayList<Product> menu){
        Scanner in = new Scanner(System.in);
        Product newProduct = new Product();
        Boolean compare = false;

        System.out.println("What product you like to add?");
        String choice1 = in.nextLine();
        System.out.println("How much is it?");
        Double choice2 = in.nextDouble();
        int index = 0;
        for(int i = 0; i < menu.size(); i++){
            if(choice1.equals(menu.get(i).productName)){
                compare = true;
            }
            else{
                compare = false;
            }
        }
        if(choice1.length() > 40){
            System.out.println("Inputs cannot be greater tha 40 characters in" +
                                 " length");
        }
        else if(compare == true){
            System.out.println("Inputs cannot be duplicate items");
        }
        else{
            newProduct.productName = choice1;
            newProduct.price = choice2;
            System.out.println("What index would you like to add to?");
            index = in.nextInt();
            menu.add(index, newProduct);
        }
    }
    //@params:takes in ArrayList menu
    //returns:none, void
    //removes any element in the menu ArrayList, by index
    public static void Remove(ArrayList<Product> menu){
        Scanner in = new Scanner(System.in);
        Product newProduct = new Product();

        System.out.println("What index would you like to remove?");
        int delete = in.nextInt();
        menu.remove(delete);
    }
    //@params:takes in ArrayList menu
    //returns:none, void
    //prints the menu ArrayList
    public static void Display(ArrayList<Product> menu){
        for(int i = 0; i < menu.size(); i++){
                String out = String.format("\nProduct Name: %s\nPrice: %.2f\n" +
                                            "Index: %d",
                                menu.get(i).productName, menu.get(i).price, i);
                System.out.println(out);
            
        }
    }
    //@params:takes in ArrayList menu
    //returns:none, void
    //prints the total price of the menu
    public static void Total(ArrayList<Product> menu){
        double total = 0;
        for(int i = 0; i < menu.size(); i++){
            total += menu.get(i).price;
        }
        System.out.println("$" + total);
    }
}