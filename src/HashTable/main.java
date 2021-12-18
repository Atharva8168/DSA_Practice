package HashTable;

public class main {
    public static void main(String[] args) {
        //  CharFinder
//        CharFinder ab = new CharFinder();
//        var nonRepeated = ab.firstNonRepeatingChar("a green apple");
//        System.out.println(nonRepeated);
//        var repeated = ab.firstRepeatedCharacter("a green apple");
//        System.out.println(repeated);


        // HashTable
        HashTable table = new HashTable();
        table.put(6 , "A");
        table.put(8 , "B");
        table.put(11 , "C");
        table.put(6 , "C");
        table.remove(8);
        table.remove(11);
        System.out.println(table.get(11));

    }
}
