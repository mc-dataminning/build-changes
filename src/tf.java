import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface tf {
   tf a = new tf() {
      @Override
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(ti.b<T> $$0, ua $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(ti.a<T> $$0) {
      return Optional.empty();
   }

   default tr a(@Nullable ds $$0, @Nullable big $$1, int $$2) throws CommandSyntaxException {
      return tr.a(this);
   }
}
