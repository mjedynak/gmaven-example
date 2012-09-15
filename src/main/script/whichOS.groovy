import org.apache.commons.lang3.SystemUtils

if (SystemUtils.IS_OS_WINDOWS) {
    println("running on Windows!")
} else {
    println("running on Unix!")
}