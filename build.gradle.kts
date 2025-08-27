plugins {
    id("com.android.application") version "8.7.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false // Tetap menggunakan versi Kotlin yang kompatibel jika diperlukan
    id("org.jetbrains.kotlin.kapt") version "1.9.22" apply false // Tetap menggunakan versi Kapt yang kompatibel jika diperlukan
    id("com.google.dagger.hilt.android") version "2.48" apply false
}