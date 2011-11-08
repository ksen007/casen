
def if {|cond,body|
    IF (cond()) GOTO l1;
    return;
    l1: body();
};

def while {|cond,body|
    l2: IF (cond[[DS.DS]]()) GOTO l1;
    return;
    l1: body[[DS.DS]]();
    IF (true) GOTO l2;
};

i = 0;
sum = 0;

while {i<100} {
      i += 1
      sum += i
}
  	   

