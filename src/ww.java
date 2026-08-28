import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface ww {
   default <T> Optional<T> a(xa.b<T> $$0, xs $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xa.a<T> $$0) {
      return Optional.empty();
   }

   default xj a(@Nullable ex $$0, @Nullable bvs $$1, int $$2) throws CommandSyntaxException {
      return xj.a(this);
   }

   ww.a<?> a();

   public static record a<T extends ww>(MapCodec<T> a, String b) implements bag {
      @Override
      public String c() {
         return this.b;
      }
   }
}
