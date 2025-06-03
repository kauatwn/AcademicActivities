package sem_2.ap_2.atv_8.challenge.core;


import sem_2.ap_2.atv_8.challenge.utils.stack.MyStack;

public class TagStackProcessor {
    private final MyStack<String> stack = new MyStack<>();

    public boolean processTag(String rawTag, String tagName, boolean isSelfClosing) {
        if (tagName.isEmpty() || containsInvalidCharacters(tagName)) {
            return false;
        }

        boolean isClosing = rawTag.startsWith("/");

        // Self-closing tags não podem ter versão de fechamento
        if (isSelfClosing) {
            return !isClosing;
        }

        if (isClosing && stack.isEmpty()) {
            return false;
        }

        if (isClosing) {
            String top = stack.pop();
            System.out.printf("FECHANDO: </%s> | Pilha após pop: %s%n", tagName, stack);
            return tagName.equals(top);
        }

        stack.push(tagName);
        System.out.printf("ABRINDO: <%s> | Pilha após push: %s%n", tagName, stack);
        return true;
    }

    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    private boolean containsInvalidCharacters(String tagName) {
        return tagName.contains("<") || tagName.contains(">");
    }
}
// Gerencia a lógica central de empilhamento/desempilhamento de tags durante a validação.
// Este processador de pilha é responsável por gerenciar a pilha de tags abertas e fechadas.
// Ele processa as tags HTML, garantindo que as tags de abertura e fechamento estejam corretamente empilhadas e desempilhadas.
// Se uma tag de fechamento não corresponder à última tag aberta, ele retorna false.
// Ele também verifica se as tags são auto-fechadas e garante que não haja caracteres inválidos nas tags.
// A classe usa uma pilha personalizada (MyStack) para armazenar as tags abertas e verificar a correspondência com as tags fechadas.
// Se a pilha estiver vazia no final do processamento, significa que todas as tags foram fechadas corretamente.
// Se a pilha não estiver vazia, significa que há tags abertas sem fechamento correspondente, o que resulta em uma estrutura HTML inválida.
// A classe imprime mensagens de depuração para cada operação de abertura e fechamento de tags, mostrando o estado atual da pilha após cada operação.
// A classe também verifica se as tags contêm caracteres inválidos, como '<' ou '>', que não são permitidos em nomes de tags HTML.