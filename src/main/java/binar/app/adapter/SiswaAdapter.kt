package binar.app.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import binar.app.R
import binar.app.model.Siswa
import kotlinx.android.synthetic.main.item_siswa.view.*

class SiswaAdapter(private val siswaList: List<Siswa>,
                   private val onClick: (siswa: Siswa) -> Unit,
                   private val onLongClick: (siswa: Siswa) -> Unit): RecyclerView.Adapter<SiswaAdapter.Holder>() {
    override fun onCreateViewHolder(group: ViewGroup, type: Int): Holder {
        val layoutInflater= LayoutInflater.from(group.context)
        val view: View= layoutInflater.inflate(R.layout.item_siswa, group, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = siswaList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val siswa= siswaList[position]
        //holder.itemView.tvStudentEmail.text = siswa.email
        //holder.itemView.tvStudentName.text = siswa.name
        holder.bind(siswa)
        holder.itemView.setOnClickListener {
            onClick(siswa)
        }
        holder.itemView.setOnLongClickListener() {
            onLongClick(siswa)
            return@setOnLongClickListener false
        }
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(siswa: Siswa) {
            itemView.run {
                tvStudentName.text = siswa.name
                tvStudentEmail.text= siswa.versi
                tvAPI.text=siswa.api.toString()
            }
        }
    }
}