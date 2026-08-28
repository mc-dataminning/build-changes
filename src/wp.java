import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wp {
   default <T> Optional<T> a(wt.b<T> $$0, xl $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(wt.a<T> $$0) {
      return Optional.empty();
   }

   default xc a(@Nullable ex $$0, @Nullable buk $$1, int $$2) throws CommandSyntaxException {
      return xc.a(this);
   }

   wp.a<?> a();

   public static record a<T extends wp>(MapCodec<T> a, String b) implements azv {
      @Override
      public String c() {
         return this.b;
      }
   }
}
