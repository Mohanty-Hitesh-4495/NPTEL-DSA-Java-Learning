import java.util.*;
class Person1 {
    private String name;
    private Integer age;
    public Person1(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ArrayListObjectSortExample {
    public static void main(String[] args) {
        List<Person1> people = new ArrayList<>();
        people.add(new Person1("Sachin", 47));
        people.add(new Person1("Chris", 34));
        people.add(new Person1("Rajeev", 25));
        people.add(new Person1("David", 31));
        System.out.println("Person List : " + people);
// Sort People by their Age
        people.sort((person1, person2) -> {
            return person1.getAge() - person2.getAge();
        });
// A more concise way of writing the above sorting function
        people.sort(Comparator.comparingInt(Person1::getAge));
        System.out.println("Sorted Person List by Age : " + people);
// Sort using Collections.sort() method by passing the custom Comparator
        Collections.sort(people, Comparator.comparing(Person1::getName));
        System.out.println("Sorted Person List by Name : " + people);
    }
}