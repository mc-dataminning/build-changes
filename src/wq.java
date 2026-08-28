import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wq {
   default <T> Optional<T> a(wu.b<T> $$0, xm $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(wu.a<T> $$0) {
      return Optional.empty();
   }

   default xd a(@Nullable ex $$0, @Nullable buk $$1, int $$2) throws CommandSyntaxException {
      return xd.a(this);
   }

   wq.a<?> a();

   public static record a<T extends wq>(MapCodec<T> a, String b) implements azv {
      @Override
      public String c() {
         return this.b;
      }
   }
}
