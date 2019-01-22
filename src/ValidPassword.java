import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args)
    {
        String password;
        boolean valid=false;
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter pasword: ");
        password = input.nextLine();

        while(!valid)
        {
             valid = isValidPassword(password);

            System.out.print("\n\nEnter pasword: ");
            password = input.nextLine();
        }


    }

    public static boolean isValidPassword(String password)
    {
        boolean hasUppercase=false;
        boolean hasLowerCase=false;
        boolean hasDigit=false;

        if(password.length()>=8)
        {
            for(int i=0;i<password.length();i++)
            {
                if(Character.isUpperCase(password.charAt(i)))
                {
                    hasUppercase=true;
                }
            }

            if(hasUppercase)
            {
                for(int i=0;i<password.length();i++)
                {
                    if(Character.isLowerCase(password.charAt(i)))
                    {
                        hasLowerCase=true;
                    }
                }

                if(hasLowerCase)
                {
                    for(int i=0;i<password.length();i++)
                    {
                        if(Character.isDigit(password.charAt(i)))
                        {
                            hasDigit=true;
                        }
                    }

                    if(hasDigit)
                    {
                        System.out.print("Password is okay");
                        return true;

                    }
                    else
                    {
                        System.out.print("Doesnt have digit");
                        return false;

                    }
                }//end of hasLowercase

                else
                {
                    System.out.print("Doesnt have lowercase");
                    return false;

                }

            }//end of hasuppercase

            else
            {
                System.out.print("Doesnt have uppercase");
                return false;

            }
        }
        else
        {
            System.out.print("Doesnt have 8 characters");
            return false;

        }
    }
}
