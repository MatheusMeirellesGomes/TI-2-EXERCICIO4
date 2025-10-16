# Exercício 4 – Computação em Nuvem  
**Disciplina:** Tecnologias para Internet II (TI 2)  
**Aluno:** Matheus Meirelles Gomes  
**Instituição:** PUC Minas Lourdes

---

## Descrição

Este repositório contém todos os artefatos e evidências dos três produtos solicitados no Exercício 4 da disciplina TI 2, abordando o uso de serviços em nuvem (Azure), banco de dados PostgreSQL e consumo de serviços cognitivos com Java.

---

## Estrutura dos Produtos

### Produto 1 – Criação de Conta e Acesso ao Azure

- **Evidências:**  
  Prints mostrando o processo de criação da conta e acesso ao portal Azure.
- **Localização:**  
  Pasta: `produto1-conta azure/`  
  Arquivos:  
    - Captura de tela do portal Azure (`Captura de tela ...png`)

---

### Produto 2 – Banco de Dados PostgreSQL no Azure

- **Evidências:**  
  Prints mostrando o recurso PostgreSQL criado no Azure, e a execução de comandos SQL via VS Code.
- **Localização:**  
  Pasta: `produto 2 - conexão e teste do bd/`  
  Arquivos:  
    - Prints do recurso e da execução de comandos SQL

---

### Produto 3 – Consumo de Serviço Cognitivo do Azure com Java

- **Evidências:**  
  Código Java que consome o serviço de análise de sentimento (Text Analytics) da Azure AI, prints do recurso criado e do resultado obtido.
- **Localização:**  
  Pasta: `produto 3 - java/`  
  Arquivos:  
    - `TextAnalyticsExample.java`: Código-fonte Java para análise de sentimento.
    - `produto 3 - resultadoJava.png`: Print do terminal mostrando a execução e resultado da API.
    - Print do recurso AI criado no portal Azure.

---

## Instruções para Executar o Produto 3 (Java)

1. **Crie um recurso Azure AI Services conforme orientações.**
2. **No código `TextAnalyticsExample.java`, insira sua chave da API Azure:**
    ```java
    String apiKey = "SUA_CHAVE_AQUI";
    ```
3. **Compile e execute:**
    ```sh
    javac TextAnalyticsExample.java
    java TextAnalyticsExample
    ```
4. O resultado será impresso no terminal, mostrando o sentimento do texto enviado.

---

## Observações

- **Por questões de segurança**, a chave de API não está presente no código-fonte público.  
  Insira sua própria chave ao testar o Produto 3!
- Todas as evidências estão organizadas por produto, conforme solicitado no roteiro do exercício.
- Para dúvidas sobre execução ou sobre o repositório, entre em contato.

---

**Aluno:**  
Matheus Meirelles Gomes  
PUC Minas Lourdes – TI 2