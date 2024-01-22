package com.example.demo.service;

import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;
    @Override
    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }
    @Override
    public List<Cart> getCartByCartId(String cartId) {
        return cartRepository.findByCartId(cartId);
    }
    @Override
    public List<Cart> createCart(List<Cart> carts) {
        List<Cart> createdCarts = new ArrayList<>();

        if (!carts.isEmpty()){
            for (Cart cart : carts) {
                Cart createdCart = cartRepository.save(cart);
                createdCarts.add(createdCart);
            }
        }
        return createdCarts;
    }
}
