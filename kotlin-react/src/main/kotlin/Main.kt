import kotlinx.html.a
import kotlinx.html.span
import react.dom.ReactDOM
import react.dom.render
import kotlin.browser.document

/**
 * react demo
 *
 * @author linux_china
 */
fun main(args: Array<String>) {
    ReactDOM.render(document.getElementById("app")) {
        span {
            +"Here is Jackie!"
            a {
                +" good morning everybody!"
            }    
        }
    }


}