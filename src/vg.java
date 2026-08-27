import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface vg {
   default <T> Optional<T> a(vk.b<T> $$0, wc $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(vk.a<T> $$0) {
      return Optional.empty();
   }

   default vt a(@Nullable ds $$0, @Nullable blu $$1, int $$2) throws CommandSyntaxException {
      return vt.a(this);
   }

   vg.a<?> a();

   public static record a<T extends vg>(MapCodec<T> a, String b) implements avj {
      @Override
      public String c() {
         return this.b;
      }
   }
}
