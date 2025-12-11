# ClimaSense – Premium Weather App (Android + Kotlin)

ClimaSense is a **modern, premium-looking weather app** built for Android using **Kotlin**.  
It shows current weather information like **temperature, condition, humidity, wind speed, and AQI-style info** using a clean **glassmorphism UI**.

> 📱 Perfect for: **Academic projects, portfolio, resumes, and demo apps.**

---

## ✨ Features

- 🌍 **City-based weather**
  - Fetches weather data for a selected city (default: `Hyderabad`).
- ⛅ **Current weather details**
  - Temperature in °C  
  - Weather condition (e.g., "Mostly Sunny", "Cloudy")  
  - Humidity (%)  
  - Wind speed (km/h)
- 🎨 **Premium UI Design**
  - Dark theme
  - Glassmorphism card
  - Mini info cards for humidity, wind, and AQI
- ⚙️ **Kotlin-based implementation**
  - Uses `AsyncTask` (or can be upgraded to coroutines) for network calls.
- 🔐 **API-based data**
  - Uses **OpenWeatherMap API** to fetch live weather data.

---

## 🛠️ Tech Stack

- **Language:** Kotlin  
- **Minimum SDK:** as per your project (e.g., 21+)  
- **UI:** XML Layout
  - `activity_main.xml`
  - Custom drawable backgrounds (`glass_bg.xml`, `mini_card.xml`)
- **Network:**
  - `HttpsURLConnection` / `URL.readText()`  
  - OpenWeatherMap REST API (`https://api.openweathermap.org/data/2.5/weather`)

---

## 📁 Project Structure (Important Files)

```bash
app/src/main/java/com/example/weatherpremium/
│── MainActivity.kt        # Main screen logic

app/src/main/res/layout/
│── activity_main.xml      # Main UI layout (premium weather screen)

app/src/main/res/drawable/
│── glass_bg.xml           # Glass card background
│── mini_card.xml          # Small info cards background
