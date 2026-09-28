# Monster Tamer

Gioco di ruolo in Java (esame di Metodologie di Programmazione, Unicam, A.A. 2025/26):
il giocatore esplora un mondo a zone, cattura e allena creature e le affronta in battaglie a turni.

Il progetto è in sviluppo. La documentazione completa (funzionalità, responsabilità, classi,
persistenza, estendibilità) è nella **Wiki** del repository.

## Requisiti

- JDK 21 o superiore

## Compilare ed eseguire

```
./gradlew build
./gradlew run
```

(su Windows: `gradlew.bat build` e `gradlew.bat run`)

## Struttura (package `it.unicam.cs.mpgc.rpg130131`)

| Package | Responsabilità |
|---|---|
| `model.monsters` | Specie, creature, statistiche, tipi elementali |
| `model.moves` | Mosse |
| `model.battle` | Regole di battaglia (tabella dei tipi, calcolo del danno) |
| `model.trainer` | Allenatori e squadre |
| `controller` | Punto d'ingresso per le viste, indipendente dal toolkit grafico |
| `persistence` | Interfacce dei repository e implementazioni (XML validato con XSD) |
| `view` | Client desktop JavaFX |

## Uso di strumenti di AI

Per la realizzazione di questo progetto è stato usato l'assistente AI Claude (Anthropic) per
brainstorming sul tema, confronto tra architetture e generazione dello scheletro iniziale del
progetto. La dichiarazione dettagliata è nella Wiki e in `docs/ai-usage.md`.
