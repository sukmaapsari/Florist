/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package florist;

import florist.view.SignInView;

/**
 *
 * @author HP
 */
public class Florist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menghubungkan main dengan view Sign in
        SignInView loginView = new SignInView(); // buat object baru
        loginView.setVisible(true);
    }
    
}
