public class CabinCrewMember extends Person{

    CabinCrewMemberRank Rank;

    public CabinCrewMember(String name, CabinCrewMemberRank rank) {
        super(name);
        this.Rank = rank;
    }

    public String getRank(){
        return this.Rank.getRank();
    }

    public String canTalk(){
        return "Hello people!";
    }
}
