public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
     
        
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preco=12;
        double imposto=2;
        
        int quantidade = 2;   
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = 0;
        
        // Modify message to include quantity 
        
        System.out.println(message);
        message = custName+" quer comprar 2 "+itemDesc;
        // Print another message with the total cost
        System.out.println(message);
        totalPrice = (preco + imposto)* quantidade;
        System.out.println("o custo total com imposto eh: R$ "+ totalPrice);
         
    }    
}
