package com.phonehub.phonehub_backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonehub.phonehub_backend.Entity.CartItem;
import com.phonehub.phonehub_backend.Repository.CartItemRepos;

@Service
public class CartItemService {
	
	@Autowired
	private CartItemRepos repo;
	
	public CartItem addCartDetails(CartItem cart) throws Exception{
			
			if(cart==null){
				throw  new Exception ("Invalid User");
			}
			CartItem cartdata =   repo.save(cart);
			return cartdata;
			   
	}

	public List<CartItem> getAllCartDetails() throws Exception{
			if(!repo.findAll().isEmpty()){
	
				return repo.findAll();
			}
			throw new Exception ("Something went wrong ");
	}


}
