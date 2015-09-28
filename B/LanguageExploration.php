

<?php

// 1. mendifinisikan kelas
class PublicClass{
	
	// 2. cara mendifinisikan atribut private bertipe int
	$privateInt;
	
	// 3. cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
	$publicString = "Hello";
	
	// 4. cara mendefinisikan atribut statik
	static $staticInt;
		
	// 5. cara mendefinisikan konstanta
	define(PI, 3.14);
	
	// 6. cara mendefinisikan konstruktor
	function_PublicClass ()	{
		
	}
	
	// 7a. Cara mendefinisikan method dengan parameter tanpa return value
    // 7b. Cara menuliskan dokumentasi untuk method 7a
	/*
	mengubah nilai atribut privateInt
	@param privateInt nilai privateInt yang baru	
	*/
	function setPrivateInt($privateInt){
		//8.Cara mengisi atribut dari dalam kelas itu sendiri
		global $privateInt;
		$privateInt = $privateInt;
	}
	
	// 9a. Cara mendefinisikan method dengan return value
    // 9b. Cara menuliskan dokumentasi untuk method 9a
	/*
	mendapatkan nilai dari atribut privateInt
	@return nilai dari privateInt*/
	function getPrivateInt(){
		// 10. Cara mengembalikan nilai
		global $privateInt;
		return $privateInt;
	}
	
	// 11. cara menurunkan kelas
class PublicSubClass extends PublicClass {
		
	// 12. cara melakukan override method
	function getPrivateInt() {
		
	// 13. cara mengakses method pada superclass
	return 2 * this->getPrivateInt();
	}
}


class LanguagesExploration{
	
	function static main(array=args){
	
		// 14. cara menginstansiasi kelas baru
		$publicClass = new PublicClass();
		
		// 15. Cara memanggil method dengan parameter
		$publicClass->setPrivateInt(13);
		
		// 16. Cara memanggil method dan mendapatkan return value-nya
		echo "[13] $publicClass->getPrivateInt() = ". $publicClass->getPrivateInt(). "\n";
		
		// 17. Cara mengubah isi atribut publik dari luar kelas
		$publicClass->publicString = "World!";
		
		// 18. Cara mendapatkan isi atribut publik dari luar kelas
		echo "[World] $publicClass->publicString = ". $publicClass->publicString;  
			
		// 19. Cara mengisi nilai atribut statik
		$publicClass->staticInt = 10;
		  //PublicClass.staticInt = 10;
			
		// 20. Cara mendapatkan nilai atribut statik
		echo "[10] PublicClass->staticInt = ". PublicClass->staticInt;
			
		// 21. Cara mendapatkan nilai konstanta
		echo "[3.14] PublicClass->PI = ". constant(PublicClass->PI);
			
		// 22. Cara menginstansiasi kelas dengan turunannya
		$publicSubClass = new PublicClass();
		$publicSubClass->setPrivateInt(13);
			
		// 23. Memastikan method overriding bekerja
		echo "[26] $publicSubClass->getPrivateInt()".$publicSubClass->getPrivateInt();
		 
	}
}






?>
