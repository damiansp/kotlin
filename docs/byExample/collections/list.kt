fun main() {
    addSysUser(4)
    println("Total superusers: ${getSysSudoers().size}")
    getSysSudoers().forEach {
        i -> println("Info on user $i...")
    }
    //getSysSoers().add(5) // read-only: compile err
}


val sysUsers: MutableList<Int> = mutableListf(1, 2, 3)
val sudoers: List<Int> = sysUsers


fun addSysUser(newUser: Int) {
    sysUsers.add(newUser)
}


fun getSysSudoers(): List<Int> {
    return sudoers
}