package Super.mimi;

public class NormalMember  extends  Super{

    public NormalMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child constructor with 3 parameter");


    }

    @Override
    public void calculateAnnualFee()
    {
//        int discount = 0;
        annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }


    public static void main(String[] args) {
        NormalMember members  = new NormalMember("oxane",16,2);
        members.getDiscount();
    }


}
