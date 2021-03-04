package com.company;

public class Database {
    private static Database instance;
    private String sqlQuery;

    private Database(String value){
        this.sqlQuery = value;
    }

    public static Database getInstance(String value){
        if(Database.instance == null)
            Database.instance = new Database(value);
        return Database.instance;
    }
    public String getQuery(){
        return Database.instance.sqlQuery;
    }

}
