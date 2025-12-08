package com.phonehub.phonehub_backend.Dto;

public class CartDto {
	
	 private Integer userId;
	 private Integer phoneId;
	 private Integer quantity;
	 public Integer getUserId() {
		 return userId;
	 }
	 public void setUserId(Integer userId) {
		 this.userId = userId;
	 }
	 public Integer getPhoneId() {
		 return phoneId;
	 }
	 public void setPhoneId(Integer phoneId) {
		 this.phoneId = phoneId;
	 }
	 public Integer getQuantity() {
		 return quantity;
	 }
	 public void setQuantity(Integer quantity) {
		 this.quantity = quantity;
	 }
	 
	 


}
