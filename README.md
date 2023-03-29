# AutomacaoSkill

Este projeto é um exemplo de automação de testes utilizando Java, Selenium WebDriver e TestNG para testar a funcionalidade de login em um site.

## Pré-requisitos

Antes de executar os testes automatizados, certifique-se de ter instalado em seu computador:

- [Java](https://www.java.com/pt-BR/download/)
- [Maven](https://maven.apache.org/download.cgi)
- [ChromeDriver](https://chromedriver.chromium.org/downloads) (para testes no navegador Google Chrome)

## Executando os testes

Para executar os testes, siga os seguintes passos:

1. Clone este repositório em seu computador:

    git clone https://github.com/MiltonDenysDesafios/AutomacaoSkill.git


2. Navegue até o diretório raiz do projeto:

    cd AutomacaoSkill


3. Execute os testes com o Maven:
   
   mvn clean test


Isso executará os testes em um navegador Chrome e exibirá o resultado dos testes no console.

## Estrutura do projeto

- `src/main/java/com/skill/automation/pages`: contém as classes Page Objects que representam as páginas do site.
- `src/test/java/com/skill/automation/tests`: contém as classes de teste que realizam a automação de testes.

## Autor

- [Milton Denys](https://github.com/MiltonDenysDesafios)






