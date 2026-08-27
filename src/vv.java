import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface vv {
   default <T> Optional<T> a(vz.b<T> $$0, wr $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(vz.a<T> $$0) {
      return Optional.empty();
   }

   default wi a(@Nullable du $$0, @Nullable bow $$1, int $$2) throws CommandSyntaxException {
      return wi.a(this);
   }

   vv.a<?> a();

   public static record a<T extends vv>(MapCodec<T> a, String b) implements axq {
      @Override
      public String c() {
         return this.b;
      }
   }
}
