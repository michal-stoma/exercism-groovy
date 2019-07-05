class Raindrops {
	def static factors = [3: 'Pling', 5: 'Plang', 7: 'Plong']
    def convert(num) {
        factors.findAll({num % it.key == 0}).collect({it.value}).join() ?: "$num"
    }

}
