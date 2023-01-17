package com.yasminedev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MarketSpace {
    private final List<Computer> cart = new ArrayList<>();
    private static final Map<String,Double> products = new HashMap<>();

    private static MarketSpace firstComputerInstance;

    private MarketSpace(){}

    public static MarketSpace getInstance(){
        if(firstComputerInstance == null){
            firstComputerInstance = new MarketSpace();
        }
        return firstComputerInstance;
    }

    public void loadProducts(){ try {
        List<String> allLines = Files.readAllLines(Paths.get("products.txt"));
        for (String line : allLines) {
            String[] productsList = line.split(",");
            products.put(productsList[0], Double.valueOf(productsList[1]));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    }

    public void printProductMenu(){
        System.out.println("What component would you like to add? ");
        int choiceCounter = 1;
        for(Map.Entry<String, Double> entry: products.entrySet()){
            System.out.println((choiceCounter++) + ": " + entry.getKey() + " " + entry.getValue());
        }
        System.out.println("9: Done");
    }

    public double getPriceFromProduct(String item){
        return products.get(item);
    }

    public void addToCart(Computer computer){
        cart.add(computer);
    }

    public void viewCart(){
        if(cart.isEmpty()){
            System.out.println("There is no item in the cart.");
            return;
        }
        for (Computer computer : cart) {
            System.out.println(computer.getOrderID() + " " + computer.getDescription() + computer.getPrice());
        }
    }

    public void sort(String whatToSort){
        if(cart.isEmpty()){
            System.out.println("There is no item in the cart.");
            return;
        }
        if(whatToSort.equals("price")){
            SortOrderByPrice newSortByPrice = new SortOrderByPrice();
            newSortByPrice.sort(cart);

        } else if(whatToSort.equals("id")){
            SortOrderByID newSortByID = new SortOrderByID();
            newSortByID.sort(cart);
        }

        viewCart();

    }



}
