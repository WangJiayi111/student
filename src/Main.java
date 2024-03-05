import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            
        
        Scanner scanner=new Scanner(System.in);
    
        while (true) {
            System.out.println("Enter student ID:");
            String studentID=scanner.nextLine();

            System.out.println("Enter student name:");
            String studentName=scanner.nextLine();

            System.out.println("Enter number of extra activities:");
            int numExtraActivities=scanner.nextInt();
            scanner.nextLine();

            Student student=new Student(studentID,studentName,numExtraActivities);

            for(int i=0;i<numExtraActivities;i++){
                System.out.println("Enter extra activities"+(i+1)+":");
                String activity=scanner.nextLine();
                student.addExtraActivity(activity,i);
            }

            System.out.println("Student details:"+student);

            System.out.println("Do you want to enter another student? ");
            String continueInput=scanner.nextLine().toLowerCase();

            if(!continueInput.equals("yes")){
                break;
            }
        }
        scanner.close();
    }
    
}

