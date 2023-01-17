package com.yasminedev;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortOrderByPrice implements SortStrategy{
    @Override
    public void sort(List<Computer> cart) {
        Collections.sort(cart, Comparator.comparing(Computer::getPrice));
        Collections.reverse(cart);
    }
}
