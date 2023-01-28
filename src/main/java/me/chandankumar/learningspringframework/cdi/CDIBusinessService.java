package me.chandankumar.learningspringframework.cdi;


import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class CDIBusinessService {

    @Inject
    private CDIDao cdiDao;

    public CDIDao getCdiDao() {
        return cdiDao;
    }
}
