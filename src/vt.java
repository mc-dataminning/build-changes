import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface vt {
   default <T> Optional<T> a(vx.b<T> $$0, wp $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(vx.a<T> $$0) {
      return Optional.empty();
   }

   default wg a(@Nullable du $$0, @Nullable bof $$1, int $$2) throws CommandSyntaxException {
      return wg.a(this);
   }

   vt.a<?> a();

   public static record a<T extends vt>(MapCodec<T> a, String b) implements axg {
      @Override
      public String c() {
         return this.b;
      }
   }
}
