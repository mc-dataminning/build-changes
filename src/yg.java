import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yg {
   MapCodec<yg> c = xg.a(new yg.a[]{yh.b, yf.b, yo.b}, yg.a::a, yg::a, "source");

   Stream<ug> a(eu var1) throws CommandSyntaxException;

   yg.a<?> a();

   public static record a<T extends yg>(MapCodec<T> a, String b) implements bab {
      @Override
      public String c() {
         return this.b;
      }
   }
}
