import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wj {
   default <T> Optional<T> a(wn.b<T> $$0, xf $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(wn.a<T> $$0) {
      return Optional.empty();
   }

   default ww a(@Nullable dv $$0, @Nullable bqa $$1, int $$2) throws CommandSyntaxException {
      return ww.a(this);
   }

   wj.a<?> a();

   public static record a<T extends wj>(MapCodec<T> a, String b) implements ayg {
      @Override
      public String c() {
         return this.b;
      }
   }
}
