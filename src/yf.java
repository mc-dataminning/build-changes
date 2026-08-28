import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yf {
   MapCodec<yf> c = xf.a(new yf.a[]{yg.b, ye.b, yn.b}, yf.a::a, yf::a, "source");

   Stream<uf> a(et var1) throws CommandSyntaxException;

   yf.a<?> a();

   public static record a<T extends yf>(MapCodec<T> a, String b) implements azy {
      @Override
      public String c() {
         return this.b;
      }
   }
}
