package edu.iu.jts11.flowershopbackend.model;


public enum Occasion {
    MOTHERSDAY, BIRTHDAY, THANKYOU;

    @Override
    public String toString() {
        switch (this) {
            case MOTHERSDAY:
                return "Mother's Day";
            case BIRTHDAY:
                return "Birthday";
            case THANKYOU:
                return "Thank You";
            default:
                return "Unspecified";
        }
    }

    public static Occasion toEnum(String value) {
        switch (value.toLowerCase()) {
            case "mother's day":
                return Occasion.MOTHERSDAY;
            case "birthday":
                return Occasion.BIRTHDAY;
            case "thank you":
                return Occasion.THANKYOU;
            default:
                return null;
        }
    }
}
