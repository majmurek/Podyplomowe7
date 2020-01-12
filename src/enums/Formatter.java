package enums;

public enum Formatter {
    CALM {
        public String format(String message) {
            return "Wiadomość: " + message;
        }
    },
    NERVOUS {
        public String format(String message) {
            return "Stop!: " + message + "!!!";
        }
    };

    public abstract String format(String message);
}
