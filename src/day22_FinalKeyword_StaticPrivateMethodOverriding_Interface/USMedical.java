package day22_FinalKeyword_StaticPrivateMethodOverriding_Interface;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public interface USMedical extends WorldHealthOrganization{  // Interfaces extends Interfaces

    // abstract method:
    // no method body
    // only method declaration/method prototype/no business logic
    // We can NOT create the object of interface because comes from classes
    // We can NOT create the constructor of the interface because simply is not a class

    // abstract methods: 100% abstraction -- OOP
    public void physioService();

    public void cardioService();

    public void dentalService();

    public void emergencyService();

}
