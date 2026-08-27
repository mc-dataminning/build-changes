import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public interface wt {
   default <T> Optional<T> a(wx.b<T> $$0, xp $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(wx.a<T> $$0) {
      return Optional.empty();
   }

   default xg a(@Nullable ec $$0, @Nullable bql $$1, int $$2) throws CommandSyntaxException {
      return xg.a(this);
   }

   wt.a<?> a();

   public static record a<T extends wt>(MapCodec<T> a, String b) implements ayq {
      @Override
      public String c() {
         return this.b;
      }
   }
}
