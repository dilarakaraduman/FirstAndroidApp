package com.ealeynaelmas.firstandroidapp

import android.media.Image

class Hotel {
    var hcity:String = ""
    var hname:String = ""
    var hlicanceno:Long = 0
    var hdocumentno:Int = 0
    var hcost:Int = 0
    var hlocation:String = ""

    var hattribute1:Boolean = false
    var hattribute2:Boolean = false
    var hattribute3:Boolean = false
    var hattribute4:Boolean = false
    var hattribute5:Boolean = false
    var hattribute6:Boolean = false

    constructor(hcity:String, hname:String, hlicanceno:Long, hcost:Int, hlocation:String,
                hdocumentno:Int, hattribute1:Boolean, hattribute2:Boolean, hattribute3:Boolean,
                hattribute4:Boolean, hattribute5:Boolean, hattribute6:Boolean){
        this.hcity = hcity
        this.hname = hname
        this.hlicanceno = hlicanceno
        this.hcost = hcost
        this.hlocation = hlocation
        this.hdocumentno = hdocumentno

        this.hattribute1 = hattribute1
        this.hattribute2 = hattribute2
        this.hattribute3 = hattribute3
        this.hattribute4 = hattribute4
        this.hattribute5 = hattribute5
        this.hattribute6 = hattribute6
    }
}