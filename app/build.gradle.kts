plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.websarva.wings.android.yamii"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.websarva.wings.android.yamii"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    signingConfigs {
        create("release") {
            storeFile = file("C:/Users/zetsu/androidkeysasd.jks")
            storePassword = "karanosyoujo1"
            keyAlias = "key0"
            keyPassword = "karanosyoujo1"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
        }
        getByName("debug"){
            isDebuggable=false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}