package seedu.address.model.person;

import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a person's boss in the address book.
 */
public class Boss extends Name {
    public static final String MESSAGE_CONSTRAINTS =
            "Boss names must contain exactly a first name and surname using alphabetical characters, or be empty";

    private static final String VALIDATION_REGEX = "[A-Za-z]+ [A-Za-z]+";

    /**
     * Constructs a boss name.
     *
     * @param name an empty value or a name containing exactly a first name and surname
     */
    public Boss(String name) {
        super(name, MESSAGE_CONSTRAINTS, true);
        checkArgument(isValidBoss(name), MESSAGE_CONSTRAINTS);
    }

    /**
     * Returns true if a given boss name is empty or contains exactly a first name and surname.
     */
    public static boolean isValidBoss(String test) {
        String trimmedTest = test.trim();
        return trimmedTest.isEmpty() || trimmedTest.matches(VALIDATION_REGEX);
    }
}
