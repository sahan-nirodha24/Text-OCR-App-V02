## 🅰️📠 Text OCR App Version 02 📸🧾

**The Text OCR App Version 2** is an advanced Android application that leverages **Google ML Kit** to recognize and extract text from images. This version includes enhancements such as always-visible icons for the Copy, Capture, and Reset functions, along with improved user interface elements and functionality.

### Features ###

+ **Capture Image**
  +  Use the device's camera to capture an image.
  +  The captured image is processed to extract text using Optical Character Recognition (OCR).
 
+ **OCR Text Recognition**
  +  Extract and display text from the captured image.
  +  Display the recognized text in a scrollable TextView for easy reading.

+ **Copy Text**
  +  Copy the recognized text to the clipboard with a single click.
  +  The Copy button is always visible for quick access.
 
+ **Reset**
  + Clear the image and reset the app to its initial state.
  + The Reset button is always visible for user convenience.
 
+ **Splash Screen**
  + Displays a splash screen with a progress bar that shows the app's initialization progress from 0% to 100%.
 
### How It Works ###

+ **Splash Screen**
  + Upon launching the app, the splash screen is displayed with a progress bar indicating the initialization process.
 
+ **Capture Image**
  + The user clicks the "Capture" button to take a photo using the device's camera.
  + If camera permission is not granted, the app requests it.
  + Once permission is granted, the user can capture an image, which is then displayed in an ImageView.
 
+ **Text Recognition**
  + The captured image is processed using Google ML Kit’s text recognition API.
  + The recognized text is displayed in a scrollable TextView for better readability.

+ **Copy Text**
  + The user can copy the recognized text to the clipboard by clicking the “Copy” button.
  + A toast message confirms that the text has been copied.
 
+ **Reset**
  + The user can reset the app to its initial state by clicking the “Clear” button.
  + The app clears the displayed text and resets the image to a default placeholder.
 
### Screenshots Of the Text OCR App Version 02 ###

Splash Screen of the App on the Android Emulator
![Screenshot 2025-01-14 234111](https://github.com/user-attachments/assets/c89b49a2-0739-414c-aadb-2850be135aad)

Main Page of the App - Default View on the Android Emulator
![Screenshot 2025-01-14 234121](https://github.com/user-attachments/assets/a4a4b93b-39ae-4efa-9d90-1eb28dcc9221)

After Capturing the Image, The Main Page View is Displayed on the Android Emulator
![Screenshot 2025-01-14 234135](https://github.com/user-attachments/assets/9d8db34c-833a-44d5-9d10-8477a8cd6f9e)

After Pressing the Reset Button, The Main Page View is Displayed on the Android Emulator
![Screenshot 2025-01-14 234121](https://github.com/user-attachments/assets/a4a4b93b-39ae-4efa-9d90-1eb28dcc9221)
