class Isogram {
    static boolean isIsogram(String phrase) {
        def chars = phrase.toLowerCase().findAll('\\p{Alnum}')
        chars.size() == chars.toSet().size()
    }
}