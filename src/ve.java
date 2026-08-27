import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ve {
   default <T> Optional<T> a(vi.b<T> $$0, wa $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(vi.a<T> $$0) {
      return Optional.empty();
   }

   default vr a(@Nullable ds $$0, @Nullable blp $$1, int $$2) throws CommandSyntaxException {
      return vr.a(this);
   }

   ve.a<?> a();

   public static record a<T extends ve>(MapCodec<T> a, String b) implements ave {
      @Override
      public String c() {
         return this.b;
      }
   }
}
