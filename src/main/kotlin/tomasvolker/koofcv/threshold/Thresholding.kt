package tomasvolker.koofcv.threshold

import boofcv.alg.filter.binary.GThresholdImageOps
import boofcv.struct.ConfigLength
import boofcv.struct.image.*

fun <T: ImageGray<T>> T.threshold(
    threshold: Double,
    destination: GrayU8? = null,
    down: Boolean = true
): GrayU8 =
    GThresholdImageOps.threshold(
        this,
        destination,
        threshold,
        down
    ) ?: error("null image")


sealed class Size

data class Fixed(val pixels: Double): Size()
data class Relative(
    val ratio: Double,
    val minimum: Int
): Size()

fun Size.toConfigLength(): ConfigLength = when(this) {
    is Fixed -> ConfigLength.fixed(pixels)
    is Relative -> ConfigLength.relative(ratio, minimum)
}
