import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //prints the instance of the object
        System.out.println(numbers);
        //prints the literal array and values
        System.out.println(Arrays.toString(numbers));
//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person[] people = new Person[3];
        people[0] = new Person("Bonnie");
        people[1] = new Person("Johnny");
        people[2] = new Person("Dunban");
        for(Person person : people){
            System.out.println(person.getName());
        }

        people = addPerson(people, new Person ("Ricky"));

        for(Person person : people){
            System.out.println(person.getName());
        }


//        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
//        Person[] thePeople = new Person[people + 1];
    }
    public static Person[] addPerson(Person[] people, Person details) {
        Person[] newPerson = Arrays.copyOf(people, people.length+1);
        newPerson[people.length] = details;
        return newPerson;
    }
}
