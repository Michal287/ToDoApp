package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;
import java.sql.PreparedStatement;

public class V2__insert_example_todo extends BaseJavaMigration {
    @Override
    public void migrate(final Context context) throws Exception {
        try (PreparedStatement statement = context.getConnection().prepareStatement(
                "INSERT INTO tasks (description, done) VALUES ('Task from migration', true)")) {
            statement.executeUpdate();
        }
    }
}
