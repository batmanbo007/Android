object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        var list = mutableListOf<Signal>()
        var i = 0
        var n = number
        while (n > 0) {
            if (n % 2 == 1) {
                when (i) {
                    0 -> list.add(Signal.WINK)
                    1 -> list.add(Signal.DOUBLE_BLINK)
                    2 -> list.add(Signal.CLOSE_YOUR_EYES)
                    3 -> list.add(Signal.JUMP)
                    else -> list.reverse()
                }
            }
            i++
            n /= 2
        }
        return list
    }
}