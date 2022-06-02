module academy.learnprogramming.common {
    requires java.base;

    exports academy.learnprogramming.common;
    opens academy.learnprogramming.common to javafx.base;
}