package grades;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
//        import java.util.Map;

    //Create a class named Student
    public class Student {
        //    It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers.
//    private String
        private String name;
        private ArrayList<Integer> grades;
    HashMap<String, String> attendance = new HashMap<>();

    //    The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList
    public Student(String name) {
        this.name=name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
        System.out.println(grades);
    }

    //returns all grades
    public ArrayList<Integer> getIndGrades() {
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        for (int grade: this.grades){
            total += grade;
        }
        return total / this.grades.size();
    }

    //returns class average
    public double classAverage() {
        int classTotal = 0;
        for (int grade: this.grades){
            classTotal += grade;
        }
        return classTotal/grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Christian");
        System.out.println(student1.getName());
        student1.addGrade(90);
        student1.addGrade(80);
        System.out.println(student1.getGradeAverage());
        System.out.println();
    }




}
