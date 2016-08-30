public class TestPerson {

    public static void main(String[] args) {

        Person person = new Person("QIS1", "Ongole1");

        Person student = new Student("QIS2", "Ongole2", "CSE", 4, 300);
    
        Person staff = new Staff("QISEMP", "ONGOLE3", "SCHOOL1", 280);

System.out.println(person.toString() + "\n");
     
        System.out.println(student.toString() + "\n");
        
        System.out.println(staff.toString() + "\n");
        }
}




