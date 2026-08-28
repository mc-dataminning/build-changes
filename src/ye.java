import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface ye {
   MapCodec<ye> c = xe.a(new ye.a[]{yf.b, yd.b, ym.b}, ye.a::a, ye::a, "source");

   Stream<ua> a(ek var1) throws CommandSyntaxException;

   ye.a<?> a();

   public static record a<T extends ye>(MapCodec<T> a, String b) implements bao {
      @Override
      public String c() {
         return this.b;
      }
   }
}
