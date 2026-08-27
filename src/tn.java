import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface tn {
   tn a = new tn() {
      @Override
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(tq.b<T> $$0, ui $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(tq.a<T> $$0) {
      return Optional.empty();
   }

   default tz a(@Nullable dt $$0, @Nullable biq $$1, int $$2) throws CommandSyntaxException {
      return tz.a(this);
   }
}
