import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface vh {
   default <T> Optional<T> a(vl.b<T> $$0, wd $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(vl.a<T> $$0) {
      return Optional.empty();
   }

   default vu a(@Nullable ds $$0, @Nullable blw $$1, int $$2) throws CommandSyntaxException {
      return vu.a(this);
   }

   vh.a<?> a();

   public static record a<T extends vh>(MapCodec<T> a, String b) implements avl {
      @Override
      public String c() {
         return this.b;
      }
   }
}
