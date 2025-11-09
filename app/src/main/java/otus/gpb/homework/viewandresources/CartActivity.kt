package otus.gpb.homework.viewandresources

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Salnikov", "Start activity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        findViewById<MaterialToolbar>(R.id.cart_toolbar).setNavigationOnClickListener { finish() }

        val topAppBar = findViewById<MaterialToolbar>(R.id.cart_toolbar)
        topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.close -> {
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}