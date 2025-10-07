int one1 = 1;
int one2 = 1;
int two1 = 2;
int two2 = 2;

one1 == one2; // => true
two1 == two2; // => true
one1 == two1; // => false
one1 == 1;    // => true
two1 == 2;    // => true

String literal = "This is a string.";
String object = new String("This is a string.");
String unequal = "Nope.";

// Using == On Value Equal Strings
literal == object;                           // => false
literal == "This is a string.";              // => true
"This is a string." == "This is a string.";  // => true
object == "This is a string.";               // => false
object == new String("This is a string.");   // => false

// Using .equals() On Value Equal Strings
literal.equals(object);                      // => true
object.equals(literal);                      // => true
literal.equals("This is a string.");         // => true
object.equals("This is a string.");          // => true
"This is a string.".equals("This is a string.");               // => true
"This is a string.".equals(new String("This is a string."));   // => true

// Using == and .equals() on Unequal Strings
literal == unequal;          // => false
object == unequal;           // => false
literal.equals(unequal);     // => false
object.equals(unequal);      // => false