package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GameConfig {
    // 1. Atributo estático para guardar a ÚNICA instância da classe
    private static GameConfig instance;

    // Atributos de configuração
    private String appId;
    private String userName;
    private String language;
    private boolean offline;
    private boolean autoDlc;
    private String buildId;
    private String dlcName;
    private boolean updateDb;
    private String signature;
    private String windowInfo;
    private String lvWindowInfo;
    private String applicationPath;
    private String workingDirectory;
    private boolean waitForExit;
    private boolean noOperation;

    // 2. Construtor PRIVADO: Ninguém fora dessa classe pode dar "new GameConfig()"
    // A leitura do arquivo acontece aqui, apenas uma vez.
    private GameConfig() {
        Path path = Paths.get("config.txt"); // Busca o arquivo na raiz do projeto

        try (BufferedReader reader = new BufferedReader(new FileReader(path.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Pula linhas vazias ou sem "="
                if (line.trim().isEmpty() || !line.contains("=")) continue;

                // Divide a linha no primeiro "=" encontrado
                String[] parts = line.split("=", 2); 
                String key = parts[0].trim();
                String value = parts.length > 1 ? parts[1].trim() : "";

                // Preenche os campos baseado na chave lida
                switch (key) {
                    case "AppId": this.appId = value; break;
                    case "UserName": this.userName = value; break;
                    case "Language": this.language = value; break;
                    case "Offline": this.offline = "1".equals(value); break; // Converte "1" para true
                    case "AutoDLC": this.autoDlc = "1".equals(value); break;
                    case "BuildId": this.buildId = value; break;
                    case "DLCName": this.dlcName = value; break;
                    case "UpdateDB": this.updateDb = "1".equals(value); break;
                    case "Signature": this.signature = value; break;
                    case "WindowInfo": this.windowInfo = value; break;
                    case "LVWindowInfo": this.lvWindowInfo = value; break;
                    case "ApplicationPath": this.applicationPath = value; break;
                    case "WorkingDirectory": this.workingDirectory = value; break;
                    case "WaitForExit": this.waitForExit = "1".equals(value); break;
                    case "NoOperation": this.noOperation = "1".equals(value); break;
                }
            }
        } catch (Exception e) {
            System.err.println("Erro ao ler config.txt: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 3. Método Público Estático: O único jeito de acessar o objeto
    public static GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig(); // Cria a instância apenas se ela ainda não existir
        }
        return instance;
    }

    // Getters
    public String getAppId() { return appId; }
    public String getUserName() { return userName; }
    public String getLanguage() { return language; }
    public boolean isOffline() { return offline; }
    public boolean isAutoDlc() { return autoDlc; }
    public String getBuildId() { return buildId; }
    public String getDlcName() { return dlcName; }
    public boolean isUpdateDb() { return updateDb; }
    public String getSignature() { return signature; }
    public String getWindowInfo() { return windowInfo; }
    public String getLvWindowInfo() { return lvWindowInfo; }
    public String getApplicationPath() { return applicationPath; }
    public String getWorkingDirectory() { return workingDirectory; }
    public boolean isWaitForExit() { return waitForExit; }
    public boolean isNoOperation() { return noOperation; }

    @Override
    public String toString() {
        return "GameConfig Carregado:\n" +
                " - AppId: " + appId + "\n" +
                " - UserName: " + userName + "\n" +
                " - Language: " + language + "\n" +
                " - Offline: " + offline + "\n" +
                " - DLCName: " + dlcName + "\n" +
                " - ApplicationPath: " + applicationPath;
    }
}