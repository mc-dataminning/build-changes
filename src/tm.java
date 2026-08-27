import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface tm {
   default <T> Optional<T> a(tq.b<T> $$0, ui $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(tq.a<T> $$0) {
      return Optional.empty();
   }

   default tz a(@Nullable dt $$0, @Nullable biw $$1, int $$2) throws CommandSyntaxException {
      return tz.a(this);
   }

   tm.a<?> a();

   public static record a<T extends tm>(MapCodec<T> a, String b) implements asu {
      @Override
      public String c() {
         return this.b;
      }
   }
}
