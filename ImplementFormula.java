private double calculateFormula(SIGN sign, double arg1, double arg2) {
    switch (sign) {
        case MULTIPLY: return arg1 * arg2;
        default:
            break;
    }
    return 0d;
}