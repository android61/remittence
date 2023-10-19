fun main() {
    val remittence = 100
    val procent = 0.0075
    var amount = remittence * procent

    if ((remittence * procent) < 35) {
        println("Комиссия: 35 рублей.")
    }else {
        println("Комиссия: " + amount + " рублей.")
    }

}