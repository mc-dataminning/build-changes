import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface xk {
   MapCodec<xk> c = wk.a(new xk.a[]{xl.b, xj.b, xs.b}, xk.a::a, xk::a, "source");

   Stream<to> a(dv var1) throws CommandSyntaxException;

   xk.a<?> a();

   public static record a<T extends xk>(MapCodec<T> a, String b) implements ayg {
      @Override
      public String c() {
         return this.b;
      }
   }
}
