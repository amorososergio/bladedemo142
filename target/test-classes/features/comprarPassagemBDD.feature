#language: pt
Funcionalidade: Comprar Passagem
    Escolher e comprar passagens aereas

    Cenario: Comprar com Sucesso
        Dado que acesso o site "https://blazedemo.com/"
        Quando seleciono a origem "São Paulo" e destino "Cairo"
        E clico no botao "Find Flights"
        Entao visualizo a lista de voos