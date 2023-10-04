import java.util.Scanner;
public class LoginSystem{
    public static void main(String[]args){
        Scanner scanner=new
            Scanner(System.in);
        String username="user";
        String password="password";
        int tries=3;
        boolean loggedln=false;
        
        while(tries > 0 && !loggedln){
            System.out.println("Enter username");
              String inputusername=scanner.nextLine();
             System.out.println("Enter password");
            String inputpassword=scanner.nextLine();
            if(inputusername.equals(username)&&inputpassword.equals(password)){
                System.out.println("Loin successful!");
                loggedln=true;
            } else {
                System.out.println("Incorrect username or password"+tries+"tries remaining");
                tries--;
            }
        }
        if(!loggedln){
            System.out.println("You have exceeded the maximum number of tries.Please try again later.");
        }
    }
}
