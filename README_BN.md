# Shadow Duel starter project
1. ZIP extract করো।
2. ফাইলগুলো GitHub repo-তে একই path-এ upload/replace করে Commit করো।
3. GitHub → Actions → Build Shadow Duel APK → workflow শেষ হলে Artifacts থেকে APK নাও।
- `index.html`: lobby, ninja-village background, fighting screen, buttons, generated ambient synth music.
- `AndroidManifest.xml`: landscape orientation.
- `MainActivity.java`: WebView load করে।
Note: এটি playable prototype, full 3D game নয়। Background music আলাদা MP3 নয়—Web Audio API দিয়ে তৈরি ambient loop; Music বোতাম চাপলে চালু হয়। Existing project-এর ফাইল replace করার আগে backup রাখবে।
