package com.thoughtworks.capability.gtb.demospringconfig;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mail")
public class MailConfig {

    private String hostname;
    private int port;
    private String from;
    private List<String> defaultRecipients;
    private Map<String, Boolean> additionalHeaders;
    private Credentials credentials;

    public static class Credentials{
        private String username;
        private String password;
        private String authMethod;

        @Override
        public String toString() {
            return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authMethod='" + authMethod + '\'' +
                '}';
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAuthMethod() {
            return authMethod;
        }

        public void setAuthMethod(String authMethod) {
            this.authMethod = authMethod;
        }
    }

    @Override
    public String toString() {
        return "MailConfig{" +
            "hostname='" + hostname + '\'' +
            ", port=" + port +
            ", from='" + from + '\'' +
            ", defaultRecipients=" + defaultRecipients +
            ", additionalHeaders=" + additionalHeaders +
            ", credentials=" + credentials +
            '}';
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public Map<String, Boolean> getAdditionalHeaders() {
        return additionalHeaders;
    }

    public void setAdditionalHeaders(Map<String, Boolean> additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
    }

    public List<String> getDefaultRecipients() {
        return defaultRecipients;
    }

    public void setDefaultRecipients(List<String> defaultRecipients) {
        this.defaultRecipients = defaultRecipients;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
