package tomasvolker.koofcv.statistics

import boofcv.alg.misc.ImageStatistics.*
import boofcv.struct.image.*

fun GrayI<*>.min(): Int = when(this) {
    is GrayU8 -> min(this)
    is GrayU16 -> min(this)
    is GrayS8 -> min(this)
    is GrayS16 -> min(this)
    is GrayS32 -> min(this)
    else -> error("Invalid image type: ${this::class.java}")
}

fun GrayS64.min(): Long = min(this)
fun GrayF32.min(): Float = min(this)
fun GrayF64.min(): Double = min(this)
