object PublicClass{

	var staticInt: Int = 0
	val PI: Double = 3.14
}

class PublicClass{

	private var privateInt: Int = 0
	var publicString: String = "Hello"

	def setPrivateInt(newPrivateInt: Int): Unit = {
		privateInt = newPrivateInt
	}

	def getPrivateInt(): Int = {
		return privateInt
	}
}

class PublicSubClass extends PublicClass{

	override def getPrivateInt(): Int = {
		return (2 * super.getPrivateInt())
	}
}

object LanguagesExploration {

	import PublicClass._

	def main(args: Array[String]) {

		val publicClass = new PublicClass
		publicClass.setPrivateInt(13)
		println("[13] publicClass.getPrivateInt() = " + publicClass.getPrivateInt())
		publicClass.publicString = "World!"
		println("[World!] publicClass.publicString = " + publicClass.publicString)
		staticInt = 10
		println("[10] PublicClass.staticInt = " + PublicClass.staticInt)
		println("[3.14] PublicClass.PI = " + PublicClass.PI)
		val publicSubClass = new PublicSubClass
		publicSubClass.setPrivateInt(13)
		println("[26] publicSubClass.getPrivateInt() = " + publicSubClass.getPrivateInt())
	}
}
