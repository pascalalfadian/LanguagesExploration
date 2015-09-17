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
