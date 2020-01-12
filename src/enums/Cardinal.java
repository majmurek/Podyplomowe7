package enums;

public class Cardinal {
    private CardinalPoints way;

    public Cardinal(CardinalPoints way) {
        this.way = way;
    }

    public static void main(String[] args) {
        Cardinal cardinal = new Cardinal(CardinalPoints.NORTH);
        Cardinal cardinal1 = new Cardinal(CardinalPoints.NORTHWEST);
        Cardinal cardinal2 = new Cardinal(CardinalPoints.SOUTHWEST);
        System.out.println(cardinal.getCardinalDetails());
        System.out.println(cardinal1.getCardinalDetails());
        System.out.println(cardinal2.getCardinalDetails());
    }

    public String getCardinalDetails(){
        return way + "(" + way.getShortCut() + ")" + "(" + way.getPolish() + ")";
    }
}
