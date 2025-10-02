import java.util.Scanner;

public class TrieImplementation {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.inserir(new char[]{'t', 'e', 's', 't', 'e'}, 5);
        trie.inserir(new char[]{'t', 'e', 's', 't', 'a'}, 5);
        trie.inserir(new char[]{'t', 'e', 's', 't', 'a', 'r'}, 6);
        trie.inserir(new char[]{'t', 'e', 's', 't', 'a', 'n', 'd', 'o'}, 8);
        trie.inserir(new char[]{'t', 'e', 's', 't', 'e', 's'}, 6);
        trie.inserir(new char[]{'t', 'e', 's', 't', 'e', 's', 'i', 'n', 'h', 'o'}, 10);


//        trie.buscar(new char[]{'t', 'e', 's'}, 3);
//
//        trie.remover(new char[]{'t', 'e', 's', 't', 'e'}, 5);
//        trie.remover(new char[]{'t', 'e', 's', 't', 'e', 's', 'i', 'n', 'h', 'o'}, 10);
//        trie.buscar(new char[]{'t', 'e', 's'}, 3);

        // Facilitando a vida na hora de inserir
        String[] arr = {"teste", "testes", "testesinho", "testesinhonho", "testa", "testando", "abacate","abacaxi","aberto","abismo","abobrinha","abraco","abrir","absurdo","acabar","academia","acaso","aceitar","acender","acesso","achar","acontecer","acordar","acreditar","acucar","acusado","adaptar","adeus","adiante","admirar","adotar","adverso","advogado","aerea","afastar","afeicao","afinidade","afirmar","aflito","afronta","agachar","agencia","agenda","agente","agitar","agora","agradar","agradecer","agreste","agua","aguardar","aguentar","agudo","ajuda","ajustar","alegrar","alegria","alem","alerta","algodao","algum","alguem","alimentar","aliar","alienar","aliviar","alma","almoco","altura","aluno","amado","amanha","amante","amarelo","amargo","amarrar","ambiente","ameno","amigo","amizade","amor","ampliar","analisar","andar","anel","anexo","animo","anotar","antena","antes","antigo","anuncio","anular","anzol","apagar","aparecer","apego","apenas","aperto","apetito","apitar","aplauso","aplicar","apoio","apontar","aposta","aprender","aprovar","aproveitar","apurar","arame","arar","arco","area","areia","arma","armar","armazem","aroma","arredor","arrepender","arriscar","arte","artigo","artista","asa","asilo","asneira","aspirar","assalto","assar","assinar","assistir","assunto","astuto","atacar","atear","atender","atento","atitude","ator","atracao","atrair","atras","atravessar","atrever","atual","atuar","aula","aumentar","aura","ausencia","autor","avaliar","avancar","avaria","ave","avenida","aviao","aviso","axila","azar","azeite","azedo","azul","baba","babosa","bacia","bala","balanco","balde","baleia","banco","banda","banho","banir","bar","barato","barba","barco","barra","barriga","barulho","base","bastao","bastar","bastante","bater","batida","batom","batucar","bau","beber","beijo","beleza","belo","bem","bemvindo","bengala","berro","besta","bexiga","bicho","bicicleta","bico","bilhete","bingo","bisavó","bisneto","biscoito","bispo","bisturi","boa","boato","boca","boi","bola","bolacha","bolha","bolo","bolsa","bom","bomba","bonde","bonito","bono","borboleta","bordo","borracha","bosque","bosta","botao","botar","braco","branco","bravo","breve","brejo","brilho","brincar","brinquedo","broa","broto","bruxa","bruto","bueiro","buraco","burro","buscar","busto","cabo","cabeca","cabide","cabine","cabo","cabra","cacador","cacau","cacho","cachorro","cadarco","caderno","cadete","cafe","cair","caixa","calado","calca","calcada","calcular","caldo","calha","calma","calor","cama","camarada","caminhar","caminho","camisa","campo","canal","cancer","candeia","candidato","candomble","canguru","canja","cano","cansado","cantar","canto","capacho","capaz","capim","capitao","capotar","capricho","captar","capuz","cara","caracol","caramba","carater","carbono","carcará","cardume","careca","carente","carinho","carne","caro","carona","carregar","carro","carta","cartao","carteira","cartola","carvao","casaco","casal","casar","cascata","casco","casebre","caso","castelo","castor","casual","catar","caverna","cavalo","cebola","ceder","cedo","cego","cegonha","cela","celeste","celula","cena","censo","centavo","centro","cerca","cerebro","certo","cesta","chamar","chao","chapéu","chave","chefe","chegar","cheio","cheirar","cheque","chifre","chile","chinelo","chocar","chover","chuchu","chupar","chuva","ciclo","cidade","cidadao","cinto","cinto","cinza","circo","circulo","citar","civil","clamor","claro","clube","coador","coala","coberto","cobrar","cobra","cocar","coceira","coco","coelho","cofre","coisa","colar","colher","colina","colocar","coluna","combinar","comeco","comer","comida","comigo","comissao","comodo","companheiro","comparecer","comprar","comum","concha","conduzir","cone","confiar","conflito","congelar","conhecer","conjugar","consertar","construir","conta","contar","conter","contigo","continuar","contrato","convidar","cooperar","copiar","copo","coração","coragem","coral","corar","corcunda","corda","corno","corpo","corredor","correr","corrida","coruja","corvo","coser","costa","costela","costume","cotar","cotar","couro","cova","covarde","cravo","crer","crescer","criar","criança","criminoso","crise","cristal","criticar","crosta","cruz","cruzeiro","cubano","cubo","cueca","cuidado","cuidar","cultura","cumprir","cunhado","cupim","cura","curioso","curtir","curva","custar","custo","cutelo","dadiva","dados","dama","danar","dançar","dança","dardo","dar","dentro","depois","derrota","desafio","descansar","descer","desenho","desejo","deserto","desfiar","desgosto","desmaiar","despejo","despir","dessa","deste","desvio","detalhe","detestar","detonar","deusar","dever","deveras","devorar","dia","diante","dica","didatico","dieta","diferente","difuso","diga","digno","diligente","diluir","dinheiro","dinossauro","dizer","doar","dobrar","doce","doente","dogma","doido","dolar","dolorido","dom","domingo","dominar","dono","dor","dormir","doutor","dragao","drama","droga","ducha","duda","duelo","duende","dupla","duro","ebuliçao","eco","ecologia","edicao","edificio","educar","efeito","efeito","ego","egua","eixo","elefante","eleger","elemento","eletricidade","elmo","elogio","embarcar","embriagado","emenda","emissor","emocao","empada","empatar","emprego","encher","encolher","encontro","endireitar","energia","enfeite","enfim","enganar","engano","engenho","engolir","engracado","enguia","enorme","enriquecer","enrolar","ensinar","entao","ente","entender","entrar","entregar","entulho","enviar","enxada","enxame","enxergar","enxofre","epoca","equilibrar","equino","equipar","era","errar","errado","erva","ervilha","esboco","escada","escala","escapar","escola","esconder","escrever","escudo","escuro","esfera","esfomeado","esgoto","espaco","espada","espanhol","esparadrapo","espelho","espera","esperanca","espeto","espiga","espirito","espuma","esquilo","essa","esse","estacao","estadio","estagio","estar","este","esteira","estilo","estima","estocar","estouro","estrela","estudo","etapa","eterno","etnia","eu","evitar","exame","exato","excluir","exemplo","exibir","exigir","existe","expandir","expectativa","experiencia","explorar","expor","expressao","expulsar","exterior","extra","extrair","fabricar","faca","facil","faculdade","fada","faixa","falar","fama","familia","famoso","farao","farinha","farol","faro","farsa","fartura","fato","favor","fazenda","fazer","fe","fechar","fedor","feio","feito","feitio","feixe","feliz","femea","feno","feriado","ferir","fermento","ferro","festa","feudo","figado","figura","fila","filho","filme","final","fino","firma","fiscal","fita","fivela","fixar","flaco","flamingo","flauta","flerte","flor","floresta","fluir","fluxo","foca","foco","fogao","fogo","foice","folha","folia","fome","fomos","fones","forca","forma","forno","forte","força","forro","fortuna","fosco","foto","fraco","fralda","frango","frase","freio","frequencia","frio","frisado","frito","fronteira","fruta","fugir","fumaça","fundo","funil","furar","furia","furto","fusao","futebol","futuro","gabarito","gado","gaiola","galinha","galo","galho","gamba","ganhar","ganso","garagem","garfo","garganta","garota","garrafa","gato","gaveta","gelo","gemeo","gente","geral","gerente","gerir","gesso","gesto","gigante","girafa","girar","globo","gole","golpe","goma","gomo","gordo","gorro","gostar","governo","graça","grade","grama","grande","grato","gravata","graxa","gredo","grego","grilo","grito","grossa","grupo","guarda","guerra","guia","guincho","guisado","guitarra","habilidade","habito","haver","hectare","heranca","heroi","hesitar","hoje","homem","honesto","honra","hora","horizonte","hospedar","hospital","hotel","humano","humilde","humor","ideia","idade","idioma","igreja","igual","iguana","iludir","iluminar","imagem","imenso","imitar","imovel","impar","impacto","importar","imprensa","impulso","inaugurar","incenso","incluir","incomodo","incrivel","indagar","indicar","indio","induzir","inercia","infeliz","inflar","informar","infra","ingresso","inimigo","iniciar","inocente","inovar","inseto","insistir","inspirar","instalar","instituto","instruir","insulto","integrar","interesse","interno","interromper","intimo","introduzir","invasao","inventar","inverno","invocar","iogurte","ir","iris","irma","irmao","ironico","isca","isolar","isso","item","jantar","jardim","jarra","jato","jogar","jogo","joia","jornal","jovem","juiz","julgar","juntar","junto","jurado","justica","labio","labor","lacre","lago","laje","lama","lance","largo","lar","laranja","lasca","lata","lavar","leao","lebre","leite","leito","lembrar","lenha","lente","leque","ler","lesao","lesma","leve","levar","livre","livro","lixo","lobo","local","lodo","logico","longe","lousa","luz","macaco","maca","macho","maduro","mae","mago","magra","magro","mala","maluco","mamadeira","mamifero","mamma","manga","manjar","manobra","mansao","manual","mapa","mar","marca","marfim","margarina","marido","marmore","maroto","massa","mastro","matador","mata","materia","matriz","medalha","medida","medo","medusa","mel","melhor","melodia","memoria","menina","menino","menos","mensagem","menta","mentira","menu","mercado","mes","mesa","mesmo","metro","mexer","miar","migalha","mil","milagre","milho","mim","minha","minhoca","minuto","mirar","misterio","mito","moda","modelo","moeda","mole","molho","momento","monarca","monge","montanha","monte","morada","moral","morrer","morro","mosaico","mosca","mosquito","motel","motor","motivo","mover","movimento","mudar","mudo","mulher","mundo","munir","muro","musculo","musica","nadar","nao","nariz","nata","natureza","navio","nave","nativo","necessario","negocio","nele","nenem","nervoso","neste","neve","nivel","noite","nome","nora","norma","nos","nossa","nosso","nota","notar","novela","novo","nuca","nulo","num","nunca","nutrir","obrigado","observar","obter","obvio","oceano","ocorrer","ocupar","odeio","odor","oferta","oficio","olhar","olho","ombro","onda","ontem","opcao","operar","opinar","oposto","orar","ordem","orelha","orgulho","oriente","origem","orvalho","osso","ossos","ou","ouco","ouro","ousar","ouvido","ovo","pao","paca","paciente","pacto","pai","pais","pala","palavra","palco","palestra","palha","palito","pao","papai","papel","papinho","par","para","parar","parede","parente","parir","parque","parte","partida","partir","passado","passar","passear","passo","pasta","patamar","pateta","patio","patrao","pato","patrao","paz","pe","peca","pecado","pecar","pedra","pedreiro","pedro","pegar","peito","pelado","pele","pelicano","pena","pensar","pequeno","perceber","perder","perdoar","perfeito","pergunta","perigoso","perna","perto","pessoa","pesquisar","peso","peste","petala","piada","piano","picanha","pico","pilar","pilha","pintar","pintor","pior","pipoca","pique","pirata","pisar","piso","pitanga","placa","plano","planta","pleno","pluma","pobre","poder","poeira","poema","poesia","poeta","poderoso","ponto","por","porco","porem","porta","portao","porto","posse","posso","posto","pote","potro","pouco","povo","praia","prancha","prato","prazer","preco","pregao","prego","prensa","presente","pressa","preto","primeiro","primo","principe","prisao","proa","problema","procurar","professor","programa","projeto","promessa","pronto","proprio","prosa","protetor","prova","publico","pudim","pular","pulmao","pulso","punho","puro","quadro","qualquer","quando","quanto","quarto","quase","queijo","quem","querer","quero","questao","quimica","quilo","quinto","quiosque","rabo","racao","rachar","raio","raiva","raiz","ramo","rancho","rapariga","rapaz","rapido","raposa","raridade","rasgar","raspado","rato","rastro","razao","reagir","real","realeza","rebelde","receber","recente","recibo","recordar","rede","redor","reduzir","regiao","rei","reino","reitor","relevo","relva","remar","remedio","remover","renda","renovar","reparo","repente","repor","reposo","represa","reprovar","respeito","resto","resultado","reter","retirar","reuniao","revelar","rever","reves","rezar","rico","rigido","rio","rir","riso","roca", "casa","carro","porta","mesa","cadeira","rua","homem","mulher","crianca","amigo","agua","fogo","terra","ar","sol","lua","estrela","ceu","nuvem","chuva","vento","tempo","dia","noite","manha","tarde","hora","minuto","segundo","ontem","hoje","amanha","semana","mes","ano","tempo","pessoa","gente","pai","mae","irmao","irma","filho","filha","familia","trabalho","emprego","escola","professor","aluno","livro","caderno","caneta","lapis","computador","celular","telefone","internet","rede","papel","quadro","janela","parede","chao","teto","porta","chave","cadeado","bolsa","mochila","roupa","sapato","camisa","calca","saia","vestido","blusa","casaco","meia","chapeu","oculos","anel","relogio","dinheiro","moeda","nota","cartao","banco","loja","mercado","feira","supermercado","padaria","restaurante","bar","cafe","sala","quarto","cozinha","banheiro","garagem","jardim","parque","praia","mar","rio","lago","ilha","montanha","floresta","campo","cidade","bairro","rua","avenida","praca","onibus","carro","moto","bicicleta","caminhao","metro","trem","aviao","barco","navio","estrada","rodovia","ponte","tunel","trabalho","empresa","chefe","colega","cliente","servico","produto","preco","conta","nota","dinheiro","salario","imposto","governo","presidente","ministro","vereador","prefeito","policia","bombeiro","medico","enfermeiro","hospital","posto","remedio","vacina","doenca","dor","saude","sangue","corpo","cabelo","olho","nariz","boca","dente","orelha","mao","braco","perna","pe","cerebro","coracao","pulmao","estomago","pele","ossos","animal","cachorro","gato","passaro","peixe","cavalo","vaca","porco","galinha","ovelha","macaco","elefante","leao","tigre","urso","cobra","sapo","abelha","formiga","mosca","arvore","flor","folha","raiz","fruta","banana","maca","laranja","uva","pera","manga","abacaxi","melancia","morango","limao","legume","arroz","feijao","pao","carne","frango","peixe","ovo","leite","queijo","manteiga","cafe","cha","acucar","sal","oleo","agua","cerveja","vinho","suco","refrigerante","doce","bolo","sorvete","biscoito","chocolate","pizza","macarrao","sopa","molho","cozinha","fogao","forno","geladeira","pia","colher","garfo","faca","prato","copo","panela","frigideira","chaleira","cadeira","mesa","sofa","cama","travesseiro","cobertor","lençol","televisao","radio","som","filme","musica","jogo","bola","futebol","basquete","volei","tenis","corrida","nado","ginastica","academia","brincadeira","brinquedo","boneca","carrinho","lego","videogame","cartas","xadrez","damas","dominó","festa","aniversario","casamento","batizado","feriado","natal","ano","novo","carnaval","pascoa","pessoa","homem","mulher","crianca","amigo","colega","vizinho","companheiro","namorado","namorada","marido","esposa","noivo","noiva","idoso","jovem","adulto","bebe","trabalho","emprego","profissao","arte","pintura","escultura","musica","dança","teatro","cinema","fotografia","livro","revista","jornal","noticia","historia","poesia","romance","aventura","fantasia","terror","comedia","drama","ciencia","fisica","quimica","biologia","medicina","matematica","geografia","historia","sociologia","filosofia","psicologia","economia","politica","religiao","igreja","templo","missa","culto","biblia","oração","deus","santo","fe","esperanca","amor","odio","alegria","tristeza","raiva","medo","coragem","paz","guerra","conflito","amizade","trabalho","sucesso","fracasso","ganho","perda","tempo","vida","morte","passado","presente","futuro","verdade","mentira","realidade","sonho","ideia","pensamento","memoria","lembranca","desejo","vontade","necessidade","direito","lei","justica","crime","culpa","pena","prisao","tribunal","juiz","advogado","acusado","vitima","testemunha","prova","evidencia","ciencia","tecnologia","maquina","motor","energia","luz","fogo","eletricidade","computador","internet","rede","programa","aplicativo","site","jogo","rede","social","mensagem","email","foto","video","musica","telefone","celular","camera","microfone","tela","controle","remoto","robot","satellite","espaco","planeta","terra","lua","marte","venus","jupiter","saturno","urano","netuno","galaxia","universo","estrela","cometa","meteoro","buraco","negro","tempo","espaco","gravidade","materia","energia","forca","velocidade","massa","peso","altura","tamanho","forma","cor","branco","preto","cinza","vermelho","azul","verde","amarelo","laranja","rosa","roxo","marrom","claro","escuro","frio","quente","velho","novo","bom","ruim","alto","baixo","grande","pequeno","forte","fraco","lento","rapido","perto","longe","certo","errado","sim","nao","talvez","sempre","nunca","agora","depois","antes","aqui","ali","la","dentro","fora","cima","baixo","esquerda","direita","frente","tras","primeiro","segundo","ultimo","outro","mesmo","diferente","todos","nenhum","algum","cada","pouco","muito","mais","menos","melhor","pior","homem","mulher","crianca","animal","cachorro","gato","passaro","peixe","cavalo","vaca","ovelha","macaco","cidade","pais","estado","governo","povo","nação","capital","fronteira","mapa","viagem","turismo","hotel","pousada","hospedagem","bagagem","passagem","bilhete","documento","passaporte","identidade","carteira","dinheiro","moeda","preco","troco","caixa","bolso","compra","venda","mercado","feira","loja","supermercado","farmacia","padaria","restaurante","bar","cafe","cinema","teatro","parque","praia","museu","biblioteca","estadio","escola","universidade","faculdade","curso","aula","prova","trabalho","nota","professor","aluno","diretor","coordenador","funcionario","colega","amigo","vizinho","companheiro","parente","conhecido","estranho","chefe","empregado","cliente","usuario","motorista","passageiro","policial","bombeiro","soldado","medico","enfermeiro","advogado","juiz","engenheiro","arquiteto","professor","cientista","artista","jornalista","ator","atriz","cantor","cantora","escritor","poeta","pintor","fotografo","estudante","trabalhador","empresario","politico","presidente","governador","prefeito","vereador","senador","deputado","ministro","embaixador","juiz","padre","pastor","bispo","papa","monge","freira","medico","paciente","doente","ferido","saudavel","rico","pobre","velho","novo","homem","mulher","bonito","feio","alto","baixo","magro","gordo","forte","fraco","feliz","triste","bravo","calmo","rapido","lento","esperto","bobo","bom","ruim","certo","errado","claro","escuro","quente","frio","seco","molhado","limpo","sujo","cheio","vazio","aberto","fechado","largo","estreito","comprido","curto","fino","grosso","leve","pesado","doce","salgado","azedo","amargo","duro","mole","seco","molhado","perto","longe","dentro","fora","emcima","embaixo","frente","tras","direita","esquerda","agora","depois","antes","ontem","hoje","amanha"};
        for (int c = 0; c < 2066; c++) trie.inserir(Trie.stringToCharArray(arr[c]), arr[c].length());

        //trie.remover(Trie.stringToCharArray("testes"), 6);

        trie.remover(Trie.stringToCharArray("testesinhonho"), 13);

        Scanner scn = new Scanner(System.in);

        String s;
        while (true) {
            System.out.print("\n\n\nDigite uma palavra: ");
            s = scn.nextLine();

            if (s.equals("")) break;

            System.out.println("\nAutocomplete:");
            char[] chars = Trie.stringToCharArray(s);

            trie.buscar(chars, s.length());
        }
    }
}

class Trie {
    private static char[] addCharToArray(char[] a, int al, char b) {
        char[] c = new char[al + 1];
        for (int i = 0; i < al; i++) c[i] = a[i];
        c[al] = b;
        return c;
    }
    public static void printCharArray(char[] s, int sl) {
        for (int i = 0; i < sl; i++) System.out.print(s[i]);
    }

    public static char[] stringToCharArray(String s) {
        char[] c = new char[s.length()];

        for (int i = 0; i < s.length(); i++) c[i] = s.charAt(i);

        return c;
    }

    TrieNode root;
    public Trie() {
        this.root = new TrieNode(0, false);
    }

    public void inserir(char[] palavra, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            int valorAscii = palavra[i];
            if (valorAscii > 255) {
                System.out.println("Um dos valores do array não é um caractere ASCII válido.");
                return;
            }
        }

        TrieNode noAtual = this.root;
        for (int i = 0; i < tamanho; i++) {
            int valorAscii = palavra[i];

            if (noAtual.filhos[valorAscii] == null) {
                noAtual.filhos[valorAscii] =  new TrieNode(valorAscii, false);
            }

            noAtual = noAtual.filhos[valorAscii];
        }

        noAtual.fim = true;
    }

    public void buscar(char[] palavra, int tamanho) {
        TrieNode noAtual = this.root;
        for (int i = 0; i < tamanho; i++) {
            int valorAscii = palavra[i];

            noAtual = noAtual.filhos[valorAscii];
            if(noAtual == null) break;
        }

        if (noAtual == null) return;

        System.out.print("Prefixo: ");
        Trie.printCharArray(palavra, tamanho);
        System.out.println();

        for (int i = 0; i < 256; i++) {
            if (noAtual.filhos[i] != null) imprimir(palavra, tamanho, noAtual.filhos[i]);
        }
    }

    public void imprimir(char[] prefix, int len, TrieNode no) {
        if (no.fim) {
            Trie.printCharArray(addCharToArray(prefix, len, (char) no.valor), len + 1);
            System.out.println();
        }
        for (int i = 0; i < 256; i++) {
            if (no.filhos[i] != null) {
                imprimir(addCharToArray(prefix, len, (char) no.valor), len + 1, no.filhos[i]);
            }
        }
    }

    public boolean remover(char[] palavra, int tamanho) {
        PilhaEncadeadaTrie p = new PilhaEncadeadaTrie();
        TrieNode noAtual = this.root;
        p.insere(noAtual);
        for (int i = 0; i < tamanho; i++) {
            int valorAscii = palavra[i];

            if (noAtual.filhos[valorAscii] == null) return false;

            noAtual = noAtual.filhos[valorAscii];
            p.insere(noAtual);
        }

        if (!noAtual.fim) return false;
        else noAtual.fim = false;

        while(!p.vazia()) {
            noAtual = p.remove();

            boolean hasChilds = false;
            for (int i = 0; i < 256; i++) {
                if (noAtual.filhos[i] != null) {
                    hasChilds = true;
                    break;
                }
            }
            if (hasChilds || noAtual.fim) break;

            if (p.vazia()) break;

            p.topo().filhos[noAtual.valor] = null;
        }

        return true;
    }
}

class TrieNode {
    TrieNode[] filhos;
    int valor;
    boolean fim;
    public TrieNode(int valor, boolean fim) {
        this.valor = valor;
        this.fim = fim;
        this.filhos = new TrieNode[256];
    }
}





class PilhaEncadeadaTrie {
    private PilhaNodeTrie topo;
    int tamanho = 0;

    boolean vazia() {
        return tamanho == 0;
    }

    int insere(TrieNode valor) {
        topo = new PilhaNodeTrie(valor, topo);
        return ++tamanho;
    }

    TrieNode remove() {
        TrieNode valor = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valor;
    }

    TrieNode topo() {
        return this.topo.valor;
    }
}

class PilhaNodeTrie {
    TrieNode valor;
    PilhaNodeTrie proximo = null;
    PilhaNodeTrie(TrieNode valor) {
        this.valor = valor;
    }
    PilhaNodeTrie(TrieNode valor,  PilhaNodeTrie proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }
}


