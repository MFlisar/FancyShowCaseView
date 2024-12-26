plugins {
    id("com.android.library")
    id("kotlin-android")
}
//apply plugin: 'com.jfrog.bintray'
//apply plugin: 'com.github.dcendents.android-maven'

//ext {
//
//    bintrayRepo = "fancyshowcaseview"
//    bintrayName = "fancyshowcaseview"
//
//    publishedGroupId = 'me.toptas.fancyshowcase'
//    libraryName = 'fancyshowcaseview'
//    artifact = 'fancyshowcaseview'
//
//    libraryVersion = "$version_name"
//
//    libraryDescription = 'An easy-to-use customisable show case view with circular reveal animation.'
//
//    siteUrl = 'https://github.com/faruktoptas/FancyShowCaseView'
//    gitUrl = 'https://github.com/faruktoptas/FancyShowCaseView'
//
//    developerId = 'faruktoptas'
//    developerName = 'Faruk Toptas'
//    developerEmail = 'faruktoptas@gmail.com'
//
//    licenseName = 'The Apache Software License, Version 2.0'
//    licenseUrl = 'http://www.apache.org/licenses/LICENSE-2.0.txt'
//    allLicenses = ["Apache-2.0"]
//}


android {

    namespace = "me.toptas.fancyshowcase"

    compileSdk = app.versions.compileSdk.get().toInt()

    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        minSdk = app.versions.minSdk.get().toInt()
        
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            consumerProguardFiles("proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    lint {
        abortOnError = false
    }
}

dependencies {
    implementation(androidx.appcompat)
}

repositories {
    mavenCentral()
    google()
}

//if (project.rootProject.file('local.properties').exists()) {
//    apply from: 'https://raw.githubusercontent.com/wajahatkarim3/JCenter-Gradle-Scripts/master/install.gradle'
//    apply from: 'https://raw.githubusercontent.com/wajahatkarim3/JCenter-Gradle-Scripts/master/bintray.gradle'
//}