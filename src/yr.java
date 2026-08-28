import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yr {
   MapCodec<yr> c = xr.a(new yr.a[]{ys.b, yq.b, yz.b}, yr.a::a, yr::a, "source");

   Stream<us> a(ep var1) throws CommandSyntaxException;

   yr.a<?> a();

   public static record a<T extends yr>(MapCodec<T> a, String b) implements azu {
      @Override
      public String c() {
         return this.b;
      }
   }
}
