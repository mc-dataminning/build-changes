import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xm {
   default <T> Optional<T> a(xq.b<T> $$0, yi $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xq.a<T> $$0) {
      return Optional.empty();
   }

   default xz a(@Nullable ew $$0, @Nullable bui $$1, int $$2) throws CommandSyntaxException {
      return xz.a(this);
   }

   xm.a<?> a();

   public static record a<T extends xm>(MapCodec<T> a, String b) implements baj {
      @Override
      public String c() {
         return this.b;
      }
   }
}
