fun main() {
    val amount: Int = 5000 //сумма покупки в настоящее время
    val previousAmount: Int = 15000 //сумма предыдущих покупок

    var discount = when(previousAmount){
        in 0..1000 -> 0
        in 1001..10000 -> 100
        else -> amount/100*5
    }
    var summ = amount-discount //сумма оплаты до дополнительной скидки
    var regularСustomer: Boolean = true
    if (regularСustomer == true) {
        println("Как постоянному покупателю сумма покупки будет равна = ${summ+summ/100*1} р.")
            } else {
                println("Сумма покупки составила $summ р.")
    }


}