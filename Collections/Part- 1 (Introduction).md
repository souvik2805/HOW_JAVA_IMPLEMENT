# Introduction


An array is an indexed collection of Fiexed number of homegenous data elements.
The Main advantage array is we can represent multiple values by using single variable so that the readability is imporved.
#### Limitation of array
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
