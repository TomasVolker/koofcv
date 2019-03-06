package tomasvolker.koofcv.statistics

import boofcv.alg.misc.ImageStatistics.*
import boofcv.struct.image.*

fun GrayI<*>.max(): Int = when(this) {
    is GrayU8 -> max(this)
    is GrayU16 -> max(this)
    is GrayS8 -> max(this)
    is GrayS16 -> max(this)
    is GrayS32 -> max(this)
    else -> error("Invalid image type: ${this::class.java}")
}

fun GrayS64.max(): Long = max(this)
fun GrayF32.max(): Float = max(this)
fun GrayF64.max(): Double = max(this)
