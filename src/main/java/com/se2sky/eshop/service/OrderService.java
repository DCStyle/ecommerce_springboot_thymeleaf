package com.se2sky.eshop.service;

import java.util.List;

import com.se2sky.eshop.domain.*;
import com.se2sky.eshop.domain.*;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
