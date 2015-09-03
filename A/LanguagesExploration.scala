// 1. Cara mendefinisikan kelas
class PublicClass {

  // 2. Cara mendefiniskan atribut privat bertipe int
  private var privateInt : Int = _

  // 3. Cara mendefinisikan atribut public bertipe string, dan mengisi, dengan nilai awal
  var publicString : String = _

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

// 11. Cara menurunkan kelas
class PublicSubClass extends PublicClass {
    
    // 12. Cara melakukan override method
    def getPrivateInt() : Int = {
    
    // 13. Cara mengakses method pada superclass
    return 2 * super.getPrivateInt();
    }
}

/**
 * The main class. Must be defined. Names don't matter as long
 * as it is defined under "object." (Remember that object denotes
 * static functions and variables).
 */
object LanguagesExploration {
  /**
   * The main function. It must accept a parameter of an Array of Strings.
   */
  def main(args: Array[String]) {
    //14. cara menginstansiasi kelas baru.
    publicClass : PublicClass = new PublicClass()
    
    //15. cara memanggil method dengan parameter.
    publicClass.setPrivateInt(13)
    
    //16. cara memanggil method dan mendapatkan return value-nya.
    println("[13] publicClass.getPrivateint() = " + publicClass.getPrivateint())
    
    // 17. Cara mengubah isi atribut publik dari luar kelas
    publicClass.publicString = "World!"
    
    // 18. Cara mendapatkan isi atribut publik dari luar kelas
    println("[World!] publicClass.publicString = " + publicClass.publicString)
    
    // 19. Cara mengisi nilai atribut statik
    PublicClass.staticInt = 10
    
    // 20. Cara mendapatkan nilai atribut statik
    println("[10] PublicClass.staticInt = " + PublicClass.staticInt)
    
    var publicSubClass = new PublicSubClass
    
    publicSubClass.setPrivateInt_=(13)
    
    println("[26] publicSubClass.getPrivateInt() = " + publicClass.getPrivateInt())
  }
}
