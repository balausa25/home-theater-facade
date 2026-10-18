# 🎬 Cinema Orchestrator Facade

Implementation of the **Facade** design pattern over a complex
home-theater subsystem (7 collaborating classes).

## Course
ShP-2216 — Software Design Patterns  
Astana IT University

## Purpose
A complex home-theater system (7 subsystem classes) is reduced to
two simple facade methods: `watchMovie()` / `endMovie()`.
A second facade (`PartyModeFacade`) exposes an unrelated subset
of functionality without polluting the main facade.

## How to run
```bash
javac -d out $(find src -name "*.java")
java -cp out client.Main
