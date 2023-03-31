public class Pilot extends Person{

    private String licenceNumber;
    CabinCrewMemberRank Rank;



    public Pilot(String name, String licenceNumber, CabinCrewMemberRank Rank) {
        super(name);
        this.licenceNumber = licenceNumber;
        this.Rank = Rank;
    }


    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String canFlyPlane(){
        return "I can flyyy!";
    }


}
