package person

import java.awt.Point
import java.awt.geom.Point2D
import javax.print.attribute.standard.Destination

open class BasePerson(inputHp: Int) {
    var hp: Int = inputHp
    private var location: Point = Point()

    fun move(destination: Point) {
        location = destination
    }

    fun destroy() {
        println("Destroying Base Person")
    }

}