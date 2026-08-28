import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xk {
   default <T> Optional<T> a(xo.b<T> $$0, yg $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xo.a<T> $$0) {
      return Optional.empty();
   }

   default xx a(@Nullable ew $$0, @Nullable bul $$1, int $$2) throws CommandSyntaxException {
      return xx.a(this);
   }

   xk.a<?> a();

   public static record a<T extends xk>(MapCodec<T> a, String b) implements bai {
      @Override
      public String c() {
         return this.b;
      }
   }
}
