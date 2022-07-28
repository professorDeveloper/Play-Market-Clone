package com.azmovhudstc.playmarketcloneui.model

class GeneralData {
    var title=""

     var appList:List<Tops> = ArrayList()

    constructor(title: String, appList: List<Tops>) {
        this.title = title
        this.appList = appList
    }
}