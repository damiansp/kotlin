fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}


const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MuatableMap<Int, Int> = mutableMapOf(
    1 to 100, 2 to 200, 3 to 300)
val EZPassReport: Map<Int, Int> = EZPassAccounts


fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { k, v -> println("ID $k: credit $v") }
}


fun updatePointsCredit(accountID: Int) {
    if (EZPassAccounts.containsKey(accountID)) {
        println("Updating $accountID...")
        EZPassAccounts[accountID] = (
            EZPassAccounts.getValue(accountID) + POINTS_X_PASS)
    } else {
        println(
            "Error: Trying to update unexisting account (id: $accountID)")
    }
}