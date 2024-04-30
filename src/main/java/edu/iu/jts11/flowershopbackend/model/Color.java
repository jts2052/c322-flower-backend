package edu.iu.jts11.flowershopbackend.model;

public enum Color {
    MIXED, RED, YELLOW, GREEN, ORANGE;

    @Override
    public String toString() {
        switch (this) {
            case MIXED:
                return "Mixed";
            case RED:
                return "Red";
            case YELLOW:
                return "Yellow";
            case GREEN:
                return "Green";
            case ORANGE:
                return "Orange";
            default:
                return "Unspecified";
        }
    }

    public static Color toEnum(String value) {
        switch (value.toLowerCase()) {
            case "mixed":
                return Color.MIXED;
            case "red":
                return Color.RED;
            case "yellow":
                return Color.YELLOW;
            case "green":
                return Color.GREEN;
            case "orange":
                return Color.ORANGE;
            default:
                return null;
        }
    }
}
