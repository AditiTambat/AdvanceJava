package com.phonehub.phonehub_backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonehub.phonehub_backend.Entity.CartItem;
import com.phonehub.phonehub_backend.Service.CartItemService;

@RestController
@RequestMapping("/cartcontroller")
public class CartController {
	
	@Autowired
	private CartItemService service;
	
	
	@PostMapping("/addtocart")
	public CartItem addPhone(@RequestBody CartItem cart) throws Exception {
	     return service.addCartDetails(cart);		
	}
	
	
	@GetMapping("/getallcart")
	public List<CartItem> getAllCart() throws Exception{
		return service.getAllCartDetails();
	}

}
