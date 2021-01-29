//კოპალა <-- მთავარი გმირი

class Copala(
    private var health: Int,
    private val weaknessEnemyType: String,
) {
    fun fight(evils: Evils) {
        health -= if (evils.type() == weaknessEnemyType) {
            evils.attackStrength() * 2
        } else {
            evils.attackStrength()
        }
        if (health < 0)
            throw RestInPeaceCopala()

        if (health > 0)
            println("All EVILS ARE IN THE HELL")
    }
}