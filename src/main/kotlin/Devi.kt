//დევი

class Devi(
    private val attackStrength: Int,
) : Evils {

    override fun type(): String = DEVI_TYPE

    override fun attackStrength(): Int = attackStrength

    companion object {
        const val DEVI_TYPE = "DEVI"
    }

}