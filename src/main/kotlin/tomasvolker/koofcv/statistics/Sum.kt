package tomasvolker.koofcv.statistics

import boofcv.alg.misc.ImageStatistics.*
import boofcv.struct.image.*

fun GrayI<*>.sum(): Int = when(this) {
    is GrayU8 -> sum(this)
    is GrayU16 -> sum(this)
    is GrayS8 -> sum(this)
    is GrayS16 -> sum(this)
    is GrayS32 -> sum(this)
    else -> error("Invalid image type: ${this::class.java}")
}

fun GrayS64.sum(): Long = sum(this)
fun GrayF32.sum(): Float = sum(this)
fun GrayF64.sum(): Double = sum(this)
