import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wh {
   default <T> Optional<T> a(wl.b<T> $$0, xd $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(wl.a<T> $$0) {
      return Optional.empty();
   }

   default wu a(@Nullable du $$0, @Nullable bpv $$1, int $$2) throws CommandSyntaxException {
      return wu.a(this);
   }

   wh.a<?> a();

   public static record a<T extends wh>(MapCodec<T> a, String b) implements aye {
      @Override
      public String c() {
         return this.b;
      }
   }
}
