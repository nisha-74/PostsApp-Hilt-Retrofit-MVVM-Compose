# 📱 Posts App — Hilt + Retrofit + MVVM + Jetpack Compose

A modern Android **Posts App** built using **Jetpack Compose**, **MVVM architecture**, **Hilt Dependency Injection**, and **Retrofit** for fetching posts from a REST API.

## 🚀 Tech Stack

* **Kotlin**
* **Jetpack Compose**
* **MVVM Architecture**
* **Hilt** — Dependency Injection
* **Retrofit** — REST API calls
* **Coroutines**
* **StateFlow**
* **ViewModel**
* **Repository Pattern**
* **Material 3**

## ✨ Features

* Fetch posts from a REST API
* Display posts using Jetpack Compose
* MVVM architecture
* Dependency injection using Hilt
* API integration using Retrofit
* State management using StateFlow
* Clean separation of UI, ViewModel, Repository, and API layers
* Loading and error state handling
  ## 📱 App Preview

<p align="center">
  <img src="screenshorts/ui.png" width="300" alt="Weather App Screenshot"/>
</p>

## 🏗️ Architecture

```text
UI (Jetpack Compose)
        ↓
    ViewModel
        ↓
    Repository
        ↓
     Retrofit
        ↓
     REST API
```

## 📂 Project Structure

```text
com.example.postsapp
│
├── data
│   ├── api
│   │   └── PostApi.kt
│   │
│   ├── model
│   │   └── Post.kt
│   │
│   └── repository
│       └── PostRepository.kt
│
├── di
│   └── AppModule.kt
│
├── presentation
│   ├── screen
│   │   └── PostScreen.kt
│   │
│   └── viewmodel
│       └── PostViewModel.kt
│
└── MainActivity.kt
```

## 🔌 API

This project uses a REST API to retrieve post data.

Example endpoint:

```text
GET /posts
```

The API response is converted into Kotlin data classes and displayed in the Compose UI.

## 🧩 Key Concepts

### Hilt

Hilt is used for dependency injection, making it easier to provide and manage dependencies such as Retrofit and repositories.

### Retrofit

Retrofit is used to communicate with the REST API and retrieve posts.

### MVVM

The application follows the MVVM pattern:

```text
Model → Repository → ViewModel → UI
```

### StateFlow

`StateFlow` is used to expose UI state from the ViewModel and automatically update the Compose UI when the state changes.

## 📸 Screenshots

### Posts Screen

![Posts App Screenshot](screenshots/posts_screen.png)

> Add your screenshot inside the `screenshots` folder with the filename `posts_screen.png`.

## 🛠️ How to Run

1. Clone the repository.

```bash
git clone https://github.com/nisha-74/PostsApp-Hilt-Retrofit-MVVM-Compose.git
```

2. Open the project in Android Studio.

3. Sync Gradle dependencies.

4. Run the application on an emulator or Android device.

## 👩‍💻 Author

**Nisha Kumari**

Android Developer | Kotlin | Jetpack Compose | MVVM

GitHub: [nisha-74](https://github.com/nisha-74)
