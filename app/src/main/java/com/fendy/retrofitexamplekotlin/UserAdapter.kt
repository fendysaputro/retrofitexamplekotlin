package com.fendy.retrofitexamplekotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter(private val list: ArrayList<UsersResponse>): RecyclerView.Adapter<UserAdapter.UserViewHolder>(){
    inner class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(usersResponse: UsersResponse){
            with(itemView){
                val nameTxt = "${usersResponse.name}"
                val emailTxt = "${usersResponse.email}"
                val companyTxt = "${usersResponse.company.name}"
                tvName.text = nameTxt
                tvEmail.text = emailTxt
                tvCompany.text = companyTxt
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int = list.size



    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
    }
}