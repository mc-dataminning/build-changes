import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xd {
   default <T> Optional<T> a(xh.b<T> $$0, xz $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xh.a<T> $$0) {
      return Optional.empty();
   }

   default xq a(@Nullable ek $$0, @Nullable bwv $$1, int $$2) throws CommandSyntaxException {
      return xq.a(this);
   }

   xd.a<?> a();

   public static record a<T extends xd>(MapCodec<T> a, String b) implements bao {
      @Override
      public String c() {
         return this.b;
      }
   }
}
