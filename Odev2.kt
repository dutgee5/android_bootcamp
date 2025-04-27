package com.example.kotlin.odevler

fun main(){

    // Parametre olarak girilen dereceyi fahrenhiet'a donusturdukten sonra geri donduren bir fonk
    fun fanrenhiet(derece:Int):Double{
        val sonuc = (derece *1.8)+32
        return sonuc
    }
   println(fanrenhiet(23))

    //Kenarlari parametre olarak girilen ve dikdörtgen cevresini hesaplayan fonk

    fun dikdortgenCevreHesabi(uzunkenar:Int,kisaKenar:Int){
        println(2*(uzunkenar+kisaKenar))
    }
    println(dikdortgenCevreHesabi(10,5))

    // Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız.
    fun faktoriyel(sayi:Int):Int{
        var toplam =1
        for (i in sayi downTo 1){
            toplam*=i
        }
        return toplam
    }
   println(faktoriyel(5))
    // Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir metod yazınız

    fun harf(kelime: String): Int {
        return kelime.count { it == 'a'}
    }
    println(harf("Istanbul"))

    //Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen metod yazınız.
    fun icAcilar(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }
    println(icAcilar(4))


    // Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız.
                         /*
                            1 günde 8 saat çalışılabilir.
                            Çalışma saat ücreti : 10 も
                            Mesai saat ücreti : 20も
                            160 saat üzeri mesai sayılır.
                        */
    fun maas(gun: Int): Int {
        val toplamSaat = gun * 8
        return if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            val mesaiSaat = toplamSaat - 160
            (160 * 10) + (mesaiSaat * 20)
        }
    }

    println("Alinan maas :${maas(23)}")


    //Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.
    //  50 GB = 100 も --  Kota aşımından sonra her 1 GB, 4 'dir

    fun kotaMiktari(kota: Int): Int {
        return if (kota <= 50) {
            100
        } else {
            100 + ((kota - 50) * 4)
        }
    }

    println("Ucret : ${kotaMiktari(100)}")


}


