package pl.akademiakodu.hellospring.dao;

import pl.akademiakodu.hellospring.model.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 27.07.2017.
 */
public class TableDao {

    public static List<Table> findAll(){
        List <Table> tables = new ArrayList<>();
        for(int i =1;i<=6;i++){
            tables.add(new Table("Author"+i, "Ksiazka"+i, 51.555+i));
        }
        return tables;
    }
}
