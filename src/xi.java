import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xi {
   default <T> Optional<T> a(xm.b<T> $$0, ye $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xm.a<T> $$0) {
      return Optional.empty();
   }

   default xv a(@Nullable ev $$0, @Nullable btz $$1, int $$2) throws CommandSyntaxException {
      return xv.a(this);
   }

   xi.a<?> a();

   public static record a<T extends xi>(MapCodec<T> a, String b) implements baf {
      @Override
      public String c() {
         return this.b;
      }
   }
}
