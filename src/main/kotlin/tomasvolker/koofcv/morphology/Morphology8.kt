package tomasvolker.koofcv.morphology

import boofcv.alg.filter.binary.BinaryImageOps
import boofcv.struct.image.GrayU8

fun GrayU8.erode8(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    BinaryImageOps.erode8(this, times, destination)

fun GrayU8.dilate8(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    BinaryImageOps.dilate8(this, times, destination)

fun GrayU8.close8(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    this.dilate8(times)
        .erode8(times, destination)

fun GrayU8.open8(times: Int = 1, destination: GrayU8? = null): GrayU8 =
    this.erode8(times)
        .dilate8(times, destination)

fun GrayU8.edge8(destination: GrayU8? = null): GrayU8 =
    BinaryImageOps.edge8(this, destination)

