fac = lambda (n) {
    if (n > 1) goto l1;
    return 1;
    l1: return n*closure.fac(n-1);
};

class = lambda (val) {
    initial = 100;
    val = val + initial;

    deposit = lambda (n) {
        closure.val = closure.val + n;
    };

    withdraw = lambda(n) {
        if (n > closure.val) goto l1;
        closure.val = closure.val - n;
        return n;
        l1: return None;
    };
    return thisframe;
};





l9: account = class(20);
print account.val;

