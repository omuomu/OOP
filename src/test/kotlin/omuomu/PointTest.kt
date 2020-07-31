package omuomu
import omuomu.Point
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import kotlin.test.assertFailsWith
import kotlin.test.assertEquals

@Test
	fun tesPoint() {
        var Point = Point(1.0, 1.0)

        assertEquals(Point.getX(), 1.0)
        assertEquals(Point.getY(), 1.0)
    }