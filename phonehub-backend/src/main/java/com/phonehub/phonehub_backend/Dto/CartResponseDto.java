package com.phonehub.phonehub_backend.Dto;

public class CartResponseDto {
	
	 private int cartItemId;
	 private int phoneId;
	 private String phoneName;
	 private Double price;
	 private Integer quantity;
	 
	 
	 public int getCartItemId() {
		 return cartItemId;
	 }
	 public void setCartItemId(int cartItemId) {
		 this.cartItemId = cartItemId;
	 }
	 public int getPhoneId() {
		 return phoneId;
	 }
	 public void setPhoneId(int phoneId) {
		 this.phoneId = phoneId;
	 }
	 public String getPhoneName() {
		 return phoneName;
	 }
	 public void setPhoneName(String phoneName) {
		 this.phoneName = phoneName;
	 }
	 public Double getPrice() {
		 return price;
	 }
	 public void setPrice(Double price) {
		 this.price = price;
	 }
	 public Integer getQuantity() {
		 return quantity;
	 }
	 public void setQuantity(Integer quantity) {
		 this.quantity = quantity;
	 }

	 
	 
}
