
import java.util.*;

class Main{
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Charlie",35,6));
        list.add(new Student("Bob",35,8));
        list.add(new Student("David",30,4.5));
        list.add(new Student("John",31,3.0));
          list.sort(null);
        System.out.println(list);
    }
}


class Student implements Comparable<Student>{
    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    private String name;
    private int age ;
    private double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getCgpa(),this.getCgpa());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cgpa=" + cgpa +
                '}';
    }
}
