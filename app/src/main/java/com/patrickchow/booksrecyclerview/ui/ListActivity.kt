package com.patrickchow.booksrecyclerview.ui

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.patrickchow.booksrecyclerview.R
import com.patrickchow.booksrecyclerview.adapter.ImageListAdapter
import com.patrickchow.booksrecyclerview.model.Book
import kotlinx.android.synthetic.main.activity_main.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = mutableListOf<Book>()

        val contactImage: Drawable? = ContextCompat.getDrawable(this, R.drawable.book_image)
        if(contactImage!=null){
            data.add(Book("Title: This is a book", "Author: Patrick Chow", contactImage))
            data.add(Book("Title: This is a book", "Author: Patrick Chow", contactImage))
            data.add(Book("Title: This is a book", "Author: Patrick Chow", contactImage))
            data.add(Book("Title: This is a book", "Author: Patrick Chow", contactImage))
            data.add(Book("Title: This is a book", "Author: Patrick Chow", contactImage))
            data.add(Book("Title: This is a book", "Author: Patrick Chow", contactImage))
            data.add(Book("Title: This is a book", "Author: Patrick Chow", contactImage))
        }

        list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = ImageListAdapter(data)
        list_view.layoutManager = manager
        list_view.adapter = adapter

    }
}
