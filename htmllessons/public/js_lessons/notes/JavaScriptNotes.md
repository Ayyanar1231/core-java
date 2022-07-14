Java Script :
first the scripts are loaded and executed before the body is loaded.It does not matter where the location of the script is.

https://javascript.info/script-async-defer
https://flaviocopes.com/javascript-async-defer/

DOMContentLoaded and async scripts dont wit for each oterh
DOMContentLoaded may happen both
before an sync script (if an async script finishes loading after the page is complete) or
after an async script ( if an async script is short or was in HTTP cache.

In other words async scripts load in the background and run when ready.
The DOM and other script dont wait for async script.
and async script dont wait for anything.

**Scoping: **
**var** : _function scoped (only available inside parent functions)
**let** and **const**: _block scoped_ (available inside a block denoted by _{}_ )
**Opinion (what to use):**
- Use const by default;
- if the value of the variable needs to change then use `let`.
**AVOID `var` as far as possible**
- 'let' was introduced from ES6 - since 2016
- js has been around since 1995
**Variable naming conventions:**
Should not start with capital unless they are a class.
Must start with **a-z** or ** ** or **$**.
If a variable is multi-word, you can use:
Camel-case: `let iLovePizza = true;`
Upper Camel case (in case of classes): ILovePizza`
Snake case: `let i_love_pizza = true;`
(underscore) is used by the helper lib called 'lodash (https://lodash.com/)
**Lodash**: A modern JavaScript utility library delivering modularity, performance & extras.

# Disallow Early Use (no-use-before-define)
In JavaScript, prior to ES6, variable and function declarations are hoisted to the top of a scope, so it's possible to use identifiers before their formal declarations in code.
This can be confusing and some believe it is best to always declare variables and functions before using them.
ES6, block-level bindings (let and const) introduce a "temporal dead zone" where a `ReferenceError` will be thrown with any attempt to access the variable before its declaration.

Types in Java Script
BONNUSS
1. Boolean
2. Object
3. Number - All numbers like integers, decimals, and floats are all one type.
4. Null
5. Undefined -
6. String
7. Symbol - (new into js) used for assigning unique id. Always gives a guaranteed unique identifier
Everything in the above list are Primitive type except Object.
An Object is a special type.
Every thing other than primitive types in js are Objects.
At the end of the day, Functions, arrays, dates are all just objects.

String
1. used for holding text
2. 3 ways to create strings:
1. using single quotes:
const first = 'Soumya';
2. using double quotes:
const middle = "Ranjan";
o single quotes and double quotes are the same thing.
3. using backticks:
const last = Mohanty`;
used for: "she's cool"
or escaping: 'she\\'s cool'

Multi-line string:
`javascript
const song = 'Oh \\ I like \\
pizza';
console.log(song); // Oh I Like pizza
javascript
const song "Oh
I like
pizza;
console.log(song);
Oh
I Like
pizza
console.log(song);
oh
I Like
pizza
2nd one using backticks is mostly used.
**String concatenation and interpolation**
'+' is used for **concatenation**. It is also used for adding 2 nos.
**Concatenation**: when 2 or more strings combined to one
**Interpolation**: when you put a variable inside a string
Example 1:
`const name = 'Soumya';`
`const hello = 'Hello my name is + name
+ '. Nice to meet you."`
_(can use double or single quotes)__
Example 2:
1+1 // 2`
'1'+'1' // 11
`1 + '1' // 11`
Example 3:
"javascript
const name = 'Soumya';
const hello = "Hello my name is ${name}. Nice to meet you. I am ${100+1} years old.`; console.log(hello); // Hello my name is Soumya. Nice to meet you. I am 101 years old.
Backticks also used for _tagged template Literals_.
Backticks are helpful for creating HTML: ```javascript
const html =
<div>
<h2>Hey everyone! I am ${name}.</h2>
</div>

## Number
Only **one** type of number in JavaScript whether it has decimal point or not.
***javascript
const age = 100;
const money = 1000.50
console.log(typeof age); // number
console.log(typeof money); // number
`typeof is used to find out the 'type' of a variable.
Various operations: `addition, subtraction, multiplication, division` can be done with numbers.
Example
I
*"10" * "10" // 100 (number) - converts the strings to number But "10"+"10" // 1010
The above works with multiplication, division and subtraction and not addition, because the + sign is also used for **concatenation**.
**Math helper methods:**
**Math.round, Math.floor, Math.ceil, Math.random** and many others
javascript
Math.round(2.5); // 3
Math.floor(6.6); // 6
Math.ceil(8.4); // 9
Math.random(); // 8.565262543848269 random no. between 0 and 1

**Modulo and Power operators:**
`javascript
const sweets = 20;
const kids = 3;
const eachKidGets Math.floor(sweets/kids); // 6 =
console.log(eachKidGets);
const leftsweets = sweets % kids; // 2 modulo operation
console.log(leftsweets);
let x = 2 ** 3; // 8 - power operation using power operator (**)
console.log(x);
// or
x = Math.pow(2,3); // 8 - power operation using Math.pow
console.log(x);
Example
0.10.2 // 0.30000000000000004

Why? [Explanation] (http://8.3000eeeeeeeeeeee4.com/
So, when working with money, don't store them as (Rupees.paise) or (dollars.cents)
Store all of the money in (paise/cents) as you won't have to deal with fractions only whole nos. When need to display to user, just convert them back.
// let costOfProduct = 100.95;
let costOfProduct = 10095; // in paise / cents
**Infinity and Negative Infinity:**
`typeof Infinity; // number
typeof -Infinity; // number
**Not a Number (NaN): **
when need to display to user, just convert them back.
// let costOfProduct = 100.95;
let costOfProduct = 10095; // in paise / cents
**Infinity and Negative Infinity:**
`typeof Infinity; // number`
`typeof -Infinity; // number`
**Not a Number (NaN):**
10 / 'hello' // NaN
`typeof NaN // number


## Booleans and Equality
A **boolean** variable can be either `true` or `false`
Example:
"javascript
const age = 18;
const of Age = age > 18;
console.log(of Age); // false
**Equal signs:**
`-` sign: used for assignment/ updation of values
javascript
let name = 'Soumya';
name = 'Raja';

Out of `==` and `===`, you should **almost always** use
and `===` are used for equality comparison.
javascript console.log(age === 18); // true
VS
checks both **type & value.**
only checks **value. **
javascript
10 === "10" // false as values are same but types are not 10 == "10" // true as values are same
10 == "10" // true as values are same.











