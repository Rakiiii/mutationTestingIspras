package dev.smurf.utils

import dev.smurf.commands.Command
import dev.smurf.results.Result

data class FSMTest(val testLine: List<Command>, val expected: List<Result>) {
    constructor(pair: Pair<List<Command>, List<Result>>) : this(pair.first, pair.second)
}
