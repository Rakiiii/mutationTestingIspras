package dev.smurf.utils

import dev.smurf.commands.*
import dev.smurf.commands.List as CList

class TestConverter {
    fun convert(command: String) = CommandConst.values().find { it.key == command }.orUnknown().create()

    private enum class CommandConst(val key: String) {
        CONNECT("0") {
            override fun create() = Connect()
        },
        QUET("1") {
            override fun create() = Quit()
        },
        USER("2") {
            override fun create() = User()
        },
        PASS("3") {
            override fun create() = Pass()
        },
        DELE("4") {
            override fun create() = Dele()
        },
        LIST("5") {
            override fun create() = CList()
        },
        RETRY("6") {
            override fun create() = Retry()
        },
        STAT("7") {
            override fun create() = Stat()
        },
        UNKNOWN("") {
            override fun create() = Command { null }
        };

        abstract fun create(): Command
    }

    private fun CommandConst?.orUnknown() = this ?: CommandConst.UNKNOWN
}