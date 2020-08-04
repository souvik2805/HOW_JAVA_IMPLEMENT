# Introduction


An array is an indexed collection of Fiexed number of homegenous data elements.
The Main advantage array is we can represent multiple values by using single variable so that the readability is imporved.
#### * Limitation of array
  - Arrays are fixed in Size. i.e. once we create an array there is no chance of increasing or decreasing the based on our reuirement. Due to this, To use array we should know the size advanced which may not possible always.
  - Arraays can hold only homogenous data element.
  ```sh
   Example: 
   Student[] s = new Student[10000];
   s[0] = new Student();
   s[1] = new Customer();
   CE: incompatible types Found : Customer required: Student
  ```
  - But we can solve this problem by Using Object type arrays
   ```sh
   Object [] a = new Object[10000];
   a[0] = new Student();
   a[1] = new Customer();
  ```
  - Arrays concept is not implement based on some standered data structure and hence readymade method  support is not available. For every requirement we have to write the code explecily which increases complexity of programming.
  
To Overcome above problemes of arrays we should go for collections concept.

### *Collection Concept:-

  - Collections are growable in nature i.e based on our requirement we can increase or decrease size.
  - Collection can hold both homegenous and heterogenous objects.
  - Every Collection class  is implemented  based on some statandered data structure hence for every requirement ready made support is avabile.
  -  Being a programmer we are resonsible to use this method and we  are not responsible to implement those methods.



| Arrays | Collections |
| ------ | ------ |
| Arrays are in fixed in size. | Collections are growable in nature |
| With respect to memeory arrays are not recomaded to use | Collection are recommmaded |
|  With respect to memeory arrays are  recomaded to use | Collection are not recommmaded use |
| Arrays can hold only homogenous element | It holds homogeneous and hetrogenous elements |
| There is no underlying data strucure of arrays and readymade mthod support is not avaiable. For Everymethod we have to write the code explictly which increases time complexity of programming| Every collecttion class is implement based on the statndered data strucruee and hence for requirement readymade suppor is avabile Beign a programmer  we can use these method directly  and we are not responsible to implement those methods  |
| Arrays can hold both premtive and Objects | It holds only Objects Type but not premetive |





*** If we want to represent a group of object in a single entity then we should go for Collections..

### Collections Framwork

It Contains several classes and interfaces which can be used to represent a grounp to .
| Java | C++ |
| ------ | ------ |
|Collectios. | Container |
|Collections Framework | STL(Standered Template Libery) |



