fun main (){
    val kkm = 75
    val nilai = 85
    val hasil : String
    hasil = if (nilai >= kkm){
        "Nilai kamu $nilai , Selamat!"
    } else{
        "Nilai kamu $nilai , Silahkan mengikuti remedial"
    }
    print(hasil)
}