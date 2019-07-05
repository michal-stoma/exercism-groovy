class Anagram {
	String subject

	Anagram(subject) {
		this.subject = subject.toLowerCase()
	}

    def find(candidates) {
    	List subject_sorted = this.subject.toList().sort()

        return candidates.findAll {
        	subject_sorted == it.toLowerCase().toList().sort() && this.subject != it.toLowerCase()
        }
    }
}