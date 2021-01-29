import java.io.File
import java.io.FileNotFoundException
import java.util.*

fun main(args: Array<String>) {

    val mythologicalPersonsFile = File("src/main/kotlin/MythologicalPerson")


    try {
        val scanner = Scanner(mythologicalPersonsFile)
        val tsikhegori = Tsikhegori(scanner)
        tsikhegori.enter(Copala(19, Beghela.BEGHELA_TYPE))

    } catch (ex: FileNotFoundException) {
        println("Evil not found")

    } catch (ex: RestInPeaceCopala) {
        println(ex.message)
    }
}

//source: http://www.nplg.gov.ge/civil/statiebi/saskolo/kopala.htm
//source: https://poetry.ge/poets/vazha-pshavela/poems/2657.kopala.htm