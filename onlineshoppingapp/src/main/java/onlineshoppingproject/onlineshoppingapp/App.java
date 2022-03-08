package onlineshoppingproject.onlineshoppingapp;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("shopping.xml");
    	 
    	User user = context.getBean("user",User.class);
    	System.out.println("User-Name       : " +user.getUserName());
    	System.out.println("Email Id        : "+user.getEmail());
    	System.out.println("Password        : "+user.getPassword());
    	System.out.println("Shipping Address: "+user.getShipping_address());
    	System.out.println("Billing Address : "+user.getBilling_address());
    	System.out.println("************************************************************************************");
    	
    	Product product = context.getBean("product",Product.class);
    	System.out.println("Product Name     : "+product.getProduct_name());
    	System.out.println("Price            : "+product.getPrice());
    	System.out.println("Quantity In Stock: "+product.getQuantity_in_stock());
    	System.out.println("Image Location   : "+product.getImagelocation());
    	System.out.println("************************************************************************************");
    	
    	Order order = context.getBean("order",Order.class);
    	List<Cart> cart = order.getCartList();
    	for(Cart ca:cart) {
    	System.out.println("User: "+ca.getUser().getUserName());
    	System.out.println("Email Id: "+ca.getUser().getEmail());
    	System.out.println("Password: "+ca.getUser().getPassword());
    	System.out.println("Shipping Address: "+ca.getUser().getShipping_address());
    	System.out.println("Billing Address: "+ca.getUser().getBilling_address());
    	
    	List<Product> productList = ca.getProductList();
        for(Product p:productList) {
        	 System.out.println("----------------------------------------------------------------------------");
        	 System.out.println(p.getProduct_name());
        	 System.out.println(p.getPrice());
        	 System.out.println(p.getQuantity_in_stock());
        	 System.out.println(p.getImagelocation());
        	 
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Total Amount: "+ ca.getTotal_amount());
        System.out.println("Status: "+ca.isStatus());
        System.out.println("Confirm Order: "+ca.isConfirmOrder());
    	System.out.println("************************************************************************************");
    	}
    }
}
