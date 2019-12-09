package grades;

        import util.Input;
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;

//Create a class named GradesApplication with a main method.
public class GradesApplication {
    //Inside the main method, create a HashMap named students.
   static HashMap<String, Student> students = new HashMap<>();

    //    It should have keys that are strings that represent GitHub usernames, and values that are Student objects.
    private static void create() {

//        students = new HashMap<>();

//        Create at least 4 student objects with at least 3 grades each, and add them to the map.
        Student sammy = new Student("Sammy Samilton");
        sammy.addGrade(100);
        sammy.addGrade(100);
        sammy.addGrade(100);

        Student benny = new Student("Benny Benjamin");
        benny.addGrade(96);
        benny.addGrade(94);
        benny.addGrade(100);

        Student freddy = new Student("Freddy Fredmen");
        freddy.addGrade(85);
        freddy.addGrade(83);
        freddy.addGrade(81);

        Student ronaldo = new Student("Ronaldo Ronaldson");
        ronaldo.addGrade(83);
        ronaldo.addGrade(87);
        ronaldo.addGrade(79);

        Student christian = new Student("Christian Christianson");
        christian.addGrade(85);
        christian.addGrade(87);
        christian.addGrade(89);


        students.put("sSamilton", sammy);
        students.put("bBenjamin", benny);
        students.put("fFredman", freddy);
        students.put("rRonaldson", ronaldo);
        students.put("cChristianson", christian);
        System.out.println(students);

//        students.get(sammy);
//
//        students.containsKey("sSamilton");
//
//        students.containsValue("sSamilton");
    }


    //    Create the command line interface
    private static void greeting() {

//        Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map).
        System.out.printf("Welcome!\n");
        String usernames = "|";
        for (String key : students.keySet())
            usernames += " " + key + " |";
        System.out.println("\n" + "Here are the GitHub usernames of our students:\n" + usernames);
//        for System.out.println("Here are the student grades: ");

    }

    private static void studentInfo(String key) {
//        If the given username does exist, display information about that student, including their name and their grades.
        if(students.get(key) !=null) {
        }
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - GitHub Username: %s%n", students.get(key).getName(), key);
            System.out.println("Current Grades:");
            for (Integer grade: students.get(key).getIndGrades()){
                System.out.println(grade);
            }
            System.out.printf("Current Average: %.0f%n%n", students.get(key).getGradeAverage());
        } else {
//            If the given input does not match up with a key in your map, tell the user that no users with that username were found.
            System.out.printf("Sorry, no student was found with \"%s\".%n", key);
        }
//        students.get(key).attendancePercentage();
    }

    public static void main(String[] args) {
        Input input = new Input();
        create();
        greeting();
        ArrayList<Double> AverageSum = new ArrayList<>();
        System.out.println(students);

        double bucket = 0;
        for (Student student : students.values()) {
            bucket += student.getGradeAverage();
            AverageSum.add(student.getGradeAverage());
        }
        System.out.println("The total average of the class is: " + bucket/AverageSum.size());
        boolean keepGoing;
//        System.out.println("Class Average:" + classAverage());

        do {
            String studentChosen = input.getString("What student would you like to see more information on?");

            studentInfo(studentChosen);

            System.out.println("Would you like to see another student?");
            keepGoing = input.yesNo();
        } while (keepGoing);
        System.out.println("Goodbye, and have a wonderful day!");


    }

}

