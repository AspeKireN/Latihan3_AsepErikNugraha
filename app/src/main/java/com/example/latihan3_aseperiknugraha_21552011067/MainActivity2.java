import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

private lateinit var editText1: EditText
private lateinit var editText2: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)

        // Tombol untuk menampilkan Toast
        findViewById(R.id.buttonShowToast).setOnClickListener {
        val text1 = editText1.text.toString()
        val text2 = editText2.text.toString()

        // Buat Toast dengan teks dari Input Control
        val toast = Toast.makeText(this, "Teks 1: $text1, Teks 2: $text2", Toast.LENGTH_SHORT)
        toast.show()
        }
        }
        }
