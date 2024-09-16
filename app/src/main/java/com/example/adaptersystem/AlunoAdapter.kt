package com.example.adaptersystem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlunoAdapter(
    private val listaAlunos: MutableList<Aluno>) : RecyclerView.Adapter<AlunoAdapter.AlunoViewHolder>() {

    class AlunoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewNomeAluno: TextView = itemView.findViewById(R.id.textViewNomeAluno)
        val textViewAreaEscolha: TextView = itemView.findViewById(R.id.textViewAreaEscolha)
        val textViewData: TextView = itemView.findViewById(R.id.textViewData)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_aluno, parent, false)
        return AlunoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val aluno = listaAlunos[position]
        holder.textViewNomeAluno.text = aluno.nome
        holder.textViewAreaEscolha.text = aluno.areaEscolha
        holder.textViewData.text = aluno.dataInsercao
    }

    override fun getItemCount() = listaAlunos.size
}
