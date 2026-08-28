import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yx {
   MapCodec<yx> c = xx.a(new yx.a[]{yy.b, yw.b, zf.b}, yx.a::a, yx::a, "source");

   Stream<ux> a(ew var1) throws CommandSyntaxException;

   yx.a<?> a();

   public static record a<T extends yx>(MapCodec<T> a, String b) implements bba {
      @Override
      public String c() {
         return this.b;
      }
   }
}
