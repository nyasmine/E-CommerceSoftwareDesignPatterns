package com.yasminedev;

import java.util.Scanner;

//Yasmine Nejah - 260688522

public class BestBuy {

    private static final MarketSpace newMarketSpace = MarketSpace.getInstance();

    public static void main(String[] args) {
        System.out.println("Loading products from text file...");
        newMarketSpace.loadProducts();
        int input;

        do{
            Scanner myScanner = new Scanner(System.in);
            System.out.println("""
                    Hi, what would you like to do?\s
                    1: Buy a computer\s
                    2: See my shopping cart\s
                    3: Sort by order ID (Descending order)\s
                    4: Sort by order price (Descending order)\s
                    5: Quit""");
            input = myScanner.nextInt();
            switch (input) {
                case 1 -> addProductToMyCart();
                case 2 -> newMarketSpace.viewCart();
                case 3 -> {
                    String id = "id";
                    newMarketSpace.sort(id);
                }
                case 4 -> {
                    String price = "price";
                    newMarketSpace.sort(price);
                }
                case 5 -> System.out.println("Thanks for shopping, see you next time.");
                default -> System.out.println("Please enter a valid option.");
            }
        } while (input != 5);
    }

    public static void addProductToMyCart(){
        int myChoice;
        Computer newComputer = new BasicComputer();
        System.out.println("Current Build: " + newComputer.getDescription() + ", and total price is " + newComputer.getPrice());
        do{
            Scanner myPurchaseChoice = new Scanner(System.in);
            newMarketSpace.printProductMenu();
            myChoice = myPurchaseChoice.nextInt();
            switch (myChoice){
                case 1:
                    newComputer = new Microphone(newComputer);
                    double priceOfMicrophone = newMarketSpace.getPriceFromProduct("Microphone");
                    newComputer.setPrice(priceOfMicrophone);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 2:
                    newComputer = new Monitor(newComputer);
                    double priceOfMonitor = newMarketSpace.getPriceFromProduct("Monitor");
                    newComputer.setPrice(priceOfMonitor);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 3:
                    newComputer = new USBHDCamera(newComputer);
                    double priceOfUSBHDCamera = newMarketSpace.getPriceFromProduct("USB HD camera");
                    newComputer.setPrice(priceOfUSBHDCamera);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 4:
                    newComputer = new Mouse(newComputer);
                    double priceOfMouse = newMarketSpace.getPriceFromProduct("Mouse");
                    newComputer.setPrice(priceOfMouse);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 5:
                    newComputer = new Keyboard(newComputer);
                    double priceOfKeyboard = newMarketSpace.getPriceFromProduct("Keyboard");
                    newComputer.setPrice(priceOfKeyboard);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 6:
                    newComputer = new BensPicture(newComputer);
                    double priceOfBenPicture = newMarketSpace.getPriceFromProduct("Ben's Picture");
                    newComputer.setPrice(priceOfBenPicture);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 7:
                    newComputer =  new GPU3080Ti(newComputer);
                    double priceOfGPU3080Ti = newMarketSpace.getPriceFromProduct("GPU 3080 Ti");
                    newComputer.setPrice(priceOfGPU3080Ti);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 8:
                    newComputer = new Speaker(newComputer);
                    double priceOfSpeaker = newMarketSpace.getPriceFromProduct("Speaker");
                    newComputer.setPrice(priceOfSpeaker);
                    System.out.println(newComputer.getDescription() + newComputer.getPrice());
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        } while (myChoice != 9);
        newMarketSpace.addToCart(newComputer);

    }

}
