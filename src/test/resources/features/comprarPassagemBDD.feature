#language: pt
Funcionalidade: Comprar Passagem
    Escolher e comprar passagens aereas

    Cenario: Comprar com Sucesso
        Dado que acesso o site "https://blazedemo.com/"
        Quando seleciono a origem "São Paolo" e destino "Cairo"
        E clico no botao "Find Flights"
        Entao visualizo a lista de voos

    Esquema do Cenario: Comprar com Sucesso DDT
        Dado que acesso o site "https://blazedemo.com/"
        Quando seleciono a <origem> e <destino>
        E clico no botao "Find Flights"
        Entao visualizo a lista de voos
    Exemplos:
        | origem      | destino     |
        | "São Paolo" | "Cairo"     |
        | "Paris"     | "London"    |

    Esquema do Cenario: Login Positivo
        Dado que acesso a pagina de Login
        Quando preenncho o <email> e a <senha> corretos
        E clico no botao Login
        Entao exibe a mensagem de login com sucesso
        Exemplos:
        | email                     | senha     |
        | "cliente@iterasys.com.br" | "123456"  | 

    Esquema do Cenario: Login Negativo
        Dado que acesso a pagina de Login
        Quando preenncho o email e a senha incorretos
        E clico no botao Login
        Entao exibe a menasgem de email ou senha incorretos
         Exemplos:
        | email                     | senha   |
        | "cliente@iterasys.com.br" | 123     |
        | "cliente@bol.com.br"      | 123456  |
        | "cliente@iterasys.com.br" | 123     |

    Esquema do Cenario: Login Negativo
        Dado que acesso a pagina de Login
        Quando preenncho o <email> e a <senha> incorretos
        E clico no botao Login
        Entao exibe a <mensagem>
        Exemplos:
        | email                     | senha     |  tipo  |    Mensagem           |
        | "cliente@iterasys.com.br" | 123456    |    P   |  Login com sucesso    |
        | "cliente@iterasys.com.br" | 123       |    N   |  login não efetuado   |
        | "teste  @iterasys.com.br" | 123456    |    N   |  login não efetuado   |



