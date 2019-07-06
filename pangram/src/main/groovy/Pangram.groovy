class Pangram {

	static private final ALPHABET = 'a'..'z'

    static boolean isPangram(String sentence) {
        sentence.toLowerCase().findAll(/[a-z]/).toSet() == ALPHABET.toSet()
    }

}