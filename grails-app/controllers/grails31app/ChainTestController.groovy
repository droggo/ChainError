class ChainTestController {
	def one() {
	    chain action: 'two', model: [name: 'Tony', town: 'Birmingham']
	}
	def two() {
	    [name: 'Anthony', country: 'England']
	}
}