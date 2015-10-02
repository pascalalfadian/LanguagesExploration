<?php
	/*nama Kelompok : Gabriel Radewa
			  Ricky Suryadi
			  Renaldi Nugroho
			  Alfian Prabowo
			  Erlangga Laimena
			  Ilham Adrian
			  Risfan
			  */
        // put your code here
        class PublicClass {
            // 2. cara mendifinisikan atribut private bertipe int
            var $privateInt;
            
            // 3. cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
            var $publicString = "Hello";
            
            // 4. cara mendefinisikan atribut statik
            static $staticInt;
            // 5. cara mendefinisikan konstanta
            const PI = 3.14;
            // 6. cara mendefinisikan konstruktor
            function PublicClass() {
                
            }
            // 7a. Cara mendefinisikan method dengan parameter tanpa return value
            // 7b. Cara menuliskan dokumentasi untuk method 7a
            /*
              mengubah nilai atribut privateInt
              @param privateInt nilai privateInt yang baru
             */
            function setPrivateInt($masukan) {
                //8.Cara mengisi atribut dari dalam kelas itu sendiri
                global $privateInt;
				$privateInt=$masukan;
            }
            // 9a. Cara mendefinisikan method dengan return value
            // 9b. Cara menuliskan dokumentasi untuk method 9a
            /*
              mendapatkan nilai dari atribut privateInt
              @return nilai dari privateInt */
            function getPrivateInt() {
                // 10. Cara mengembalikan nilai
				global $privateInt;
                return $privateInt;
            }
        }
		
		class PublicSubClass extends PublicClass {
            // 12. cara melakukan override method
            function getPrivateInt() {
                // 13. cara mengakses method pada superclass
                return 2*PublicClass::getPrivateInt();
            }
        }
	$obj=new PublicSubClass();
	$obj->setPrivateInt(10);
	echo $obj->getPrivateInt();
	echo $obj->publicString;
?>
