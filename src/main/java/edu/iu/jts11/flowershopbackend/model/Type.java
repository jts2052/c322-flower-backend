package edu.iu.jts11.flowershopbackend.model;

public enum Type {
    MIXED, ROSES, LILIES, TULIPS, DAISES;

    @Override
    public String toString() {
        switch (this) {
            case MIXED:
                return "Mixed";
            case ROSES:
                return "Roses";
            case LILIES:
                return "Lilies";
            case TULIPS:
                return "Tulips";
            case DAISES:
                return "Daises";
            default:
                return "Unspecified";
        }
    }

    public static Type toEnum(String value) {
        switch (value.toLowerCase()) {
            case "mixed":
                return Type.MIXED;
            case "roses":
                return Type.ROSES;
            case "lilies":
                return Type.LILIES;
            case "tulips":
                return Type.TULIPS;
            case "daises":
                return Type.DAISES;
            default:
                return null;
        }
    }
}
