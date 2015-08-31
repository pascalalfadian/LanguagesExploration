// 1. Cara mendefinisikan kelas
class PublicClass {

  // 2. Cara mendefiniskan atribut privat bertipe int
  private var privateInt : Int

  // 3. Cara mendefinisikan atribut public bertipe string, dan mengisi, dengan nilai awal
  var publicString : String

  // 6. Cara mendefinisikan konstruktor
  // 'Primary Contructor' telah dibuat saat pendefinisian kelas di baris ke-2

  // 7a. Cara mendefinisikan method dengan parameter tanpa return value
  // 7b. Cara menuliskan dokumentasi untuk method 7a

  /** Mengubah nilai atribut privateInt
   *  @param privateInt nilai privateInt yang baru.
   */
  def setPrivateInt_=(privateInt: Int):Unit {
    // 8. Cara mengisi atribut dari dalam kelas itu sendiri
    this.privateInt = privateInt
  }

  // 9a. Cara mendefinisikan method dengan return value
  // 9b. Cara menuliskan dokumentasi untuk method 9a

  /**
   * Getter for the private integer variable.
   * @return _privateInt
   */
  def getPrivateInt() : Int = {
    // 10. Cara mengembalikan nilai
    return this.privateInt
  } 
}

object LanguagesExploration {
	def main(args: Array[String]) {
		// 17. Cara mengubah isi atribut publik dari luar kelas
        publicClass.publicString = "World!"
        
        // 18. Cara mendapatkan isi atribut publik dari luar kelas
        println("[World!] publicClass.publicString = " + publicClass.publicString)
        
        // 19. Cara mengisi nilai atribut statik
        PublicClass.staticInt = 10
        
        // 20. Cara mendapatkan nilai atribut statik
        println("[10] PublicClass.staticInt = " + PublicClass.staticInt)
	}
}