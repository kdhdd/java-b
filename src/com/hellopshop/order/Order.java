package com.hellopshop.order;

import com.hellopshop.product.Product;
import com.hellopshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
