class Hamming {

    def distance(strand1, strand2) {
    	if (strand1.size() != strand2.size()) {
    		throw new ArithmeticException()
    	}

    	return [strand1, strand2]
    		.collect { it.toList() }
    		.transpose()
    		.count { a, b -> a != b}

    }

}