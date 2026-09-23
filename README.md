# If you encounter any problems with this application, please feel free to contact us via a pull request or issues before proceeding with any further steps. I will delete This repo and app.

This app supports the open-source community, encourages student programmers, and supports individual app developers. I receive no revenue from it, and there are no ads. It does not contain any proprietary data or copyrighted libraries. It does not require root access or anything like that. Administrator privileges are only for uninstallation protection.If you encounter any problems with this application, please feel free to contact us via a pull request before proceeding with any further steps. I will delete it.
# KeepDroid (FreeDr0idv2)

![KeepDroid logo](docs/keepdroid-logo.png)

I signed the petition to support software freedom.
- https://c.org/msWBf6kfsy

KeepDroid is an Android 9+ Material 3 application designed under the FOSS philosophy to help users maintain complete visibility and ownership over their device management status.

## Purpose & Architecture

This project is a minimalist, local compatibility stub ensuring persistent availability of free and open-source applications via the standard Android Device Administrator API.

## Features & Requirements

- Material 3 UI with Monet dynamic colors, top app bar, visible device-admin entry, and localized resources for multiple languages.
- Includes the [FreeDroidWarn](https://github.com/woheller69/FreeDroidWarn) library and a summary of concerns by [Keep Android Open](https://keepandroidopen.org/ja/).
- Requires Android 9 / API 28+ (Android 12+ recommended for full UI features).

## Build & Metadata

```bash
export ANDROID_HOME=/path/to/android-sdk
./gradlew assembleDebug
```
- Version: `2` (`September302026notcoming`), Min SDK: `28`, Target SDK: `35`.

## Third-party notices & Disclaimer

FreeDroidWarn is under Apache License 2.0. KeepDroid does not exploit OS vulnerabilities or hide its process; admin mode requires explicit system confirmation.
