package com.azmovhudstc.playmarketcloneui.model

class Tops {
    var smallImage=0
    var bigImage=0
    var topsName=""
    var typeTops=""
    var sizeTops=""
    var ratingTops=""

    constructor(
        smallImage: Int,
        bigImage: Int,
        topsName: String,
        typeTops: String,
        sizeTops: String,
        ratingTops: String
    ) {
        this.smallImage = smallImage
        this.bigImage = bigImage
        this.topsName = topsName
        this.typeTops = typeTops
        this.sizeTops = sizeTops
        this.ratingTops = ratingTops
    }
}