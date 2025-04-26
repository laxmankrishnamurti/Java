# **Data Types, Variables(Identifier) & Input**

Variable is like a container used to store values in the memory location. On the other hand data type means we are actually trying to inform the computer which type of data we are going to store in that memory location so that computer knows the type of data and distribute memory cell according to their data size. 

Every memory cell has a particular address known as "Memory Address". 

|   Data Type   | Size   | Default Value | Type of Value Stored  | 
|---------------|--------|---------------| --------------------  |
|      byte     | 1 byte | 0             |       Integral        |
  |     short   | 2 byte    | 0             |       Integral        |
| int | 4 byte | 0             |    Integral    |
|   long    | 8 byte    | 0 L           | Integral |
    | char  | 2 byte    | `\u0000`  | Character | 
    | float |   4 byte  | 0.0f  | Decimal   | 
    | double    | 8 byte    | 0.0d  | Decimal   | 
|   boolean | 1 bit | false | True or False | 

## **Data Types**

1. **_Primitive Data Types_**

    - Boolean
    - Numeric
      - Character
        - Char
      - Integral
        - Integer
          - byte
          - short
          - int
          - long
        - Floating Point
          - float
          - double

2. **_Non Primitive Data Types_**

These are derived by Primitive Data Types

- Strings
- Arrays
- Objects
- etc

## **Naming Convension**

1. **camelCase**
2. **snake_case**
3. **Kebab-case**

## **Identifier Rules**

1. The only allowed characters for identifiers are all alphanumeric characters, `$(doller sign)`, and `_(underscore)`.
2. Can't use keywords or reserved words. 
3. Identifiers should not start with digits. 
4. Java Identifiers are case-sensitive. 

Whenever we assign a direct or fixed value to a variable, the value known as _literals_.


## **Keywords**

Keywords are those fixed words used by programming language itself.

Ex:- default, super, switch, void, class, implements, throws, try, const, byte, interface, goto, long, short, package, continue, public, static, boolean, extends, private, etc.

## **Escape Sequences**

|   Escape Sequences    |   Description |
|   ----------------    |   ----------- |
|  \t   | Insert a tab in the text at this point.   | 
|   \b  | Insert a backspace in the text at this point. | 
| \n    | Insert a newline in the text at this point.   | 
| \'    | Insert a single quote character in the text at this point.    | 
|   \"  | Insert a double quote character in the text at this point.    | 
|   \\  | Insert a backslash character in the text at this point.       | 


## **User Input**

```java
import java.lang.*;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){
        Scanner userdata = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String userName = userdata.nextLine();
        System.out.println("Hello " + userName);
        System.out.print(userName + ", please also tell me your age : ");
        byte userAge = userdata.nextByte();
        if (userAge > 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are a teenager so you can't vote");
        }
    }
}
```

## **Type Conversion and Casting**

It simply means the data is converting from one type to another. Type conversion totally depends on the size of the data because we can't store a big value into a small data type container. So, based on the size of the data the conversion has two types. There are follows :- 

1. **Implicit Conversion**

It can easily done by computer because in this conversion the small data type is being converted into larger data type which can be easily done. This type of conversion called _Implicit Conversion(Widening)._

```java
double myAge = 23;
```

2. **Explicit Conversion(Casting)**

But if we try to fit a big data type into small data type computer says: Hey! This could not done by me easily. If you are 100% sure that the data can fit into the small data type they give me explicit order to do that after that I'll not be responsible if something went wrong, Like: Data loss. This type of conversion called _Explicit Conversion(Narrowing)._

```java
//Explicit Conversion (Casting)
int collection = (int) 232938.9394f;
```
