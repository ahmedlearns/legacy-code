# Legacy Code: Rewrite, or Rejuvenate

Based on https://www.youtube.com/watch?v=koGpF1solzM and https://www.youtube.com/watch?v=-lB74Zg3QSw

## Legacy Code
- Who loves legacy code!?
- Necessary evil

## What is it?

Many definitions, lots of stackoverflow posts debating this.

One definition I like:
> Code is legacy code as soon as it's written

Generally, any code that has been delivered. But there's also:
- code without tests
- code someone else wrote


## Fixing Issues as you go == Duck Tape solution

## Big Rewrite Risks

## Kintsugi

https://en.wikipedia.org/wiki/Kintsugi

## Quote
> "Legacy code" often differs from its suggested alternative by actually working and scaling.
- Bjarne Stroustrup, designer & implementor of C++

 ## Rejuvination is not Refactoring

 ### Rejuvination 
 > Automated migration of legacy code

 Leverages enhanced language and library features by finding and replacing coding patterns that can be expressed through higher-level software abstractions.

 Why raise abstraction?

 Raising the abstraction *generally* benefits maintainability, security, and performance.

 Behavior *does not necessarily* change.

 ### Refactoring
 > Improving structurally inadequate source code

 Behavior *does not change* 

 ## Example
 Monolith Enterprise Java app -> microservice architecture (or another modular setup)

## Rewrite or Rejuvenate?

`TODO: add image of question mark`

- Is the application modular?
- How big is the risk?
- How often does it have to change?
- Do we understand the problem better?
- Are we better developers?
- How long will it take?

Essentially: if possible, rejuvinate, otherwise, rewrite (language / architecture change)

## Antipattern
> An anti-pattern is a common response to a recurring problem that is usually ineffective and risks being highly counterproductive.

https://en.wikipedia.org/wiki/Anti-pattern

### Stovepipes
A Lack of coordination across systems, leading to almost identical code in different systems

Definitely not DRY

### Lavaflow
` // This class probably does something important, but I don't understand it. Don't delete.`

`class SomethingImportant extends Important {...}`

The future of all "MVP" apps that go into production - a collection of code fragments that that no one can remember much about, though it's hardened into the application.

### Shotgun Surgery
Modifications that require many small changes

> Let's change our logger class 

### God Class
One class to rule them all!

A class that does too much

## Catch-22

`TODO: remove this section?`

> How am I supposed to refactor code to write unit tests if you must have unit tests in place before refactoring?

* Implement (temporary) solution until you have something to unit test.

## Method of Rejuvenation

1. Write external/end-to-end tests
2. Split into modules
3. Clean a module
4. Write its unit tests
5. Rinse and repeat

## Step 0: Simplify the On-Boarding

Easier said then done, but a complex on-boarding is likely an indication of an overly complex system.

The sooner a new person can commit code to the system, the faster you can iterate.

## Write End-to-End Tests

Let's make sure we have the behavior we need.

## Split into Modules

Split vertically, not horizontally. I.e. something that goes from input to output (an entire use case), as opposed to splitting into UI/Backend/Database, etc.

## Clean and Refactor

No more spaghetti code!

## Neat and Tidy Unit Tests

`TODO: image here`

## Repeat with another module

(If you have to)

## Examples

### Remove Singletons

1. Separate stateful and stateless singletons
2. Stateless ones don't need to be singletons
3. Inject Stateless dependencies in the constructor
4. Wrap static calls in stateless dependencies
5. Use an App Context `interface` to share stateful singletons

## Demo

https://github.com/uberto/alchemical

## Method

`0. Add a couple of EndToEnd tests` - not in this demo
1) Remove direct use of singletons from `common`
2) Introduce an interface to clearly separate `risk` from `common`
3) Clean up class design inside `risk`/`report`
4) Remove duplication of intents
5) Add proper unit tests

## Essentially:

`TODO: image of spaghetti on plate down to component parts?`

see https://youtu.be/koGpF1solzM?t=1602

1. Spaghetti
2. links of parts of spaghetti to represent tests
3. separate into hermetic modules
4. clean one module
5. show all clean modules

## Why

Hopefully this changes the way you view legacy code. Since any code we write ourselves will be deemed 
"legacy", whether it's now or later, let's have a little more compassion for the previous developers
and rejuvenate our systems to satisfy ourselves and the business.


## Questions?

## Resources

This talk has been adapted from Uberto Barbini, native of Venice, Italy
* https://www.youtube.com/watch?v=-lB74Zg3QSw
* https://www.youtube.com/watch?v=koGpF1solzM
* https://github.com/uberto/alchemical
* This talk: 