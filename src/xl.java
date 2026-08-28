import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xl {
   default <T> Optional<T> a(xp.b<T> $$0, yh $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xp.a<T> $$0) {
      return Optional.empty();
   }

   default xy a(@Nullable ew $$0, @Nullable bvb $$1, int $$2) throws CommandSyntaxException {
      return xy.a(this);
   }

   xl.a<?> a();

   public static record a<T extends xl>(MapCodec<T> a, String b) implements baq {
      @Override
      public String c() {
         return this.b;
      }
   }
}
