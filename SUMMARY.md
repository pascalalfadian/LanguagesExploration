# Pemrograman Berorientasi Objek dalam Berbagai Bahasa

Kontribusi dari: calvintorsa, yogo-chen, christo15, JohanesKalas, MelindaNurAbianti, ReynaldoImanuel, kuzan754, RikiRusli, andrelim96, kpratama24, pascalalfadian, betz95, MarcellTrixie, KelvinTandika, gabriellavg, Fadhmoore, gregoriusgeraldi, keenanleman, TimusVPF, claraccs, MirzaLazuardiWI, marchellametta, stanleyhanes, Kresnadc, FedrianHermana, ghanifaza, adrianzbrr, danielferdinan, karyotubruk, andysetiawanharyanto, JovankaMaradenia, carissaulibasa, IhsanFajari14018, vinietaaa, louisemarcho, wahyuuwewe, BarsyaPrastoro, muhammadhilman27, KrisogonusFerdieRendragraha, Fachrann, valentinancy, LydiaFebtriani, SaptaKesuma, IvanTW, rindagina, Betari, StephanieTania, andrewabcd, RezaHaznam, stillmenvallian, farhanfazrian, deviapriliani, cklsh di Github.

Ada kesalahan? Buat _issue_ atau kirim _pull request_ di [https://github.com/pascalalfadian/LanguagesExploration](https://github.com/pascalalfadian/LanguagesExploration)

## Java

```java
// 1. Cara mendifinisikan kelas
class PublicClass {
    
    // 2. Cara mendefinisikan atribut privat bertipe int
    private int privateInt;
    
    // 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
    public String publicString = "Hello";
    
    // 4. Cara mendefinisikan atribut statik
    public static int staticInt;
    
    // 5. Cara mendefinisikan konstanta
    public static final double PI = 3.14;
    
    // 6. Cara mendefinisikan konstruktor
    public PublicClass() {
        // kosong
    }
    
    // 7a. Cara mendefinisikan method dengan parameter tanpa return value
    // 7b. Cara menuliskan dokumentasi untuk method 7a
    /**
     * Mengubah nilai atribut privateInt
     * @param privateInt nilai privateInt yang baru.
     */
    public void setPrivateInt(int privateInt) {
    
        // 8. Cara mengisi atribut dari dalam kelas itu sendiri
        this.privateInt = privateInt;
    }
    
    // 9a. Cara mendefinisikan method dengan return value
    // 9b. Cara menuliskan dokumentasi untuk method 9a
    /**
     * Mendapatkan nilai dari atribut privateInt
     * @return nilai dari privateInt
     */
    public int getPrivateInt() {
        
        // 10. Cara mengembalikan nilai
        return this.privateInt;
    }
}

// 11. Cara menurunkan kelas
class PublicSubClass extends PublicClass {
    
    // 12. Cara melakukan override method
    public int getPrivateInt() {
    
    // 13. Cara mengakses method pada superclass
    return 2 * super.getPrivateInt();
    }
}

public class LanguagesExploration {
    public static void main(String[] args) {
        // 14. Cara menginstansiasi kelas baru
        PublicClass publicClass = new PublicClass();
        
        // 15. Cara memanggil method dengan parameter
        publicClass.setPrivateInt(13);
        
        // 16. Cara memanggil method dan mendapatkan return value-nya
        System.out.println("[13] publicClass.getPrivateInt() = " + publicClass.getPrivateInt());
        
        // 17. Cara mengubah isi atribut publik dari luar kelas
        publicClass.publicString = "World!";
        
        // 18. Cara mendapatkan isi atribut publik dari luar kelas
        System.out.println("[World!] publicClass.publicString = " + publicClass.publicString);
        
        // 19. Cara mengisi nilai atribut statik
        PublicClass.staticInt = 10;
        
        // 20. Cara mendapatkan nilai atribut statik
        System.out.println("[10] PublicClass.staticInt = " + PublicClass.staticInt);
        
        // 21. Cara mendapatkan nilai konstanta
        System.out.println("[3.14] PublicClass.PI = " + PublicClass.PI);
        
        // 22. Cara menginstansiasi kelas dengan turunannya
        PublicClass publicSubClass = new PublicSubClass();
        
        publicSubClass.setPrivateInt(13);
        
        // 23. Memastikan method overriding bekerja
        System.out.println("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt());
    }
}
```

C#
--

```cs
using System;
// 
// 1. Cara mendifinisikan kelas
class PublicClass {
    // 2. Cara mendefinisikan atribut privat bertipe int
    // Atribut untuk menyimpan data integer*/
    private int privateInt;
    
    // 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
    public String publicString = "Hello";
    
    // 4. Cara mendefinisikan atribut statik
    public static int staticInt;
    
    // 5. Cara mendefinisikan konstanta
    public const double PI = 3.14;
    
    // 6. Cara mendefinisikan konstruktor
    public PublicClass() {
        // kosong
    }
    
    // 7a. Cara mendefinisikan method dengan parameter tanpa return value
    // 7b. Cara menuliskan dokumentasi untuk method 7a
    ////<summary>
    ///komentar yang muncul di kolom deskripsi
    ///</summary>
    ///<remarks>
    ///penjelasan untuk method setPrivateInt di bagian remark
    ///</remarks>
    public void SetPrivateInt(int privateInt) {
        this.privateInt = privateInt;
        // 8. Cara mengisi atribut dari dalam kelas itu sendiri
        this.privateInt = privateInt;
    }
    
    // 9a. Cara mendefinisikan method dengan return value
    // 9b. Cara menuliskan dokumentasi untuk method 9a
    /*Mendapatkan nilai dari atribut privateInt
    @return nilai dari privateInt*/
    ///<summary>
    ///komentar yang muncul di kolom deskripsi
    ///</summary>
    ///<remarks>
    ///penjelasan untuk method getPrivateInt di bagian remark
    ///</remarks>
    public virtual int GetPrivateInt() {
        
        // 10. Cara mengembalikan nilai
        return this.privateInt;
    }
}

// 11. Cara menurunkan kelas
class PublicSubClass : PublicClass {
    
    // 12. Cara melakukan override method
    public override int GetPrivateInt() {
    
        // 13. Cara mengakses method pada superclass
        return 2 * base.GetPrivateInt();
    }
}

public class LanguagesExploration {
    
    public static void Main(String[] args) {
        // 14. Cara menginstansiasi kelas baru
        PublicClass publicClass = new PublicClass();
        
        // 15. Cara memanggil method dengan parameter
        // Memanggil method berparameter yakni "public void setPrivateInt(int privateInt)"
        // Dengan masukan angka 13
        publicClass.SetPrivateInt(13);
        
        // 16. Cara memanggil method dan mendapatkan return value-nya
        Console.WriteLine("[13] publicClass.GetPrivateInt() = " + publicClass.GetPrivateInt());
        
        // 17. Cara mengubah isi atribut publik dari luar kelas
        publicClass.publicString = "World!";
        
        // 18. Cara mendapatkan isi atribut publik dari luar kelas
        Console.WriteLine("[World!] publicClass.publicString = " + publicClass.publicString);
        
        // 19. Cara mengisi nilai atribut statik
        PublicClass.staticInt = 10;
        
        // 20. Cara mendapatkan nilai atribut statik
        Console.WriteLine("[10] PublicClass.staticInt = " + PublicClass.staticInt);
        
        // 21. Cara mendapatkan nilai konstanta
        Console.WriteLine("[3.14] PublicClass.PI = "+PublicClass.PI);
        
        // 22. Cara menginstansiasi kelas dengan turunannya
        PublicClass publicSubClass = new PublicSubClass();
        
        publicSubClass.SetPrivateInt(13);
        
        // 23. Memastikan method overriding bekerja
        Console.WriteLine("[26] publicSubClass.GetPrivateInt() = {0}", publicSubClass.GetPrivateInt());
    }
}
```

## Dart

```dart
// 1. Cara mendifinisikan kelas
class PublicClass {
    
    // 2. Cara mendefinisikan atribut privat bertipe int
    // Pada dart tidak ada keyword public,protected,private.
    // Untuk mendapatkan hak akses private, sebelum nama variable ditambahkan '_'. 
    // Variable tersebut tidak bisa diakses dari luar library.
    int _privateInt;
    
    // 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
    String publicString = "Hello";
    
    // 4. Cara mendefinisikan atribut statik
    static int staticInt;
    
    // 5. Cara mendefinisikan konstanta
    static const PI = 3.14;
    
    // 6. Cara mendefinisikan konstruktor
    ///Named Constructor
    ///Jika mendeklarasikan konstruktor lebih dari satu, disarankan meberi nama konstruktor agar dapat dibedakan dengan jelas.
    PublicClass.kosong(){
    //kosong
    }
    
    /// Constructor with optional parameter.
    /// Parameter di dalam brace {} merupakan optional parameter. Parameter tersebut dapat menerima argumen bisa juga tidak.
    /// Dengan deklarasi konstruktor seperti dibawah, dapat dipanggil dengan new PublicClass() dan new PublicClass(privateInt,publicString).
    PublicClass({int privateInt,String publicString}) {
        if(privateInt!=null)this._privateInt = privateInt;
     if(publicString!=null)this.publicString = publicString;
    }
    
    // 7a. Cara mendefinisikan method dengan parameter tanpa return value
    // 7b. Cara menuliskan dokumentasi untuk method 7a
    
     /// Mengubah nilai atribut privateInt.
     /// [privateInt] nilai privateInt yang baru.
   void setPrivateInt(int privateInt) {
    
        // 8. Cara mengisi atribut dari dalam kelas itu sendiri
        // Sama seperti java, untuk mengacu pada atribut kelas dapat menggunakan this.
        this._privateInt = privateInt;
    }
    
    // 9a. Cara mendefinisikan method dengan return value
    // 9b. Cara menuliskan dokumentasi untuk method 9a

     /// Mendapatkan nilai dari atribut privateInt.
     /// Return nilai dari privateInt.
    int getPrivateInt() {
        
        // 10. Cara mengembalikan nilai
        return this._privateInt;
    }
    // method getter v2
    // public int getPrivateInt()=>this._privateInt;
}

// 11. Cara menurunkan kelas
// Cara menurunkan kelas di Dart sama dengan di java dengan keyword extends
class PublicSubClass extends PublicClass {
    
    // 12. Cara melakukan override method
    num getPrivateInt() {
        // 13. Cara mengakses method pada superclass
        return 2 * super.getPrivateInt();
    }
}

//Pada dart tidak dibutuhkan kelas main untuk menjalankan method main
void main() {
        
    // 14. Cara menginstansiasi kelas baru
    // Mengistansiasi kelas baru pada dart sama dengan yang ada di java
    PublicClass publicClass = new PublicClass();
        
    // 15. Cara memanggil method dengan parameter
    // Memanggil method pada dart sama seperti pada java
    publicClass.setPrivateInt(13);
        
    // 16. Cara memanggil method dan mendapatkan return value-nya
    print("[13] publicClass.getPrivateInt() =  ${publicClass.getPrivateInt()}");
        
    // 17. Cara mengubah isi atribut publik dari luar kelas
    // Pada dart,cara mengisi variable string dapat kita beri petik dua atau petik satu, keduanya memiliki fungsi yang sama
    publicClass.publicString = "World!";
        
    // 18. Cara mendapatkan isi atribut publik dari luar kelas
    print("[World!] publicClass.publicString = ${publicClass.publicString}");
        
    // 19. Cara mengisi nilai atribut statik
    // Sama seperti java, atribut statik dipanggil dari kelasnya kemudian dapat diisi dengan suatu nilai literal.
    PublicClass.staticInt = 10;
        
    // 20. Cara mendapatkan nilai atribut statik
    // Sama seperti java, atribut statik didapat dengan cara memanggilnya dari kelasnya.
    // Untuk mengoutputkan nilai integer ke layar dilakukan dengan ${value}, dengan value adalah nilai integer tersebut.
    print("[10] PublicClass.staticInt = ${PublicClass.staticInt}");
        
    // 21. Cara mendapatkan nilai konstanta
    print("[3.14] PublicClass.PI = ${PublicClass.PI}");
        
    // 22. Cara menginstansiasi kelas dengan turunannya
    // Pada dart menginstansiasi kelas memiliki cara yang sama dengan java
    PublicClass publicSubClass = new PublicSubClass();
        
    publicSubClass.setPrivateInt(13);
        
    // 23. Memastikan method overriding bekerja
    print("[26] publicSubClass.getPrivateInt() = ${publicSubClass.getPrivateInt()}");
    
}
```

## PHP

```php
<?php
/*
  Akan dijelaskan apa yang dilakukan dalam nomor-nomor yang telah kami kerjakan sesuai dengan
  LanguagesExploration.java (pada setiap nomor menggunakan tanda #)
*/
# deklarasi kelas
# 1. cara mendefinisikan kelas
class PublicClass {

    # 2. Cara mendefinisikan atribut private bertipe int
    private $private_int = 0;
    
  
    # 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
    public $public_string = "Hello";
  
    # 4. Cara mendefinisikan atribut statik
    public static $static_int;
  
    # 5. Cara mendefinisikan konstanta
    const PI = 3.14;
  
    # 6. Cara mendefinisikan konstruktor
    public function __construct() {
        #kosong
    }
    #7a. Cara mendefinisikan method dengan parameter tanpa return value
    # 7b. Cara menuliskan dokumentasi untuk method 7a
    public function set_private_int($input) {
        # 8. Cara mengisi atribut dari dalam kelas itu sendiri
        $this->private_int = $input;
    }
    # 9a. Cara mendefinisikan method dengan return value
    # 9b. Cara menuliskan dokumentasi untuk method 9a
    public function get_private_int() {
        # 10. Cara mengembalikan nilai
        return $this->private_int;
    }
}
# 11. Cara menurunkan kelas
class PublicSubClass extends PublicClass {
    public function __construct() {
        parent::__construct();
    }
    # 12. Cara melakukan override method
    public function get_private_int() {
        # 13. Cara mengakses method pada superclass
        return 2 * parent::get_private_int();
    }
}
class LanguagesExploration {
    public static function main() {
        # 14. Cara menginstansiasi kelas baru
        $publicClass = new PublicClass();

        # 15. Cara memanggil method dengan parameter
        $publicClass->set_private_int(13);

        # 16. Cara memanggil method dan mendapatkan return value-nya
        echo "[13] publicClass.getPrivateInt() = " . $publicClass->get_private_int() . "\n" ;

        # 17. Cara mengubah isi atribut publik dari luar kelas
        $publicClass->publicString = "World!";

        # 18. Cara mendapatkan isi atribut publik dari luar kelas
        echo "[World!] publicClass.publicString = " . $publicClass->publicString . "\n";

        /*
            *memperbaiki nomor 19 untuk mengganti atribut statik kami menggunakan method setter
            *memperbaiki "<br>" menjadi "\n"
        */


        # 19. Cara mengisi nilai atribut statik
        $publicClass->set_private_int(10);

        # 20. Cara mendapatkan nilai atribut statik
        echo "[10] PublicClass.staticInt = " . $publicClass->get_private_int(). "\n";


        # 21. Cara mendapatkan nilai konstanta
        echo "[3.14] PublicClass.PI = " . $publicClass::PI . "\n";

        # 22. Cara menginstansiasi kelas dengan turunannya
        $publicSubClass = new PublicSubClass();
        $publicSubClass->set_private_int(13);

        # 23. Memastikan method overriding bekerja
        echo "[26] publicSubClass.getPrivateInt() = " . $publicSubClass->get_private_int() . "\n";
    }
}
LanguagesExploration::main();
?>
```

## Python

```python
# 1. Cara mendefinisikan kelas
class PublicClass(object):
  # 2. Cara mendefiniskan atribut bertipe int
  __privateInt=0 #private
  # 6. Cara mendefinisikan konstruktor 
  def __init__(self):
    # 3. Cara mendefinisikan atribut bertipe string, dan mengisi dengan nilai awal
    self.publicString="Hello"
    # 5.Cara mendefinisikan konstanta
    self.PI=3.14

  # 7a. Cara mendefinisikan method dengan parameter tanpa return value
  # 7b. Cara menuliskan dokumentasi untuk method 7a

  def setPrivateInt(self, privateInt):
    # 8. Cara mengisi atribut dari dalam kelas itu sendiri
    self.__privateInt=privateInt

  # 9a. Cara mendefinisikan method dengan return value
  # 9b. Cara menuliskan dokumentasi untuk method 9a

  def getPrivateInt(self):
    # 10. Cara mengembalikan nilai
    return self.__privateInt
  
# 11. Cara menurunkan kelas
class PublicSubClass(PublicClass):
  # 12. Cara melakukan override method
  def getPrivateInt(self):
  # 13. Cara mengakses method pada superclass
    return 2 * super(PublicSubClass, self).getPrivateInt()

class LanguagesExploration():
  #def main(self):
  # 14. Cara menginstansiasi kelas baru
  publicClass=PublicClass()
  # 15. Cara memanggil method dengan parameter
  publicClass.setPrivateInt(13)
  # 16. Cara memanggil method dan mendapatkan return value-nya
  print("[13] publicClass.getPrivateInt() = %s" % publicClass.getPrivateInt())
  # 17. Cara mengubah isi atribut publik dari luar kelas
  publicClass.publicString = "World!"
  # 18. Cara mendapatkan isi atribut publik dari luar kelas
  print("[World!] publicClass.publicString = %s" % publicClass.publicString)
  # 19. Cara mengisi nilai atribut statik 
  publicClass.staticInt=10
  # 20. Cara mendapatkan nilai atribut statik 
  print("[10] publicClass.staticInt = %s"%publicClass.staticInt)
  # 21. Cara mendapatkan nilai konstanta 
  print("[3.14] publicClass.PI = %s"%publicClass.PI)
  # 22. Cara menginstansiasi kelas dengan turunannya
  publicSubClass = PublicSubClass();
  publicSubClass.setPrivateInt(13);
  #23. Memastikan method overriding bekerja
  print("[26] publicSubClass.getPrivateInt= %s"%publicSubClass.getPrivateInt())
```

## Ruby

```ruby
# 1. Cara mendifinisikan kelas
class PublicClass 
    
    # 2. Cara mendefinisikan atribut privat bertipe int
    @privateInt
    
    # 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
    @publicString = "Hello"
    
    def setPublicString(publicString)
        return @publicString= publicString
    end    
    
    def getPublicString
        return @publicString
    end 
    
    # 4. Cara mendefinisikan atribut statik
    @@staticInt
    
    def setStaticInt(newStaticInt)
        @@staticInt = newStaticInt
    end
    
    def getStaticInt
        return @@staticInt
    end
    
    # 5. Cara mendefinisikan konstanta
    PI = 3.14
    
    # 6. Cara mendefinisikan konstruktor
    def initialize
        # kosong
    end
    
    # 7a. Cara mendefinisikan method dengan parameter tanpa return value
    
    
    # 7b. Cara menuliskan dokumentasi untuk method 7a
    
    # Mengubah nilai atribut privateInt
    # @param privateInt nilai privateInt yang baru.
    
    def setPrivateInt(privateInt)
        
        # 8. Cara mengisi atribut dari dalam kelas itu sendiri
        @privateInt = privateInt
    end
    
    # 9a. Cara mendefinisikan method dengan return value
    # 9b. Cara menuliskan dokumentasi untuk method 9a
    
    #  Mendapatkan nilai dari atribut privateInt
    #  @return nilai dari privateInt
    
    
    def getPrivateInt 
        
        # 10. Cara mengembalikan nilai
        return @privateInt
    end
    
end

# 11. Cara menurunkan kelas
class PublicSubClass < PublicClass 
    
    # 12. Cara melakukan override method
    def getPrivateInt 
    
    # 13. Cara mengakses method pada superclass
    return 2 * super
end
    
end

# 14. Cara menginstansiasi kelas baru
publicClass = PublicClass.new

# 15. Cara memanggil method dengan parameter
publicClass.setPrivateInt(13)

# 16. Cara memanggil method dan mendapatkan return value-nya
print "[13] publicClass.getPrivateInt() = "
puts publicClass.getPrivateInt

# 17. Cara mengubah isi atribut publik dari luar kelas
publicClass.setPublicString("World!")

# 18. Cara mendapatkan isi atribut publik dari luar kelas
print "[World!] publicClass.publicString = "
puts publicClass.getPublicString


# 19. Cara mengisi nilai atribut statik
publicClass.setStaticInt(10)

# 20. Cara mendapatkan nilai atribut statik
print "[10] PublicClass.staticInt = "
puts publicClass.getStaticInt


# 21. Cara mendapatkan nilai konstanta
print "[3.14] PublicClass.PI = " 
puts PublicClass::PI


# 22. Cara menginstansiasi kelas dengan turunannya
publicSubClass = PublicSubClass.new


publicSubClass.setPrivateInt(13)

# 23. Memastikan method overriding bekerja
print "[26] publicSubClass.getPrivateInt() = "
puts publicSubClass.getPrivateInt
```

## Scala

```scala
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
  override def getPrivateInt() : Int = {
  
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
    var publicSubClass = new PublicSubClass()
    
    publicSubClass.setPrivateInt(13)
    
    // 23. Memastikan method overriding bekerja
    println("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt())
  }
}
```