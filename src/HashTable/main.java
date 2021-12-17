package HashTable;

public class main {
    public static void main(String[] args) {
        CharFinder ab = new CharFinder();
        var nonRepeated = ab.firstNonRepeatingChar("a green apple");
        System.out.println(nonRepeated);
        var repeated = ab.firstRepeatedCharacter("a green apple");
        System.out.println(repeated);

    }
}
