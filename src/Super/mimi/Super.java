package Super.mimi;

import java.util.Scanner;

public class Super {

    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public  Super(){
        System.out.println("parent class with no parameters");

    }

    public Super(String pName, int pMemberID, int pMemberSince) {
        System.out.println("Parent Constructor with 3 parameters");
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;

        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password: ");
        password = input.nextLine();
        if (!password.equals("abcd"))
        {
            System.out.println("Invalid password. You do not have discount.");
        }else
        {
            System.out.print("Please enter the discount: ");
            discount = input.nextInt();}
    }


    public void displayMemInfo(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }

    public void calculateAnnualFee()
    {
        annualFee = 0;
    }
}
