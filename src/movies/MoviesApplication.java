 package movies;
        import java.util.Arrays;
        import java.util.Scanner;
        import util.Input;

public class MoviesApplication {
    static Input input = new Input();

    public static void main(String[] args) {
        boolean keepGoing;
        Scanner sc = new Scanner(System.in);
        //This class has a static method named findAll that will return an array of Movie objects. (from MoviesArray.java
        Movie[] movie = MoviesArray.findAll();
        do {
            System.out.println("What would you like to do?\n" +
                    "0 - exit\n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the animated category \n" +
                    "3 - view movies in the drama category \n" +
                    "4 - view movies in the horror category \n" +
                    "5 - view movies in the scifi category \n" +
                    "6 - view movies in the musical category \n" +
                    "7 - view movies in the comedy category \n" +
                    "8 - Add a movie\n");

            String userAnswer = sc.nextLine();

            if (userAnswer.equals("0")) {
                System.out.println("fin");
            } else if (userAnswer.equals("1")) {
                System.out.println(displayMovies(movie));
            } else if (userAnswer.equals("2")) {
                System.out.println(displayCategory("animated"));
            } else if (userAnswer.equals("3")) {
                System.out.println(displayCategory("drama"));
            } else if (userAnswer.equals("4")) {
                System.out.println(displayCategory("horror"));
            } else if (userAnswer.equals("5")) {
                System.out.println(displayCategory("scifi"));
            } else if (userAnswer.equals("6")) {
                System.out.println(displayCategory("musical"));
            } else if (userAnswer.equals("7")) {
                System.out.println(displayCategory("comedy"));
            } else if (userAnswer.equals("8")) {
                addMovie();
            } else {
                System.out.println("That wasn't a valid entry.");
            }
            System.out.println("Would you like to keep going?");
            keepGoing = input.yesNo();
        } while (keepGoing);
    }

    public static String displayMovies(Movie[] movie) {
        String movies = "";
        for (int i = 0; i < movie.length; i++) {
            movies += (movie[i].getName() + " - " + movie[i].getCategory() + "\n");
        }
        return movies;
    }

    public static String displayCategory(String category) {
        Movie[] movie = MoviesArray.findAll();
        String categories;
        String movies = "";
        for (int i = 0; i < movie.length; i++) {
            categories = movie[i].getCategory();
            if (categories.equals(category)) {
                movies += (movie[i].getName() + " - " + movie[i].getCategory() + "\n");
            }
        }
        return movies;
    }

    //bonus
    public static void addMovie() {
        Movie[] movie = MoviesArray.findAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the title of the movie you would like to add?");
        String name = sc.nextLine();
        System.out.println("What is the category of your movie?");
        String category = sc.next();
        Movie[] newList = Arrays.copyOf(movie, movie.length + 1);
        newList[newList.length - 1] = new Movie(name, category);
        System.out.println(displayMovies(newList));

    }
}
