package demo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class HelloBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage("Hello " + name + "!"));
    }
}
