# SocialCops-Video-App-demo
SocialCops-Video-App-demo is my submission to the challenge hosted by SocialCops as part of their hiring program.

### Challenge
- A video should be saved in the internal storage while user is streaming it 
- You can use this link to access the video: https://socialcops.com/images/old/spec/home/header-img-background_video-1920-480.mp4
- Make sure there is a single request going to the server for streaming and saving on the Android phone

**All successfully completed.**

# Documentation

### Libraries used 

- [Android Video Cache](https://github.com/danikula/AndroidVideoCache) - This library adds caching support to VideoView and it is because of this library that there is a single request going to the server for streaming and saving.

### Classes: 

1. MainActivity : Initialization, assignment and calling of all functions related to video URL fetching, streaming, caching and playing.

2. CacheManager : A class to manage caching. If there is no caching server, it is built and returned. If it exists, it is returned.

3. Utils : All caching related functions like getting the directory, cleaning it etc. reside in this class.
