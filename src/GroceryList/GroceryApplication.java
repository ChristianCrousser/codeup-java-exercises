//
//package groceryList;
//
//import util.Input;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//
//public class GroceryApplication {
//
//    public static void main(String[] args) {
//
//        Input input = new Input();
//        boolean exited = false;
//
//        if (input.yesNo("Would you like to create a grocery list y/n?")) {
//
//            HashMap<String, ArrayList<GroceryItem>> groceryList = new HashMap<>();
//
//            groceryList.put("Bakery", new ArrayList<>());
//            groceryList.put("Fruit", new ArrayList<>());
//            groceryList.put("Meat", new ArrayList<>());
//            groceryList.put("Vegetables", new ArrayList<>());
//
//            do {
//                if (input.yesNo("Would you like to enter a new item y/n?")) {
//                    String category;
//                    String name;
//                    int quantity;
//
//                    do {
//                        do {
//                            printCategories(groceryList);
//                            category = input.getString("\nEnter a category from the list");
//                        } while (!groceryList.containsKey(category));
//
//                        name = input.getString("What is the name of the item?");
//                        quantity = input.getInt("How many would you like?");
//
//                        GroceryItem item = new GroceryItem(name, quantity);
//
//                        groceryList.get(category).add(item);
//
//                    } while (input.yesNo("Would you like to add an additional item y/n?"));
//                }
//            } while (!input.yesNo("Would you like to finalize the list y/n?"));
//
//            do {
//                int displayInput = input.getInt("\nWhat would you like to do?\n" +
//                        "\n" +
//                        "0 - Exit\n" +
//                        "1 - See the full list\n" +
//                        "2 - See a specific category of items\n" +
//                        "3 - Edit an item");
//
//                switch (displayInput) {
//                    case 0:
//                        exited = true;
//                        break;
//                    case 1:
//                        System.out.println("\nHere is your list:");
//                        for (Map.Entry<String, ArrayList<GroceryItem>> list : groceryList.entrySet()) {
//                            Collections.sort(list.getValue());
//                            System.out.println(String.format("%s: %s", list.getKey(), list.getValue()));
//                        }
//                        break;
//                    case 2:
//                        String cat;
//
//                        do {
//                            printCategories(groceryList);
//                            cat = input.getString("\nWhich category would you like to see?");
//                        } while (!groceryList.containsKey(cat));
//
//                        System.out.println(String.format("Showing all items in %s:\n%s", cat, groceryList.get(cat)));
//                        break;
//                    case 3:
//                        editItem(groceryList, input);
//                        break;
//                    default:
//                        System.out.println("Invalid input");
//                        break;
//                }
//            } while (!exited && input.yesNo("\nWould you like to do something else y/n?"));
//        }
//        System.out.println("Goodbye, and have a wonderful day!");
//    }
//
//    public static void printCategories(HashMap<String, ArrayList<GroceryItem>> groceryList) {
//        for (String i : groceryList.keySet()) {
//            System.out.printf("|%s|", i);
//        }
//    }
//
//    public static void editItem(HashMap<String, ArrayList<GroceryItem>> groceryList, Input input) {
//        String editCat;
//        GroceryItem editItem = null;
//        String editItemName;
//        String newName;
//        int newQuantity;
//
//        do {
//            printCategories(groceryList);
//            editCat = input.getString("\nWhich category is the item in?");
//        } while (!groceryList.containsKey(editCat));
//
//        do {
//            System.out.println("\n" + groceryList.get(editCat));
//            editItemName = input.getString("Which item would you like to edit?");
//
//            for (GroceryItem i : groceryList.get(editCat)) {
//                if (i.getName().equals(editItemName)) {
//                    editItem = i;
//                }
//            }
//        } while (!groceryList.get(editCat).contains(editItem));
//
//        newName = input.getString("What would you like to change the name to?");
//        newQuantity = input.getInt("What would you like to change the quantity to?");
//
//        groceryList.get(editCat).set(groceryList.get(editCat).indexOf(editItem), new GroceryItem(newName, newQuantity));
//    }
//}