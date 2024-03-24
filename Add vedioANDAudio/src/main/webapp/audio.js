const express = require('express');
const multer = require('multer');
const path = require('path');

const app = express();
const port = 3000;

// Set up multer for handling file uploads
const storage = multer.diskStorage({
    destination: function (req, file, cb) {
        cb(null, 'uploads/') // specify the upload directory
    },
    filename: function (req, file, cb) {
        // generate a unique filename
        cb(null, `${file.fieldname}-${Date.now()}${path.extname(file.originalname)}`)
    }
});
const upload = multer({ storage: storage });

// Serve static files from the 'public' directory
app.use(express.static('public'));

// Route for uploading video file
app.post('/upload/video', upload.single('video'), (req, res) => {
    res.send('Video file uploaded successfully');
});

// Route for uploading audio file
app.post('/upload/audio', upload.single('audio'), (req, res) => {
    res.send('Audio file uploaded successfully');
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
