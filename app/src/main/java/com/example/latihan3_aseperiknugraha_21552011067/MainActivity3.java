import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

private lateinit var phoneNumber1EditText: EditText
private lateinit var phoneNumber2EditText: EditText

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneNumber1EditText = findViewById(R.id.phoneNumber1EditText)
        phoneNumber2EditText = findViewById(R.id.phoneNumber2EditText)
        }
        }
}