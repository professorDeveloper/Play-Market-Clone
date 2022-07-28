package com.azmovhudstc.playmarketcloneui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.azmovhudstc.playmarketcloneui.adapter.CategorieAdapter
import com.azmovhudstc.playmarketcloneui.adapter.PlayMarketAdapter
import com.azmovhudstc.playmarketcloneui.adapter.TopsAdapter
import com.azmovhudstc.playmarketcloneui.adapter.TypeAdapter
import com.azmovhudstc.playmarketcloneui.model.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var typeAdapter: TypeAdapter
    private lateinit var categorieAdapter: CategorieAdapter
    private lateinit var typeList: ArrayList<Type>
    private lateinit var categorieList: ArrayList<Categorie>
    private lateinit var playMarketAdapter: PlayMarketAdapter
    private lateinit var generalList: ArrayList<GeneralData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        typeAdapter = TypeAdapter(loadData(), applicationContext)

        rv_type.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_type.adapter = typeAdapter
        loadGeneralData()
        rv_tops.layoutManager=LinearLayoutManager(this)
        playMarketAdapter=PlayMarketAdapter(generalList,applicationContext.applicationContext)
        rv_tops.adapter=playMarketAdapter

    }

    private fun loadData(): ArrayList<Type> {
        typeList = ArrayList()
        typeList.add(Type("For You"))
        typeList.add(Type("Top charts"))
        typeList.add(Type("Education"))
        typeList.add(Type("Premium"))
        typeList.add(Type("Categories"))
        typeList.add(Type("Editors Choice"))
        return typeList
    }

    private fun loadDataCategoria(): ArrayList<Categorie> {
        categorieList = ArrayList()
        categorieList.add(Categorie(0, "Games"))
        categorieList.add(Categorie(R.drawable.ic_baseline_apps_24.toInt(), "Apps"))
        categorieList.add(Categorie(R.drawable.ic_baseline_local_movies_24, "Movies"))
        categorieList.add(Categorie(R.drawable.ic_baseline_book_24, "Books"))
        return categorieList
    }

    private fun loadGeneralData() {
        generalList = ArrayList()
        var apps = Tops(R.drawable.whatsappsmalls, R.drawable.whatsapp, "Whats App Meta", "Social", "45 MB", "4.2")
        var tops1 = Tops(R.drawable.telegramsmall, R.drawable.telegrambig, "Telegram ", "Social", "55 MB", "4.3")
        var tops2 = Tops(R.drawable.facebooksmall, R.drawable.facebookbig, "Facebook Meta", "Social", "35 MB", "4.5")
        var tops3 = Tops(R.drawable.spoftfysmall, R.drawable.spoftifybig, "Spoftify", "Music", "40 MB", "4.3")
        var tops4 = Tops(R.drawable.wiki, R.drawable.wiki, "Wikipediya", "Pediya", "40 MB", "4.3")
        var tops5 = Tops(R.drawable.tiktoks, R.drawable.tiktoks, "Tik Tok", "Enjoy", "40 MB", "4.5")
        var generalData = GeneralData("New & Popular apps", listOf(apps, tops5, tops1, tops3, tops2,tops4 ))
        generalList.add(generalData)
        var game = Tops(R.drawable.pubg, R.drawable.pubg, "Pubg Mobile", "Arcade", "667 MB", "4.2")
        var game1 = Tops(R.drawable.tom, R.drawable.tom, "My Talking Tom", "Casual", "80 MB", "4.5")
        var game2 = Tops(R.drawable.protaype, R.drawable.protaype, "Prototype Mobile","Adventure","90 MB","4.3")
        var game3 = Tops(R.drawable.combat, R.drawable.combat, "Modern Combat 4","Adventure","100 MB","3.5")
        var game4 = Tops(R.drawable.surg, R.drawable.surg, "Subway Surfers","Arcade","75 MB","4.2")
        var game5 = Tops(R.drawable.clash, R.drawable.clash, "Clash of Clans","Strategy","150 MB","4.7")
        var game6 = Tops(R.drawable.hit, R.drawable.hit, "Smash Hit","Arcade","30 MB","4.2")
        var gameData = GeneralData("New & popular games", listOf(game, game1, game2, game3, game4, game5, game6, ))
        generalList.add(gameData)
        var film = Tops(R.drawable.titans, R.drawable.titans, "Titans Dc", "Adventure", "667 MB", "4.2")
        var film1 = Tops(R.drawable.avengers, R.drawable.avengers, "Avengers Ultron", "Action", "290 MB", "4.5")
        var film2 = Tops(R.drawable.arcane, R.drawable.arcane, "Arcane Netflix","Adventure","450 MB","4.3")
        var film3 = Tops(R.drawable.moonknight,R.drawable.moonknight, "Moon Kinght","Adventure","350 MB","4.5")
        var film4 = Tops(R.drawable.alice, R.drawable.alice, "Alice in border","Arcade","340 MB","4.2")
        var film5 = Tops(R.drawable.iroman, R.drawable.iroman, "Iroman 3 ","Action","450 MB","4.7")
        var film6 = Tops(R.drawable.msmarvel, R.drawable.msmarvel, "Ms Marvel","Action","233 MB","4.2")
        var film7 = Tops(R.drawable.spiderman3, R.drawable.spiderman3, "Spderman 3","Action","233 MB","4.2")
        var filmData = GeneralData("New & popular Films", listOf(film, film1,film7, film2, film3, film4, film5, film6, ))
        generalList.add(filmData)



    }

}