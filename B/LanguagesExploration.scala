object PublicClass{

	//4. Cara mendefinisikan atribut statik
	//variable var memungkinkan nilai pada atribut staticInt dapat diubah
	var staticInt: Int = _

	//5. Cara mendefinisikan konstanta
	// variable val membuat nilai pada atribut PI selalu tetap
	val PI: Double = 3.14
}

//1. Cara mendefiniskan kelas
class PublicClass{
	
	//2. Cara mendefiniskan atribut ber hak akses private, bertipe integer, dan mengisi nilai awal
	private var privateInt: Int = _

	//3. Cara mendefiniskan atribut ber hak akses public, bertipe string, dan mengisi nilai awal 	
	var publicString: String = "Hello"

	//6. Cara mendefinisikan konstruktor
	def PublicClass() = {
		//kosong
	}
	
	//7a. Cara mendefinisikan method dengan parameter tanpa return value
	//7b. cara menuliskan dokumentasi untuk method 7a
	/**
	* Mengubah atribut privateInt dengan nilai yang baru, bertipe integer
	* @param newPrivateInt merupakan nilai dari atribut privateInt yang baru
	*/
	def setPrivateInt(newPrivateInt: Int): Unit = {
		//8. Cara mengubah nilai dari atribut menjadi nilai dari parameter
		this.privateInt = newPrivateInt 
	}
	
	//9a. Cara mendifinisikan method tanpa return value
	//9b. cara menuliskan dokumentasi untuk method 9a 
	/**
	 * Mengembalikan nilai dari atribut privateInt
	 * @return nilai dari atribut privateInt
	 */
	def getPrivateInt(): Int = {
		//10. Cara mengembalikan nilai
		return this.privateInt
	}
}

//11. Cara menurunkan kelas
class PublicSubClass extends PublicClass{
	
	//12. Cara meng-override method dari kelas Superclass
	override def getPrivateInt(): Int = {
		//13. Cara mengakses method dari kelas Superclass
		return  (2 * super.getPrivateInt())
	}
}

object LanguagesExploration {

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
		
		//19. Cara mengisi nilai atribut statik
		PublicClass.staticInt = 10
		
		//20. Cara memanggil atribut statik dan mendapatkan nilainya 
		println("[10] PublicClass.staticInt = " + PublicClass.staticInt)
		
		//21. Cara mendapatkan nilai konstanta 
		println("[3.14] PublicClass.PI = " + PublicClass.PI)
		
		//22. Cara menginstansiasi kelas dengan turunannya
		var publicSubClass = new PublicSubClass()
		publicSubClass.setPrivateInt(13)
		
		//23. Memastikan method overriding bekerja
		println("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt)
	}
}
