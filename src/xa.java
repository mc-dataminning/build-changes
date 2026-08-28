import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface xa {
   default <T> Optional<T> a(xe.b<T> $$0, xw $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xe.a<T> $$0) {
      return Optional.empty();
   }

   default xn a(@Nullable et $$0, @Nullable bsr $$1, int $$2) throws CommandSyntaxException {
      return xn.a(this);
   }

   xa.a<?> a();

   public static record a<T extends xa>(MapCodec<T> a, String b) implements azk {
      @Override
      public String c() {
         return this.b;
      }
   }
}
