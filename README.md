# Simulação de Algoritmos de Eleição em Sistemas Distribuídos – Bully e Anel

Este projeto implementa e simula dois algoritmos clássicos de eleição em sistemas distribuídos: **Bully** e **Anel**, utilizando a linguagem **Java**. A simulação utiliza threads para representar processos que detectam falhas e elegem um novo coordenador automaticamente.

## Estrutura do Projeto

📁 src
├── App.java 
├── processo/ # Define a classe Processo (cada processo é uma thread)
├── bully/ # Implementação do Algoritmo de Bully
├── anel/ # Implementação do Algoritmo de Anel
├── cenarios/ # Simulações: falha do coordenador e múltiplas falhas
├── log/ # Logger que salva os eventos em um arquivo .txt
└── utils/ # Obtém um método para retornar o coordenador ativo

---

## Algoritmos Implementados

- `Bully` e `Anel`

---

## Cenários Simulados

- **Cenário A**: Falha do coordenador atual e retorno após eleição (utiliza Bully).
- **Cenário B**: Múltiplas falhas de processos ativos (utiliza Anel).

---

## Relatório Técnico

O projeto acompanha um arquivo `Relatorio_Tecnico.pdf` com:

- Comparação conceitual entre os algoritmos
- Eficiência nos cenários simulados
- Vantagens e desvantagens
- Situações ideais de uso

---

## Log de Execução

Todos os eventos importantes (falhas, mensagens, eleições, coordenadores) são salvos no arquivo:

---

## Como Executar

1. Compile o projeto com o Java (JDK 11+).
2. Execute a classe `App.java`.
3. Observe os resultados no console e no arquivo de log.