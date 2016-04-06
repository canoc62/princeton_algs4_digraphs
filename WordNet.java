import edu.princeton.cs.algs4.In;
//import edu.princeton.cs.algs4.DiGraph;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WordNet {
    
    public WordNet(String synsets, String hypernyms) {
        if (synsets == null || hypernyms == null) {
            throw new NullPointerException();
        }
    }
    
    public Iterable<String> nouns() {
        
    }
    
    public boolean isNoun(String word) {
        if (word == null) throw new NullPointerException();
    }
    
    public int distance(String nounA, String nounB) {
        if (nounA == null || nounB == null) {
            throw new NullPointerException();
        }
    }
    
    public String sap(String nounA, String nounB) {
        if (nounA == null || nounB == null) {
            throw new NullPointerException();
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}