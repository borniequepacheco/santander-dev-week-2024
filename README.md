# Santander Dev Week 2024
Java RESTful API criada para a Santander Dev Week.

## Diagrama de Classes
```mermaid
classDiagram
    class Collaborator {
        +int id
        +string name
        +int age
    }

    class License {
        +int id
        +int reason
        +string description
        +string dateStart
        +string dateEnd
    }

    Collaborator "1" -- "0..*" License : has

```


