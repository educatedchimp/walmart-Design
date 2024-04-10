package com.walmart;

import org.springframework.beans.factory.annotation.Value;

public class InventoryConfig {

    @Value("${com.walmart.inventory.books.count}")
    int Books;

    @Value("${com.walmart.inventory.electronics.count}")
    int electronics ;




}
