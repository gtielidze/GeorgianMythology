//ბეღელა

class Beghela(
    private val attackStrength: Int,
) : Evils {

    override fun type(): String = BEGHELA_TYPE

    override fun attackStrength(): Int = attackStrength

    companion object {
        const val BEGHELA_TYPE = "BEGHELA"
    }

}