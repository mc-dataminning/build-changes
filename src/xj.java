import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xj {
   default <T> Optional<T> a(xn.b<T> $$0, yf $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xn.a<T> $$0) {
      return Optional.empty();
   }

   default xw a(@Nullable ew $$0, @Nullable bue $$1, int $$2) throws CommandSyntaxException {
      return xw.a(this);
   }

   xj.a<?> a();

   public static record a<T extends xj>(MapCodec<T> a, String b) implements bag {
      @Override
      public String c() {
         return this.b;
      }
   }
}
