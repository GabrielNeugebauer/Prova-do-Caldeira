public class Logica {
    public static void main(String[] args) {
        /*int prioridade = 4;
        int urgencia = 8;
        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa crítica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        } */

        int notificacoes = 0;
        for (int i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes+=2;
            } else {
                notificacoes++;
            }
        }
        System.out.println("Notificações: " + notificacoes);
    }
}
