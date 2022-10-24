plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = Config.namespace
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationName
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }

        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.composeCompilerVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    //Hilt
    implementation(Dependencies.DI.daggerHilt)
    implementation(Dependencies.DI.daggerHiltNavigation)
    kapt(Dependencies.DI.daggerHiltCompiler)

    //Room
    implementation(Dependencies.Room.room)
    kapt(Dependencies.Room.roomCompiler)

    //Coroutines
    implementation(Dependencies.Coroutines.coroutines)

    //Android
    implementation(Dependencies.AndroidComponents.activityCompose)
    implementation(Dependencies.AndroidComponents.ktxCore)
    implementation(Dependencies.AndroidComponents.viewModel)
    implementation(Dependencies.AndroidComponents.lifecycleRuntime)

    //Navigation
    implementation(Dependencies.NavigationComponent.navigationCompose)

    //Compose
    implementation(Dependencies.Compose.compose)
    implementation(Dependencies.Compose.composePreview)
    implementation(Dependencies.Compose.composeMaterial3)
    debugImplementation(Dependencies.Compose.composeTooling)
    debugImplementation(Dependencies.Compose.composeTestManifest)
}