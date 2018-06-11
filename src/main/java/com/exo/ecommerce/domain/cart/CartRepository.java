package com.exo.ecommerce.domain.cart;

import java.util.Optional;

public interface CartRepository {
    public Optional<Cart> fetchCurrentCart();
    public Cart save(Cart cart);
}