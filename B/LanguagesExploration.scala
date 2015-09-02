object PublicClass{

	//1. Cara mendefinisikan atribut statik
	var staticInt: Int = 0

	//2. Cara mendefinisikan konstanta
	val PI: Double = 3.14
}

//3.Cara mendefiniskan kelas
class PublicClass{

	//4. Cara mendefiniskan atribut ber hak akses private, bertipe integer, dan mengisi nilai awal
	private var privateInt: Int = 0
	
	//5. Cara mendefiniskan atribut ber hak akses public, bertipe string, dan mengisi nilai awal 	
	var publicString: String = "Hello"
	
	//6a. Cara mendifinisikan method dengan parameter tanpa return value
	//6b. cara menuliskan dokumentasi untuk method 6a
	/**
	* Mengubah atribut privateInt dengan nilai yang baru, bertipe integer
	* @param newPrivateInt merupakan nilai dari atribut privateInt yang baru
	*/
	def setPrivateInt(newPrivateInt: Int): Unit = {
		//7. Cara mengubah nilai dari atribut menjadi nilai dari parameter
		privateInt = newPrivateInt 
	}

	/**
	 * Mengembalikan nilai dari atribut privateInt
	 * @return nilai dari atribut privateInt
	 */
	def getPrivateInt(): Int = {
	   	//7. Cara mengembalikan nilai
		return privateInt
	}
}

//8. Cara menurunkan kelas
class PublicSubClass extends PublicClass{

	//9. Cara meng-override method dari kelas Superclass
	override def getPrivateInt(): Int = {
		//10. Cara mengakses method dari kelas Superclass
		return (2 * super.getPrivateInt())
	}
}

object LanguagesExploration {
	
	import PublicClass._

	def main(args: Array[String]): Unit = {

		//11. Cara menginstansiasi kelas baru
		val publicClass = new PublicClass
		
		//12. Cara memanggil method dengan parameter  
		publicClass.setPrivateInt(13)
		
		//13. Cara memanggil method dan mendapatkan return value-nya
		println("[13] publicClass.getPrivateInt() = " + publicClass.getPrivateInt())
		
		//14. Cara mengubah nilai dari atribut publicString dari kelas publicClass (luar kelas)
		publicClass.publicString = "World!"
		
		//15. Cara memanggil atribut dan mendapatkan nilai atribut dari kelas publicClass (luar kelas)
		println("[World!] publicClass.publicString = " + publicClass.publicString)
		
		//16. Cara mengisi nilai atribut statik
		staticInt = 10
		
		//17. Cara memanggil atribut statik dan mendapatkan nilainya 
		println("[10] PublicClass.staticInt = " + PublicClass.staticInt)
		
		//18. Cara memanggil konstanta 
		println("[3.14] PublicClass.PI = " + PublicClass.PI)
		
		//19. Cara menginstansiasi kelas subclass
		val publicSubClass = new PublicSubClass
		publicSubClass.setPrivateInt(13)
		
		//20. Memastikan method overriding bekerja
		println("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt())
	}
}
