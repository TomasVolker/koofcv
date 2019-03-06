package tomasvolker.koofcv.constructor

import boofcv.struct.image.GrayF32
import tomasvolker.koofcv.interation.forEachIndexXY

inline fun grayF32(
    width: Int,
    height: Int,
    init: (x: Int, y: Int)->Float
): GrayF32 = GrayF32(width, height).apply {
    forEachIndexXY { index, x, y ->
        this[x, y] = init(x, y)
    }
}