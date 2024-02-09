package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardDefinition
import com.dessalines.thumbkey.utils.KeyboardDefinitionModes
import com.dessalines.thumbkey.utils.KeyboardDefinitionSettings
import com.dessalines.thumbkey.utils.autoCapitalizeI
import com.dessalines.thumbkey.utils.autoCapitalizeIApostrophe

val KB_EN_TWO_HANDS_SYMBOLS_MESSAGEASE_MAIN =
    KeyboardC(
        listOf(
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[0] +
                    KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[0].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[1] +
                    KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[1].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[2] +
                    KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[2].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[3] +
                    KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[3].subList(0, 1),
        ),
    )

val KB_EN_TWO_HANDS_SYMBOLS_MESSAGEASE_SHIFTED =
    KeyboardC(
        listOf(
            KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[0] +
                    KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[0].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[1] +
                    KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[1].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[2] +
                    KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[2].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[3] +
                    KB_EN_MESSAGEASE_SYMBOLS_SHIFTED.arr[3].subList(0, 1),
        ),
    )

val NUMERIC_KEYBOARD_TWO_HANDS_MESSAGEASE =
    KeyboardC(
        listOf(
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[0] +
                    KB_EN_MESSAGEASE_NUMERIC.arr[0].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[1].subList(0, 3) +
                    listOf(ABC_KEY_ITEM) +
                    KB_EN_MESSAGEASE_NUMERIC.arr[1].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[2] +
                    KB_EN_MESSAGEASE_NUMERIC.arr[2].subList(0, 3),
            KB_EN_MESSAGEASE_SYMBOLS_MAIN.arr[3] +
                    KB_EN_MESSAGEASE_NUMERIC.arr[3].subList(0, 2),
        ),
    )

val KB_EN_TWO_HANDS_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english two-hands symbols messagease",
        modes =
        KeyboardDefinitionModes(
            main = KB_EN_TWO_HANDS_SYMBOLS_MESSAGEASE_MAIN,
            shifted = KB_EN_TWO_HANDS_SYMBOLS_MESSAGEASE_SHIFTED,
            numeric = NUMERIC_KEYBOARD_TWO_HANDS_MESSAGEASE,
        ),
        KeyboardDefinitionSettings(
            autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
        ),
    )
