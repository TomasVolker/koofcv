package tomasvolker.koofcv.statistics

import boofcv.alg.misc.ImageStatistics.*
import boofcv.struct.image.*

fun GrayI<*>.mean(): Double = when(this) {
    is GrayU8 -> mean(this)
    is GrayU16 -> mean(this)
    is GrayS8 -> mean(this)
    is GrayS16 -> mean(this)
    is GrayS32 -> mean(this)
    else -> error("Invalid image type: ${this::class.java}")
}

fun GrayS64.mean(): Double = mean(this)
fun GrayF32.mean(): Float = mean(this)
fun GrayF64.mean(): Double = mean(this)
