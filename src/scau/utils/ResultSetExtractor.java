package scau.utils;

import java.sql.ResultSet;

public interface ResultSetExtractor<T> {
    T extractData(ResultSet rs);
}
