# Virtual Art Gallery App

A virtual art gallery app designed for artists and art enthusiasts to showcase, explore, and interact with various types of art, including digital, <br>and video formats. The app creates a social network-like experience where artists can share their work, and users can discover, engage, and purchase artworks.

## **Features**

- **Art Display**: Showcase artworks in various formats (images, 3D models(in future), and videos).
- **User and Artist Profiles**: Separate profiles for users and artists to manage their content and interactions.
- **Video Artworks**: Stream and display video art with smooth playback using ExoPlayer.
- **Community Interaction**: Like, comment, share, and follow artists or other users.

## **Tech Stack**

- **Frontend**:
  - [Kotlin](https://kotlinlang.org/) - Programming language for Android development.
  - [Jetpack Compose](https://developer.android.com/jetpack/compose) - UI toolkit for building native Android UI.
  - [ExoPlayer](https://exoplayer.dev/) - For video playback.

- **Backend**:
  - [Firebase Firestore](https://firebase.google.com/products/firestore) - NoSQL cloud database for storing data (artworks, users, comments).
  - [Firebase Storage](https://firebase.google.com/products/storage) - For storing media files (images, videos, 3D models).
  - [Firebase Authentication](https://firebase.google.com/products/auth) - For managing user authentication.

- **Other Tools**:
  - [Firebase Analytics](https://firebase.google.com/products/analytics) - For tracking user engagement and analytics.
  - [Retrofit](https://square.github.io/retrofit/) - For making network requests.
  - [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - For dependency injection.



## **Usage**

1. **Create an Account**: Sign up as an artist or a user.
2. **Upload Artwork**: Artists can upload digital images, videos, or 3D models.
3. **Explore the Gallery**: Users can browse, view, and interact with artworks.
4. **Engage with the Community**: Follow artists, like, comment, and share artworks.

