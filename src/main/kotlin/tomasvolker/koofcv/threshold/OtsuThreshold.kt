package tomasvolker.koofcv.threshold

import boofcv.alg.filter.binary.GThresholdImageOps
import boofcv.struct.ConfigLength
import boofcv.struct.image.GrayU8
import boofcv.struct.image.ImageGray

fun <T: ImageGray<T>> T.localOtsuThreshold(
    size: Size,
    destination: GrayU8? = null,
    otsu2: Boolean = false,
    tuning: Double = 0.0,
    scale: Double = 1.0,
    down: Boolean = true
): GrayU8 =
    GThresholdImageOps.localOtsu(
        this,
        destination,
        otsu2,
        size.toConfigLength(),
        tuning,
        scale,
        down
    )

fun <T: ImageGray<T>> T.localOtsuThreshold(
    size: Double,
    destination: GrayU8? = null,
    otsu2: Boolean = false,
    tuning: Double = 0.0,
    scale: Double = 1.0,
    down: Boolean = true
): GrayU8 =
    GThresholdImageOps.localOtsu(
        this,
        destination,
        otsu2,
        ConfigLength.fixed(size),
        tuning,
        scale,
        down
    )
