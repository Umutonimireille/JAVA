package Super.mimi;

public class VIPMember extends  Super {

    public VIPMember(String pName, int pMemberID, int
            pMemberSince)
    {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }
    @Override
    public void calculateAnnualFee()
    {
        annualFee = (1-0.01*getDiscount())*1200;
    }

    public static void main(String[] args) {

    }
}
