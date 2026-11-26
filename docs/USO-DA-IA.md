# Uso de IA no trabalho

Ferramenta: Claude (Anthropic).

## Prompt 1 — pedido inicial

> vamos criar um novo projeto no VS code, ele deve respeitar isto aqui [regras
> do trabalho: arguição sobre o código, uso obrigatório de IA pedindo
> passo-a-passo, documentação dos prompts e ajustes via commits]
> este e o programa que tenho que implementar: Processador de Textos [enunciado
> completo com as classes TudoMaiuscula e TudoMinuscula] Aplique o padrão
> Template Method para unificar e simplificar os códigos acima...

### Passo-a-passo proposto pela IA

1. Registrar o código original do enunciado (ponto de partida para o diff).
2. Criar a classe abstrata `ProcessadorDeTexto` com o método-template `final`.
3. Fazer `TudoMaiuscula` e `TudoMinuscula` estenderem a base e remover a duplicação.
4. Implementar na base os passos comuns: extrair e juntar caracteres.
5. Implementar nas subclasses apenas o passo que varia: converter um caractere.
6. Manter os métodos estáticos originais como fachada (compatibilidade).
7. Criar a classe `Main` para demonstrar o funcionamento.
8. Criar testes simples, sem dependências externas.

Cada passo acima corresponde a um commit no histórico.

## Meus ajustes sobre o que a IA fez

> Registrar aqui (e nos commits seguintes) cada ajuste feito por mim:
> o que a IA fez que não serviu totalmente e por que o meu ajuste melhora.
