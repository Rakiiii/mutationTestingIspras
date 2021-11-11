package dev.smurf.utils

class InputConverter(
    private val testConverter: TestConverter = TestConverter(),
    private val resultConvert: ResultConverter = ResultConverter()
) {
    fun convert(str: String) = FSMTest(
        str.doubleSplit(' ', '/').doubleMap(testConverter::convert, resultConvert::convert)
    )

    fun String.doubleSplit(firstDelimiter: Char, secondDelimiter: Char): Pair<List<String>, List<String>> {
        val firstList = split(firstDelimiter)

        val fRes = mutableListOf<String>();
        val sRes = mutableListOf<String>()
        firstList.forEach {
            it.split(secondDelimiter).apply {
                fRes.add(first())
                sRes.add(last())
            }
        }

        return fRes to sRes
    }

    private fun <T, R> Pair<List<String>, List<String>>.doubleMap(
        fTransform: (String) -> T,
        sTransform: (String) -> R
    ): Pair<List<T>, List<R>> = first.map(fTransform) to second.map(sTransform)
}