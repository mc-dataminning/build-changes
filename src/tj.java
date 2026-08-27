import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface tj {
   tj a = new tj() {
      @Override
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(tm.b<T> $$0, ue $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(tm.a<T> $$0) {
      return Optional.empty();
   }

   default tv a(@Nullable dt $$0, @Nullable bil $$1, int $$2) throws CommandSyntaxException {
      return tv.a(this);
   }
}
