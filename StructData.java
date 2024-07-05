public class StructData {
    public char c;
    public float f;
    public int i;
    
    public StructData(char c, float f, int i) {
        this.c = c;
        this.f = f;
        this.i = i;
    }
    
    public static void main(String[] args) {
        StructData data = new StructData('A', 3.14f, 42);
        System.out.println("Char: " + data.c);     
        System.out.println("Float: " + data.f);
        System.out.println("Int: " + data.i);
        
        // Test rearranging the order of data types
        StructData rearrangedData = new StructData('B', 1.414f, 99);
        System.out.println("\nRearranged Data:");
        System.out.println("Char: " + rearrangedData.c);
        System.out.println("Float: " + rearrangedData.f);
        System.out.println("Int: " + rearrangedData.i);
    }
}

