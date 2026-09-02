# Sistema de Controle de Notas - Manutenção e Configuração de Software

Projeto desenvolvido para a disciplina de **Manutenção e Configuração de Software**.

---

## 📌 Respostas às Questões Finais

### 1. Qual era o principal problema do código original?
O código usava variáveis confusas (`n`, `a`, `b`, `c`) e colocava todas as tarefas juntas no método `main`, tornando o programa difícil de entender e manter.

### 2. Quais melhorias você realizou?
Substituí as variáveis por nomes claros (`nomeAluno`, `primeiraNota`, `segundaNota`), criei a constante `NOTA_MINIMA_APROVACAO`, dividi o código em métodos (`calcularMedia`, `verificarSituacao`, `exibirResultados`) e adicionei comentários simples de uma linha.

### 3. Como a modularização facilitou a organização do código?
Ela dividiu o programa em partes menores, onde cada método é responsável por apenas uma tarefa. Isso deixou o código mais organizado e fácil de alterar sem quebrar o restante do sistema.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu guardar a versão original, criar a branch `melhoria-boas-praticas` para fazer os testes com segurança e depois juntar as melhorias na branch `main` através do merge.
