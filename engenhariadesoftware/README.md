1 - Primeiro trecho do livro Software Engineering at Google, Oreilly

  
  O primeiro trecho do livro apresenta uma reflexão importante sobre a diferença entre programação, ciência da computação e engenharia de software.
Enquanto a programação está mais relacionada à escrita de códigos e a ciência da computação foca nos fundamentos mais teóricos e matemáticos, a
engenharia de software envolve a aplicação estruturada desses conhecimentos para construir sistemas confiáveis no mundo real. Os autores comparam
a engenharia de software a outras engenharias tradicionais, como a civil e a aeronáutica, destacando que essas áreas seguem processos rigorosos
devido ao impacto direto de falhas. Já o desenvolvimento de software, historicamente não adotou o mesmo nível de rigor, apesar de seus erros
também poderem causar grandes prejuízos. Com o aumento da dependência da sociedade em sistemas digitais, o trecho defende que o desenvolvimento de
software precisa evoluir e adotar práticas mais sólidas e disciplinadas. Desta forma a engenharia de software deve ser vista como uma área
responsável por garantir qualidade, confiabilidade e segurança, e não apenas como a simples escrita de código.


2 - Segundo trecho do livro Software Engineering at Google, Oreilly


  O segundo trecho do livro amplia o conceito de engenharia de software ao afirmar que ela não se limita apenas à escrita de código, mas também
engloba os processos, ferramentas e práticas utilizadas para manter e evoluir o software ao longo do tempo. Os autores defendem que o valor de um
sistema está diretamente relacionado a sua capacidade de se adaptar as mudanças necessárias durante todo o seu ciclo de vida. Ao definir a engenharia
de software como "programação integrada ao longo do tempo", o texto reforça a importância de pensar no impacto das decisões técnicas não apenas no 
momento da implementação, mas também na manutenção, evolução e descontinuação do software. Dessa forma, práticas que priorizam a sustentabilidade do
código tornam-se essenciais para garantir sua longevidade. O trecho também apresenta três princípios fundamentais: tempo e mudança, escala e crescimento, 
trade-offs e custos. Esses princípios destacam que o desenvolvimento de software envolve decisões estratégicas nas quais é necessário equilibrar qualidade,
custo e capacidade de adaptação. Assim, a engenharia de software se consolida como uma disciplina que exige planejamento contínuo e escolhas conscientes
ao longo do tempo e não apenas a produção imediata do código.


3 - Listar e explicar 3 exemplos de tradeoffs

    1. Qualidade do código x Velocidade de desenvolvimento - Um dos trade-offs mais comuns em engenharia de software ocorre entre a qualidade do código e
    a velocidade do desenvolvimento. Optar por entregar uma funcionalidade rapidamente pode levar a escrita de código menos organizado ou com menor cobertura
    de testes. Por outro lado, investir mais tempo em boas práticas, como testes automatizados e refatoração, pode atrasar a entrega inicial mas resulta em um
    software mais confiável e de fácil manutenção a longo prazo.

    2. Flexibilidade x Simplicidade - Buscar alta flexibilidade no software, como permitir múltiplas configurações e extensões, pode tornar o sistema mais
    complexo e difícil de entender. Por outro lado, soluções mais simples tendem a ser mais fáceis de manter e compreender, porém podem limitar futuras adaptações.
    Esse trade-off exige equilíbrio, considerando o contexto do projeto e a probabilidade de mudanças futuras.

    3. Escalabilidade x Custo - Projetar um sistema altamente escalável desde o início pode gerar custos elevados, tanto em infraestrutura quanto em tempo de
    desenvolvimento. Por outro lado, optar por uma solução mais simples e econômica pode atender as necessidades iniciais, mas exigir grandes mudanças caso o sistema
    cresça rapidamente. Assim, as decisões devem considerar o estágio do projeto e crescimento esperado da aplicação.


4 - Software é intangível


  O trecho do livro reforça a ideia de que o software, diferente de outras áreas da engenharia é intangível, ou seja, não pode ser tocado ou visto fisicamente
como um prédio, uma ponte ou uma máquina. Mesmo assim, ele continua sendo algo real. Isso acontece porque o valor do software não está na sua forma física, mas
na função que ele exerce e no impacto que gera no mundo real. Enquanto engenheiros civis ou mecânicos aplicam conhecimento teórico para criar estruturas concretas,
o engenheiro de software aplica teoria, lógica e metódos para construir sistemas que resolvem problemas reais. Mesmo sendo intangível, o software controla processos,
armazena informações, automatiza tarefas e influencia diretamente o funcionamento de empresas, serviços e até a vida das pessoas. Portanto, o fato do software não
ser palpável não o torna menos importante ou menos "engenharia", pelo contrário, o fato dele ser intangível exige ainda mais cuidado no planejamento, na organização
e na manutenção, já que erros não são visíveis a olho nu, mas podem causar grandes impactos. Isso reforça a necessidade de tratar o desenvolvimento de software como
uma atividade de engenharia e não apenas como escrita de código.


5 - Engenharia de Software = Programação + tempo, escalabilidade e trade-offs


  O autor deixa claro que engenharia de software não se resume ao ato de escrever código, programar é apenas uma parte do processo. A engenharia de software envolve
todas as práticas, ferramentas e decisões que permitem que esse código continue sendo útil ao longo do tempo, mesmo com mudanças constantes no sistema, na equipe
e na própria organização. Quando o texto define engenharia de software como "programação integrada ao longo do tempo", ele reforça exatamente essa ideia: escrever
código hoje não é suficiente. É preciso pensar em como esse código vai se comportar no futuro, como será mantido, adaptado e eventualmente até descontinuado. Isso
conecta diretamente o conceito de tempo e mudança, já que todo software precisa evoluir para continuar relevante. Além disso o trecho aborda a questão da escala e
crescimento, mostrando que software não cresce sozinho. A medida que a organização evolui, o sistema precisa acompanhar esse crescimento, seja em número de usuários,
complexidade ou novas funcionalidades. Isso exige planejamento, arquitetura bem pensada e decisões que vão muito além da simples programação. Por fim, entram os
trade-offs e custos, que deixam evidente que não existem decisões perfeitas. Toda escolha em engenharia de software envolve ganhos e perdas, seja em desempenho,
manutenção, tempo de desenvolvimento ou custo. O engenheiro de software precisa equilibrar esses fatores com base nas mudanças ao longo do tempo e na escala do sistema.
Assim, o trecho reforça que engenharia de software é programação somada ao tempo, à escalabilidade e aos trade-offs, pois trata o software como algo vivo, que precisa
ser sustentável, adaptável e bem gerenciado durante todo o seu ciclo de vida e não apenas como um código que funciona no momento em que foi escrito.


6 - Requisitos não funcionais

    1. Escalabilidade - A escalabilidade está relacionada à capacidade do sistema de crescer sem perder desempenho, ou seja, o software precisa continuar funcionando
    bem mesmo quando o número de usuários, acessos ou requisições aumenta. Isso é essencial em sistemas como bancos ou leilões online, que podem ter muitos usuários,
    acessando ao mesmo tempo. Um sistema escalável acompanha o crescimento da aplicação e da ogranização.

    2. Confiabilidade - A confiabilidade diz respeito à consistência do sistema durante o uso. O software precisa funcionar como esperado, sem falhas frequentes,
    principalmente em momentos críticos. No caso de sistemas online, o usuário espera que o serviço não caia no meio de uma operação importante, como um lance em um
    leilão ou uma transação financeira.

    3. Segurança - A segurança garante que os dados e operações do sistema estejam protegidos contra acessos indevidos, ataques ou vazamentos de informação. Em sistemas
    bancários, por exemplo, esse requisito é fundamental, pois envolve dados sensíveis e transações financeiras. Um software seguro protege tanto o usuário quanto a
    organização.

    4. Disponibilidade - A disponibilidade está ligada ao tempo em que o sistema permanece acessível para uso. Um bom sistema precisa estar disponível a maior parte
    do tempo, caso ocorra alguma falha, ele deve conseguir voltar ao ar rapidamente. Quanto maior a disponibilidade, maior a confiança do usuário no sistema.

    5. Manutenibilidade/Extensibilidade - Esse requisito trata da facilidade de manter, corrigir e evoluir o sistema ao longo do tempo. Um software bem projetado 
    permite adicionar novas funcionalidades ou corrigir problemas sem quebrar o que já existe. Isso está diretamente ligado à modularidade e ao baixo acoplamento,
    facilitando a evolução do sistema conforme novas necessidades surgem.


7 - Trade-offs

    1. Performance x Manutenibilidade - Em muitos sistemas, existe a pressão para deixar tudo o mais rápido possível. Para isso, o desenvolvedor acaba escrevendo
    um código mais complexo, cheio de otimizações e atalhos. O problema é que, com o tempo, esse código fica difícil de entender, testar e modificar. O trade-off
    acontece porque melhorar a performance pode piorar a manutenibilidade, exigindo que a equipe escolha até onde vale a pena otimizar sem comprometer o futuro do
    sistema.

    2. Segurança x Usabilidade - Um sistema bancário, por exemplo, precisa de autenticação forte, validações e várias etapas de confirmação. Isso aumenta a segurança,
    mas deixa o uso mais lento e menos amigável para o usuário. Se a prioridade for usabilidade, a experiência melhora, mas a segurança pode ficar mais frágil. Aqui
    o trade-off está em encontrar um equilíbrio entre proteger os dados e não tornar o sistema frustrante de usar.

    3. Escalabilidade x Complexidade - Arquiteturas como microserviços ajudam muito quando o sistema cresce e precisa atender muitos usuários ao mesmo tempo. Porém,
    elas trazem mais complexidade: comunicação entre serviços, monitoramento, deploy e falhas distribuídas. Um monólito é mais simples de desenvolver e entender no
    início, mas pode virar um problema quando o sistema cresce. O trade-off aqui é decidir entre simplicidade no começo ou escalabilidade a longo prazo. 
    





  
  

