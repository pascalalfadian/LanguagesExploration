// 1. Cara mendefinisikan kelas
/**
 * The interface for public class.
 * Serves as a class definition guide.
 */
class PublicClass {

  // 2. Cara mendefiniskan atribut privat bertipe int
  /**
   * A private integer. It needs to be accessed and
   * mutated through a accessor/mutator.
   */
  private var privateInt : Int = _

  // 3. Cara mendefinisikan atribut public bertipe string, dan mengisi, dengan nilai awal
  var publicString : String = "Hello"

  // 6. Cara mendefinisikan konstruktor
  // 'Primary Contructor' telah dibuat saat pendefinisian kelas di baris ke-2
  
  /**
   * The constructor of this class. Also an empty
   * constructor.
   * 
   * @constructor
   */
  def PublicClass():Unit = { } // Constructor

  // 7a. Cara mendefinisikan method dengan parameter tanpa return value
  // 7b. Cara menuliskan dokumentasi untuk method 7a

  /** 
   *  Mengubah nilai atribut privateInt
   *  @param privateInt nilai privateInt yang baru.
   */
  def setPrivateInt (privateInt: Int):Unit = {
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

/**
 * Defines static variables for the Public Class.
 */
object PublicClass {
  /**
   * A regular mutable static integer.
   */
  var staticInt: Int = 0  // Static Variable.
  
  /**
   * A final variable having the value of PI: 3.14.
   * In Scala, constants are defined using the keyword 'val'.
   */
  val PI: Double = 3.14    // Final Variable.
}

// 11. Cara menurunkan kelas
/**
 * Implementing a subclass that overrides the getter of its own
 * private integer.
 */
class PublicSubClass extends PublicClass {
    
  // 12. Cara melakukan override method
  /**
   * Returns the private int of this class, which is 2 times
   * its ancestor's private integer.
   */
  def getPrivateInt() : Int = {
  
    // 13. Cara mengakses method pada superclass
    2 * super.getPrivateInt
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
    var publicClass : PublicClass = new PublicClass()
    
    //15. cara memanggil method dengan parameter.
    publicClass.setPrivateInt(13)
    
    //16. cara memanggil method dan mendapatkan return value-nya.
    println("[13] publicClass.getPrivateInt() = " + publicClass.getPrivateInt())
    
    // 17. Cara mengubah isi atribut publik dari luar kelas
    publicClass.publicString = "World!"
    
    // 18. Cara mendapatkan isi atribut publik dari luar kelas
    println("[World!] publicClass.publicString = " + publicClass.publicString)
    
    // 19. Cara mengisi nilai atribut statik
    PublicClass.staticInt = 10
    
    // 20. Cara mendapatkan nilai atribut statik
    println("[10] PublicClass.staticInt = " + PublicClass.staticInt)
    
    // 21. Cara mendapatkan nilai konstanta
    println("[3.14] PublicClass.PI = " + PublicClass.PI)
    
    // 22. Cara menginstansiasi kelas dengan turunannya
    var publicSubClass = new PublicSubClass
    
    publicSubClass.setPrivateInt_=(13)
    
    // 23. Memastikan method overriding bekerja
    println("[26] publicSubClass.getPrivateInt() = " + publicClass.getPrivateInt())
  }
}
