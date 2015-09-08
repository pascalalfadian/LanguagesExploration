__author__ = 'Carissa'

# 1. Cara mendifinisikan kelas
class PublicClass():

    # 2. Cara mendefinisikan atribut privat bertipe int
    privateInt=0;

    # 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
    publicString = "Hello";

    # 4. Cara mendefinisikan atribut statik
    staticInt=0;

    # 5. Cara mendefinisikan konstanta
    """static final double PI = 3.14;
    atribut final tidak dapat didefinisikan dalam bahasa python"""


    # 6. Cara mendefinisikan konstruktor
    def __init__(self):
        # kosong


    # 7a. Cara mendefinisikan method dengan parameter tanpa return value
    # 7b. Cara menuliskan dokumentasi untuk method 7a
    '''
     Mengubah nilai atribut privateInt
     @param privateInt nilai privateInt yang baru.
     '''
    def setPrivateInt(privateInt):
        # 8. Cara mengisi atribut dari dalam kelas itu sendiri
        self.privateInt = privateInt;


    # 9a. Cara mendefinisikan method dengan return value
    # 9b. Cara menuliskan dokumentasi untuk method 9a
    '''
     Mendapatkan nilai dari atribut privateInt
     @return nilai dari privateInt
     '''

    def getPrivateInt(self, privateInt):
        # 10. Cara mengembalikan nilai
        return privateInt;



# 11. Cara menurunkan kelas
class PublicSubClass(PublicClass):

    # 12. Cara melakukan override method
    def getPrivateInt(self):
        # 13. Cara mengakses method pada superclass
        return 2 * super.getPrivateInt();



class LanguagesExploration():
    def main(args):
        # 14. Cara menginstansiasi kelas baru
        publicClass = PublicClass();

        # 15. Cara memanggil method dengan parameter
        publicClass.setPrivateInt(13);

        # 16. Cara memanggil method dan mendapatkan return value-nya
        print("[13] publicClass.getPrivateInt() = " + publicClass.getPrivateInt());

        # 17. Cara mengubah isi atribut publik dari luar kelas
        publicClass.publicString = "World!";

        # 18. Cara mendapatkan isi atribut publik dari luar kelas
        print("[World!] publicClass.publicString = " + publicClass.publicString);

        # 19. Cara mengisi nilai atribut statik
        PublicClass.staticInt = 10;

        # 20. Cara mendapatkan nilai atribut statik
        print("[10] PublicClass.staticInt = " + PublicClass.staticInt);

        # 21. Cara mendapatkan nilai konstanta
        print("[3.14] PublicClass.PI = " + PublicClass.PI);

        # 22. Cara menginstansiasi kelas dengan turunannya
        publicSubClass = PublicSubClass();

        publicSubClass.setPrivateInt(13);

        # 23. Memastikan method overriding bekerja
        print("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt());

