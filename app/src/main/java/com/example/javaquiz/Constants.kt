package com.example.javaquiz

object Constants {

    fun getQuestion() : ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1,
            "What is the size of float and double in java?",
        "32 and 64",
            "32 and 32",
            "64 and 64", "64 and 32",
            1)



        val que2 = Question(2,
            "Which component is used to compile, debug and execute the java programs?",
            "JVM",
            "JIT",
            "JDK",
            "JRE",
            3)


        val que3 = Question(3,
            "What is the extension of java code files?",
            ".txt",
            ".java",
            ".js",
            ".class",
            2)


        val que4 = Question(4,
            "Identify the return type of a method that does not return any value?",
            "int",
            "double",
            "void",
            "none",
            3)


        val que5 = Question(5,
            "Which of the following exception is thrown when divided by zero statement is executed?",
            "ArithmeticException",
            "NullPointerException",
            "NumberFormatException",
            "None",
            1)


        val que6 = Question(6,
            "Which of the following for loop declaration is not valid?",
            "for ( int i = 20; i >= 2; - -i )",
            "for ( int i = 2; i <= 20; i = 2* i )",
            "for ( int i = 99; i >= 0; i / 9 )",
            "for ( int i = 7; i <= 77; i += 7 )",
            3)


        val que7 = Question(7,
            "In which memory a String is stored, when we create a string using new operator?",
            "Stack",
            "Heap memory",
            "String memory",
            "Random storage space",
            2)


        val que8 = Question(8,
            "What is the return type of the hashCode() method in the Object class?",
            "object",
            "void",
            "long",
            "int",
            4)


        val que9 = Question(9,
            "Which class is a resizable array implementation?",
            "ArrayDeque",
            "LinkedList",
            "ArrayList",
            "HashSet",
            3)


        val que10 = Question(10,
            "Which method is used to obtain the size of a collection?",
            "size()",
            "getLength()",
            "length()",
            "count()",
            1)


        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)




        return questionsList
    }

}