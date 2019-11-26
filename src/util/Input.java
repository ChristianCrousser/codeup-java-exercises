     package util;

        import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Input test = new Input();
//        System.out.println(test.getString(""));
//        System.out.println(test.getString("This"));
//        System.out.println(test.yesNo());
//        System.out.println("Give Int");
//        System.out.println(test.getInt(1, 10));
//        System.out.println("Give double");
//        System.out.println(test.getDouble(1, 10));
//        System.out.println(test.getDouble(1, 10.5));
        System.out.println("Enter a binary number:");
        System.out.println(test.getBinary());
        System.out.println("Enter a hexidecimal number:");
        System.out.println(test.getHex());
    }

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {

        return this.sc.nextLine();
    }
    private String getString(String prompt) {
        if(prompt.isEmpty()){
            System.out.println("Type Something: ");

        }else {
            System.out.println(prompt);
        }
        return getString();
    }

    //
    boolean yesNo() {
        System.out.println("Type y/n");
        String yesorNo = this.sc.nextLine();
        if (yesorNo.equalsIgnoreCase("yes") || yesorNo.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }

    }


    public int getInt(int min, int max) {
        try {
            int userNum = Integer.valueOf(this.sc.nextLine());
            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.println("Out of Range");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
        }
        return getInt(min, max);
    }


//        if (this.sc.hasNextInt()) {
//            int userNum = Integer.parseInt(this.sc.nextLine());
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Invalid Number Range");
//            }
//        } else {
//            System.out.println("Invalid Input");
//        }


    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal 1 and 10: ");
        try{
            double userNum = Double.valueOf(this.sc.nextLine());
            if (userNum >= min && userNum <= max) {
                return userNum;
            }else{
                System.out.println("Out of Range");
            }
        }catch(Exception e){
            System.out.println("Invalid Input");
        }
        return getDouble(min, max);

    }

    //    double getDouble(double min, double max)
    public double getDouble(String prompt){
        System.out.println(prompt);
        return Double.parseDouble(this.sc.nextLine());
    }

    public int getBinary(){

        int userNum = Integer.valueOf(this.sc.nextLine());
        String binary = Integer.toString(userNum);
        System.out.println("Your number is " + Integer.valueOf(binary,2));
        return    Integer.valueOf(binary,2);


    }
    public int getHex(){

        int userNum = Integer.valueOf(this.sc.nextLine());
        String hex = Integer.toString(userNum);
        System.out.println("Your number is " + Integer.valueOf(hex,16));
        return Integer.valueOf(hex,16);
    }


}
