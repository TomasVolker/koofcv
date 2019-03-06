package tomasvolker.koofcv.morphology

import boofcv.alg.filter.binary.BinaryImageOps
import boofcv.struct.image.GrayU8

fun GrayU8.logicAnd(other: GrayU8, destination: GrayU8? = null) =
    BinaryImageOps.logicAnd(this, other, destination)

fun GrayU8.logicOr(other: GrayU8, destination: GrayU8? = null) =
    BinaryImageOps.logicOr(this, other, destination)

fun GrayU8.logicXor(other: GrayU8, destination: GrayU8? = null) =
    BinaryImageOps.logicXor(this, other, destination)

fun GrayU8.invert(destination: GrayU8? = null): GrayU8 =
    BinaryImageOps.invert(this, destination)