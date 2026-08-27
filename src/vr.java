import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface vr {
   default <T> Optional<T> a(vv.b<T> $$0, wn $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(vv.a<T> $$0) {
      return Optional.empty();
   }

   default we a(@Nullable du $$0, @Nullable bnq $$1, int $$2) throws CommandSyntaxException {
      return we.a(this);
   }

   vr.a<?> a();

   public static record a<T extends vr>(MapCodec<T> a, String b) implements axc {
      @Override
      public String c() {
         return this.b;
      }
   }
}
