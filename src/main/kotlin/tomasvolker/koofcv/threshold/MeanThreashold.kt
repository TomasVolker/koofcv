package tomasvolker.koofcv.threshold

import boofcv.alg.filter.binary.GThresholdImageOps
import boofcv.struct.ConfigLength
import boofcv.struct.image.GrayU8
import boofcv.struct.image.ImageGray

fun <T: ImageGray<T>> T.localMeanThreshold(
    size: Double,
    destination: GrayU8? = null,
    scale: Double = 1.0,
    down: Boolean = true,
    work1: T? = null,
    work2: T? = null
): GrayU8 =
    GThresholdImageOps.localMean(
        this,
        destination,
        ConfigLength.fixed(size),
        scale,
        down,
        work1,
        work2
    )

fun <T: ImageGray<T>> T.localMeanThreshold(
    size: Size,
    destination: GrayU8? = null,
    scale: Double = 1.0,
    down: Boolean = true,
    work1: T? = null,
    work2: T? = null
): GrayU8 =
    GThresholdImageOps.localMean(
        this,
        destination,
        size.toConfigLength(),
        scale,
        down,
        work1,
        work2
    )
