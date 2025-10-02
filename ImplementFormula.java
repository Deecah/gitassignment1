private double calculateFormula(SIGN sign, double arg1, double arg2) {
    switch (sign) {
        case MINUS:
            return arg1 - arg2;
        case DIVIDE  : return arg1 / arg2;
        case ADD:
            return arg1 + arg2;
        default:
            break;
    }
    return 0d;
}