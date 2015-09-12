# 1. Cara mendefinisikan kelas
class PublicClass:
  # 6. Cara mendefinisikan konstruktor 
  def __init__(self):
    # 2. Cara mendefiniskan atribut bertipe int
    self.privateInt=0
    
    # 3. Cara mendefinisikan atribut bertipe string, dan mengisi dengan nilai awal
    self.publicString="Hello"
    
    # 5.Cara mendefinisikan konstanta
    self.PI=3.14

# 7a. Cara mendefinisikan method dengan parameter tanpa return value
# 7b. Cara menuliskan dokumentasi untuk method 7a

def setPrivateInt(self, privateInt):
    # 8. Cara mengisi atribut dari dalam kelas itu sendiri
    self.privateInt=privateInt
