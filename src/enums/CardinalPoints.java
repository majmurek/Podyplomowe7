package enums;

public enum CardinalPoints {
    NORTH("N","Północ"),
    NORTHEAST("NE","Północny-wschód"),
    NORTHWEST("NW","Północny-zachód"),
    SOUTH("S", "Południe"),
    SOUTHEAST("SE", "Południowy-wschód"),
    SOUTHWEST("SW", "Południowy-zachód"),
    EAST("E", "Wschód"),
    WEST("W","Zachód");

    private String shortCut;
    private String polish;

    CardinalPoints(String shortCut, String polish) {
        this.shortCut = shortCut;
        this.polish = polish;
    }

    public String getShortCut() {
        return shortCut;
    }

    public String getPolish() {
        return polish;
    }
}
