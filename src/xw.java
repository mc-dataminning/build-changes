import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xw {
   default <T> Optional<T> a(ya.b<T> $$0, ys $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(ya.a<T> $$0) {
      return Optional.empty();
   }

   default yj a(@Nullable ew $$0, @Nullable bvf $$1, int $$2) throws CommandSyntaxException {
      return yj.a(this);
   }

   xw.a<?> a();

   public static record a<T extends xw>(MapCodec<T> a, String b) implements bba {
      @Override
      public String c() {
         return this.b;
      }
   }
}
