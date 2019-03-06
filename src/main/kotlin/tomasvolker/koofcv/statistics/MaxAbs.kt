package tomasvolker.koofcv.statistics

import boofcv.alg.misc.ImageStatistics.*
import boofcv.struct.image.*

fun GrayI<*>.maxAbs(): Int = when(this) {
    is GrayU8 -> maxAbs(this)
    is GrayU16 -> maxAbs(this)
    is GrayS8 -> maxAbs(this)
    is GrayS16 -> maxAbs(this)
    is GrayS32 -> maxAbs(this)
    else -> error("Invalid image type: ${this::class.java}")
}

fun GrayS64.maxAbs(): Long = maxAbs(this)
fun GrayF32.maxAbs(): Float = maxAbs(this)
fun GrayF64.maxAbs(): Double = maxAbs(this)
