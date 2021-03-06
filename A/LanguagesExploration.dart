  // 1. Cara mendifinisikan kelas
  class PublicClass {
    
  // 2. Cara mendefinisikan atribut privat bertipe int
  int _privateInt;
  
  // 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
  var publicString = "Hello";
  
 // 4. Cara mendefinisikan atribut statik
  static var staticInt;

 // 5. Cara mendefinisikan konstanta
  static const PI = 3.14;

 // 6. Cara mendefinisikan konstruktor
  PublicClass();

  // 7b. Cara menuliskan dokumentasi untuk method 7a
  ///
  ///
  ///Mengubah nilai atribut privateInt menjadi [newPrivateInt]
  ///
  // 7a. Cara mendefinisikan method dengan parameter tanpa return value
  void setPrivateInt(num newPrivateInt) {
    // 8. Cara mengisi atribut dari dalam kelas itu sendiri
    _privateInt = newPrivateInt;
  }
  
    // 9a. Cara mendefinisikan method dengan return value
    
    // 9b. Cara menuliskan dokumentasi untuk method 9a
     /// Mendapatkan nilai dari atribut privateInt
     /// @return nilai dari privateInt
    num getPrivateInt() {
        // 10. Cara mengembalikan nilai
        return this._privateInt;
    }
}

// 11. Cara menurunkan kelas
class PublicSubClass extends PublicClass {

  // 12. Cara melakukan override method
  @override
  num getPrivateInt() {

    // 13. Cara mengakses method pada superclass
    var temp = super.getPrivateInt();
    return 2*temp;
  }
}

///Method main tidak perlu didalam kelas
  void main() {
    // 14. Cara menginstansiasi kelas baru
    var publicClass = new PublicClass();

    // 15. Cara memanggil method dengan parameter
    publicClass.setPrivateInt(13);

    // 16. Cara memanggil method dan mendapatkan return value-nya
   // var temp = publicClass.getPrivateInt();
    print("[13]publicClass.getPrivateInt() = "+ publicClass.getPrivateInt().toString());

    // 17. Cara mengubah isi atribut publik dari luar kelas
    publicClass.publicString = "World!";
    
    // 18. Cara mendapatkan isi atribut publik dari luar kelas
    print("[World!] publicClass.publicString = " + publicClass.publicString);

    // 19. Cara mengisi nilai atribut statik
    PublicClass.staticInt = 10;
    
    // 20. Cara mendapatkan nilai atribut statik
    print("[10] PublicClass.staticInt = " + PublicClass.staticInt.toString());

    // 21. Cara mendapatkan nilai konstanta
    print("[3.14] PublicClass.PI = " + PublicClass.PI.toString());
    
    // 22. Cara menginstansiasi kelas dengan turunannya
    var publicSubClass = new PublicSubClass();

    publicSubClass.setPrivateInt(13);

    // 23. Memastikan method overriding bekerja
    print("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt().toString());
  }
