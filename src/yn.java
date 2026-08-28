import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yn {
   MapCodec<yn> c = xn.a(new yn.a[]{yo.b, ym.b, yv.b}, yn.a::a, yn::a, "source");

   Stream<ur> a(ep var1) throws CommandSyntaxException;

   yn.a<?> a();

   public static record a<T extends yn>(MapCodec<T> a, String b) implements azp {
      @Override
      public String c() {
         return this.b;
      }
   }
}
