import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface uw {
   default <T> Optional<T> a(va.b<T> $$0, vs $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(va.a<T> $$0) {
      return Optional.empty();
   }

   default vj a(@Nullable du $$0, @Nullable bkv $$1, int $$2) throws CommandSyntaxException {
      return vj.a(this);
   }

   uw.a<?> a();

   public static record a<T extends uw>(MapCodec<T> a, String b) implements auk {
      @Override
      public String c() {
         return this.b;
      }
   }
}
