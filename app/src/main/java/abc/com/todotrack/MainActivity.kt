package abc.com.todotrack

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        fun setSupportActionBar(toolbar: Toolbar?) {
//            delegate.setSupportActionBar(toolbar)
//        }
//        todo.apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
//            adapter = this@MainActivity.adapter
//        }
    }



    private lateinit var linearLayoutManager: LinearLayoutManager
// for right menu connect

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.right_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
// for item clicked and change Activity
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.history ->
            {
                startActivity(Intent(this,HistoryActivity:: class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun openNewTask(view: View) {
        startActivity(Intent(this,TaskActivity:: class.java))
    }



}