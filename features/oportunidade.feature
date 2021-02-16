# language: pt
Funcionalidade: Validar a funcionalidade Oportunidade de Negócio
        no ambiente de thailhead

  Cenario: Incluir uma Oportunidade de Negócio

    Dado seleciono o menu "Oportunidades"
    E seleciono "Novo"
    Quando preencho os dados obrigatorios
    Então a oportunidade é cadastrada