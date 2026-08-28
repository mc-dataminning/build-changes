import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wz {
   default <T> Optional<T> a(xd.b<T> $$0, xv $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xd.a<T> $$0) {
      return Optional.empty();
   }

   default xm a(@Nullable ej $$0, @Nullable bwi $$1, int $$2) throws CommandSyntaxException {
      return xm.a(this);
   }

   wz.a<?> a();

   public static record a<T extends wz>(MapCodec<T> a, String b) implements bak {
      @Override
      public String c() {
         return this.b;
      }
   }
}
