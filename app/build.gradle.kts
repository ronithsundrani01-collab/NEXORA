plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.nexora.os"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.nexora.os"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.1"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }
}

dependencies {
    implementation("androidx.activity:activity-compose:1.9.2")
    implementation("androidx.compose.material3:material3:1.3.0")
}
