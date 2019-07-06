class Isogram {
    static boolean isIsogram(String phrase) {
        def chars = phrase.toLowerCase().findAll(/[a-zA-Z0-9]/)
        chars.size() == chars.toSet().size()
    }
}