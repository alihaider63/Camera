package com.example.camera

//import android.app.Activity
//import android.content.Intent
//import android.graphics.Bitmap
//import android.graphics.BitmapFactory
//import android.os.Bundle
//import android.os.Environment
//import android.provider.MediaStore
//import android.widget.Toast
//import androidx.activity.result.contract.ActivityResultContracts
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.content.FileProvider
//import kotlinx.android.synthetic.main.mainactivity.*
//import java.io.File
//
//class MainActivity : AppCompatActivity() {
//    lateinit var photoFile: File
//    val FILE_NAME = "photo.jpg"
//    val REQUEST_CODE = 42
//    private val takePhoto = registerForActivityResult(
//        ActivityResultContracts.StartActivityForResult()
//    ) {
//        if (it.resultCode == Activity.RESULT_OK) {
//
//
//            val takenImage = BitmapFactory.decodeFile(photoFile.absolutePath)
////            val imageBitmap = it.data?.extras?.get("data") as Bitmap?
//            if (takenImage != null) {
//                imageView.setImageBitmap(takenImage)
//            }
//            // do your thing with the obtained bitmap
//        }
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.mainactivity)
//
//        clickImage?.setOnClickListener {
//            //val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            photoFile = getPhotoFile(FILE_NAME)
//            val fileProvider = FileProvider.getUriForFile(this,
//                "com.example.fileprovider", photoFile)
//            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileProvider)
//
//            takePhoto.launch(takePictureIntent)
//
//
//
//
//            /*if (intent.resolveActivity(this.packageManager) != null) {
//                startActivityForResult(intent,REQUEST_CODE)
//            } else {
//                Toast.makeText(this, "Unable to Open Camera", Toast.LENGTH_SHORT).show()
//            }*/
//        }
//    }
//
//    private fun getPhotoFile(fileName: String): File {
//        val storageDirectory = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
//        return File.createTempFile(fileName,"jpg",storageDirectory)
//    }
//
//    /* override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//         if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK) {
//             val takenImage = data?.extras?.get("data") as Bitmap
//             //val takenImage = BitmapFactory.decodeFile(photoFile.absolutePath)
//             imageView.setImageBitmap(takenImage)
//         } else {
//             super.onActivityResult(requestCode, resultCode, data)
//         }
//     }*/
//
//}