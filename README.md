## 📱 Projeto iPhone - Modelagem e Diagramação UML

Este projeto representa a modelagem e diagramação das classes e interfaces de um componente **iPhone**, conforme proposto no desafio da DIO.

---

### 📚 Funcionalidades

O componente iPhone foi modelado com 3 responsabilidades principais, cada uma representada por uma **interface** Java:

#### 🎵 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

#### 📞 Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

#### 🌐 Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

---

### 🧩 Diagrama UML

```mermaid
classDiagram

class ReprodutorMusical {
  +tocar()
  +pausar()
  +selecionarMusica(String musica)
}

class AparelhoTelefonico {
  +ligar(String numero)
  +atender()
  +iniciarCorreioVoz()
}

class NavegadorInternet {
  +exibirPagina(String url)
  +adicionarNovaAba()
  +atualizarPagina()
}

class Iphone {
  +tocar()
  +pausar()
  +selecionarMusica(String musica)
  +ligar(String numero)
  +atender()
  +iniciarCorreioVoz()
  +exibirPagina(String url)
  +adicionarNovaAba()
  +atualizarPagina()
}

Iphone ..|> ReprodutorMusical
Iphone ..|> AparelhoTelefonico
Iphone ..|> NavegadorInternet
