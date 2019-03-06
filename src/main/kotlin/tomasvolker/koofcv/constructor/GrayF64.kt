package tomasvolker.koofcv.constructor

import boofcv.struct.image.GrayF64
import tomasvolker.koofcv.interation.forEachIndexXY

inline fun grayF64(
    width: Int,
    height: Int,
    init: (x: Int, y: Int)->Double
): GrayF64 = GrayF64(width, height).apply {
    forEachIndexXY { index, x, y ->
        this[x, y] = init(x, y)
    }
}