package gr.aueb.cf1.ch18.mobilecontacts.dao;

import gr.aueb.cf1.ch18.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    //basic crud API services
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(Long id, MobileContact mobileContact);
    void deleteById(Long id);
    MobileContact getById(Long id);
    List<MobileContact>getAll();


    void deleteByPhoneNumber(String phoneNumber);


    MobileContact getByPhoneNumber(String phoneNumber);
    boolean userIdExists(Long id);
    boolean phoneNumberExists(String phoneNumber);


}
