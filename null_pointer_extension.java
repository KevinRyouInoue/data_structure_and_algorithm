String nullObject = null;
String normalObject = "normal";

// The correct way of checking if an object is null
nullObject == null;   // => true
normalObject == null; // => false

// The String class checks if argument is null, so it will throw NPE.  
// If a .equals() method doesn't check for a null argument, it will crash and throw a NPE.
// Here, we are comparing the value stored in normalObject to the values null, and nullObject
normalObject.equals(null);       // => false
normalObject.equals(nullObject); // => false

// However, here we invoking the .equals() method on a null object stored in nullOject
// This will cause a NPE to be thrown, regardless of the parameter in the .equals() method
nullObject.equals(normalObject);  // causes NullPointerException
nullObject.equals(null);          // causes NullPointerException


Setup
String nullObject = null; — This variable doesn’t point to any object. It’s “empty.”
String normalObject = "normal"; — This points to an actual String object with the text "normal".

Checking for null with ==
nullObject == null; → true
The == operator checks whether the reference is literally null. Here it is, so true.
normalObject == null; → false
normalObject points to a real String, so it isn’t null.

Using .equals(...) for content equality Important: You can only call a method on a real object. Calling any method on null throws a NullPointerException (NPE).
normalObject.equals(null); → false
You are calling equals on a real String ("normal"), passing null as the argument. String.equals returns false when the argument is null. No exception is thrown.
normalObject.equals(nullObject); → false
Same idea: the receiver (normalObject) is not null, and the argument is null, so equals returns false.

Null receiver causes NPE
nullObject.equals(normalObject); → throws NullPointerException
nullObject.equals(null); → throws NullPointerException
In both cases, you’re trying to call a method on null (nullObject). That’s an immediate NPE before equals even runs.

Fix a misleading comment
The note “The String class checks if argument is null, so it will throw NPE” is incorrect. String.equals does NOT throw for a null argument; it simply returns false. The NPE happens only when the receiver (the thing before .equals) is null.

When to use what
To check if something is null: use == null (or != null).
To compare two possibly-null references safely: use Objects.equals(a, b), which returns true if both are null, false if one is null, and otherwise calls equals without throwing.