import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface us {
   default <T> Optional<T> a(uw.b<T> $$0, vo $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(uw.a<T> $$0) {
      return Optional.empty();
   }

   default vf a(@Nullable du $$0, @Nullable bki $$1, int $$2) throws CommandSyntaxException {
      return vf.a(this);
   }

   us.a<?> a();

   public static record a<T extends us>(MapCodec<T> a, String b) implements aub {
      @Override
      public String c() {
         return this.b;
      }
   }
}
