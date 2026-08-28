import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yb {
   MapCodec<yb> c = xb.a(new yb.a[]{yc.b, ya.b, yj.b}, yb.a::a, yb::a, "source");

   Stream<ub> a(et var1) throws CommandSyntaxException;

   yb.a<?> a();

   public static record a<T extends yb>(MapCodec<T> a, String b) implements azk {
      @Override
      public String c() {
         return this.b;
      }
   }
}
