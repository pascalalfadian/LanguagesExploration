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
