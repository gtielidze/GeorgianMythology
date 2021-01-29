//მაცილი

class Matsili(
    private val attackStrength: Int,
) : Evils {

    override fun type(): String = MATSILI_TYPE

    override fun attackStrength(): Int = attackStrength

    companion object {
        const val MATSILI_TYPE = "MATSILI"
    }

}