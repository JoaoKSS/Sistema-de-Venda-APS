# Sistema de Venda

> Aplicação de linha de comando em Java para gerenciamento de vendas com armazenamento em memória.

## 📖 Descrição
O **Sistema de Venda** simula o fluxo de um sistema de vendas simples:
- Cadastro de **Caixas** (vendedores).  
- Cadastro de **Produtos**.  
- Registro de **Vendas** (data, status, itens).  
Utiliza padrões Singleton e Repository em memória, ideal para aprendizado.

## 🎬 Demonstração
```text
=== Iniciando Nova Venda ===
ID Caixa: 1
Nome do Caixa: João
Nome do Produto: Caneta
Preco do produto: 2.50
Quantidade: 3
Deseja adicionar outro produto? (S/N): S
Nome do Produto: Caderno
Preco do produto: 10.0
Quantidade: 1
Deseja adicionar outro produto? (S/N): N
Total da Venda: 17.50
Data da Venda: 05/10/2023
Status da Venda: CONCLUIDA
```

## 🚀 Funcionalidades
- CRUD em memória para **Caixa**, **Produto**, **Venda** e **ItemVenda**.  
- Cálculo automático do valor total da venda.  
- Status de venda (`ABERTA` → `CONCLUIDA`).

## ⚙️ Pré-requisitos
- Java JDK 17+  
- Maven 3.6+ (opcional)

## 🛠️ Instalação e Execução
```bash
git clone https://github.com/JoaoKSS/Sistema-de-Venda-APS.git
cd Sistema_de_Venda
mvn clean package
java -jar target/Sistema_de_Venda-1.0-SNAPSHOT.jar
```
Ou direto:
```bash
mvn compile exec:java -Dexec.mainClass="br.edu.br.ifnmg.sistema_de_venda.Sistema_de_Venda"
```

## 🎲 Como Usar
1. Informe o **ID do Caixa**.  
2. Para cada item:
   - Informe **nome do produto**.   
   - Informe **preço**. 
   - Informe **quantidade**.  
   - Escolha adicionar outro produto (S/N).  
3. Ao final, são exibidos:
   - **Total da Venda**  
   - **Data**  
   - **Status** (`CONCLUIDA`)

## 🗂️ Estrutura do Projeto
```
src/
 ├ main/
 |   ├ java/br/edu/br/ifnmg/sistema_de_venda/
 |   |   ├ Sistema_de_Venda.java      
 |   |   ├ VendaController.java       
 |   |   ├ Venda.java                 
 |   |   ├ Produto.java               
 |   |   ├ ItemVenda.java            
 |   |   ├ Caixa.java                 
 |   |   └ repository/                
 ├ Documentos
 ├ pom.xml                                                        
 └ Readme
```