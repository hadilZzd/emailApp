import java.util.Random;
import java.util.Scanner;

public class Email {

    private String firstName ;
    private String lastName ;
    private String email ;
    private String password ;
    private String deprt ;
    private String alterEmail ;
    private int mailBoxCap ;
    private String companySuf = "comp.com";

    // Constructor to receive first and last name  

    public Email( String firstName , String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email has been created : "+ this.firstName + " " + this.lastName);
        this.deprt = setDept();
        System.out.println("Departement : "+this.deprt);
        this.password = randmPass(10);
        System.out.println("Suggested string password : "+password);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + deprt +"."+ companySuf;

        System.out.println(email);
    }


    // Ask for departement 
    private String setDept() {
        System.out.println("Enter the departement \n1 for Sales \n2 for Dev \n3 for Accounting \n0 for none ");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        
        switch (depChoice) {
            case 1:
                return "Sales";
            case 2:
                return "Dev";
            case 3:
                return "Accounting";
            case 0:
                return "None";
            default:
                return "Invalid choice";
    }
}
    // Generate a random pass 

    private String randmPass(int length) {
       String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*";
       char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * setPassword.length());
            password[i] = setPassword.charAt(rand);
        }
        return new String(password);    
    } 
    
    
    // Set the mailBox capacity

    public void setMailboxCap(int capacity) {
        this.mailBoxCap = capacity ;
    }
    // Set the alternative email 
    public void setAlterEmail(String altEmail) {
        this.alterEmail = altEmail ;
    }
    // Change password
    public void changePass(String password) {
        this.password = password ;
    }

    public int getMailboxCap() {return mailBoxCap ;}
    public String getChangePass() {return password ;}
    public String getAlterEmail() {return alterEmail ;}

   
        
    }






