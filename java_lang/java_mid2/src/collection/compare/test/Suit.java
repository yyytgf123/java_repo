package collection.compare.test;

public enum Suit {
    SPACE("\u2660"),
    HEART("\u2665"),
    DIAMOND("\u2666"),
    CLUB("\u2663");

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
