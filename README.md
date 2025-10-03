# Gasosa - Álcool ou Gasolina?

Gasosa é um aplicativo simples feito em Kotlin com Jetpack Compose para me aproximar ainda mais dos recursos do Jetpack.  
Ao informar o preço da gasolina e do álcool, ele exibe qual vale mais a pena usando a regra do **0,7**.
> Inspirações [Meu Bolso em Dia](https://meubolsoemdia.com.br/calculadora-alcool-gasolina) e **Professor** [Alex Felipe](https://www.youtube.com/@AlexFelipeDev)

* [Tecnologias](#tecnologias-utilizadas)
* [Tomadas de Decisão](#tomadas-de-decisão)
* [Demonstração](#demonstração)
* [Observações](#observações)
* [Créditos](#créditos)

## Tecnologias Utilizadas

* [Kotlin](https://kotlinlang.org/) — Melhor linguagem 💜
* [Jetpack Compose](https://developer.android.com/jetpack/compose) — Criação rápida e simples da interface.
* [Material 3](https://m3.material.io/) — Visual moderno e consistente.
* [Splash Screen](https://developer.android.com/develop/ui/views/launch/splash-screen) — Tela de abertura com logo e fundo.
* [AnimatedVisibility](https://developer.android.com/develop/ui/compose/animation/composables-modifiers) — Mostra o resultado de forma suave.

## Tomadas de Decisão

### rememberSaveable 
Preferi utilizar o **rememberSaveable**, pois vejo faz mais sentido para este tipo de aplicativo.  
Assim, sempre que os preços forem atualizados, os valores digitados são preservados mesmo que a tela seja recriada.

### Material 3
Optei por **Material3** para garantir um visual moderno, limpo e consistente. Mantive a customização mínima, apenas o suficiente
para que o app tivesse uma aparência "profissional" e agradável.

### Arquitetura MVVM simples
Mantive uma arquitetura básica: a UI é componível e a lógica está separada em funções e componentes distintos.  
Isso facilita a manutenção, entendimento do código e possíveis mudanças futuras.

### Animações com AnimatedVisibility
Usei **AnimatedVisibility** para mostrar o resultado do cálculo (Álcool ou Gasolina) de forma suave.  
O texto aparece apenas quando os dois valores são preenchidos, tornando a experiência mais intuitiva e agradável.

### Splash Screen
Coloquei uma **Splash Screen** com o logo e um fundo bacana para dar um toque mais legal e profissional  
na abertura do app.

## Demonstração
Abaixo disponibilizei um **vídeo** curto da execução do aplicativo (lembrando que é um MVP, até o momento).
> https://github.com/user-attachments/assets/1780baf2-2d58-4dbb-9574-eab4a94f88d0

## Observações
Esse app é simples é um projeto pessoal para meu portfólio, não pretendo liberar para colaboração.
Com ele, aprimorei meu conhecimento em **animações com AnimatedVisibility** e ganhei mais familiaridade com a **Splash Screen**,
recurso que já havia utilizado no meu [jogo interativo de RPG](https://github.com/GBLZIN/HeroForge).

Logo menos, pretendo adicionar novas features para melhorar a **usabilidade** e a **UI**, mas, por enquanto, o projeto cumpriu
muito bem o objetivo de me aproximar ainda mais dos recursos do **Jetpack Compose**.

## Créditos
Feito por mim, Gabriel Rodrigues, entusiasta em Desenvolvimento Mobile (Android).
- [LinkedIn](https://www.linkedin.com/in/gahrodrigues/)


