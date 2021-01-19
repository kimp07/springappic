package org.alex.springappic.dialect;

import org.hibernate.dialect.pagination.AbstractLimitHandler;
import org.hibernate.dialect.pagination.LimitHelper;
import org.hibernate.engine.spi.RowSelection;

public class SqliteLimitHadler extends AbstractLimitHandler {

    @Override
    public boolean supportsLimit() {
        return true;
    }

    @Override
    public boolean bindLimitParametersInReverseOrder() {
        return true;
    }

    @Override
    public String processSql(String sql, RowSelection selection) {
        final boolean hasOffset = LimitHelper.hasFirstRow(selection);
        if (hasOffset) {
            return sql + " limit ?,?";
        }
        return sql + " limit ?";
    }
    
    
}
