package tomasvolker.koofcv.constructor

import boofcv.struct.image.GrayU8
import tomasvolker.koofcv.interation.forEachIndexXY

inline fun grayU8(
    width: Int,
    height: Int,
    init: (x: Int, y: Int)->Int
): GrayU8 = GrayU8(width, height).apply {
    forEachIndexXY { index, x, y ->
        this.data[index] = init(x, y).toByte()
    }
}