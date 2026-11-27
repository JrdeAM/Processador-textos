# Processador de Textos — Template Method

Trabalho: unificar `TudoMaiuscula` e `TudoMinuscula` aplicando o padrão
**Template Method**, implementar os métodos deixados em branco e demonstrar
o funcionamento.

O histórico de commits conta a evolução da solução, um commit por passo.
O uso de IA está documentado em [`docs/USO-DA-IA.md`](docs/USO-DA-IA.md).

## Estrutura

```
ProcessadorDeTexto (abstrata)
 ├─ processar(String)          final  -> método-template
 ├─ extrairCaracteres(String)  private (passo comum)
 ├─ converterCaracteres(char[]) private (passo comum: laço)
 ├─ converterCaractere(char)   abstract -> único ponto de variação
 └─ juntarCaracteres(char[])   private (passo comum)
      ▲                    ▲
 TudoMaiuscula        TudoMinuscula
 toUpperCase(c)       toLowerCase(c)
```

## Como rodar

No VS Code (com o *Extension Pack for Java*): abra a pasta e clique em
**Run** acima do `main` de `Main.java` ou de `TesteProcessadores.java`.

Pelo terminal:

```bash
javac -d bin src/processador/*.java
java -cp bin processador.Main
java -cp bin processador.TesteProcessadores
```
