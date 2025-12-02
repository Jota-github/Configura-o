package app;

public class GameConfig {
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

    // Construtor vazio (por enquanto)
    public GameConfig() {
    }

    // Getters e Setters
    public String getAppId() { return appId; }
    public void setAppId(String appId) { this.appId = appId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public boolean isOffline() { return offline; }
    public void setOffline(boolean offline) { this.offline = offline; }

    public boolean isAutoDlc() { return autoDlc; }
    public void setAutoDlc(boolean autoDlc) { this.autoDlc = autoDlc; }

    public String getBuildId() { return buildId; }
    public void setBuildId(String buildId) { this.buildId = buildId; }

    public String getDlcName() { return dlcName; }
    public void setDlcName(String dlcName) { this.dlcName = dlcName; }

    public boolean isUpdateDb() { return updateDb; }
    public void setUpdateDb(boolean updateDb) { this.updateDb = updateDb; }

    public String getSignature() { return signature; }
    public void setSignature(String signature) { this.signature = signature; }

    public String getWindowInfo() { return windowInfo; }
    public void setWindowInfo(String windowInfo) { this.windowInfo = windowInfo; }

    public String getLvWindowInfo() { return lvWindowInfo; }
    public void setLvWindowInfo(String lvWindowInfo) { this.lvWindowInfo = lvWindowInfo; }

    public String getApplicationPath() { return applicationPath; }
    public void setApplicationPath(String applicationPath) { this.applicationPath = applicationPath; }

    public String getWorkingDirectory() { return workingDirectory; }
    public void setWorkingDirectory(String workingDirectory) { this.workingDirectory = workingDirectory; }

    public boolean isWaitForExit() { return waitForExit; }
    public void setWaitForExit(boolean waitForExit) { this.waitForExit = waitForExit; }

    public boolean isNoOperation() { return noOperation; }
    public void setNoOperation(boolean noOperation) { this.noOperation = noOperation; }

    @Override
    public String toString() {
        return "GameConfig{" +
                "appId='" + appId + '\'' +
                ", userName='" + userName + '\'' +
                ", language='" + language + '\'' +
                ", offline=" + offline +
                ", autoDlc=" + autoDlc +
                ", buildId='" + buildId + '\'' +
                ", dlcName='" + dlcName + '\'' +
                ", updateDb=" + updateDb +
                ", signature='" + signature + '\'' +
                ", windowInfo='" + windowInfo + '\'' +
                ", lvWindowInfo='" + lvWindowInfo + '\'' +
                ", applicationPath='" + applicationPath + '\'' +
                ", workingDirectory='" + workingDirectory + '\'' +
                ", waitForExit=" + waitForExit +
                ", noOperation=" + noOperation +
                '}';
    }
}