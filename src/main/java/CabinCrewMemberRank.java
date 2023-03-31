public enum CabinCrewMemberRank {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant");
    private final String rank;


        CabinCrewMemberRank(String rank) {
            this.rank = rank;
        }

        public String getRank() {
            return rank;
        }
    }


