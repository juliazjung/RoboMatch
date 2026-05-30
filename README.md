# 🤖 RoboMatch

Sistema de controle de competições de robótica com placar em tempo real.

![Java](https://img.shields.io/badge/Java-20-blue) ![Maven](https://img.shields.io/badge/Maven-3.2.0-orange) ![Status](https://img.shields.io/badge/status-acadêmico-green)

## Sobre o projeto

O RoboMatch foi desenvolvido como projeto acadêmico para a competição de robótica da URI (Universidade Regional Integrada do Alto Uruguai e das Missões). O sistema centraliza o controle das disputas, permitindo o gerenciamento de equipes, competições e provas, além de exibir um placar de pontuação atualizado em tempo real.

## Funcionalidades

- Cadastro de equipes participantes
- Cadastro e gerenciamento de competições e provas
- Placar em tempo real com atualização de pontuações por equipe
- Interface desktop nativa

## Tecnologias

- `Java 20`
- `Maven 3.2.0`
- Documentação gerada via `JavaDoc`

## Como executar

Pré-requisitos: Java 20+ e Maven instalados.

```bash
# Clone o repositório
git clone https://github.com/juliazjung/RoboMatch.git
cd RoboMatch

# Compile e execute
mvn compile
mvn exec:java -Dexec.mainClass="com.uri.robomatch.RoboMatch"
```

## Estrutura do projeto

```
RoboMatch/
├── src/
│   └── main/
│       └── java/
│           └── com/uri/robomatch/
│               └── RoboMatch.java
├── pom.xml
└── README.md
```

## Autora

**Julia Jung** — [github.com/juliazjung](https://github.com/juliazjung)
