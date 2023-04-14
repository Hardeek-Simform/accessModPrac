import com.student.record.StudentDetails;

public class Main extends StudentDetails {
    public static void main(String[] args) {
        Main childObj = new Main();
        System.out.println("Welcome to student portal!!!");
        System.out.println("Your current details are:");
        System.out.println("Roll number:" + childObj.rollNo);
        System.out.println("Standard:" + childObj.standard);
        System.out.println("Phone Number:" + childObj.getPhoneNumber());

        childObj.rollNo = 12;
        childObj.standard = 11;
        childObj.setPhoneNumber("9123123123");

        System.out.println("---------------------------------------------------");
        System.out.println("As per your request we have updated the details:");
        System.out.println("Roll number:" + childObj.rollNo);
        System.out.println("Standard:" + childObj.standard);
        System.out.println("Phone Number:" + childObj.getPhoneNumber());

    }
}