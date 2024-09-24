package com.mutia.wisatajepang


import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mutia.wisatajepang.Adapter.AdapterGambar

class HomePage : AppCompatActivity() {
    private val imageList = arrayOf(
        R.drawable.kuil,
        R.drawable.gunungfuji,
        R.drawable.osaka,
        R.drawable.jatim
    )

    private val title = arrayOf("Kuil", "Gunung Fuji", "Osaka", "Jatim")
    private val location = arrayOf("Lokasi : kuil,Jepang", "Lokasi : Kansai,Jepang", "Lokasi : Yamagata,Jepang", "Lokasi : Nara,Jepang")
    private val tgl = arrayOf(
        "Tgl : 20 - September - 2024",
        "Tgl : 1 - Agustus - 2024",
        "Tgl : 12 - Maret - 2024",
        "Tgl : 17 - Juni - 2024"
    )

    private val des = arrayOf(
        "kuil ini adalah kuil Shinto, yang juga merupakan kuil yang paling terkenal di Jepang. Wajar bila kuil ini adalah yang paling terkenal, karena merupakan pusat dari semua kuil Shinto yang ada di Jepang.",
        "Gunung Fuji, terletak di pulau Honshu, adalah gunung tertinggi di Jepang, dengan ketinggian 3.776,24 m. Gunung ini adalah gunung berapi tertinggi kedua yang terletak di sebuah pulau di benua Asia, dan puncak tertinggi ketujuh dari sebuah pulau di Bumi",
        "Osaka Jepang: 大阪市 adalah sebuah kota di wilayah Kansai, Jepang. Selain sebagai ibu kota Prefektur Osaka, kota ini ditetapkan sebagai salah satu Kota Terpilih berdasarkan Undang-Undang Otonomi Lokal. Osaka adalah kota berpenduduk terbesar nomor tiga di Jepang setelah Tokyo dan Yokohama. ",
        "Osaka (Jepang: 大阪市 adalah sebuah kota di wilayah Kansai, Jepang. Selain sebagai ibu kota Prefektur Osaka, kota ini ditetapkan sebagai salah satu Kota Terpilih berdasarkan Undang-Undang Otonomi Lokal."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home_page)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = AdapterGambar(this, imageList, title, location)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailGambar::class.java)
            intent.putExtra("data", imageList[position])
            intent.putExtra("data1", title[position])
            intent.putExtra("data2", location[position])
            intent.putExtra("data3", tgl[position])
            intent.putExtra("data4", des[position])
            startActivity(intent)
        }
    }
}