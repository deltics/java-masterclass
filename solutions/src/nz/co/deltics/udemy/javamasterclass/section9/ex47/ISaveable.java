package nz.co.deltics.udemy.javamasterclass.section9.ex47;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> strings);
}
