//ჭინკა

class Chinka (
    private val attackStrength: Int,
) : Evils {

    override fun type(): String = CHINKA_TYPE

    override fun attackStrength(): Int = attackStrength

    companion object {
        const val CHINKA_TYPE = "CHINKA"
    }

}