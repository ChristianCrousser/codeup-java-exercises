//package groceryList;
//
//public class GroceryApplication implements Comparable<GroceryApplication> {
//
//    private String name;
//    private int quantity;
//
//    public GroceryApplication(String name, int quantity) {
//        this.name = name;
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%d %s(s)", quantity, name);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    @Override
//    public int compareTo(GroceryApplication groceryItem) {
//        return this.name.compareToIgnoreCase(groceryItem.getName());
//    }
//}
