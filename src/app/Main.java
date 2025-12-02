package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Sistema de Jogo ---");

        // 1. Primeira chamada:
        // O Singleton percebe que não existe instância, cria uma, lê o arquivo e retorna.
        GameConfig config1 = GameConfig.getInstance();
        System.out.println("Player detectado: " + config1.getUserName());
        System.out.println("Versão da Build: " + config1.getBuildId());

        // 2. Segunda chamada:
        // O Singleton vê que JÁ existe instância e retorna a MESMA imediatamente.
        GameConfig config2 = GameConfig.getInstance();

        System.out.println("\n--- Teste de Singleton ---");
        // Verifica se as duas variáveis apontam para o mesmo lugar na memória
        if (config1 == config2) {
            System.out.println("SUCESSO: Ambas as variáveis referenciam a MESMA instância única na memória.");
        } else {
            System.out.println("ERRO: Foram criadas instâncias diferentes!");
        }

        // 3. Mostra todos os dados carregados
        System.out.println("\n--- Configuração Completa ---");
        System.out.println(config1.toString());
    }
}