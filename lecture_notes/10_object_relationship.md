# Relationship between Objects
    - Author: Anthoniraj Amalanathan
    - Date: 05-Sep-2022
- In Object Oriented Programming, Objects are related with each other in the following manner,
    - `IS-A` Relationship
    - `HAS-A` Relationship
- Examples
    - `Yamaha` is a `Bike`
    - `Bike` has an `Engine`

## Inheritance 
- Getting Property from Parent
    - `Parent -> Parent Class / Base Class / Super Class`
    - `Children -> Child Class  / Derived Class / Sub Class`
- Types
    - Single Inheritance (A->B | `Person->Student`)
    - Multilevel Inheritance (A->B->C | `Person->Employee->Programmer`)
    - Hierarchical Inheritance (A->B,A->C| `Person->Student, Person->Employee`) 
- Keyword Used in Java: `extends`
- When to use: If the objects are coming under `IS-A` relationship
- Syntax 
```java
class A {}
class B extends A {}
```

## Visibility Modifier
- `default`: visible within package (Note: default is not a keyword)
- `private`: visible within class
- `protected`: visible within inheritance hierarchy
- `public`: visible to ALL