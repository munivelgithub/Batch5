//public class StringClass {
//    public static void removingspaces(){
//
//        String a=" Hello world";
//        // to remove only spaces
//        System.out.println(a.replace(" ",""));
//        //Leading spaces = spaces at the beginning of a string.
//        //
//        //Trailing spaces = spaces at the end of a string.
//        System.out.println(a.trim());
//        String b="Hello world \n Munivel";
//        System.out.println(b);
//        // to remove all new line an all those stuff like tabs and spaces and all other things
//        System.out.println(a.replaceAll("//s",""));
////       //replace(" ", "") → removes space characters.
////trim() → removes spaces only at the beginning and end.
////replaceAll("\\s", "") → removes all whitespace characters.
//
//        //Regex	Meaning	Example
//        //.	Any single character	a.c → abc, axc
//        //\\d	Digit (0-9)	5, 8, 1
//        //\\D	Not a digit	a, @, X
//        //\\s	Whitespace	space, tab
//        //\\S	Non-whitespace	a, 5
//        //[abc]	a or b or c	a, b, c
//        //[0-9]	Any digit	0 to 9
//        //+	One or more	a+ → a, aa, aaa
//        //*	Zero or more	a* → "", a, aa
//      //  System.out.println();
//        //  main
//        //* munivel
//        //  remotes/origin/munivel
//        //PS C:\Java\Patient-Service> git push -u origin munivel
//        //branch 'munivel' set up to track 'origin/munivel'.
//        //Everything up-to-date
//        //PS C:\Java\Patient-Service>
//        //
//        //In Java, you can remove spaces from a string using replace().
//        //
//        //Remove all spaces
//        //String str = "Hello World Java";
//        //String result = str.replace(" ", "");
//        //
//        //System.out.println(result);
//        //
//        //Output:
//        //
//        //HelloWorldJava
//        //Remove leading and trailing spaces only
//        //String str = "   Hello World   ";
//        //String result = str.trim();
//        //
//        //System.out.println(result);
//        //
//        //Output:
//        //
//        //Hello World
//        //Remove all types of whitespace (spaces, tabs, new lines)
//        //String str = "Hello \t World \n Java";
//        //String result = str.replaceAll("\\s", "");
//        //
//        //System.out.println(result);
//        //
//        //Output:
//        //
//        //HelloWorldJava
//        //Interview Question
//        //String s = " J a v a ";
//        //System.out.println(s.replace(" ", ""));
//        //
//        //Output:
//        //
//        //Java
//        //
//        //Remember:
//        //
//        //replace(" ", "") → removes space characters.
//        //trim() → removes spaces only at the beginning and end.
//        //replaceAll("\\s", "") → removes all whitespace characters.
//        //emove leading and trailing spaces only what is leading an trainling
//        //
//        //Leading spaces = spaces at the beginning of a string.
//        //
//        //Trailing spaces = spaces at the end of a string.
//        //
//        //Example:
//        //
//        //String s = "   Hello World   ";
//        //
//        //Visualization:
//        //
//        //|___Hello World___|
//        // ↑               ↑
//        //Leading       Trailing
//        //spaces        spaces
//        //
//        //When you use:
//        //
//        //String result = s.trim();
//        //System.out.println(result);
//        //
//        //Output:
//        //
//        //Hello World
//        //
//        //The spaces before "Hello" and after "World" are removed, but the space between "Hello" and "World" remains.
//        //
//        //More examples
//        //String s1 = "   Java";
//        //System.out.println(s1.trim());
//        //
//        //Output:
//        //
//        //Java
//        //String s2 = "Java   ";
//        //System.out.println(s2.trim());
//        //
//        //Output:
//        //
//        //Java
//        //String s3 = "   Java Programming   ";
//        //System.out.println(s3.trim());
//        //
//        //Output:
//        //
//        //Java Programming
//        //
//        //Think of a train:
//        //
//        //[spaces][Java Programming][spaces]
//        //    ↑                    ↑
//        // Leading             Trailing
//        //
//        //trim() removes the empty coaches at the front and back, but keeps everything in the middle.
//        //
//        //what is // regex
//        //
//        //Regex stands for Regular Expression.
//        //
//        //It is a pattern used to search, match, validate, or replace text in a string.
//        //
//        //In Java, methods like replaceAll(), matches(), and split() use regex.
//        //
//        //Example 1: Remove all spaces
//        //String s = "Hello World Java";
//        //System.out.println(s.replaceAll(" ", ""));
//        //
//        //Output:
//        //
//        //HelloWorldJava
//        //Example 2: \\s means whitespace
//        //String s = "Hello\tWorld\nJava";
//        //System.out.println(s.replaceAll("\\s", ""));
//        //
//        //Output:
//        //
//        //HelloWorldJava
//        //
//        //Here:
//        //
//        //\s = whitespace (space, tab, newline)
//        //In Java strings, \ must be escaped, so we write \\s.
//        //Common Regex Patterns
//        //Regex	Meaning	Example
//        //.	Any single character	a.c → abc, axc
//        //\\d	Digit (0-9)	5, 8, 1
//        //\\D	Not a digit	a, @, X
//        //\\s	Whitespace	space, tab
//        //\\S	Non-whitespace	a, 5
//        //[abc]	a or b or c	a, b, c
//        //[0-9]	Any digit	0 to 9
//        //+	One or more	a+ → a, aa, aaa
//        //*	Zero or more	a* → "", a, aa
//        //Validate a Mobile Number
//        //String mobile = "9876543210";
//        //
//        //System.out.println(mobile.matches("\\d{10}"));
//        //
//        //Output:
//        //
//        //true
//        //
//        //Meaning:
//        //
//        //\\d → digit
//        //{10} → exactly 10 times
//        //Remove All Digits
//        //String s = "Java123Spring456";
//        //System.out.println(s.replaceAll("\\d", ""));
//        //
//        //Output:
//        //
//        //JavaSpring
//        //
//        //A simple definition for interviews:
//        //
//        //Regex (Regular Expression) is a sequence of characters that defines a search pattern used for matching, validating, splitting, or replacing text in a string.
//        //
//        //Toggle case what us toggle cases
//        //
//        //Toggle case means:
//        //
//        //Convert uppercase letters to lowercase
//        //Convert lowercase letters to uppercase
//        a.length();
//        public class Main {
//            public static void main(String[] args) {
//                String str = "JaVa ProGraMMing";
//                String result = "";
//
//                for (int i = 0; i < str.length(); i++) {
//                    char ch = str.charAt(i);
//
//                    if (Character.isUpperCase(ch)) {
//                        result += Character.toLowerCase(ch);
//                    } else if (Character.isLowerCase(ch)) {
//                        result += Character.toUpperCase(ch);
//                    } else {
//                        result += ch;
//                    }
//                }
//
//                System.out.println(result);
//            }
//        }
//        //Uppercase → Lowercase
//        //
//        //Add 32:
//        //
//        //char ch = 'A';
//        //char lower = (char)(ch + 32);
//        //
//        //System.out.println(lower);
//        //
//        //Output:
//        //ASCII conversion logic is commonly used to change uppercase letters to lowercase and vice versa.
//        //A = 65
//        //B = 66
//        //C = 67
//        //...
//        //Z = 90
//        //
//        //a = 97
//        //b = 98
//        //c = 99
//        //...
//        //z = 122
//
//        //How are characters internally stored?
//        //
//        //In Java, characters are stored as numbers internally.
//        //
//        //When you write:
//        //
//        //char ch = 'A';
//        //
//        //Java actually stores:
//        //
//        //A = 65 (ASCII value)
//        //
//        //You can see it:
//        //
//        //char ch = 'A';
//        //System.out.println((int) ch);
//        //
//        //Output:
//        //
//        //65
//        //Memory Representation
//        //char ch = 'A';
//        //
//        //Conceptually:
//        //
//        //Variable: ch
//        //Value stored: 65
//        //Character displayed: A
//        //
//        //Similarly:
//        //
//        //char ch = 'a';
//        //Variable: ch
//        //Value stored: 97
//        //Character displayed: a
//        //Why can we do arithmetic on characters?
//        //
//        //Because characters are stored as numbers.
//        //
//        //char ch = 'A';
//        //
//        //System.out.println(ch + 1);
//        //
//        //Output:
//        //String vs StringBuilder in Java
//        //Feature	String	StringBuilder
//        //Mutable?	❌ No (Immutable)	✅ Yes (Mutable)
//        //Memory	Creates new object on modification	Modifies same object
//        //Performance	Slower for frequent changes	Faster for frequent changes
//        //Package	java.lang.String	java.lang.StringBuilder
//        //String Example
//        //String s = "Java";
//        //
//        //s = s + " Programming";
//        //s = s + " Language";
//        //
//        //System.out.println(s);
//        //
//        //What happens internally?
//        //
//        //"Java"
//        //   ↓
//        //"Java Programming"   (new object)
//        //   ↓
//        //"Java Programming Language" (new object)
//        //
//        //Every modification creates a new String object because String is immutable.
//        //
//        //StringBuilder Example
//        //StringBuilder sb = new StringBuilder("Java");
//        //
//        //sb.append(" Programming");
//        //sb.append(" Language");
//        //
//        //System.out.println(sb);
//        //
//        //What happens internally?
//        //
//        //Java
//        //  ↓ append
//        //Java Programming
//        //  ↓ append
//        //Java Programming Language
//        //
//        //The same object is modified.
//        //
//        //Interview Question
//        //Reverse a String Using StringBuilder
//        //String str = "Java";
//        //
//        //StringBuilder sb = new StringBuilder(str);
//        //
//        //System.out.println(sb.reverse());
//        //
//        //Output:
//        //
//        //avaJ
//        //Common Methods
//        //StringBuilder sb = new StringBuilder("Java");
//        //
//        //sb.append(" Spring");
//        //sb.insert(4, " Core");
//        //sb.delete(4, 9);
//        //sb.reverse();
//        //
//        //System.out.println(sb);
//        //
//        //Methods:
//        //
//        //append() → add text
//        //insert() → insert text
//        //delete() → remove text
//        //reverse() → reverse string
//        //When to Use?
//        //
//        //✅ Use String when the value rarely changes.
//        //
//        //String name = "Munivel";
//        //
//        //✅ Use StringBuilder when performing many modifications.
//        //
//        //StringBuilder log = new StringBuilder();
//        //
//        //for(int i = 1; i <= 1000; i++) {
//        //    log.append(i);
//        //}
//        //Interview Definition
//        //
//        //String is immutable, meaning its value cannot be changed after creation. StringBuilder is mutable, meaning its content can be modified without creating new objects. Therefore, StringBuilder is more efficient for frequent string manipulations.
//        //3. String Pool Saves Memory
//        //String s1 = "Java";
//        //String s2 = "Java";
//        //
//        //Both variables can refer to the same string in the String Pool.
//        //
//        //s1 ──┐
//        //     ├──> "Java"
//        //s2 ──┘
//        //
//        //This saves memory.
//        //
//        //StringBuilder objects don't use the String Pool in this way.
//        //If StringBuilder is mutable and faster for modifications, why does Java still have String?
//        //
//        //1. Most text doesn't change
//        //
//        //Many values remain constant:
//        //
//        //String name = "Munivel";
//        //String college = "ABC Engineering College";
//        //
//        //These values are usually just read, not modified.
//        //
//        //Using StringBuilder here would add unnecessary complexity.
//
//        //What is a String in Java?
//        //
//        //A String is a sequence of characters used to store text.
//        //A String is an object that represents a sequence of characters.
//        //For example:
//        //
//        //String s = "Java";
//        //
//        //Internally:
//        //
//        //J  a  v  a
//        //↓  ↓  ↓  ↓
//        //74 97 118 97
//        //
//        //Each character is stored using its Unicode value.
//        //
//        //Why is String not a primitive?
//        //
//        //Primitive types:
//        //
//        //int age = 20;
//        //char grade = 'A';
//        //double salary = 1000.5;
//        //
//        //But String is an object:
//        //
//        //String name = "Munivel";
//        //
//        //It belongs to the class:
//        //
//        //java.lang.String
//        //Ways to Create a String
//        //1. String Literal (Recommended)
//        //String s1 = "Java";
//        //
//        //Stored in the String Pool.
//        //
//        //2. Using new
//        //String s2 = new String("Java");
//        //
//        //Creates a new object in memory.
//        //
//        //Common String Methods
//        //String s = "Java";
//        //s.length();      // 4
//        //s.charAt(0);     // J
//        //s.toUpperCase(); // JAVA
//        //s.toLowerCase(); // java
//        //s.contains("av");// true
//        //Important Property: Immutable
//        //String s = "Java";
//        //
//        //s.concat(" Spring");
//        //
//        //System.out.println(s);
//        //
//        //Output:
//        //
//        //Java
//        //
//        //The original string does not change because Strings are immutable.
//        //
//        //To store the modified value:
//        //
//        //s = s.concat(" Spring");
//        //
//        //Output:
//        //
//        //Java Spring
//        //Interview Answer
//        //
//        //A String in Java is an object of the String class that represents a sequence of characters. Strings are immutable, meaning their contents cannot be changed after creation. They are used to store and manipulate text data.
//        //
//    }
//}
