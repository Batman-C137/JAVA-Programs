package onlineshoppingproject.onlineshoppingapp;

import java.util.*;

public class Cart {
	private User user;
	List<Product> productList;
	private float total_amount;
	private boolean Status;
	private boolean ConfirmOrder;
	
	public Cart() {}

	public Cart(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public boolean isConfirmOrder() {
		return ConfirmOrder;
	}

	public void setConfirmOrder(boolean confirmOrder) {
		ConfirmOrder = confirmOrder;
	}
	
}
