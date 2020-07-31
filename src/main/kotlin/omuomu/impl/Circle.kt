package omuomu.impl

import omuomu.Point
import omuomu.Shape

import kotlin.math.*

public class Circle: Shape{

    private val center: Point
    private val radius: Double
    constructor(center: Point, radius: Double) {
        this.center = center
        this.radius = radius
    }

    override fun contains(p: Point):Boolean {
        return (this.center.getX() - p.getX()).pow(2) + (this.center.getY() - p.getY()).pow(2) <= radius.pow(2)
    }
}