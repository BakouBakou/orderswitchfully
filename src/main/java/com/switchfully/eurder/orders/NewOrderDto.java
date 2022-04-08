package com.switchfully.eurder.orders;

import java.util.HashSet;
import java.util.Set;

public class NewOrderDto {
    private final String customerId;
    private final Set<ItemGroup> itemGroupSet;

    public NewOrderDto(String customerId, Set<ItemGroup> itemGroupSet) {
        this.customerId = customerId;

        this.itemGroupSet = new HashSet<>();
        this.itemGroupSet.addAll(itemGroupSet);

    }

    public Set<ItemGroup> getItemGroupSet() {
        return itemGroupSet;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double totalPrice() {
        return 0;
    }
}