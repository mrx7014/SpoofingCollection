# SpoofingCollection
<img src"assets/banner.jpg">

A collection of Magisk root modules and LSPosed (Xposed) modules for spoofing Android device fingerprints (manufacturer, model, build props, etc.) to appear as different devices.

Each sub-project targets a specific device profile and ships two components:

1. **Magisk Module** — patches `build.prop` / `system.prop` at boot via Magisk's module system.
2. **LSPosed Module** — an Xposed hook (loaded through LSPosed) that intercepts and overrides device-identifying API calls (`Build.MODEL`, `Build.MANUFACTURER`, etc.) at runtime, for apps that read these values programmatically instead of relying on system properties alone.

## Included Device Profiles
| Folder | Target Device | Package |
|---|---|---|
| `S26Ultra-Spoofer` | Samsung Galaxy S26 Ultra | `com.mrx7014.s26uspoofer` |
| `OnePlus15-Spoofer` | OnePlus 15 | `com.mrx7014.oplus15spoofer` |
| `TabS10Ultra-Spoofer` | Samsung Galaxy Tab S10 Ultra | `com.mrx7014.tabs10uspoofer` |
| `Pixel10ProXL-Spoofer` | Google Pixel 10 Pro XL | `com.mrx7014.p10xlspoofer` |
| `PixelTablet-Spoofer` | Google Pixel Tablet | `com.mrx7014.gpxtabletspoofer` |
| `Xiaomi17ProMax-Spoofer` | Xiaomi 17 Pro Max | `com.mrx7014.x17pmspoofer` |

## Repository Structure

Each device folder follows the same layout:

```
<Device>-Spoofer/
├── Module/                          # Magisk module
│   ├── META-INF/com/google/android/
│   │   ├── update-binary
│   │   └── updater-script
│   ├── customize.sh
│   ├── module.prop
│   └── system.prop
└── LSPosed/                         # Xposed/LSPosed module (Android Studio project)
    ├── app/
    │   ├── src/main/
    │   │   ├── java/com/mrx7014/.../*.java   # Hook entry point
    │   │   ├── assets/xposed_init             # Xposed module registration
    │   │   ├── res/                            # Standard Android resources
    │   │   └── AndroidManifest.xml
    │   ├── build.gradle
    │   └── proguard-rules.pro
    ├── build.gradle
    ├── settings.gradle
    ├── gradle.properties
    ├── gradlew / gradlew.bat
    └── gradle/wrapper/
```

## Requirements
- Rooted Android device with **Magisk**
- **LSPosed** framework installed (Zygisk or a compatible LSPosed build)
- Android Studio / Gradle for building the LSPosed APKs from source

## Installation
**Magisk module:**
1. Zip the contents of `Module/` (not the `Module` folder itself).
2. Flash the zip via Magisk Manager → Modules → Install from storage.
3. Reboot.

**LSPosed module:**
1. Build or download the APK for the target device profile.
2. Install the APK on your device.
3. Enable it inside the LSPosed Manager app and select the target scope (system framework / specific apps).
4. Reboot or force-stop the scoped apps for the hook to take effect.

## Notes
- Each module is scoped to a single device profile — install only the one matching the identity you want to spoof.
- The Magisk module changes persistent system properties; the LSPosed module additionally hooks runtime API calls for apps that don't rely solely on system properties.
- Use on your own device only, and be aware that spoofing device identity may violate the terms of service of some apps or services.

## License
Specify a license here (e.g., MIT) if you intend to open-source this publicly.