import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface ym {
   MapCodec<ym> c = xm.a(new ym.a[]{yn.b, yl.b, yu.b}, ym.a::a, ym::a, "source");

   Stream<um> a(ew var1) throws CommandSyntaxException;

   ym.a<?> a();

   public static record a<T extends ym>(MapCodec<T> a, String b) implements baq {
      @Override
      public String c() {
         return this.b;
      }
   }
}
