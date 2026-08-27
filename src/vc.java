import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface vc {
   default <T> Optional<T> a(vg.b<T> $$0, vy $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(vg.a<T> $$0) {
      return Optional.empty();
   }

   default vp a(@Nullable ds $$0, @Nullable blf $$1, int $$2) throws CommandSyntaxException {
      return vp.a(this);
   }

   vc.a<?> a();

   public static record a<T extends vc>(MapCodec<T> a, String b) implements aut {
      @Override
      public String c() {
         return this.b;
      }
   }
}
