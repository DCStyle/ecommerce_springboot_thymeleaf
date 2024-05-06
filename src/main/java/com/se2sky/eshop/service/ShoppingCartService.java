package com.se2sky.eshop.service;

import com.se2sky.eshop.domain.Article;
import com.se2sky.eshop.domain.CartItem;
import com.se2sky.eshop.domain.ShoppingCart;
import com.se2sky.eshop.domain.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);
	
	int getItemsNumber(User user);
	
	CartItem findCartItemById(Long cartItemId);
	
	CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);
		
	void clearShoppingCart(User user);
	
	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);
	
}
