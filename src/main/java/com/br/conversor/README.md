# Conversor de Moedas em Java 

Projeto desenvolvido como desafio de programação, utilizando Java para realizar conversões de moedas em tempo real através do consumo de uma API externa.

## Funcionalidades
- Menu interativo via console.
- 6 opções de conversão entre moedas (USD, BRL, ARS, COP).
- Taxas de câmbio dinâmicas utilizando a **ExchangeRate-API**.
- Tratamento de dados com a biblioteca **Gson**.

## Tecnologias Utilizadas
- **Java 17+**
- **HttpClient**: Para requisições assíncronas e síncronas.
- **Gson (Google)**: Para serialização e desserialização de JSON.
- **ExchangeRate-API**: Fonte de dados para as taxas de conversão.

## Como Executar
1. Clone este repositório.
2. Obtenha uma chave gratuita em [exchangerate-api.com](https://www.exchangerate-api.com/).
3. No arquivo `ConversorService.java`, substitua `SUA_CHAVE_AQUI` pela sua chave da API.
4. Adicione a biblioteca Gson ao seu classpath ou projeto Maven.
5. Compile e execute a classe `Principal.java`.

## Exemplo de Uso
Ao iniciar, o sistema solicitará uma opção do menu. Após escolher, insira o valor e o sistema retornará o montante convertido com base na cotação atual.