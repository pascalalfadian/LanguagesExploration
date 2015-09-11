# 1. Cara mendifinisikan kelas
class PublicClass {
    
    # 2. Cara mendefinisikan atribut privat bertipe int
    @privateInt
    
    # 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
    @publicString = "Hello"
    
    # 4. Cara mendefinisikan atribut statik
    @@staticInt
    
    # 5. Cara mendefinisikan konstanta
    PI = 3.14




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
