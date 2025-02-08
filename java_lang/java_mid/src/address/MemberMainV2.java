package address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");
        MemberV2 memberA = new MemberV2("􀴥􀨗A", address);
        MemberV2 memberB = new MemberV2("􀴥􀨗B", address);
        //􀴥􀨗A, 􀴥􀨗B􀩄 􀭊􀨺 􀪱􀣗􀗗 􀝽􀙁 􀢲􀨎
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
//􀴥􀨗B􀩄 􀪱􀣗􀜳 􀠗􀢑􀨵􀛽 􀟸􀒃􀳧􀦠􀳣
//memberB.getAddress().setValue("􀠗􀢑"); //􀮹􀱵􀩌 􀧟􀜨
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("􀠗􀢑 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}