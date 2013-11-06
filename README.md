some
====

A really simple library for generating some random values implemented in plain Java with no dependencies

Usage
-----
    import static io.shaka.some.SomeValues.*;
    ...
    //some random string of length 10
    String someString = some(string);

    //some string of length 100
    String someStringOfLength = some(string.ofLength(100));

    //some integer
    int someInteger = some(integer);

    //some integer greater than 0
    int someNaturalNumber = some(naturalNumber);

    //some integer between 3 (inclusive) and 100 (exclusive)
    int someIntegerBetween = some(integer.from(3).to(100));

Maven Repo
----------
http://timt.github.io/repo/releases/

Code license
------------
Apache License 2.0