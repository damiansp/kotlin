val authors = setOf("Shakespeare", "Hemingway", "Twain")
val writers = setOf("Twain", "Shakespeare", "Hemingway")
println(authors == writers)  // true
println(authors === writers)  // false; separate objects in memory