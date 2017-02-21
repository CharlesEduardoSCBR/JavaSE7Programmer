package m2;

class D implements B { //A
}
public interface B { //B
}
class C extends D { //C
}
class E extends D, implements B { //D
}