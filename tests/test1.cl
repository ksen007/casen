def fac {|n|
    IF (n > 1) GOTO l1;
    return 1;
    l1: return n*fac(n-1);
};



def account  {|val|
    initial = 100;
    val = val + initial;

    def deposit {|n|
        SS.val = SS.val + n + DS.val;
    };

    withdraw = {|n|
       if (n > SS.val) goto l1;
        SS.val = SS.val - n;
        return n;
        l1: return None;
    };
    return LS;
};


val = 10;
acnt1 = account(20);
fac(acnt1.val);

acnt1.deposit(1);


