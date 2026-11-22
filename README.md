# Working with Legacy Code

Talk material on working with, refactoring and rejuvenating legacy code.

- `index.html`: the slide deck, built with [remarkjs](https://github.com/gnab/remark). Open it in a browser to present. `legacy-code-ahmed-ismail.pdf` is a PDF export.
- `notes/2018-rewrite-or-rejuvenate.md`: notes from an earlier (2018) talk, "Legacy Code: Rewrite, or Rejuvenate".
- `examples/`: Java refactoring examples ("alchemical refactoring"), each with `before`, `after` and sometimes `step1` packages:
  - `exerciseRisk`: a legacy risk-report app to practice on (see `ExerciseRules.txt`)
  - `hermeticSeal`: hiding singletons and connection handling behind an injected context
  - `solveEtCoagula`: refactoring a small group of classes
  - `alkahestLambda`: replacing calculator subclasses with lambdas

The 2018 talk and the examples are adapted from Uberto Barbini's [alchemical](https://github.com/uberto/alchemical). They were previously kept at gitlab.com/ahmedismail/legacy-code.
