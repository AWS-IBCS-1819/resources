//Useful code for Gradebook.java

//read next item as a string and append to StringBuilder
yourStringBuilder.append(yourScanner.next());

//String formatting
"\n" // new Line
"apples" +
"bananas" // concatenate to be "applesbananas"

// check to see user input = choice
if (userInput.next().equals("1")) { // picked choice 1
  // do stuff
}

// method for converting string to double
Double.parseDouble("the number you want to convert");

// loop for going through a stringbuilder at every 5th interval
// 1) i = 0
// 2) i = 5
// 3) i = 10
// ...
for (int i = 0; i < yourStringBuilder.length(); i = i + 5)

// method for taking a substring of stringbuilder that is from index 4 - 7
yourStringBuilder.substring(4, 8));

// method for converting integers back to strings
Integer.toString(yourNumber);
// method for converting doubles back to strings
Double.toString(yourNumber);

// method for finding the number of characters in your StringBuilder
youStringBuilder.length();

//try and catch for reading files
try {
  //read the file here
  //add contents to string builders
}

catch (FileNotFoundException e) {
  e.printStackTrace();
}
