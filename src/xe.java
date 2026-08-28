import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xe {
   default <T> Optional<T> a(xi.b<T> $$0, ya $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xi.a<T> $$0) {
      return Optional.empty();
   }

   default xr a(@Nullable et $$0, @Nullable btj $$1, int $$2) throws CommandSyntaxException {
      return xr.a(this);
   }

   xe.a<?> a();

   public static record a<T extends xe>(MapCodec<T> a, String b) implements azy {
      @Override
      public String c() {
         return this.b;
      }
   }
}
