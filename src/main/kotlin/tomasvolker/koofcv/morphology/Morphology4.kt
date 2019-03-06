package tomasvolker.koofcv.morphology

import boofcv.alg.filter.binary.BinaryImageOps
import boofcv.struct.image.GrayU8

fun GrayU8.erode4(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    BinaryImageOps.erode4(this, times, destination)

fun GrayU8.dilate4(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    BinaryImageOps.dilate4(this, times, destination)

fun GrayU8.close4(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    this.dilate4(times)
        .erode4(times, destination)

fun GrayU8.open4(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    this.erode4(times)
        .dilate4(times, destination)

fun GrayU8.edge4(destination: GrayU8? = null): GrayU8 =
    BinaryImageOps.edge4(this, destination)