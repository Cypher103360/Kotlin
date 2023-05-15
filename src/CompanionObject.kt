fun main() {
    CompanionObject.funA()
    CompanionObject.MyAnotherObject.funB()
}

class CompanionObject {
    companion object MyObject {
        @JvmStatic // this annotation is used, so that we can call this function from a Java class
        fun funA() {
            println("this is funA from MyObject Companion Object")
        }
    }

    object MyAnotherObject {
        fun funB() {
            println("this is my funB from MyAnotherObject")
        }
    }
}