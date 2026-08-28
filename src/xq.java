import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xq {
   default <T> Optional<T> a(xu.b<T> $$0, ym $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xu.a<T> $$0) {
      return Optional.empty();
   }

   default yd a(@Nullable ep $$0, @Nullable bsv $$1, int $$2) throws CommandSyntaxException {
      return yd.a(this);
   }

   xq.a<?> a();

   public static record a<T extends xq>(MapCodec<T> a, String b) implements azu {
      @Override
      public String c() {
         return this.b;
      }
   }
}
