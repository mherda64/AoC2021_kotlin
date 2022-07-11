import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

fun readInput(name: String) = File("src/${name.substring(0, 5).lowercase()}", "$name.txt").readLines()

fun readInputAsInts(name: String) = readInput(name).map { it.toInt() }
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)
