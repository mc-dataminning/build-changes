import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface uj {
   default <T> Optional<T> a(un.b<T> $$0, vf $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(un.a<T> $$0) {
      return Optional.empty();
   }

   default uw a(@Nullable du $$0, @Nullable bjt $$1, int $$2) throws CommandSyntaxException {
      return uw.a(this);
   }

   uj.a<?> a();

   public static record a<T extends uj>(MapCodec<T> a, String b) implements atr {
      @Override
      public String c() {
         return this.b;
      }
   }
}
