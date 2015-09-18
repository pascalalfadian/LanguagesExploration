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
    /*
	Named Constructor
	Jika mendeklarasikan konstruktor lebih dari satu, disarankan meberi nama konstruktor agar dapat dibedakan dengan jelas.
    */
    PublicClass.kosong(){
	//kosong
    }
    /*
	Constructor with optional parameter.
	Parameter di dalam brace {} merupakan optional parameter. Parameter tersebut dapat menerima argumen bisa juga tidak.
	Dengan deklarasi konstruktor seperti dibawah, dapat dipanggil dengan new PublicClass() dan new PublicClass(privateInt,publicString).
    */
    PublicClass({int privateInt,String publicString}) {
        if(privateInt!=null)this._privateInt = privateInt;
		if(publicString!=null)this.publicString = publicString;
    }
    
    // 7a. Cara mendefinisikan method dengan parameter tanpa return value
    // 7b. Cara menuliskan dokumentasi untuk method 7a
    
     ///Mengubah nilai atribut privateInt
     ///[privateInt] nilai privateInt yang baru.
   void setPrivateInt(int privateInt) {
    
        // 8. Cara mengisi atribut dari dalam kelas itu sendiri
        //Sama seperti java, untuk mengacu pada atribut kelas dapat menggunakan this.
        this._privateInt = privateInt;
    }
    
    // 9a. Cara mendefinisikan method dengan return value
    
    
    // 9b. Cara menuliskan dokumentasi untuk method 9a

     ///Mendapatkan nilai dari atribut privateInt
     ///Return nilai dari privateInt
    public int getPrivateInt() {
        
        // 10. Cara mengembalikan nilai
        return this._privateInt;
    }
    //method getter v2
    //public int getPrivateInt()=>this._privateInt;
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
    // Pada dart variable string dapat kita beri petik dua atau petik satu, keduanya memiliki fungsi yang sama
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
