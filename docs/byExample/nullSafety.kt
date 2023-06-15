var neverNull: String = "I cannot be null"
//neverNull = null  // compilation err

var nullable: String? = "I am ok with the nulls"
nullable = null

var inferredNonNull = "Compiler defaults me to null"
//inferredNonNull = null  // compilation err


fun strLength(notNull: String): Int {
    return notNull.length
}

strLength(neverNull) // ok
strLength(nullable)  // comp err


fun descrString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Null or empty string"
    }
}