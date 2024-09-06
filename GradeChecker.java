public class GradeChecker {
    public static void main(String[] args) {
        int marks = 85;

        
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        
        if (marks >= 60) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed.");
        }
    }
}
