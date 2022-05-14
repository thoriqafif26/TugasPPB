import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.moh.thoriq_afif_19102153.praktikum5.R
import kotlinx.android.synthetic.main.activity_practice5_read_data.*

class Practice5ReadDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_read_data)
        val prodi = intent.getStringExtra(EXTRA_PRODI)
        lblProdiSaya.text = "Prodi Saya Adalah $prodi"
    }
}