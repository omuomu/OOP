package omuomu

class Point {
    private val x: Double
    private val y: Double
    constructor (x: Double, y: Double) {
        this.x = x
        this.y = y
    }

    public fun getX(): Double {
        return this.x
    }

    public fun getY(): Double {
        return this.y
    }
}