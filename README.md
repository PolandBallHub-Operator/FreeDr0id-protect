# last desperate attempt
# KeepDr0id(FreeDr0idv2）

![KeepDroid logo](docs/keepdroid-logo.png)

I signed the petition.
- https://c.org/msWBf6kfsy
KeepDroid is an Android 9+ Material 3 application that keeps device-management status visible and user-controlled. Its package name is `com.g00gle.andr0id.verifier`.
- 0=o
Ensure persistent availability using Android Device Administrator API. Having administrator privileges makes it impossible to overwrite. On devices running Android 16, Developer Verifier is not a system app. While the possibility is unclear, this can prevent auto-installation.
## Features

- Material 3 UI with Android 12+ Monet dynamic colors.
- A normal Android top app bar with a centered, bold title.
- A visible device-administrator entry that can be enabled or disabled through Android system settings.
- Displays **Blocking verifier** in the app when the device administrator is active.
- Includes the [FreeDroidWarn](https://github.com/woheller69/FreeDroidWarn) library.
- Includes an original, concise summary of the concerns described by [Keep Android Open](https://keepandroidopen.org/ja/), rather than reproducing the site's text.
- Adaptive Icon support with the provided foreground and monochrome artwork. On Android 12+, the icon background uses the system Monet accent color.
- Localized resources for English, Japanese, German, French, Spanish, Korean, and Simplified Chinese.

## Requirements

- Android 9 / API 28 or newer.
- Android 12 or newer is recommended for full Monet dynamic-color and Adaptive Icon behavior.

## Build

```bash
export ANDROID_HOME=/path/to/android-sdk
./gradlew assembleDebug
```

The debug APK is generated at `app/build/outputs/apk/debug/app-debug.apk`.

Current application metadata:

- Application ID: `com.g00gle.andr0id.verifier`
- Designed as a drop-in replacement for the verification namespace.0→o
- Version code: `2`
- Version name: `September302026notcoming`
- Minimum SDK: `28`
- Target SDK: `35`

## Third-party notices

FreeDroidWarn is included under the Apache License, Version 2.0. See [`THIRD_PARTY_LICENSES.txt`](THIRD_PARTY_LICENSES.txt) and the upstream project for its source and license terms.

## Disclaimer

KeepDroid does not hide its status or prevent removal. Enabling device-admin mode is always confirmed by Android system settings, and users can manage the administrator from the system UI.
