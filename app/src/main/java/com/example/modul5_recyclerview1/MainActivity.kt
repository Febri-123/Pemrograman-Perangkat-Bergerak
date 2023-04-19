package com.example.modul5_recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<Inis_Variable>(
        Inis_Variable(
            R.drawable.harry,
            Namamhs = "Harry",
            Nimmhs = "20102240",
            Telpmhs = "082345"
            ),
        Inis_Variable(
            R.drawable.harmione,
            Namamhs = "Harmione",
            Nimmhs = "20102241",
            Telpmhs = "085432"
        ),
        Inis_Variable(
            R.drawable.malfoy,
            Namamhs = "Malfoy",
            Nimmhs = "20102242",
            Telpmhs = "0890845"
        ),
        Inis_Variable(
            R.drawable.luna,
            Namamhs = "Ginny",
            Nimmhs = "20102243",
            Telpmhs = "0823789"
        ),
        Inis_Variable(
            R.drawable.ginny,
            Namamhs = "Lala",
            Nimmhs = "20102244",
            Telpmhs = "0856701"
        ),
        Inis_Variable(
            R.drawable.ron,
            Namamhs = "Ron Weasly",
            Nimmhs = "20102244",
            Telpmhs = "0856701"
        ),
        Inis_Variable(
            R.drawable.wulan,
            Namamhs = "Wulan",
            Nimmhs = "20102244",
            Telpmhs = "0856701"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        //ShowListMahasiswa()
        //ShowGridMhasiswa()
        ShowCardMahasiswa()
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = Card_MahasiswaAdapter(this, Datamahasiswa) {}
        recyclerView.adapter = adapter
    }

    private fun ShowGridMhasiswa() {
        val adapter = Grid_MahasiswaAdapter(grid_mhs = Datamahasiswa){
        }
        val recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = Grid_MahasiswaAdapter (Datamahasiswa){
        }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= List_MahasiswaAdapter(this, Datamahasiswa){

        }
    }
}