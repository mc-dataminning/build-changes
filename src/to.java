import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface to {
   to a = new to() {
      @Override
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(tr.b<T> $$0, uj $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(tr.a<T> $$0) {
      return Optional.empty();
   }

   default ua a(@Nullable dt $$0, @Nullable bis $$1, int $$2) throws CommandSyntaxException {
      return ua.a(this);
   }
}
