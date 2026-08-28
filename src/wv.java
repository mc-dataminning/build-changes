import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wv {
   default <T> Optional<T> a(wz.b<T> $$0, xr $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(wz.a<T> $$0) {
      return Optional.empty();
   }

   default xi a(@Nullable eq $$0, @Nullable bsh $$1, int $$2) throws CommandSyntaxException {
      return xi.a(this);
   }

   wv.a<?> a();

   public static record a<T extends wv>(MapCodec<T> a, String b) implements azc {
      @Override
      public String c() {
         return this.b;
      }
   }
}
