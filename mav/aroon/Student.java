public class Student {
    String name;
    double mark1;
    double mark2;
    double mark3;

    public Student(String n, double m1, double m2, double m3) {
        name = n;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    double getTotal() {
        double total = mark1 + mark2 + mark3;
        return total;
    }

    double getPercentage(double total) {
        double per = total / 3;
        return per;
    }

    public void display() {
        System.out.println("Name :" + name);
        System.out.println("Total mark obtained: " + getTotal());
        System.out.println("Percentage score: " + getPercentage(getTotal()));
    }

    public static void main(String[] args) {
        System.out.println("Enter Name, marks obtained in three subjects:");
        Student st = new Student("Shyam", 60, 76, 80);
        st.display();

    }
}
