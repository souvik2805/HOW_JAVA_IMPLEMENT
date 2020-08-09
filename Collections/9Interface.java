# 9 Key interface of Java Collection Framework:
   - Collections
   - List
   - Set
   - SortedSet
   - Navigable set
   - Queue
   - Map
   - SortedMap
   - NavigableMap
  See [The Source Code of java/util/Collection.java](https://hg.openjdk.java.net/jdk8/jdk8/jdk/file/687fd7c7986d/src/share/classes/java/util/Collection.java)
From Line no 126 to 142

  There is no concrate class which implement collection interface directly 

#### 1.Collections(I)
  If you want to  represent a group of inevitable Object as a Single Entity the We should go for Collctions.
  Collections Interface defines the most common method which are applicable for any collection Object in General Collections Interface is Considered as Root Interface of Collection Framework.

  
| Collection | Collections |
| ------ | ------ |
|Collection is an Interface . If we want to represent a Group of invitable Objects as a Single Entity. Then we should go for Collection. | Collections is an Utility class Present as java.util. package to define seveeral ultity method for Collecttion Object Like Sorting, Searching etc.  |



#### 2. List(I):-
  - It is the child interface of collection.
  - If you want to represent a grouop of Invitable Objects as a single Entity where **duplicate is allowed and the insertation order must be preserved**. Then wee should go for List(I).
  ![OptionalText](https://github.com/souvik2805/HOW_JAVA_IMPLEMENT/blob/master/assets/Capture.PNG?raw=true)
 - From java 1.0 V Vector and Stack present in java. But From 1.2V java introduce List , ArrayList, LinkedList etc.
 - Form 1.2V Vector and Stack updated to Implement List(I)
 

####  3. Set(I):-
  - It is child interface of Collection(I). 
  - If we want to represent a group of invetible Objects as a Single Entity where **duplicate are not allowed and Inseration order not required** then we should go for Set(I);
 

##### SortedSet(I):-
   - It is the chile interface of Set(I) if we represent a groupo of invetible Objects as Single entity wherer **duplicate are allowed and all Objects should be Intserted according to Some Sorting Order** then should go for SortedSet(I);
  -  ![OptionalText](https://github.com/souvik2805/HOW_JAVA_IMPLEMENT/blob/master/assets/set.PNG?raw=true)
  
| Arrays | |
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



