<html>
	<head></head>
	<body>
		<?php
			//deklarasi kelas
			//1. cara mendefinisikan kelas
			class PublicClass{
				 // 2. Cara mendefinisikan atribut privat bertipe int
				private $private_int=0;
				
				// 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
				public $public_string="Hello";
				
				// 4. Cara mendefinisikan atribut statik
				public static $static_int;
				
				// 5. Cara mendefinisikan konstanta
				//belum dibikin
				
				 // 6. Cara mendefinisikan konstruktor
				public function __construct(){
					//kosong
				}
				
				//7a. Cara mendefinisikan method dengan parameter tanpa return value
				// 7b. Cara menuliskan dokumentasi untuk method 7a
				public function set_private_int($input){
					// 8. Cara mengisi atribut dari dalam kelas itu sendiri
					$this->private_int= $input;
										
				}
				
				// 9a. Cara mendefinisikan method dengan return value
				// 9b. Cara menuliskan dokumentasi untuk method 9a
				public function get_private_int(){
					// 10. Cara mengembalikan nilai
					return $this->private_int;
					
				}
				
				
				
			}
			
			// 11. Cara menurunkan kelas
			class PublicSubClass extends PublicClass{
				
				public function __construct(){
					parent::__construct();
					
				}
				// 12. Cara melakukan override method
				public function get_private_int($input){
					// 13. Cara mengakses method pada superclass
					$x=2*$this->private_int;
					return $x;
					
				}
				
			}
		
		?>
	
	</body>


</html>
