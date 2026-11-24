//-----------------utilisation possible------------------
public static void main(String[] args) {
    Singleton.getInstance().op1(1, 2, 3);
    Singleton.getInstance().op2(3, 4, 5);
}

//autre facon
/* 
public static void main(String[] args) {
    Singleton singl = Singleton.getInstance();
    singl.op1(1, 2, 3);
    singl.op2(3, 4, 5);
}

*/