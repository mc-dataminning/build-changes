import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xb {
   default <T> Optional<T> a(xf.b<T> $$0, xx $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xf.a<T> $$0) {
      return Optional.empty();
   }

   default xo a(@Nullable ej $$0, @Nullable bwt $$1, int $$2) throws CommandSyntaxException {
      return xo.a(this);
   }

   xb.a<?> a();

   public static record a<T extends xb>(MapCodec<T> a, String b) implements bam {
      @Override
      public String c() {
         return this.b;
      }
   }
}
