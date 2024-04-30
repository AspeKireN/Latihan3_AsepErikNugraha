import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ... (rest of your code)

        // Show Alert Dialog
        val builder = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.alert_dialog_layout, null)
        editText1 = view.findViewById(R.id.editText1)
        editText2 = view.findViewById(R.id.editText2)

        builder.setView(view)
            .setPositiveButton("OK") { dialog, _ ->
                // Get input values from EditTexts
                val input1 = editText1.text.toString()
                val input2 = editText2.text.toString()

                // Perform actions based on input values
                // ...
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                // Handle cancel action
                dialog.cancel()
            }
            .show()
    }
}
