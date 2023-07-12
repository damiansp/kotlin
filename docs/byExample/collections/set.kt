fun main() {
    val newIssue: String = "some new issue"
    val extantIssue: String = "some extant issue"
    println("Issue: $newIssue ${getStatusLog(addIssue(newIssue))}")
    println("Issue: $extantIssue ${getStatusLog(addIssue(extantIssue))}")
}


val openIssues: MutableSet<String> = mutableSetOf(
    "some extant issue", "another extant issue", "yet another extant issue")

fun addIssue(issue: String): Boolean {
    return openIssues.add(issue)
}


fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered" else "duplicate rejected"
}