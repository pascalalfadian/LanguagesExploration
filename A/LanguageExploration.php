<?php
        /*
          Dokumentasi LanguagesExploration ADBO dalam PHP
          Kelompok 1 :
          Riki Rusli    2014730032
          Daniel Ferdinan     2014730038
          Fernando    2011730080
          Ivan TW             2014730026
          Aldy Marcelino  2013730005
        */
        
        /*
          Akan dijelaskan apa yang dilakukan dalam nomor-nomor yang telah kami kerjakan sesuai dengan
          LanguagesExploration.java (pada setiap nomor menggunakan tanda #)
        */
        # deklarasi kelas
        # 1. cara mendefinisikan kelas
        class PublicClass {
    
            # 2. Cara mendefinisikan atribut private bertipe int
            private $private_int = 0;
            
      
            # 3. Cara mendifinisikan atribut public bertipe string, dan mengisi dengan nilai awal
            public $public_string = "Hello";
      
            # 4. Cara mendefinisikan atribut statik
            public static $static_int;
      
            # 5. Cara mendefinisikan konstanta
            const PI = 3.14;
      
            # 6. Cara mendefinisikan konstruktor
            public function __construct() {
                #kosong
            }
            #7a. Cara mendefinisikan method dengan parameter tanpa return value
            # 7b. Cara menuliskan dokumentasi untuk method 7a
            public function set_private_int($input) {
                # 8. Cara mengisi atribut dari dalam kelas itu sendiri
                $this->private_int = $input;
            }
            # 9a. Cara mendefinisikan method dengan return value
            # 9b. Cara menuliskan dokumentasi untuk method 9a
            public function get_private_int() {
                # 10. Cara mengembalikan nilai
                return $this->private_int;
            }
        }
        # 11. Cara menurunkan kelas
        class PublicSubClass extends PublicClass {
            public function __construct() {
                parent::__construct();
            }
            # 12. Cara melakukan override method
            public function get_private_int() {
                # 13. Cara mengakses method pada superclass
                return 2 * parent::get_private_int();
            }
        }
        class LanguagesExploration {
            public static function main() {
                # 14. Cara menginstansiasi kelas baru
                $publicClass = new PublicClass();
        
                # 15. Cara memanggil method dengan parameter
                $publicClass->set_private_int(13);
        
                # 16. Cara memanggil method dan mendapatkan return value-nya
                echo "[13] publicClass.getPrivateInt() = " . $publicClass->get_private_int() . "\n" ;
        
                # 17. Cara mengubah isi atribut publik dari luar kelas
                $publicClass->publicString = "World!";
        
                # 18. Cara mendapatkan isi atribut publik dari luar kelas
                echo "[World!] publicClass.publicString = " . $publicClass->publicString . "\n";
        
                /*
					*memperbaiki nomor 19 untuk mengganti atribut statik kami menggunakan method setter
					*memperbaiki "<br>" menjadi "\n"
				*/
        
        
				# 19. Cara mengisi nilai atribut statik
                $publicClass->set_private_int(10);
        
                # 20. Cara mendapatkan nilai atribut statik
                echo "[10] PublicClass.staticInt = " . $publicClass->get_private_int(). "\n";
        
        
                # 21. Cara mendapatkan nilai konstanta
                echo "[3.14] PublicClass.PI = " . $publicClass::PI . "\n";
        
                # 22. Cara menginstansiasi kelas dengan turunannya
                $publicSubClass = new PublicSubClass();
                $publicSubClass->set_private_int(13);
        
                # 23. Memastikan method overriding bekerja
                echo "[26] publicSubClass.getPrivateInt() = " . $publicSubClass->get_private_int() . "\n";
            }
        }
        LanguagesExploration::main();
        ?>
