package login;

import beans.Alumno;

/**
 * Created by w3234 on 11/05/2016.
 */
public class LoginPresenterImp implements LoginPresenter{
    private LoginView mview;


    public LoginPresenterImp(LoginView mview) {
        this.mview = mview;
    }

    @Override
    public void login(Alumno alumno) {

    }


}
