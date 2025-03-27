class CPU{
int price;
class Processor{
int core;
String manufacturer;
}
static class RAM{
int memory;
String manufacturer;
}
}


public class computer{
public static void main(String[] args){
CPU cpu=new CPU();
cpu.price=500;

CPU.Processor processor=cpu.new Processor();
processor.core=8;
processor.manufacturer="Intel";

CPU.RAM ram=new CPU.RAM();
ram.memory=16;
ram.manufacturer="Corsair";

System.out.println("CPU price:"+cpu.price);
System.out.println("Processor core:"+processor.core);
System.out.println("Processor manufacturer:"+processor.manufacturer);
System.out.println("RAM memory:"+ram.memory);
System.out.println("RAM manufacturer:"+ram.manufacturer);
}
}
