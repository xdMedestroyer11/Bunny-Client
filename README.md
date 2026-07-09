# 🐰 Bunny Client

A custom Minecraft PvP client optimized for SMP videos with maximum performance enhancements.

**Version:** 1.21.1  
**Loader:** Fabric  
**Status:** In Development

---

## 🚀 Features

### Performance Mods Included:
- **Sodium** - Advanced rendering optimization
- **Lithium** - Server-side optimizations
- **Phosphor** - Lighting engine optimization
- **Entity Culling** - Reduce unnecessary entity rendering
- **Lazy DFU** - Faster startup times
- **Krypton** - Network optimization
- **Starlight** - Improved lighting

### Planned Features:
- ✨ Custom PvP HUD
- 🎯 Combat utilities
- 🏷️ Name tags and player tracking
- ⚡ Performance monitoring
- 🎨 Customizable GUI themes
- 🎥 Content creator tools for video recording

---

## 📥 Installation

### Prerequisites:
- Java 21 or higher
- Fabric Loader 0.15.10+

### Steps:
1. Download the latest `.jar` release
2. Place it in your `.minecraft/mods` folder
3. Launch Minecraft with the Fabric profile
4. Enjoy!

---

## 🔧 Development Setup

### Build from Source:

```bash
git clone https://github.com/xdMedestroyer11/Bunny-Client.git
cd Bunny-Client
```

### On Windows:
```bash
./gradlew build
```

### On Linux/Mac:
```bash
chmod +x gradlew
./gradlew build
```

The compiled JAR will be in `build/libs/bunny-client-1.0.0.jar`

---

## 📦 Project Structure

```
Bunny-Client/
├── src/
│   ├── main/
│   │   ├── java/com/bunnyclient/
│   │   │   ├── BunnyClient.java (Main mod class)
│   │   │   ├── client/ (Client-side code)
│   │   │   └── mixin/ (Mixins for optimization)
│   │   └── resources/
│   │       ├── fabric.mod.json (Mod metadata)
│   │       └── bunnyclient.mixins.json (Mixin config)
├── build.gradle.kts (Build configuration)
├── settings.gradle.kts (Gradle settings)
└── README.md
```

---

## 🎮 Usage

After installation, Bunny Client will automatically:
- Load all performance mods
- Optimize rendering and lighting
- Improve network performance
- Reduce CPU/GPU load

For best results:
1. Go to Video Settings → Graphics → Fast
2. Enable VSync if you have high FPS
3. Adjust render distance based on your hardware

---

## 📝 Contributing

Want to add features? Follow these steps:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/awesome-feature`
3. Make your changes and test
4. Commit: `git commit -m "Add awesome feature"`
5. Push: `git push origin feature/awesome-feature`
6. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License - see LICENSE file for details.

---

## 👤 Author

**xdMedestroyer11**  
GitHub: [@xdMedestroyer11](https://github.com/xdMedestroyer11)

---

## 🐛 Bug Reports

Found a bug? Open an [Issue](https://github.com/xdMedestroyer11/Bunny-Client/issues) and describe:
- What happened
- Steps to reproduce
- Your system specs
- Minecraft version

---

## 📢 Support

Need help? Check out:
- [Fabric Wiki](https://fabricmc.net/wiki/)
- [GitHub Issues](https://github.com/xdMedestroyer11/Bunny-Client/issues)

---

Made with ❤️ for the Minecraft PvP community! 🐰⚡
