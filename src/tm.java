import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface tm {
   tm a = new tm() {
      @Override
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(tp.b<T> $$0, uh $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(tp.a<T> $$0) {
      return Optional.empty();
   }

   default ty a(@Nullable dt $$0, @Nullable biq $$1, int $$2) throws CommandSyntaxException {
      return ty.a(this);
   }
}
