package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carts")
@CrossOrigin(origins = "http://localhost:3000")
public class CartController {
    @Autowired
    private CartService cartService;
    @GetMapping
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }
    @GetMapping("/{cartId}")
    public ResponseEntity<List<Cart>> getCartById(@PathVariable String cartId) {
        List<Cart> carts = cartService.getCartByCartId(cartId);
        return ResponseEntity.ok(carts);
    }
    @PostMapping
    public ResponseEntity<List<Cart>> createCart(@RequestBody List<Cart> carts) {
        List<Cart> createdCart = cartService.createCart(carts);
        return new ResponseEntity<>(createdCart, HttpStatus.CREATED);
    }
}
