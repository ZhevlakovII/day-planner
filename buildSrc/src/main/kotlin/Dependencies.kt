/**
 * Dependency file. It lists all the dependencies used in the application.
 * All dependencies are divided into logical and represent a pair
 * @param objectName The original or semantic name of the dependencies
 *
 * In object:
 * @param version Version of the library used
 * @param dependency Provided dependency
 */
object Dependencies {
    object DI {
        private const val hiltVersion = "2.44"
        private const val hiltNavigationVersion = "1.0.0"

        //implementation
        const val daggerHilt = "com.google.dagger:hilt-android:$hiltVersion"
        const val daggerHiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationVersion"

        //Kapt
        const val daggerHiltCompiler = "com.google.dagger:hilt-compiler:$hiltVersion"
    }

    object Compose {
        const val composeCompilerVersion = "1.3.2"
        private const val composeVersion = "1.2.1"
        private const val materialVersion = "1.0.0"

        //implementation
        const val compose = "androidx.compose.ui:ui:$composeVersion"
        const val composePreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
        const val composeMaterial3 = "androidx.compose.material3:material3:$materialVersion"

        //debugImplementation
        const val composeTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
        const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:$composeVersion"

        //androidTestImplementation
        const val composeJunitTest = "androidx.compose.ui:ui-test-junit4:$composeVersion"
    }

    object AndroidComponents {
        private const val ktxCoreVersion = "1.7.0"
        private const val lifecycleVersion = "2.5.1"
        private const val viewModelVersion = "2.5.1"
        private const val activityComposeVersion = "1.3.1"
        private const val junitTextExtVersion = "1.1.3"
        private const val espressoCoreVersion = "3.4.0"

        //implementation
        const val ktxCore = "androidx.core:core-ktx:$ktxCoreVersion"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$viewModelVersion"
        const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

        //androidTestImplementation
        const val junitTestExt = "androidx.test.ext:junit:$junitTextExtVersion"
        const val espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"
    }

    object Junit {
        private const val junitVersion = "4.13.2"

        //testImplementation
        const val junit = "junit:junit:$junitVersion"
    }

    object Room {
        private const val roomVersion = "2.4.3"

        //implementation
        const val room = "androidx.room:room-runtime:$roomVersion"

        //kapt
        const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
    }

    object Coroutines {
        private const val coroutinesVersion = "1.6.4"

        //implementation
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    }

    object NavigationComponent {
        private const val navigationVersion = "2.5.2"

        //implementation
        const val navigationCompose = "androidx.navigation:navigation-compose:$navigationVersion"
    }
}