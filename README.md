Uma instituição de ensino possui diferentes profissionais envolvidos em suas atividades acadêmicas e administrativas. Entre esses profissionais estão "professores", "coordenadores" e "bibliotecários."

Atualmente, a instituição precisa controlar mensalmente as informações relacionadas à remuneração desses profissionais. Cada tipo de funcionário possui uma forma específica de cálculo de sua remuneração, e determinados valores podem ser "acrescentados" ou "descontados" ao longo de cada mês. Todo esse controle é organizado por **competência**, ou seja, o mês e o ano de referência ao qual os lançamentos e a folha de pagamento pertencem.

A instituição deseja organizar esse processo por meio de um sistema de folha de pagamento que permita centralizar as informações, realizar os cálculos necessários e disponibilizar os resultados de forma organizada.

O sistema será utilizado pelos responsáveis pelo processamento da folha de pagamento da instituição.

----------

### Professor

A remuneração de um professor é determinada pela quantidade de aulas e pelo valor definido para cada aula.

### Coordenador

A remuneração de um coordenador considera:

* um valor-base;
* um percentual;
* a quantidade de alunos sob sua responsabilidade.

### Bibliotecário

A remuneração de um bibliotecário é determinada por um valor-base estabelecido pela instituição.

### Competência

Toda folha de pagamento, todo holerite e todo aditivo/desconto pertencem a uma **competência**, identificada pelo mês e pelo ano de referência (ex.: 09/2026). É a competência que define a qual mês um lançamento (aditivo ou desconto) se refere, e é para uma competência específica que uma folha de pagamento é gerada.

### Regras de validação

* Todo profissional cadastrado deve ter, no mínimo, **18 anos de idade**.

----------
CLASSES: COORDENADOR, PROFESSOR, BIBLIOTECARIO, FOLHAPAGAMENTO, HOLERITE, ADITIVO, DESCONTO, COMPETENCIA;

----------

## Descrição do fluxo de funcionamento do sistema

Antes de dar início a geração da folha de pagamento, o sistema deve permitir que o usuário cadastre os profissionais da instituição, incluindo suas informações pessoais e dados específicos relacionados à remuneração, respeitando a idade mínima de 18 anos exigida para o cadastro.

A seguir, o usuário poderá cadastrar os aditivos e descontos que serão aplicados aos profissionais durante o mês, informando a competência (mês/ano) à qual cada lançamento se refere. Esses valores podem ser positivos (acréscimos) ou negativos (descontos) e devem ser associados a cada profissional.

Uma vez concluído o cadastro dos profissionais, aditivos e descontos, o sistema deve dar início ao processo de gerar a folha de pagamento para uma competência específica e, durante a criação, deve-se criar o holerite de cada funcionário, considerando apenas os aditivos e descontos lançados para aquela competência, com seus descontos e aditivos, valores bruto e líquido.

## Arquitetura do sistema

O sistema será construído como uma **API REST**, desenvolvida em Java com Spring Boot, responsável por processar as informações, realizar os cálculos necessários e gerar os holerites. O consumo da API (cadastro de profissionais, aditivos, descontos e geração da folha de pagamento) fica a cargo de um cliente externo, que se comunica com o back-end por meio dos endpoints HTTP expostos. O banco de dados armazenará todas as informações relacionadas aos profissionais, aditivos, descontos e folhas de pagamento.

A API deverá fazer as validações necessárias para garantir a integridade dos dados e a consistência das informações, sendo organizada em camadas: uma camada de controllers responsável por expor os endpoints REST, uma camada de entidades identificando o domínio do sistema, uma camada de repositories responsável pelo acesso ao banco de dados (Spring Data JPA) e uma camada de services para realizar as operações de negócio.
Além disso, o sistema deve ser projetado de forma modular, permitindo futuras expansões e melhorias.

## Estrutura de pacotes

O código-fonte do back-end está organizado nos seguintes pacotes, dentro de `src/main/java/br/edu/imepac/folhapagamento`:

```
br.edu.imepac.folhapagamento
├── config          # Configurações gerais da aplicação Spring Boot
├── controlles      # Controladores REST (endpoints da API)
├── dtos            # Objetos de transferência de dados (DTOs)
├── entities        # Entidades JPA mapeadas para o banco de dados
├── repositories    # Interfaces de acesso a dados (Spring Data JPA)
├── services        # Regras de negócio e cálculos da folha de pagamento
└── utils           # Classes utilitárias e helpers
```

Cada pacote possui um `README.md` próprio descrevendo seu objetivo com mais detalhes.
