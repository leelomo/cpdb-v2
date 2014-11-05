package hk.ed.cpdb.util;

import java.sql.Types;

import org.hibernate.dialect.SQLServer2008Dialect;

public class UnicodeSQLServerDialect extends SQLServer2008Dialect {

    public UnicodeSQLServerDialect() {
        super();

        // Use Unicode Characters
        registerColumnType(Types.VARCHAR, 255, "nvarchar($l)");
        registerColumnType(Types.CHAR, "nchar(1)");
        registerColumnType(Types.CLOB, "nvarchar(max)");

    }
}
