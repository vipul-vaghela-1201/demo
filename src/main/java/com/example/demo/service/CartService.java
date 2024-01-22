package com.example.demo.service;

import com.example.demo.model.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getAllCarts();
    List<Cart> getCartByCartId(String cartId);
    List<Cart> createCart(List<Cart> carts);
}
