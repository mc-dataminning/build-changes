import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xi {
   MapCodec<xi> c = wi.a(new xi.a[]{xj.b, xh.b, xq.b}, xi.a::a, xi::a, "source");

   Stream<tm> a(du var1) throws CommandSyntaxException;

   xi.a<?> a();

   public static record a<T extends xi>(MapCodec<T> a, String b) implements aye {
      @Override
      public String c() {
         return this.b;
      }
   }
}
