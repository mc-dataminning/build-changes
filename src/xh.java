import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xh {
   default <T> Optional<T> a(xl.b<T> $$0, yd $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xl.a<T> $$0) {
      return Optional.empty();
   }

   default xu a(@Nullable ek $$0, @Nullable bxe $$1, int $$2) throws CommandSyntaxException {
      return xu.a(this);
   }

   xh.a<?> a();

   public static record a<T extends xh>(MapCodec<T> a, String b) implements bax {
      @Override
      public String c() {
         return this.b;
      }
   }
}
