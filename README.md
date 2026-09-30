# Geo Explorer DIO - Padrão Strategy

## Sobre o Projeto
Este projeto é uma evolução do desafio final Geo Explorer da DIO, desenvolvido para demonstrar o **Padrão de Projeto Strategy** utilizando Java puro e princípios de Orientação a Objetos.

## Desafio DIO
Este repositório serve como uma solução prática para o desafio final de Padrões de Projeto na trilha Java da DIO.

## Objetivo
Explorar conceitos de design implementando uma arquitetura limpa, escalável e de fácil manutenção sem depender de frameworks externos como o Spring.

## Padrão de Projeto Utilizado
**Strategy Pattern (Padrão Estratégia)**

## Por que Strategy?
Em uma plataforma educacional, gerar desafios de estudo com base no nível do usuário (Iniciante, Intermediário, Avançado) geralmente leva a instruções massivas de `switch` ou `if/else`. O padrão Strategy resolve isso encapsulando o algoritmo de geração de desafios de cada nível em classes separadas, substituindo as condicionais por polimorfismo.

## Problema Sendo Resolvido
Evita a violação do Princípio Aberto/Fechado (Open/Closed Principle). Adicionar um novo nível de especialização agora requer apenas a criação de uma nova classe de estratégia, deixando o Contexto principal inalterado.

## Arquitetura
- **Java Puro:** Sem dependências externas.
- **Baixo Acoplamento e Alta Coesão:** Pacotes separados para entidades de domínio, estratégias e o contexto da aplicação.

## Estrutura do Projeto
```text
src/main/java/br/com/oliverdev17/geoexplorer/
├── domain/ (Technology, Challenge)
├── strategy/ (ChallengeGenerationStrategy & Estratégias Concretas)
├── context/ (ChallengeGeneratorContext)
└── application/ (Main)
```

## Fluxo da Aplicação
1. O cliente instancia o Contexto.
2. O cliente define a estratégia desejada em tempo de execução.
3. O contexto delega a geração do desafio para a estratégia injetada.
4. Diferentes desafios são gerados com base na estratégia ativa.

## Exemplo de Execução
A classe `Main` demonstra o padrão alterando dinamicamente a estratégia e gerando desafios iniciantes, intermediários e avançados para a mesma tecnologia.

## Tecnologias
- Java (Biblioteca Padrão)

## Como Executar

**Pré-requisito:** JDK 8+ instalado ([OpenJDK](https://adoptium.net/)).

```bash
# Compilar
javac -d bin src/main/java/br/com/oliverdev17/geoexplorer/domain/*.java \
             src/main/java/br/com/oliverdev17/geoexplorer/strategy/*.java \
             src/main/java/br/com/oliverdev17/geoexplorer/context/*.java \
             src/main/java/br/com/oliverdev17/geoexplorer/application/*.java

# Executar a demonstração principal
java -cp bin br.com.oliverdev17.geoexplorer.application.Main

# Executar os testes (flag -ea habilita assertions)
javac -cp bin -d bin src/test/java/br/com/oliverdev17/geoexplorer/strategy/StrategyTestRunner.java
java -ea -cp bin br.com.oliverdev17.geoexplorer.strategy.StrategyTestRunner
```

## Conceitos Demonstrados
- Padrão Strategy
- Programação Orientada a Objetos (POO)
- Princípio Aberto/Fechado (SOLID)
- Injeção de Dependência (via setter)

## Melhorias Futuras
- Integrar um padrão Factory para automatizar a instanciação de estratégias.
- Adicionar estratégias para geração de certificados e trilhas de aprendizado.
- Adicionar persistência local em arquivo para o histórico do usuário.

## Referências
- Repositório oficial DIO: [lab-padroes-projeto-java](https://github.com/digitalinnovationone/lab-padroes-projeto-java)
- Projeto base: [projeto_final_dio_formacao_bob](https://github.com/oliverdev17/projeto_final_dio_formacao_bob)
