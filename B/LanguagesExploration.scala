object PublicClass{

	//1. Cara mendefinisikan atribut statik
	//variable var memungkinkan nilai pada atribut staticInt dapat diubah
	var staticInt: Int = _

	//2. Cara mendefinisikan konstanta
	// variable val membuat nilai pada atribut PI selalu tetap
	val PI: Double = 3.14
}

//3.Cara mendefiniskan kelas
class PublicClass{

	//4. Cara mendefiniskan atribut ber hak akses private, bertipe integer, dan mengisi nilai awal
	private var privateInt: Int = _
	
	//5. Cara mendefiniskan atribut ber hak akses public, bertipe string, dan mengisi nilai awal 	
	var publicString: String = "Hello"
	
	//6a. Cara mendefinisikan method dengan parameter tanpa return value
	//6b. cara menuliskan dokumentasi untuk method 6a
	/**
	* Mengubah atribut privateInt dengan nilai yang baru, bertipe integer
	* @param newPrivateInt merupakan nilai dari atribut privateInt yang baru
	*/
	def setPrivateInt(newPrivateInt: Int): Unit = {
		//7. Cara mengubah nilai dari atribut menjadi nilai dari parameter
		privateInt = newPrivateInt 
	}
	
	//8a. Cara mendifinisikan method tanpa return value
	//8b. cara menuliskan dokumentasi untuk method 8a 
	/**
	 * Mengembalikan nilai dari atribut privateInt
	 * @return nilai dari atribut privateInt
	 */
	def getPrivateInt(): Int = {
	   	//9. Cara mengembalikan nilai
		return privateInt
	}
}

//10. Cara menurunkan kelas
class PublicSubClass extends PublicClass{

	//11. Cara meng-override method dari kelas Superclass
	override def getPrivateInt(): Int = {
		//12. Cara mengakses method dari kelas Superclass
	     return  (2 * super.getPrivateInt())
	}
}

//13. Cara mendefinisikan konstruktor
class PublicClass2(){
	// kosong
}

object LanguagesExploration {
	
	import PublicClass._

	def main(args: Array[String]): Unit = {

		//14. Cara menginstansiasi kelas baru
		var publicClass = new PublicClass()
		
		//15. Cara memanggil method dengan parameter  
		publicClass.setPrivateInt(13)
		
		//16. Cara memanggil method dan mendapatkan return value-nya
		println("[13] publicClass.getPrivateInt() = " + publicClass.getPrivateInt)
		
		//17. Cara mengubah nilai dari atribut publicString dari kelas publicClass (luar kelas)
		publicClass.publicString = "World!"
		
		//18. Cara memanggil atribut dan mendapatkan nilai atribut dari kelas publicClass (luar kelas)
		println("[World!] publicClass.publicString = " + publicClass.publicString)
		
		//19. Cara memanggil dan mengisi nilai atribut statik
		PublicClass.staticInt = 10
		
		//20. Cara memanggil atribut statik dan mendapatkan nilainya 
		println("[10] PublicClass.staticInt = " + PublicClass.staticInt)
		
		//21. Cara memanggil konstanta 
		println("[3.14] PublicClass.PI = " + PublicClass.PI)
		
		//22. Cara menginstansiasi kelas subclass
		var publicSubClass = new PublicSubClass()
		publicSubClass.setPrivateInt(13)
		
		//23. Memastikan method overriding bekerja
		println("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt)
	}
}
