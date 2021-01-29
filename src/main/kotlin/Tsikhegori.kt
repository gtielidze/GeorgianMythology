import java.util.*

class Tsikhegori (scanner: Scanner) {
    private val evils = mutableListOf<Evils>()


    init {
        while (scanner.hasNext()) {
            when {
                scanner.next() == Matsili.MATSILI_TYPE -> {
                    add(Matsili(scanner.nextInt()))
                }
                scanner.next() == Chinka.CHINKA_TYPE -> {
                    add(Chinka(scanner.nextInt()))
                }
                scanner.next() == Devi.DEVI_TYPE -> {
                    add(Devi(scanner.nextInt()))
                }
                scanner.next() == Beghela.BEGHELA_TYPE -> {
                    add(Beghela(scanner.nextInt()))
                }
            }
        }
    }

    private fun add(evil: Evils) {
        evils.add(evil)

    }

    fun enter(copala: Copala) {
        for (evil in evils) {
            copala.fight(evil)

        }
    }
}

