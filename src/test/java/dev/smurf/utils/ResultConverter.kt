package dev.smurf.utils

import dev.smurf.results.Err
import dev.smurf.results.Ok
import dev.smurf.results.Result

class ResultConverter {
    fun convert(str: String) = ResultConst.values().find { str == it.key }.orErr().result

    private enum class ResultConst(val key: String, val result: Result) {
        OK("0", Ok.OK),
        ERR("1", Err.ERR)
    }

    private fun ResultConst?.orErr() = this ?: ResultConst.ERR
}