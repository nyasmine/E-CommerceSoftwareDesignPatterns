package com.yasminedev;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortOrderByID implements SortStrategy{
    @Override
    public void sort(List<Computer> cart) {
        Collections.sort(cart, Comparator.comparing(Computer::getOrderID));
        Collections.reverse(cart);
    }
}
