package src;

public enum Operation {
    INFO, DEPOSIT, WITHDRAW, EXIT;

    public static Operation getAllowableOperationByOrdinal(Integer i) {
        if (i == null) {
            throw new IllegalArgumentException("Введите число");
        }
        switch (i) {
            case 1:
                return INFO;
            case 2:
                return DEPOSIT;
            case 3:
                return WITHDRAW;
            case 4:
                return EXIT;
            default:
                throw new IllegalArgumentException("Введите число от 1 до 4");

        }
    }

}





