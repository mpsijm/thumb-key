@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EN_MESSAGEASE_SYMBOLS_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    bottomRight = KeyC("v"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    longPress = KeyAction.CommitText("1"),
                ),
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    bottom = KeyC("l"),
                    topLeft = KeyC(
                        action = KeyAction.ComposeLastKey("`"),
                        color = ColorVariant.MUTED,
                    ),
                    top = KeyC(
                        action = KeyAction.ComposeLastKey("^"),
                        color = ColorVariant.MUTED,
                    ),
                    topRight = KeyC(
                        action = KeyAction.ComposeLastKey("´"),
                        color = ColorVariant.MUTED,
                    ),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    longPress = KeyAction.CommitText("2"),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    bottomLeft = KeyC("x"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    longPress = KeyAction.CommitText("3"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    right = KeyC("k"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    longPress = KeyAction.CommitText("4"),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    topLeft = KeyC("q"),
                    top = KeyC("u"),
                    topRight = KeyC("p"),
                    right = KeyC("b"),
                    bottomRight = KeyC("j"),
                    bottom = KeyC("d"),
                    bottomLeft = KeyC("g"),
                    left = KeyC("c"),
                    longPress = KeyAction.CommitText("5"),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    left = KeyC("m"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottom =
                        KeyC(
                            ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                        ),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    longPress = KeyAction.CommitText("6"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    topLeft = KeyC(
                        action = KeyAction.ComposeLastKey("~"),
                        color = ColorVariant.MUTED,
                    ),
                    top = KeyC(
                        action = KeyAction.ComposeLastKey("¨"),
                        color = ColorVariant.MUTED,
                    ),
                    topRight = KeyC("y"),
                    right = KeyC("*", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    longPress = KeyAction.CommitText("7"),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("w"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    longPress = KeyAction.CommitText("8"),
                ),
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    topLeft = KeyC("f"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC(
                        action = KeyAction.ComposeLastKey("°"),
                        color = ColorVariant.MUTED,
                    ),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    longPress = KeyAction.CommitText("9"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM.copy(longPress = KeyAction.CommitText("0")),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MESSAGEASE_SYMBOLS_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    bottomRight = KeyC("V"),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("$", color = MUTED),
                    longPress = KeyAction.CommitText("1"),
                ),
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    bottom = KeyC("L"),
                    topLeft = KeyC(
                        action = KeyAction.ComposeLastKey("`"),
                        color = ColorVariant.MUTED,
                    ),
                    top = KeyC(
                        action = KeyAction.ComposeLastKey("^"),
                        color = ColorVariant.MUTED,
                    ),
                    topRight = KeyC(
                        action = KeyAction.ComposeLastKey("´"),
                        color = ColorVariant.MUTED,
                    ),
                    right = KeyC("!", color = MUTED),
                    bottomRight = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("/", color = MUTED),
                    left = KeyC("+", color = MUTED),
                    longPress = KeyAction.CommitText("2"),
                ),
                KeyItemC(
                    center = KeyC("I", size = LARGE),
                    bottomLeft = KeyC("X"),
                    left = KeyC("?", color = MUTED),
                    bottomRight = KeyC("€", color = MUTED),
                    bottom = KeyC("=", color = MUTED),
                    longPress = KeyAction.CommitText("3"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    right = KeyC("K"),
                    topLeft = KeyC("{", color = MUTED),
                    topRight = KeyC("%", color = MUTED),
                    bottomRight = KeyC("_", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    longPress = KeyAction.CommitText("4"),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    topLeft = KeyC("Q"),
                    top = KeyC("U"),
                    topRight = KeyC("P"),
                    right = KeyC("B"),
                    bottomRight = KeyC("J"),
                    bottom = KeyC("D"),
                    bottomLeft = KeyC("G"),
                    left = KeyC("C"),
                    longPress = KeyAction.CommitText("5"),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    left = KeyC("M"),
                    bottom =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardCapslock),
                            capsModeDisplay = KeyDisplay.IconDisplay(Icons.Outlined.Copyright),
                            action = ToggleCapsLock,
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                    topLeft = KeyC("|", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                    bottomLeft = KeyC("@", color = MUTED),
                    longPress = KeyAction.CommitText("6"),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    topLeft = KeyC(
                        action = KeyAction.ComposeLastKey("~"),
                        color = ColorVariant.MUTED,
                    ),
                    top = KeyC(
                        action = KeyAction.ComposeLastKey("¨"),
                        color = ColorVariant.MUTED,
                    ),
                    topRight = KeyC("Y"),
                    right = KeyC("*", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    bottomRight = KeyC("\t", displayText = "⇥", color = MUTED),
                    longPress = KeyAction.CommitText("7"),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    top = KeyC("W"),
                    topRight = KeyC("'", color = MUTED),
                    right = KeyC("Z"),
                    bottomRight = KeyC(":", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomLeft = KeyC(",", color = MUTED),
                    longPress = KeyAction.CommitText("8"),
                ),
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    topLeft = KeyC("F"),
                    top = KeyC("&", color = MUTED),
                    topRight = KeyC(
                        action = KeyAction.ComposeLastKey("°"),
                        color = ColorVariant.MUTED,
                    ),
                    right = KeyC(">", color = MUTED),
                    bottomLeft = KeyC(";", color = MUTED),
                    left = KeyC("#", color = MUTED),
                    longPress = KeyAction.CommitText("9"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM.copy(longPress = KeyAction.CommitText("0")),
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EN_MESSAGEASE_SYMBOLS: KeyboardDefinition =
    KeyboardDefinition(
        title = "english messagease symbols",
        modes =
            KeyboardDefinitionModes(
                main = KB_EN_MESSAGEASE_SYMBOLS_MAIN,
                shifted = KB_EN_MESSAGEASE_SYMBOLS_SHIFTED,
                numeric = KB_EN_MESSAGEASE_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
