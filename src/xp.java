import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xp {
   default <T> Optional<T> a(xt.b<T> $$0, yl $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xt.a<T> $$0) {
      return Optional.empty();
   }

   default yc a(@Nullable ep $$0, @Nullable bss $$1, int $$2) throws CommandSyntaxException {
      return yc.a(this);
   }

   xp.a<?> a();

   public static record a<T extends xp>(MapCodec<T> a, String b) implements azs {
      @Override
      public String c() {
         return this.b;
      }
   }
}
