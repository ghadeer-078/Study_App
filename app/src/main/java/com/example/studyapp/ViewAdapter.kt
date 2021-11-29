package com.example.studyapp

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*


class Course(val name:String, val description:String, val details:String)


class ViewAdapter (private val courses: List<Course>, private val layout: Activity) :
    RecyclerView.Adapter<ViewAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val course = courses[position]

        holder.itemView.apply {
            tvName.text = course.name
            tvDescription.text = course.description
            cvMain.setOnClickListener {
                alertBox(layout,course.name, course.details)
            }
        }
    }

    override fun getItemCount() = courses.size


    private fun alertBox(layout: Activity, title:String , details: String) {
        // first we create a variable to hold an AlertDialog builder
        val dialogBuilder = AlertDialog.Builder(layout)
        // here we set the message of our alert dialog
        dialogBuilder.setMessage(details)
            // positive button text and action
            .setPositiveButton("Ok", DialogInterface.OnClickListener {
                    dialog, _ -> dialog.dismiss()
            })
        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle(title)
        // show alert dialog
        alert.show()
    }

}