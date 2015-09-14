// 1. Cara mendifinisikan kelas
class PublicClass {

  // 2. Cara mendefinisikan atribut privat bertipe int
  int _privateInt;
  // 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal ==> var s = 'Hello';
  var publicString = "Hello";

 // 4. Cara mendefinisikan atribut statik ==> static void bar() {} // A static method
  static var staticInt;

 // 5. Cara mendefinisikan konstanta ==>  const PI = 3.14;  
  static const PI = 3.14;

 // 6. Cara mendefinisikan konstruktor
  PublicClass();

   // 7b. Cara menuliskan dokumentasi untuk method 7a
  ///
  /// Method printNumber menerima [number] lalu mengeluarkan
  /// String tanpa kembalian
  ///
  // 7a. Cara mendefinisikan method dengan parameter tanpa return value
  void printNumber(num number) {
    print("The number is $number.");
  }

  ///
  ///Mengubah nilai atribut privateInt menjadi [privateInt]
  ///
  void setPrivateInt(num newPrivateInt) {
    // 8. Cara mengisi atribut dari dalam kelas itu sendiri
    _privateInt = newPrivateInt;
  }
  // 9a. Cara mendefinisikan method dengan return value
  // 9b. Cara menuliskan dokumentasi untuk method 9a
  /// Method say mengembalikan String pesan dengan format
  /// [from] mengirim [msg] menggunakan [device]
  ///
  String say(String from, String msg, [String device]) {
    var result = '$from says $msg';
    if (device != null) {
      result = '$result with a $device';
    }
    return result;
  }


  ///
  /// Mendapatkan nilai dari atribut privateInt
  /// @return nilai dari privateInt
  ///
  num getPrivateInt() {
    // 10. Cara mengembalikan nilai
    return this.privateInt;
    }
}

// 11. Cara menurunkan kelas
class PublicSubClass extends PublicClass {

  // 12. Cara melakukan override method
  num getPrivateInt() {

    // 13. Cara mengakses method pada superclass
   // super.setPrivateInt(2); //
    var temp = super.getPrivateInt();
    //return 2*temp; null
  }
}

class LanguagesExploration {
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
  }
}
