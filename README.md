# Pesquisa sobre SOLID
O presente repositório tem o intuito de demonstrar na prática os pilares do SOLID.

---

## 🔎 O que é SOLID?

O SOLID se refere a princípios de design de software, que tem como objetivo melhorar a qualidade, manutenção e escalabilidade do software. Os principios do SOLID são 5 e estão relacionados a cada letra do nome 'S-O-L-I-D'.

---

## 5️⃣ Pilares/Princípios do SOLID

O significado de cada letra representa um pilar/princípio, assim tem-se:

1. S: Single Responsibility (Responsábilidade Única): Refere-se que uma classe deve ter apenas uma responsabilidade. Assim, cada classe deve ser responsável por fazer apenas uma função.
2. O: Open/Closed (Aberto/Fechado): Cada classe deve estar aberta para extensão, ou seja, aumentar suas implementações, porém devem estar fechadas para modificações. Assim, de acordo com esse princípio é necessário que uma classe possa estender o comportamento dela porém sem sofrer alterações.
3. L: Liskov Substitution (Substituição de Liskov): Se uma classe T é um subtipo de uma classe S, então os objetos do tipo S podem ser substituídos por objetos do tipo T. Assim, esse princípio informa que é possível instanciar objetos da classe filha tendo como base a classe pai.
4. I: Interface Segregation (Segregação de Interfaces): Interfaces devem ser segregadas a ponto de que uma classe não implemente um método que não vá utilizar. Assim, é melhor criar interfaces que façam métodos específicos para as classes que implementá-las utilizem todos os métodos.
5. D: Dependency Inversion (Inversão de Dependência): Os módulos de alto nível não devem depender dos de baixo nível. Assim, esse princípio promove a redução do acoplamento do código.

---

## 💻 Classes implementadas

### Implementação do SingleResponsability

Para acessar a pasta da implementação: [clique aqui](https://github.com/joaocruzzup/ExemplosSolid/tree/main/src/singleResponsibility)

A implementação se baseou a criação de duas classes com responsabilidades únicas e definidas: 
1. Classe [Funcionario](https://github.com/joaocruzzup/ExemplosSolid/blob/main/src/singleResponsibility/Funcionario.java)
<br>Responsabilidade: Modelar o funcionário, contendo os atributos, construtor e Get&Sets da classe <br>


2. Classe [FuncionarioValidacao](https://github.com/joaocruzzup/ExemplosSolid/blob/main/src/singleResponsibility/FuncionarioValidacao.java)
<br>Responsabilidade: Responsável por validar atributos de funcionário e validar o próprio funcionário completo.

### Implementação do Open/Closed
Para acessar a pasta da implementação: [clique aqui](https://github.com/joaocruzzup/ExemplosSolid/tree/main/src/openClosed)

A implementação se baseou a criação de algumas classes, onde algumas herdavam de classes concretas e também foi criado interface para demonstrar mais a fundo o pilar.
1. Classe [Funcionario](https://github.com/joaocruzzup/ExemplosSolid/blob/main/src/openClosed/Funcionario.java)
<br> Classe Modelo que será herdado por outras classes 
2. Classes Desenvolvedor, ProductManager, Estagiario e Recruiter
<br> Classes que estendem funcionário sem alterar modificações nessas classes, assim utilizam o princípio aberto/fechado
3. Interface HorasExtras
<br> Essa interface friza sobre o aberto/fechado uma vez que as classes implementarão ela, ou seja, estará aumentando a funcionalidade.

### Implementação do liskovSubstitution
Para acessar a pasta da implementação: [clique aqui](https://github.com/joaocruzzup/ExemplosSolid/tree/main/src/liskovSubstitution)

A implementação se baseus na criação de uma classe abstrata com métodos abstratos, onde as classes filhas serão "obrigadas" a implementar esses métodos. Além disso, há uma main para testar esse principio.

1. Classe Animal
<br> classe abstrata com um método abstrato
2. Classes Gato, Cachorro e Vaca
<br> classes que herdam a classe Animal

Assim, no método main é possível perceber que ao instanciar as subclasses (cachorro, gato e vaca) elas são chamadas por meio da superClasse Animal, garantindo assim o princípio de liskov e que a herança foi implementada efetivamente.

Visualização do que foi dito:

**Animal** cachorro = new Cachorro();
**Animal** gato = new Gato();
**Animal** vaca = new Vaca();


### Implementação do InterfaceSegregation
Para acessar a pasta da implementação: [clique aqui](https://github.com/joaocruzzup/ExemplosSolid/tree/main/src/interfaceSegregation)

Nesse projeto foram criados várias interfaces com objetivos específicos para garantir que a segregação de interface foi feita com sucesso.

1. Classe Conta
<br> classe criada para servir de modelo para demais tipos de conta
2. Classes ContaCorrente, ContaPoupanca, ContaSalario
<br> classes criadas para implementar as interfaces pretendidas
3. Interfaces Depositavel, Sacavel, Rentavel, Transferivel
<br> interfaces com métodos específicos, assim quando forem implementadas, as classes terão que implementar os métodos chamados.

OBS.: Vemos que nesse exemplo apesar de ser atingido o InterfaceSegregation, não foi possível atingir o liskovSubstitution já que as contas não conseguem ser instanciadas a partir da superclasse Conta.

### Implementação do DependencyInversion
Para acessar a pasta da implementação: [clique aqui](https://github.com/joaocruzzup/ExemplosSolid/tree/main/src/dependencyInversion)

Nesse projeto foi criado uma interface Operacoes a fim de que a classe Banco não precise instanciar diretamente as ContaCorrente e ContaPoupanca, e sim acessar métodos dessa conta por meio da abstração de Operacoes.

OBS.: Ainda estou desenvolvendo meu conhecimento nesse princípio, assim estarei complementando melhor essa explicação.

---

## 👨‍💻 Autor

Nome: João Cruz<br>Linkedin: https://www.linkedin.com/in/joaosilvacruz/

---

<h4 align=center>Made with 💚 by <a href="https://github.com/joaocruzzup">João Cruz</a></h4>
