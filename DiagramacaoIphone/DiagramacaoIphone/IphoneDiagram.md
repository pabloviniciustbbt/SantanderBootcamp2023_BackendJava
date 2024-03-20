```mermaid

classDiagram
  class Telefone {
    <<INTERFACE>>
    +adicionarContato(nome: String, numero: int) void
    +exibirContato() void
    +realizarChamada(nome: String) void
    +atenderChamada(numero: int) void
    +desligarChamada() void
  }
  
  class Contato {
    -nome: String
    -numero: int
  }

  class Reprodutor {
    <<INTERFACE>>
    +adicionarMusica(nome: String, artista: String) void
    +selecionarMusica(nome: String) void
    +tocarMusica(nome: String) void
    +pausarMusica(nome: String) void
    +pularMusica() void
    +antecederMusica() void
  }

  class Musica {
    -nome: String
    -artista: String
  }

  class Navegador {
    <<INTERFACE>>
    +abriSite(url: String) void
    +adicionarNovaAba(url: String) void
    +atualizarPagina(url: String) void
    +fecharPagina(url: String) void
  }

  class Iphone {
    -List~Contato~
    -List~Musica~
  }

    Navegador <|.. Iphone : implements

    Reprodutor <|.. Iphone : implements

    Telefone <|.. Iphone : implements

    Iphone *-- Contato 

    Iphone *-- Musica 
