public class Enums {
    public static class AppleVariety {
        public static final AppleVariety GOLDEN_DELICIOUS = new AppleVariety("Golden Delicious");
        public static final AppleVariety RED_DELICIOUS = new AppleVariety("Red Delicious");
        public static final AppleVariety HONEYCRISP = new AppleVariety("Honeycrisp");
        
        private final String varietyName;
        
        private AppleVariety(String varietyName) {
            this.varietyName = varietyName;
        }
        
        @Override
        public String toString() {
            return varietyName;
        }
    }
    
    public static class OrangeType {
        public static final OrangeType NAVEL = new OrangeType("Navel Orange");
        public static final OrangeType BLOOD = new OrangeType("Blood Orange");
        public static final OrangeType VALENCIA = new OrangeType("Valencia Orange");
        
        private final String typeName;
        
        private OrangeType(String typeName) {
            this.typeName = typeName;
        }
        
        @Override
        public String toString() {
            return typeName;
        }
    }
    
    public static void main(String[] args) {
        // Test cases
        OrangeType myFavoriteOrange = OrangeType.NAVEL;
        System.out.println("My favorite orange: " + myFavoriteOrange);
        
        // Tasty apple-flavored orange juice!!!
        OrangeType tastyOrangeJuice = OrangeType.VALENCIA;
        System.out.println("Tasty apple-flavored orange juice: " + tastyOrangeJuice);
    }
}

