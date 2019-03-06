package tomasvolker.koofcv.statistics

import boofcv.alg.misc.ImageStatistics.*
import boofcv.struct.image.*

fun GrayU8.meanDiffAbs(other: GrayU8): Double = meanDiffAbs(this, other)
fun GrayU16.meanDiffAbs(other: GrayU16): Double = meanDiffAbs(this, other)
fun GrayS8.meanDiffAbs(other: GrayS8): Double = meanDiffAbs(this, other)
fun GrayS16.meanDiffAbs(other: GrayS16): Double = meanDiffAbs(this, other)
fun GrayS32.meanDiffAbs(other: GrayS32): Double = meanDiffAbs(this, other)
fun GrayS64.meanDiffAbs(other: GrayS64): Double = meanDiffAbs(this, other)
fun GrayF32.meanDiffAbs(other: GrayF32): Double = meanDiffAbs(this, other)
fun GrayF64.meanDiffAbs(other: GrayF64): Double = meanDiffAbs(this, other)
