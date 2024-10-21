#Sistema de Votação para Eleições CIPA PUC

Descrição
Este é um sistema de votação desenvolvido para as eleições da CIPA na PUC. Ele permite o cadastro de candidatos e eleitores, a realização de votações e a apuração dos votos.

Funcionalidades
Cadastro de Eleitores
Cadastro de Candidatos com Upload de Foto
Processo de Votação
Apuração dos Votos com Visualização e Impressão

Tecnologias Utilizadas
Java
Swing para Interface Gráfica
SQLite para Banco de Dados

Como Executar o Projeto
Pré-requisitos
Java JDK
SQLite JDBC (caso não esteja usando Maven)

Passos para Executar
Clone o repositório:

Copiar
git clone https://github.com/L7Nascimento/app_Cipa_eleicao_PUC.git
Navegue até o diretório do projeto:

Copiar
cd app_Cipa_eleicao_PUC
Compile o projeto:

Copiar
javac -cp .:sqlite-jdbc-3.34.0.jar *.java
Execute a aplicação:

Copiar
java -cp .:sqlite-jdbc-3.34.0.jar MainApp

Estrutura do Projeto
MainApp.java: Ponto de entrada da aplicação.

EleicaoController.java: Controle da lógica de votação e acesso ao banco de dados.

CadastroEleitorFrame.java: Interface para cadastro de eleitores.

CadastroCandidatoFrame.java: Interface para cadastro de candidatos.

ModoVotacao.java: Interface para realização da votação.

ModoApuracao.java: Interface para apuração dos votos.

DatabaseConnector.java: Gerenciamento da conexão com o banco de dados.

Contribuição
Sinta-se à vontade para contribuir com o projeto. Para isso:

Faça um fork do repositório.

Crie uma branch para sua feature (git checkout -b feature/nova-feature).

Commit suas mudanças (git commit -am 'Adicionando nova feature').

Faça push para a branch (git push origin feature/nova-feature).

Crie um novo Pull Request.

Licença
Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.


