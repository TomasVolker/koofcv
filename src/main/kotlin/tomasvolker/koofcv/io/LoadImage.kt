package tomasvolker.koofcv.io

import boofcv.io.image.UtilImageIO
import boofcv.struct.image.*
import java.io.File

inline fun <reified I: ImageGray<I>> loadImage(path: String): I =
    UtilImageIO.loadImage<I>(path, I::class.java)

fun <I: ImageBase<I>> loadImage(
    file: File,
    imageType: ImageType<I>,
    orderRgb: Boolean = true
): I = UtilImageIO.loadImage(file, orderRgb, imageType)

fun ImageBase<*>.saveImage(path: String) =
    UtilImageIO.saveImage(this, path)

inline fun <reified I: ImageGray<I>> planarTypeOf(bands: Int): ImageType<Planar<I>> =
        ImageType.pl(bands, I::class.java)
