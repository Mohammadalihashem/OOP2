/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strucule;

 class classFacade {
    private subsystem Subsystem1;
    private subsystem Subsystem2;

    public classFacade(){
    this.Subsystem1 = new subsystem();
    this.Subsystem2 = new subsystem();
    
    }
    public void Operate(){
        System.out.println("Facade is coordiniting the sub system");
        Subsystem1.operation1();
        Subsystem2.operation2();

    }
}
