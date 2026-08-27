import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface tg {
   tg a = new tg() {
      @Override
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(tj.b<T> $$0, ub $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(tj.a<T> $$0) {
      return Optional.empty();
   }

   default ts a(@Nullable dr $$0, @Nullable bii $$1, int $$2) throws CommandSyntaxException {
      return ts.a(this);
   }
}
