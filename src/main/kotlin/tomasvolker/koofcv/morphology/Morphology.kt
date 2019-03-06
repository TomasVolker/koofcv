package tomasvolker.koofcv.morphology

import boofcv.alg.filter.binary.BinaryImageOps.*
import boofcv.struct.image.GrayU8

fun GrayU8.thin(maxIterations: Int = -1, destination: GrayU8? = null): GrayU8 =
    thin(this, maxIterations, destination)

fun GrayU8.removePointNoise(destination: GrayU8? = null) =
    removePointNoise(this, destination)

