class PublicClass:
    privateInt=0
    def __init__ (self):
        self.publicString = "hello"
        self.staticInt = 0
        self.PI = 3.14
        
    def setPrivateInt(self,privateInt):
        self.privateInt = privateInt

    def getPrivateInt(self):
        return self.privateInt
    
class PublicSubClass(PublicClass):
    def getPrivateInt(self):
        temp = super().getPrivateInt()
        return (2*temp)
    
class LanguageExploration:
    publicClass = PublicClass()
    publicClass.setPrivateInt(13)
    print ("[13] publicClass.getPrivateInt() = %s" % publicClass.getPrivateInt())
    publicClass.publicString="World!"
    print("[World] publicClass.publicString = %s"%publicClass.publicString)
    publicClass.staticInt=10
    print("[10] publicClass.staticInt = %s"%publicClass.staticInt)
    print("[3.14] publicClass.PI = %s"%publicClass.PI)
    publicSubClass = PublicSubClass()
    publicSubClass.setPrivateInt(13)
    print("[26] publicSubClass.getPrivateInt = %s"%publicSubClass.getPrivateInt())

##
