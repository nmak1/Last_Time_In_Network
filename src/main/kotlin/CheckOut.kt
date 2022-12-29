const val DAY : Int = 24*60*60
const val HOUR : Int = 60*60
const val MIN : Int = 60

fun CheckMinuts(min: Int): String = when (min % 10) {

    1 -> "минуту"
    2, 3, 4 -> "минтуты"
    else -> "минут"
}

fun CheckHours(hours: Int): String = when (hours % 10) {

    1 -> "час"
    2, 3, 4 -> "часа"
    else -> "часов"
}

fun CheckedOut (text: String,countSec:Int):String {
    var answer = when {
        countSec > 3*DAY -> {
            "давно"
        }
        countSec <= 3*DAY &&  countSec > 2*DAY -> {
            "вчера"
        }
        countSec <= 2*DAY &&  countSec > 1*DAY -> {
            "сегодня"
        }
        countSec in (HOUR + 1)..DAY ->{
            val hours : Int = (countSec/(HOUR)).toInt()
            "$hours " + CheckHours(hours) + " назад"
        }
        countSec in (MIN + 1)..HOUR ->  {
            val minutes : Int = (countSec/(MIN)).toInt()
            "$minutes " + CheckMinuts(minutes) + " назад"}
        else -> {"только что"}
    }
return text+ answer
}