interface a {
void methoda();
}

interface b extends a {
void methodb();
}

class c implements b {
public void methoda() {
System.out.println("methoda");
}

public void methodb() {
System.out.println("methodb");

}

}

class Interface4 {
public static void main(String[] args) {
c obj= new c();
obj.methoda();
obj.methodb();
}
}