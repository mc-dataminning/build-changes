import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wx {
   default <T> Optional<T> a(xb.b<T> $$0, xt $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(xb.a<T> $$0) {
      return Optional.empty();
   }

   default xk a(@Nullable ei $$0, @Nullable bwa $$1, int $$2) throws CommandSyntaxException {
      return xk.a(this);
   }

   wx.a<?> a();

   public static record a<T extends wx>(MapCodec<T> a, String b) implements bai {
      @Override
      public String c() {
         return this.b;
      }
   }
}
