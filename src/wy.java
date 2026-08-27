import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wy {
   default <T> Optional<T> a(xc.b<T> $$0, xu $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xc.a<T> $$0) {
      return Optional.empty();
   }

   default xl a(@Nullable ee $$0, @Nullable bru $$1, int $$2) throws CommandSyntaxException {
      return xl.a(this);
   }

   wy.a<?> a();

   public static record a<T extends wy>(MapCodec<T> a, String b) implements ayx {
      @Override
      public String c() {
         return this.b;
      }
   }
}
