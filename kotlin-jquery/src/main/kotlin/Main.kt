import jquery.jq
import kotlin.browser.document

/**
 * jquery demo
 *
 * @author linux_china
 */
fun main(args: Array<String>) {
    //document.bgColor = "blue"
    jq("#guest").text("Jackie")
    val message = "Kotlin Blueprints"
    println("Your first JS code using Kotlin")
}