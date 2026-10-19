package pkg;

import java.util.Random;

public class FortuneBank {
       private final String[] tips = {
        "Commit early, commit often.",
        "Code is read more often than it is written.",
        "Make it work, make it right, make it fast.",
        "Test before you ship.",
        "Simple code is easier to maintain.",
        "Name things clearly."
    };
    private final Random random = new Random();

    public String getTip() {
        return tips[random.nextInt(tips.length)];
    }
}
