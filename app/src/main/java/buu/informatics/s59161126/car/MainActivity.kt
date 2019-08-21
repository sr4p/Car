package buu.informatics.s59161126.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun addQueue(view: View) {
        val name_renter = findViewById<EditText>(R.id.name_text)
        val license_car = findViewById<EditText>(R.id.license_text)
        val brand_car = findViewById<EditText>(R.id.brand_text)
    }



}
