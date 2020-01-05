import java.util.Scanner;

    public class ExamPassMark {
        // insatnce variable 
        int x=0;
        int no_passed=0, no_failed=0;

        int [] values = new int[10]; 
        String [] subject = {"Mathematics", "English", "Biology", "Chemistry", "Physics", "Economics", "Yourba"};


        public void input () {
            Scanner input = new Scanner(System.in);
            ExamPassMark ip = new ExamPassMark();

            System.out.print("PASS MARK GRADING PROGRAM");
            System.out.println();

            // input to take in the values of subject
            for (int a=0; a<7; a++) {
                System.out.print("Enter Grade Score for " + subject[a] + " : ");
                values[a] = input.nextInt();
            }

            ip.calculate(values, subject);
        }

        public void calculate (int [] values, String [] subject) {

            System.out.println(); 
            System.out.print("LIST OF PASSING GRADES");
            System.out.println();
            for (int a=0; a<8; a++) {
                if (values[a] >= 50) {
                    System.out.print(" " + values[a] + " ");
                    no_passed++;
                }
            }


            System.out.println(); 
            System.out.print("LIST OF FAILING NUMBERS ");
            System.out.println(); 

            for (int a=0; a<8; a++) {
                if(values[a] < 50) {
                    System.out.print(" " + values[a] + " ");
                    no_failed++; 
                }
            } 
            System.out.println("\n\n"); 
            System.out.println("Number of Passing Course is " + no_passed + ".");
            System.out.println("Number of Failing Course is " + no_failed + ".");

            if (no_passed >= 5 && (values[0] >= 50 && values[1] >= 50) ) {
                System.out.println("CONGRATULATONS!!, YOU CLEARED ALL THE REQUIRED COURSE AND QUALIFY TO WRITE JAMB TEST!");    
            } else {
                System.out.println("UNFORTUNARELY!!, YOU DIDNT PASS ALL THE NECCESSARY COURSE AND REQUIRED TO TAKE THE EXAM AGAIN!");
            }

        }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;


        do { 
            ExamPassMark pm = new ExamPassMark();
            pm.input();

            System.out.println();
            System.out.print("\nDo you want to continue (Type y or n) : ");
            ch = input.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y'); 

        System.out.println();
        System.out.print("\t THANK YOU FOR USING THIS PROGRAM");
        System.out.println("\n\n");
    }
} 
