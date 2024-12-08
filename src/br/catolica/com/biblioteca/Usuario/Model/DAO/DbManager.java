package br.catolica.com.biblioteca.Usuario.Model.DAO;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

public class DbManager {
    private static ObjectContainer db;

    private DbManager() {

    }

    public static ObjectContainer getDb() {
        if (db == null || db.ext().isClosed()) {
            db = Db4o.openFile("banco.db4o");
        }
        return db;
    }

    public static void closeDb() {
        if (db != null && !db.ext().isClosed()) {
            db.close();
        }
    }
}
