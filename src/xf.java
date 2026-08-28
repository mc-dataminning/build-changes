import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xf {
   default <T> Optional<T> a(xj.b<T> $$0, yb $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xj.a<T> $$0) {
      return Optional.empty();
   }

   default xs a(@Nullable eu $$0, @Nullable btr $$1, int $$2) throws CommandSyntaxException {
      return xs.a(this);
   }

   xf.a<?> a();

   public static record a<T extends xf>(MapCodec<T> a, String b) implements bab {
      @Override
      public String c() {
         return this.b;
      }
   }
}
