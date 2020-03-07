public class Main {
    
    public static void main(String[] args) {
        
        // some simple tests to make StringParsing.java works
        // must have assertions enabled for tests to work, though
        assert StringParsing.toInt("42") == 42;
        assert StringParsing.toInt("00042") == 42;
        assert StringParsing.containsInt("fivehundred25thousand600");
        assert !StringParsing.containsInt("forty-three");
        
    }
    
}
