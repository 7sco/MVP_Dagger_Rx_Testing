package com.example.franciscoandrade.androidapplication.login;


public interface LoginActivityMVP {
    interface View{
        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showInputError();
        void showUserSaved();

        void setFirstName(String fName);
        void setLastName(String lName);

    }

    interface Presenter{

        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();
    }

    interface Model{

        void createUser(String fName, String lName);
        User getUser();

    }

}
