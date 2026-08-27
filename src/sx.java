import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface sx {
   sx a = new sx() {
      @Override
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(ta.b<T> $$0, ts $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(ta.a<T> $$0) {
      return Optional.empty();
   }

   default tj a(@Nullable ds $$0, @Nullable bfj $$1, int $$2) throws CommandSyntaxException {
      return tj.a(this);
   }
}
