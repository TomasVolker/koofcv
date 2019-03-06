package tomasvolker.koofcv.statistics

import boofcv.alg.misc.ImageStatistics.*
import boofcv.struct.image.*

fun GrayU8.meanDiffSq(other: GrayU8): Double = meanDiffSq(this, other)
fun GrayU16.meanDiffSq(other: GrayU16): Double = meanDiffSq(this, other)
fun GrayS8.meanDiffSq(other: GrayS8): Double = meanDiffSq(this, other)
fun GrayS16.meanDiffSq(other: GrayS16): Double = meanDiffSq(this, other)
fun GrayS32.meanDiffSq(other: GrayS32): Double = meanDiffSq(this, other)
fun GrayS64.meanDiffSq(other: GrayS64): Double = meanDiffSq(this, other)
fun GrayF32.meanDiffSq(other: GrayF32): Double = meanDiffSq(this, other)
fun GrayF64.meanDiffSq(other: GrayF64): Double = meanDiffSq(this, other)
