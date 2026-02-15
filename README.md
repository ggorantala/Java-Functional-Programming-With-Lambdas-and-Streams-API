# Java Functional Programming with Lambdas and Streams API

Code examples and exercises for the course **[Functional Programming With Streams API](https://www.javahandbook.com/java-streams-api/)** on [Java Handbook](https://www.javahandbook.com).

---

## Table of Contents

- [About](#about)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Chapters](#chapters)
  - [1. Functional Programming](#1-functional-programming)
  - [2. Functional Interfaces](#2-functional-interfaces)
  - [3. Lambda Expressions](#3-lambda-expressions)
  - [4. Method References](#4-method-references)
  - [5. Streams API](#5-streams-api)
- [Models and Services](#models-and-services)
- [How to Run](#how-to-run)
- [Course Link](#course-link)

---

## About

Functional programming was introduced in Java SE 8 and has become essential for writing concise, readable, and high-performance code. This repository contains all code examples, exercises, and solutions from the [Functional Programming With Streams API](https://www.javahandbook.com/java-streams-api/) course, organized chapter by chapter.

By working through this material you will learn to:

- Distinguish between imperative and declarative programming styles
- Understand pure vs. impure functions
- Use built-in functional interfaces (`Predicate`, `Function`, `Consumer`, `Supplier`, `BiFunction`, etc.)
- Write lambda expressions and understand variable scoping rules
- Apply the four kinds of method references
- Create, transform, filter, and reduce data with the Streams API
- Choose between sequential and parallel stream processing

---

## Prerequisites

| Requirement | Details |
|---|---|
| **Java version** | JDK 17 or higher (JDK 8+ for most examples) |
| **IDE** | IntelliJ IDEA, Eclipse, or VS Code with Java extensions |
| **Knowledge** | Core Java basics, familiarity with Collections API is helpful |

---

## Project Structure

```
dev/ggorantala/
├── Constants.java                          # Shared constants used across examples
├── PlaceHolder.java                        # Entry-point placeholder
├── model/
│   ├── Book.java                           # Book record with sample data
│   └── Person.java                         # Person record with sample data
├── service/
│   └── BookService.java                    # Functional interface for book creation
└── chapters/
    ├── functionalprogramming/              # Ch 1 — Functional Programming
    │   ├── imperative/
    │   ├── declarative/
    │   ├── interfaces/
    │   └── functions/
    │       ├── pure/
    │       └── impure/
    ├── functionalinterfaces/               # Ch 2 — Functional Interfaces
    │   ├── types/
    │   │   ├── consumer/
    │   │   ├── supplier/
    │   │   ├── function/
    │   │   ├── predicate/
    │   │   └── bifunction/
    │   ├── example/
    │   ├── exercises/
    │   └── log/
    ├── lambdas/                            # Ch 3 — Lambda Expressions
    │   └── scope/
    ├── methodreferences/                   # Ch 4 — Method References
    │   ├── kinds/
    │   │   └── arbitaryobject/
    │   └── exercise/
    ├── streams/                            # Ch 5 — Streams API
    │   ├── introduction/
    │   ├── create/
    │   └── types/
    └── otherstreams/                       # IntStream, LongStream, etc.
```

---

## Chapters

### 1. Functional Programming

Covers the foundations: what functional programming is, how it differs from imperative programming, and how Java supports it.

#### Imperative vs. Declarative

Side-by-side comparison of the two paradigms using identical problems.

| File | What It Demonstrates |
|---|---|
| `imperative/ListObjects.java` | Filters books by cost using a for-each loop |
| `declarative/ListObjects.java` | Filters books by cost using `Stream.filter()` |
| `imperative/RemoveDuplicates.java` | Removes duplicates with a loop and a mutable list |
| `declarative/RemoveDuplicates.java` | Removes duplicates using `Stream.distinct()` |

#### Interface Types

Shows the three categories of interfaces in Java and how functional interfaces (SAM interfaces) enable lambdas.

| File | What It Demonstrates |
|---|---|
| `interfaces/MarkerInterfaceService.java` | Marker interface — no methods |
| `interfaces/NormalInterfaceService.java` | Normal interface — multiple abstract methods |
| `interfaces/SAMInterfaceService.java` | SAM / Functional interface — single abstract method (`@FunctionalInterface`) |

#### Pure vs. Impure Functions

Explains referential transparency and side effects through concrete examples.

| File | What It Demonstrates |
|---|---|
| `functions/pure/AddNumbers.java` | Pure function — integer addition |
| `functions/pure/MathFunctions.java` | Pure function — `Math.pow()` |
| `functions/pure/StringOperations.java` | Pure function — string concatenation |
| `functions/pure/IntegerStream.java` | Pure function — stream doubling each element |
| `functions/pure/FunctionalInterfaceExample.java` | Pure function — even-number check via `Predicate` |
| `functions/impure/DateTimeFunctions.java` | Impure — depends on system clock |
| `functions/impure/RandomNumberGenerator.java` | Impure — non-deterministic output |
| `functions/impure/FileIOFunctions.java` | Impure — file system side effect |
| `functions/impure/NetworkIOFunctions.java` | Impure — network I/O side effect |

---

### 2. Functional Interfaces

Deep dive into `java.util.function` built-in interfaces and how to create custom ones.

#### Built-in Functional Interface Types

| File | Interface | Key Method | What It Demonstrates |
|---|---|---|---|
| `types/consumer/AcceptExample.java` | `Consumer<T>` | `accept()` | Consumes a value and prints the result of a multiplication |
| `types/consumer/AndThenExample.java` | `Consumer<T>` | `andThen()` | Chains two consumers sequentially |
| `types/supplier/SupplierExample.java` | `Supplier<T>` | `get()` | Supplies a greeting string |
| `types/supplier/StringOperations.java` | `Supplier<T>` | `get()` | Supplies boolean, integer, and string results |
| `types/supplier/RandomNumberGenerator.java` | `Supplier<T>` | `get()` | Supplies a random integer |
| `types/function/FunctionExample.java` | `Function<T, R>` | `apply()` | Transforms a string to its length |
| `types/predicate/PredicateExample.java` | `Predicate<T>` | `test()` | Filters even numbers from a list |
| `types/bifunction/BiFunctionExample.java` | `BiFunction<T, U, R>` | `apply()` | Concatenates two strings |
| `types/bifunction/AddIntegers.java` | `BiFunction<T, U, R>` | `apply()` | Adds two integers via `Integer::sum` |
| `UnaryOperatorExample.java` | `UnaryOperator<T>` | `apply()` | Doubles an integer value |
| `BinaryOperatorExample.java` | `BinaryOperator<T>` | `apply()` | Sums two integers |

#### Custom Functional Interfaces

| File | What It Demonstrates |
|---|---|
| `example/PowerOfTwo.java` | Custom `@FunctionalInterface` with `isPowerOfTwo()` |
| `example/PowerOfTwoExecutor.java` | Lambda implementing `PowerOfTwo` using bitwise AND |
| `log/Logger.java` | Custom logger functional interface |
| `log/LoggerImpl.java` | Concrete implementation of the logger |
| `log/LoggerMain.java` | Wiring the logger via dependency injection |

#### Exercises

| Exercise | Files | Description |
|---|---|---|
| Problem 1 | `exercises/problemone/ConsumerImpl.java`, `Solution.java` | Implement a `Consumer<String>` that converts fruit names to uppercase |
| Problem 2 | `exercises/problemtwo/PowerOfTwoFI.java`, `Solution.java` | Implement a custom functional interface to check power of two |

---

### 3. Lambda Expressions

Syntax, usage, and scoping rules for lambda expressions.

| File | What It Demonstrates |
|---|---|
| `lambdas/PrintElements.java` | Iterating a list with `forEach()` and a method reference |
| `lambdas/RunnableExample.java` | Lambda implementing `Runnable` |
| `lambdas/scope/Logger.java` | Functional interface used in scope examples |
| `lambdas/scope/ScopeOfVariables.java` | Lambda accessing instance, static, and local variables via `this` |
| `lambdas/scope/VariablesScope.java` | Lambda capturing local, instance, and static variables (effectively final rule) |

---

### 4. Method References

The four kinds of method references as shorthand for lambdas.

| Kind | File | Example |
|---|---|---|
| **Reference to a static method** | `kinds/RefToStaticMethod.java` | `RefToStaticMethod::compareByCost` |
| **Reference to an instance method of a particular object** | `kinds/RefToInstance.java` | `referenceToInstance::compareByTitle` |
| **Reference to an instance method of an arbitrary object** | `kinds/arbitaryobject/SortIntegers.java` | `Integer::compareTo` |
| **Reference to an instance method of an arbitrary object** | `kinds/arbitaryobject/ListObjects.java` | `Person::name` |
| **Reference to a constructor** | `kinds/RefToConstructor.java` | `Person::new` |

Additional examples:

| File | What It Demonstrates |
|---|---|
| `methodreferences/StringOperations.java` | `String::toUpperCase` and `System.out::println` in a stream pipeline |
| `methodreferences/exercise/Application.java` | Sorting books by title using `Comparator.comparing(Book::title)` |

---

### 5. Streams API

Creating, transforming, filtering, and collecting data with streams.

#### Introduction

| File | What It Demonstrates |
|---|---|
| `streams/introduction/StreamExample.java` | Creating a stream from a collection and iterating |
| `streams/introduction/ArrayStream.java` | Creating an `IntStream` from an array with `Arrays.stream()` |
| `streams/introduction/StreamFilter.java` | Filtering elements with `filter()` |
| `streams/introduction/StreamMapExample.java` | Transforming elements with `map()` (string to length) |

#### Creating Streams

| File | Creation Method |
|---|---|
| `streams/create/StreamCollectionExample.java` | `collection.stream()` |
| `streams/create/ArrayStreamExample.java` | `Arrays.stream(array)` |
| `streams/create/StreamOfExample.java` | `Stream.of(...)` |
| `streams/create/StreamIterateExample.java` | `Stream.iterate(seed, fn).limit(n)` |
| `streams/create/StreamGenerateExample.java` | `Stream.generate(supplier).limit(n)` |
| `streams/create/StreamFileExample.java` | `Files.lines(path)` |
| `streams/create/EmptyStreamExample.java` | `Stream.empty()` for null/empty-safe streaming |
| `streams/create/OtherStreams.java` | `IntStream.range()`, `LongStream.range()`, `Random.doubles()` |

#### Sequential vs. Parallel Streams

| File | What It Demonstrates |
|---|---|
| `streams/types/SequentialStreamExample.java` | Sequential processing with `stream()` |
| `streams/types/ParallelStreamExample.java` | Parallel processing with `parallelStream()` |

#### Specialized Streams

| File | What It Demonstrates |
|---|---|
| `otherstreams/IntStreamExample.java` | `IntStream.range()`, `IntStream.rangeClosed()`, and `IntStream.max()` |

---

## Models and Services

Shared data classes and interfaces used across chapters.

| File | Type | Description |
|---|---|---|
| `model/Book.java` | `record` | Book with title, author, year, copies sold, rating, and cost. Includes a static `BOOKS` list with 5 sample entries. |
| `model/Person.java` | `record` | Person with a name. Includes a static `PEOPLE` list with 3 sample entries. |
| `service/BookService.java` | `@FunctionalInterface` | Factory-style interface for creating `Book` instances. |
| `Constants.java` | `class` | Shared constants — integer lists, string lists, delimiters, and multipliers used throughout examples. |

---

## How to Run

1. **Clone the repository**

```bash
git clone https://github.com/ggorantala/Java-Functional-Programming-WIth-Lambdas-and-Streams-API.git
cd Java-Functional-Programming-WIth-Lambdas-and-Streams-API
```

2. **Open in your IDE**

   - Open the project in IntelliJ IDEA (or your preferred IDE).
   - Mark the `dev` directory as the **Sources Root** (right-click > Mark Directory as > Sources Root in IntelliJ).

3. **Run any example**

   Each file with a `main` method is a standalone example. Right-click any file and select **Run** to execute it.

> **Note:** This project uses Java records (`Book`, `Person`), which require **JDK 16+**. The `toList()` terminal stream operation used in several examples also requires **JDK 16+**.

---

## Course Link

**[Functional Programming With Streams API — Java Handbook](https://www.javahandbook.com/java-streams-api/)**

Happy coding!
