# 🐰 Bunny Client - Setup & Build Guide

## Prerequisites

Before you start, make sure you have:

- **Java 21 JDK** - [Download here](https://www.oracle.com/java/technologies/downloads/#java21)
- **Git** - [Download here](https://git-scm.com/)
- **A text editor or IDE** (VS Code, IntelliJ IDEA recommended)

### Verify Java Installation:
```bash
java -version
```

Should output Java 21.x or higher.

---

## Quick Start (5 Minutes)

### 1. Clone the Repository
```bash
git clone https://github.com/xdMedestroyer11/Bunny-Client.git
cd Bunny-Client
```

### 2. Build the Project

**Windows:**
```bash
gradlew build
```

**Linux/Mac:**
```bash
chmod +x gradlew
./gradlew build
```

### 3. Find Your JAR
The compiled client will be at:
```
build/libs/bunny-client-1.0.0.jar
```

### 4. Install to Minecraft

1. Open your `.minecraft` folder
   - **Windows:** `%APPDATA%\.minecraft`
   - **Mac:** `~/Library/Application Support/minecraft`
   - **Linux:** `~/.minecraft`

2. Navigate to the `mods` folder (create if it doesn't exist)

3. Copy `bunny-client-1.0.0.jar` into the `mods` folder

4. Launch Minecraft with the **Fabric** profile

5. Enjoy! 🎉

---

## Development Setup

### Import into IDE

#### IntelliJ IDEA:
1. Open IntelliJ
2. Select **File → Open**
3. Navigate to the `Bunny-Client` folder
4. Click **Open**
5. Wait for indexing to complete

#### VS Code:
1. Open VS Code
2. **File → Open Folder**
3. Select `Bunny-Client`
4. Install recommended extensions (Java, Gradle)

---

## Common Tasks

### Run the Game (Development):
```bash
./gradlew runClient
```

This launches Minecraft with your mod loaded for testing.

### Clean Build:
```bash
./gradlew clean build
```

### Generate IDE Configs:
```bash
./gradlew idea      # IntelliJ IDEA
./gradlew eclipse   # Eclipse
```

---

## Troubleshooting

### "Gradle command not found"
- **Windows:** Use `gradlew.bat build` instead of `gradlew build`
- **Linux/Mac:** Make sure you ran `chmod +x gradlew`

### "Java version too low"
```bash
# Check your Java version
java -version

# If not Java 21, set JAVA_HOME
export JAVA_HOME=/path/to/java21  # Linux/Mac
set JAVA_HOME=C:\path\to\java21   # Windows
```

### Build fails with "duplicate class"
Delete the build folder and rebuild:
```bash
./gradlew clean build
```

### Mod won't load in Minecraft
1. Ensure you have **Fabric Loader** installed
2. Check that the JAR is in the correct **mods** folder
3. Verify you're using **Minecraft 1.21.1**
4. Check logs: `.minecraft/logs/latest.log`

---

## Adding Custom Features

### Add a New Command:
Create a new file in `src/main/java/com/bunnyclient/commands/`:

```java
package com.bunnyclient.commands;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import static net.minecraft.server.command.CommandManager.*;

public class MyCommand {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(literal("mybunny")
                .executes(context -> {
                    context.getSource().sendFeedback(
                        Text.literal("Bunny Client loaded!"), false
                    );
                    return 1;
                })
            );
        });
    }
}
```

Then initialize it in `BunnyClientClient.java`:
```java
MyCommand.register();
```

---

## Next Steps

1. ✅ Build and install the client
2. 📝 Add your own PvP features
3. 🎮 Test in-game
4. 📤 Release to the community!

---

## Support

Need help? 
- Check [Fabric Documentation](https://fabricmc.net/wiki/)
- Open an [Issue on GitHub](https://github.com/xdMedestroyer11/Bunny-Client/issues)
- Join the [Fabric Discord](https://discord.gg/v6v4pMv)

---

Happy coding! 🐰⚡
